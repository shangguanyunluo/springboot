package springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller   // Spring Boot项目的核心注解，主要目的是开启自动配置
public class HelloController {
	
	@ResponseBody
	@RequestMapping("/hello")
	public String hello(){
		return "hello world!";
	}

}
