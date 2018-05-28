package com.devglan;

import org.springframework.context.ApplicationListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.messaging.SessionSubscribeEvent;

@Service
public class Example implements ApplicationListener<SessionSubscribeEvent>{
	
	@Override
	public void onApplicationEvent(SessionSubscribeEvent event) {
		StompHeaderAccessor sha = StompHeaderAccessor.wrap(event.getMessage());
		System.out.println("Example class");
	    String sessionId = sha.getSessionId();
	    System.out.println(sessionId);
	    Message<byte[]> message = event.getMessage();
	    
	    System.out.println(sha.getSubscriptionId());
	}

}
