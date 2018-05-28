package com.devglan;

import org.springframework.context.ApplicationListener;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.web.socket.messaging.SessionUnsubscribeEvent;

public class UnSubscribe implements ApplicationListener<SessionUnsubscribeEvent>{

	@Override
	public void onApplicationEvent(SessionUnsubscribeEvent event) {
		StompHeaderAccessor sha = StompHeaderAccessor.wrap(event.getMessage());
		System.out.println(sha.getSubscriptionId());
		System.out.println(sha.getSessionId());
	}
}
