package pl.jacob_the_liar.fun_home_help;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date : 29.08.2019 13:49
 * *
 * @className: FunHomeHelp
 * *
 * *
 ******************************************************/
@SpringBootApplication
@Slf4j
public class FunHomeHelpApplication {

    public static void main(String[] args) {
        try {
            log.debug("FunHomeHelpApplication - static main");

            SpringApplication.run(FunHomeHelpApplication.class, args);
        } catch (Exception e) {
            log.error("FunHomeHelpApplication - static main error: " + e.getMessage(), e);
            throw e;
        }

    }
}
