package yb.ecp.fast.infra;

import de.codecentric.boot.admin.config.EnableAdminServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableEurekaServer
@EnableZipkinServer
@EnableConfigServer
@EnableAdminServer
public class EurekaServerApplication {
    public static void main(String[] a) {
        SpringApplication.run(EurekaServerApplication.class, a);
    }
}
