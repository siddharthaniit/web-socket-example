package com.devglan;

import org.springframework.messaging.SubscribableChannel;
import org.springframework.messaging.simp.user.UserDestinationMessageHandler;
import org.springframework.messaging.simp.user.UserDestinationResolver;

public class DestnationHandler extends UserDestinationMessageHandler{

	public DestnationHandler(SubscribableChannel clientInboundChannel, SubscribableChannel brokerChannel,
			UserDestinationResolver resolver) {
		super(clientInboundChannel, brokerChannel, resolver);
	}

	

}
