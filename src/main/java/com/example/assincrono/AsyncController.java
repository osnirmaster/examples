package com.example.assincrono;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AsyncController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private WorkService work;
	
	@PostMapping("async")
	public String async() {
		
		logger.info("Requisiçao recebida");
		work.async();
		logger.info("Processamento em andamento");
		
		return "Ok";
		
	}

}
