package consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 描述
 *
 * @author Oliver
 * @version 1.0
 * @date 2021/04/20 14:48:40
 */
@EnableEurekaClient
@SpringBootApplication
public class ConsumerApplication_80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication_80.class, args);
    }
}
