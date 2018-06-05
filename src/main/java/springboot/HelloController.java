package springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.entity.People;

@RestController
public class HelloController {
	
	@Value("${name}")
	private String name;
	
	@Value("${message}")
	private String message;
	
	@Autowired
	private People people;
	
	@RequestMapping("/hello")
	public String hello(){
		return "hello "+this.name+" !";
	}
	
	@RequestMapping("/message")
	public String message(){
		return this.message;
	}
	
	@RequestMapping("/people")
	public People people(){
		return this.people;
	}

}
