package cn.itsrobin.swagger.rest.config;

import com.wordnik.swagger.config.ConfigFactory;
import com.wordnik.swagger.config.ScannerFactory;
import com.wordnik.swagger.config.SwaggerConfig;
import com.wordnik.swagger.jaxrs.config.ReflectiveJaxrsScanner;
import com.wordnik.swagger.jaxrs.reader.DefaultJaxrsApiReader;
import com.wordnik.swagger.reader.ClassReaders;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author lifeng
 * @createTime 2017/2/12.
 * @updateTime 2017/2/12
 */
@Component
public class SwaggerConfiguration {

    @Value("${swagger.resourcePackage}")
    private String resourcePackage;

    @Value("${swagger.basePath}")
    private String basePath;

    @Value("${swagger.apiVersion}")
    private String apiVersion;

    @PostConstruct
    public void init() {
        final ReflectiveJaxrsScanner scanner = new ReflectiveJaxrsScanner();
        scanner.setResourcePackage(resourcePackage);

        ScannerFactory.setScanner(scanner);
        ClassReaders.setReader(new DefaultJaxrsApiReader());

        final SwaggerConfig config = ConfigFactory.config();
        config.setApiVersion(apiVersion);
        config.setBasePath(basePath);
    }

    public String getResourcePackage() {
        return resourcePackage;
    }

    public void setResourcePackage(String resourcePackage) {
        this.resourcePackage = resourcePackage;
    }

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }
}
