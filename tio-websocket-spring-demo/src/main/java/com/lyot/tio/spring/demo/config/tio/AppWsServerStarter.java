package com.lyot.tio.spring.demo.config.tio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.tio.websocket.server.WsServerStarter;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AppWsServerStarter implements CommandLineRunner {
	
	private WsServerStarter wsServerStarter;
	
	@Autowired
	public AppWsServerStarter(WsServerStarter wsServerStarter) {
		this.wsServerStarter = wsServerStarter;
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("tio starter....");
		wsServerStarter.start();
	}
	
	
}
