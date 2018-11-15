package com.lyot.tio.spring.demo.config.tio;

import org.springframework.stereotype.Component;
import org.tio.core.ChannelContext;
import org.tio.core.GroupContext;
import org.tio.core.intf.Packet;
import org.tio.core.stat.IpStat;
import org.tio.core.stat.IpStatListener;

@Component
public class AppIpStatListener implements IpStatListener {

	@Override
	public void onExpired(GroupContext groupContext, IpStat ipStat) {
		
	}

	@Override
	public void onAfterConnected(ChannelContext channelContext, boolean isConnected, boolean isReconnect, IpStat ipStat)
			throws Exception {
		
	}

	@Override
	public void onDecodeError(ChannelContext channelContext, IpStat ipStat) {
		
	}

	@Override
	public void onAfterSent(ChannelContext channelContext, Packet packet, boolean isSentSuccess, IpStat ipStat)
			throws Exception {
		
	}

	@Override
	public void onAfterDecoded(ChannelContext channelContext, Packet packet, int packetSize, IpStat ipStat)
			throws Exception {
		
	}

	@Override
	public void onAfterReceivedBytes(ChannelContext channelContext, int receivedBytes, IpStat ipStat) throws Exception {
		
	}

	@Override
	public void onAfterHandled(ChannelContext channelContext, Packet packet, IpStat ipStat, long cost)
			throws Exception {
		
	}

}
