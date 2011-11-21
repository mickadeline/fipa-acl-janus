package org.janus.acl;

import org.janusproject.kernel.message.ObjectMessage;

public class ACLMessage extends ObjectMessage
{
    public ACLMessage(ACLMessage o) {
		super(o);
		// TODO Auto-generated constructor stub
	}
    
	public class Envelope extends ACLMessageEnvelope {
    	
    }
    public class Content extends ACLMessageContent{
    	
    }
}
