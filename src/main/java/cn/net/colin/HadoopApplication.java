package cn.net.colin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Package: cn.net.colin
 * @Author: sxf
 * @Date: 2020-8-24
 * @Description:
 */
@SpringBootApplication
@EnableSwagger2
public class HadoopApplication {
    public static void main(String[] args) {
        SpringApplication.run(HadoopApplication.class,args);
    }
}
