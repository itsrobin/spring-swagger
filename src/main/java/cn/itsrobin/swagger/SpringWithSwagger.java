package cn.itsrobin.swagger;

import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * @author lifeng
 * @createTime 2017/2/12.
 * @updateTime 2017/2/12
 */
public class SpringWithSwagger extends ResourceConfig {

    public SpringWithSwagger() {

        final String myRestPackage = "cn.itsrobin.swagger";
        final String jacksonPackage = "org.codehaus.jackson.jaxrs";

        final String swaggerJaxrsJsonPackage = "com.wordnik.swagger.jaxrs.json";
        final String swaggerJaxrsListingPackage = "com.wordnik.swagger.jaxrs.listing";

        packages(swaggerJaxrsJsonPackage,
                swaggerJaxrsListingPackage,
                jacksonPackage,
                myRestPackage);

        register(MultiPartFeature.class);
    }


}
