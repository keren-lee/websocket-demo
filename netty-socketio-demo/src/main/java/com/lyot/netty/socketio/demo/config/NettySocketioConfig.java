package com.lyot.netty.socketio.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.corundumstudio.socketio.SocketConfig;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.annotation.SpringAnnotationScanner;

@Configuration
public class NettySocketioConfig {
	
	public static final int MAX_FRAME_PAYLOAD_LENGTH = 1024*1024;
	public static final int MAX_HTTP_CONTENT_LENGTH = 1024*1024;
	
	@Bean
	public SocketIOServer socketIOServer() {
		com.corundumstudio.socketio.Configuration configuration = new com.corundumstudio.socketio.Configuration();
		configuration.setHostname("localhost");
		configuration.setPort(9092);
		configuration.setMaxFramePayloadLength(MAX_FRAME_PAYLOAD_LENGTH);
		configuration.setMaxHttpContentLength(MAX_HTTP_CONTENT_LENGTH);
		SocketConfig socketConfig = new SocketConfig();
		socketConfig.setReuseAddress(true);
		configuration.setSocketConfig(socketConfig);
		return new SocketIOServer(configuration);
	}
	
	@Bean
	public SpringAnnotationScanner springAnnotationScanner(SocketIOServer socketIOServer) {
		
		return new SpringAnnotationScanner(socketIOServer);
	}
}
