package cuixb.test.springboot.quartz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestJob {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//每1分钟执行一次
    @SuppressWarnings({ "rawtypes", "unchecked" })
	@Scheduled(cron = "0 */1 *  * * * ")
    @Async
    public void job1() throws InterruptedException{
    	logger.info("New scheduling, test task launched");

    	logger.info("New scheduling, test task completed");
    }
    

}
