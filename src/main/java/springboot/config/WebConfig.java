package springboot.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @className: WebConfig
 * @description: 静态资源配置类 // WebMvcConfigurerAdapter 已经过时，使用WebMvcConfigurer替换
 */

 @Configuration
 @EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

	/**
	 * 日志管理
	 */
	private Logger log = LoggerFactory.getLogger(WebConfig.class);

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		log.info("配置静态资源所在目录");
		// 和页面有关的静态目录都放在项目的static目录下
		registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
	}

}
