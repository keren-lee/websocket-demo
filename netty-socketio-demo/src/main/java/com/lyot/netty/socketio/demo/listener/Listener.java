package com.lyot.netty.socketio.demo.listener;

import com.corundumstudio.socketio.listener.ConnectListener;
import com.corundumstudio.socketio.listener.DataListener;
import com.corundumstudio.socketio.listener.DisconnectListener;
import com.corundumstudio.socketio.listener.ExceptionListener;

public abstract class Listener<T> implements ConnectListener,DisconnectListener,DataListener<T>,ExceptionListener {
	
}
