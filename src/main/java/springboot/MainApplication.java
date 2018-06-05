package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Spring Boot项目的核心注解，主要目的是开启自动配置
public class MainApplication {

	// 在main方法中启动一个应用，即：这个应用的入口
	public static void main(String[] args) throws Exception {
		SpringApplication.run(MainApplication.class, args);
	}

}
