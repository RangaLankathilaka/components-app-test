package lk.eyepax.demo.main;

//import org.apache.catalina.Globals;
//import org.apache.catalina.core.StandardContext;
//import org.apache.catalina.startup.Tomcat;
//
//import java.io.File;
//
//public class Application {
//    public static void main(String[] args) throws Exception {
//
//        String webAppDirLocation = "src/main/";
//        Tomcat tomcat = new Tomcat();
//
//
//        tomcat.setPort(8082);
//
//        StandardContext ctx = (StandardContext) tomcat.addWebapp("/", new File(webAppDirLocation).getAbsolutePath());
//        File configFile = new File("F:\\test1\\tomcat\\src\\main\\webapp\\WEB-INF\\web.xml");
//        ctx.setConfigFile(configFile.toURI().toURL());
//
//        //ctx.getServletContext().setAttribute(Globals.ALT_DD_ATTR,"F:\\test1\\tomcat\\src\\main\\webapp\\WEB-INF\\web.xml");
//        tomcat.start();
//        tomcat.getServer().await();
//    }
//}


import java.io.File;

import javax.servlet.ServletException;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class Application {

    public static void main(String[] args) throws LifecycleException, InterruptedException, ServletException {

        String docBase = "src/main/webapp/";

        Tomcat tomcat = new Tomcat();
        String webPort = System.getenv("PORT");
        if(webPort == null || webPort.isEmpty()) {
            webPort = "8082";
        }
        tomcat.setPort(Integer.valueOf(webPort));

        tomcat.addWebapp("/", new File(docBase).getAbsolutePath());
        System.out.println("configuring app with basedir: " + new File("./" + docBase).getAbsolutePath());

        tomcat.start();
        tomcat.getServer().await();
    }

}