package jenkins.JenkinsDemo;

import static  org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class JenkinsDemoApplicationTests {

	public static Logger logger= LoggerFactory.getLogger(JenkinsDemoApplicationTests.class);

	@Test
	public  contextLoads() {
		logger.info("Test case execution......");
		logger.info("Second Test case execution......................");
        assertEquals(true,true);
	}



}
