package org.janus.acl;

import org.janusproject.kernel.message.ObjectMessage;

public class ACLTransportMessage extends ObjectMessage
{
	public ACLTransportMessage(byte[] payload) {
		super(payload);
	}
}
