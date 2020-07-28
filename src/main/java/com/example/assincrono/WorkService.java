package com.example.assincrono;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class WorkService {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Async("fileExecutor")
	public void async() {
		try {
			Thread.sleep(30000);
		}catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		logger.info("Processamento concluido");
		
	}
}
