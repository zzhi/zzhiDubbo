package zzhiDubboprovider.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ImportResource({ "classpath:dubbo/*.xml" })
public class PropertiesConfig {

}
