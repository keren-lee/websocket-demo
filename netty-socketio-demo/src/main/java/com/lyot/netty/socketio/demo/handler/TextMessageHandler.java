package com.lyot.netty.socketio.demo.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.corundumstudio.socketio.AckRequest;
import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.annotation.OnConnect;
import com.corundumstudio.socketio.annotation.OnDisconnect;
import com.corundumstudio.socketio.annotation.OnEvent;

@Component
public class TextMessageHandler {
	
	private SocketIOServer socketIOServer;
	
	private static final Logger logger = LoggerFactory.getLogger(TextMessageHandler.class);
	
	@Autowired
	public TextMessageHandler(SocketIOServer socketIOServer) {
		this.socketIOServer = socketIOServer;
	}
	
	@OnConnect
	public void onConnection(SocketIOClient socketIOClient) {
		logger.info("user online");
	}
	
	@OnDisconnect
	public void onDisconnection(SocketIOClient socketIOClient) {
		
	}
	
	@OnEvent(value="text")
	public void onEvent(SocketIOClient socketIOClient,byte[] data,AckRequest ackRequest) {
		
	}
}
