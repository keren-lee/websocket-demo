package com.lyot.tio.spring.demo.config.tio;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="tio")
public class TioServerProperties {
	
	private String protocolName;
	
	private String serverIp;
	
	private Integer serverPort;
	
	private String charset = "UTF-8";
	
	private Integer heartbeatTimeout;

	public String getProtocolName() {
		return protocolName;
	}

	public void setProtocolName(String protocolName) {
		this.protocolName = protocolName;
	}

	public String getServerIp() {
		return serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	public Integer getServerPort() {
		return serverPort;
	}

	public void setServerPort(Integer serverPort) {
		this.serverPort = serverPort;
	}

	public String getCharset() {
		return charset;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}

	public Integer getHeartbeatTimeout() {
		return heartbeatTimeout;
	}

	public void setHeartbeatTimeout(Integer heartbeatTimeout) {
		this.heartbeatTimeout = heartbeatTimeout;
	}
	
	
}
