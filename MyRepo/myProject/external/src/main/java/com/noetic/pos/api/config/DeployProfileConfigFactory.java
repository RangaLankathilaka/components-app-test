package com.noetic.pos.api.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.noetic.pos.api.util.ActiveProfileReader;

/**
 */
/**
 * Runtime determination of the config for the deployment based on system property.
 *
 * E.g. supply JVM arg -DdeployProfile=DEV to run with DEV settings.
 */

@Component
public class DeployProfileConfigFactory {

    private static Logger log = LoggerFactory.getLogger(DeployProfileConfigFactory.class);

    @Value("${runtime.parameter.production}")
    private static String productionParameter = "/etc/ghaAPI/production";


    public static DeployProfileConfig forEnvironment() {

        String deployProfileValue = System.getProperty("deployProfile");

        if (deployProfileValue != null) {
            log.debug("Attempting to run deployProfile on api" + deployProfileValue);
        } else {

            boolean isProduction = false;
            if (productionParameter != null) {
                log.info("Runtime parameter setting {}", productionParameter);
                isProduction = ActiveProfileReader.isFileExist(productionParameter);
            }

            if (isProduction) {
                deployProfileValue = DeployProfile.PRODUCTION.name();
            } else {
                deployProfileValue = DeployProfile.LOCAL.name();
            }
            log.debug("Initialising application running on api {}", deployProfileValue);
        }

        DeployProfile deployProfile = DeployProfile.getDeployProfile(deployProfileValue);

        DeployProfileConfig deployProfileConfig = null;

        switch(deployProfile){

            case LOCAL:
                log.info("Matched to LocalDeployConfig");
                deployProfileConfig = SpringApplicationContext.getBean("LocalDeployConfig",
                        LocalDeployConfig.class);
                break;
            case DEV:
                log.info("Matched to DevDeployConfig");
                deployProfileConfig = SpringApplicationContext.getBean("DevDeployConfig",
                        DevDeployConfig.class);
                break;
//            case STAGING:
//                log.info("Matched to StagingDeployConfig");
//                deployProfileConfig = SpringApplicationContext.getBean("StagingDeployConfig",
//                        StagingDeployConfig.class);
//                break;
//            case PRELIVE:
//                log.info("Matched to PreliveDeployConfig");
//                deployProfileConfig = SpringApplicationContext.getBean("PreliveDeployConfig",
//                        PreliveDeployConfig.class);
//                break;
//            case PRODUCTION:
//                log.info("Matched to ProductionDeployConfig");
//                deployProfileConfig = SpringApplicationContext.getBean("ProductionDeployConfig",
//                        ProductionDeployConfig.class);
//                break;
            default:
                log.info("Runtime deployProfile not set defaulting to LocalDeployConfig");
                deployProfileConfig = SpringApplicationContext.getBean("LocalDeployConfig",
                        LocalDeployConfig.class);
                break;
        }

        deployProfileConfig.setDeployProfile(deployProfile);
        return deployProfileConfig;
    }

}
