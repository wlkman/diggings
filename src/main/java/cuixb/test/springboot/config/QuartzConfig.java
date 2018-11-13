package cuixb.test.springboot.config;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;


@Configuration 
@EnableScheduling
@EnableAsync
public class QuartzConfig implements AsyncConfigurer{

	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5);
        executor.setMaxPoolSize(20);  
        executor.setQueueCapacity(20);  
        executor.setKeepAliveSeconds(60);
        executor.setThreadNamePrefix("SomeTitle-TaskExecutor-");
		executor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy() );
        executor.initialize();
		return executor;
	}

	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		return null;
	}
	
}
