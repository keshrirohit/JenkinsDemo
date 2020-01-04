package jenkins.JenkinsDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsDemoApplication {

	public static Logger logger=LoggerFactory.getLogger(JenkinsDemoApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Start initialization......");
	}
	public static void main(String[] args)
	{
		logger.info("Start execution......");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}