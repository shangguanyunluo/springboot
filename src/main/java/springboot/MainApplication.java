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


//配置路径规则后，无法直接访问静态资源，例如：
/*//@SpringBootApplication
public class MainApplication extends WebMvcConfigurationSupport {

	

	// 在main方法中启动一个应用，即：这个应用的入口
	public static void main(String[] args) throws Exception {
		SpringApplication.run(MainApplication.class, args);
	}

	@Override
	protected void configurePathMatch(PathMatchConfigurer configurer) {
		// TODO Auto-generated method stub
		super.configurePathMatch(configurer);
		configurer.setUseSuffixPatternMatch(false).setUseTrailingSlashMatch(true);
	}

}*/
/**
 * 1、 extends WebMvcConfigurationSupport 2、重写下面方法; setUseSuffixPatternMatch:
 * 设置是否是后缀模式匹配，如“/user”是否匹配/user.*，默认真即匹配； setUseTrailingSlashMatch:
 * 设置是否自动后缀路径模式匹配，如“/user”是否匹配“/user/”，默认真即匹配；
 */