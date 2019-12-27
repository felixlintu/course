package sec.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CyberSecurityBaseProjectApplication {

    private static final Logger LOGGER=LoggerFactory.getLogger(CyberSecurityBaseProjectApplication.class);
    
    public static void main(String[] args) throws Throwable {
        SpringApplication.run(CyberSecurityBaseProjectApplication.class);
        LOGGER.info("Simple log statement with inputs {}, {} and {}", 1,2,3);
    }
}
