package com.lyot.netty.socketio.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.corundumstudio.socketio.SocketIOServer;

@Component
public class SocketioStartupRunner implements CommandLineRunner {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SocketioStartupRunner.class);
	
	private SocketIOServer socketIOServer;
	
	@Autowired
	public SocketioStartupRunner(SocketIOServer socketIOServer) {
		this.socketIOServer = socketIOServer;
	}
	
	@Override
	public void run(String... args) throws Exception {
		socketIOServer.start();
		LOGGER.info("socket io started");
	}
	
	
	
}
