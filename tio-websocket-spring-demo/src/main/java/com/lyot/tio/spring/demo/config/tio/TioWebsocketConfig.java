package com.lyot.tio.spring.demo.config.tio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.tio.server.ServerGroupContext;
import org.tio.websocket.server.WsServerStarter;

import lombok.extern.slf4j.Slf4j;

@Configuration
@EnableConfigurationProperties(TioServerProperties.class)
@Slf4j
public class TioWebsocketConfig {
	
	private final TioServerProperties tioServerProperties;
	
	@Autowired
	public TioWebsocketConfig(TioServerProperties tioServerProperties) {
		this.tioServerProperties = tioServerProperties;
	}
	
	@Bean
	public WsServerStarter wsServerStarter(AppIpStatListener appIpStatListener
										,AppWsServerAioListener appWsServerAioListener
										,WsMessageHandler wsMsgHandler) throws Exception {
		log.info("WsServerStarter config");
		WsServerStarter wsServerStarter = new WsServerStarter(tioServerProperties.getServerPort(), wsMsgHandler);
		ServerGroupContext serverGroupContext = wsServerStarter.getServerGroupContext();
		serverGroupContext.setName(tioServerProperties.getProtocolName());
		serverGroupContext.setServerAioListener(appWsServerAioListener);

		//设置ip监控
		serverGroupContext.setIpStatListener(appIpStatListener);
		//设置ip统计时间段
		serverGroupContext.ipStats.addDurations(AppServerConfig.IpStatDuration.IPSTAT_DURATIONS);
		
		//设置心跳超时时间
		serverGroupContext.setHeartbeatTimeout(tioServerProperties.getHeartbeatTimeout());
		
//		if (P.getInt("ws.use.ssl", 1) == 1) {
//			//如果你希望通过wss来访问，就加上下面的代码吧，不过首先你得有SSL证书（证书必须和域名相匹配，否则可能访问不了ssl）
//			String keyStoreFile = "classpath:config/ssl/keystore.jks";
//			String trustStoreFile = "classpath:config/ssl/keystore.jks";
//			String keyStorePwd = "214323428310224";
//			serverGroupContext.useSsl(keyStoreFile, trustStoreFile, keyStorePwd);
//		}
		return wsServerStarter;
	}
	
}
