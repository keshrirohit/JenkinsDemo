package jenkins.JenkinsDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class JenkinsDemoApplication {

	public static Logger logger=LoggerFactory.getLogger(JenkinsDemoApplication.class);

	@PostConstruct
	public  void init(){
		logger.info("Start initialization......");
		logger.info("start After making three project ..... ");
	}

	@GetMapping("/welcome")
	public  String welcome(){
		return  "Welcome to Docker example";
	}
	public static void main(String[] args)
	{
		logger.info("Start execution......");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
