package org.janus.acl;

import java.util.ArrayList;

import org.janusproject.kernel.address.AgentAddress;

public interface ACLMessageContent
{
	public int getPerformative();
	public void setPerformative(int performative);
	
	public AgentAddress getSender();
	public void setSender(AgentAddress sender);
	
	public ArrayList<AgentAddress> getReceiver();
	public void setReceiver(ArrayList<AgentAddress> receiver);
	
	public ArrayList<AgentAddress> getReplyTo();
	public void setReplyTo(ArrayList<AgentAddress> replyTo);
	
	public StringBuffer getContent();
	public void setContent(StringBuffer content);
	
	public String getLanguage();
	public void setLanguage(String language);
	
	public String getEncoding();
	public void setEncoding(String encoding);
	
	public String getOntology();
	public void setOntology(String ontology);
	
	public String getProtocol();
	public void setProtocol(String protocol);
	
	public String getConversationId();
	public void setConversationId(String conversationId);
	
	public String getReplyWith();
	public void setReplyWith(String replyWith);
	
	public String getInReplyTo();
	public void setInReplyTo(String inReplyTo);
	
	public String getReplyBy();
	public void setReplyBy(String replyBy);
    
    
}
