package lk.eyepax.translate;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.ArrayList;
import java.util.Locale;

@RestController
@Configuration
public class LocalelizationConfig {


    @Bean
    public LocaleResolver localeResolver(){
        SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
        sessionLocaleResolver.setDefaultLocale(Locale.US);
        return sessionLocaleResolver;


    }

    @Bean
    public ResourceBundleMessageSource messageSource(){
        ResourceBundleMessageSource resourceBundleMessageSource = new ResourceBundleMessageSource();
        resourceBundleMessageSource.setBasename("language");
        resourceBundleMessageSource.setUseCodeAsDefaultMessage(true);
        return resourceBundleMessageSource;
    }





    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ArrayList<String> getSource(@RequestHeader("Accept-Language") String locale){



        String how= messageSource().getMessage("how.txt",null,new Locale(locale));
        String helloworld= messageSource().getMessage("helloworld.txt",null,new Locale(locale));

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add(how);
        arrayList.add(helloworld);

        return arrayList;




    }





}
