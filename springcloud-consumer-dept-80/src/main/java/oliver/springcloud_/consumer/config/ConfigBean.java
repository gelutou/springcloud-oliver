package oliver.springcloud_.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 描述
 *
 * @author Oliver
 * @version 1.0
 * @date 2021/04/19 09:56:35
 */
@Configuration
public class ConfigBean { //@Configuration = Spring 里 applicationContext.xml

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
