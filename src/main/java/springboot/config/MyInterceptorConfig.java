package springboot.config;

import java.nio.charset.Charset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springboot.interceptor.MyInterceptor;

/**
 * @Description:springboot拦截器配置
 * @Description WebMvcConfigurerAdapter已经过时，换用WebMvcConfigurationSupport
 *              implements WebMvcConfigurer/ extends WebMvcConfigurationSupport
 * @author Administrator
 *
 */
@Configuration
@EnableWebMvc
public class MyInterceptorConfig implements WebMvcConfigurer {

	@Autowired
	private MyInterceptor myInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		// 添加拦截器并设置拦截规则
		// /*表示路径
		// /**表示路径及其自路径
		registry.addInterceptor(myInterceptor).addPathPatterns("/**");
		System.out.println("--------------addInterceptors----------------------");
	}

	/*
	 * public void configureMessageConverters(List<HttpMessageConverter<?>>
	 * converters) { System.out.println(
	 * "--------------configureMessageConverters----------------------" +
	 * converters.size()); StringHttpMessageConverter stringHttpMessageConverter
	 * = new StringHttpMessageConverter( Charset.forName("UTF-8"));
	 * converters.add(stringHttpMessageConverter); }
	 */
	// spring boot默认就有消息转化器，其编码格式为utf-8，采用以上的方式返回对象的时候会报错
	@Bean
	public StringHttpMessageConverter stringHttpMessageConverter() {
		StringHttpMessageConverter stringHttpMessageConverter = new StringHttpMessageConverter(
				Charset.forName("UTF-8"));
		System.out.println("--------------stringHttpMessageConverter----------------------");
		return stringHttpMessageConverter;
	}

}
