package com.sapients.eretail;

import com.sapients.eretail.cronJob.scheduler.QuartzScheduler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@Import({ QuartzScheduler.class })
@EnableScheduling
public class EretailApplication {

	public static void main(String[] args) {
		SpringApplication.run(EretailApplication.class, args);
	}

}
