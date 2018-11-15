package com.lyot.tio.spring.demo.config.tio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.tio.websocket.server.WsServerStarter;

@Component
public class AppWsServerStarter implements CommandLineRunner {
	
	private WsServerStarter wsServerStarter;
	
	@Autowired
	public AppWsServerStarter(WsServerStarter wsServerStarter) {
		this.wsServerStarter = wsServerStarter;
	}

	@Override
	public void run(String... args) throws Exception {
		wsServerStarter.start();
	}
	
	
}
