package org.janus.acl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Properties;

import org.janusproject.kernel.address.AgentAddress;

public interface ACLMessageEnvelope
{
	public ArrayList<AgentAddress> getTo();
	public void setTo(ArrayList<AgentAddress> to);
	
	public AgentAddress getFrom();
	public void setFrom(AgentAddress from);
	
	public String getAclRepresentation();
	public void setAclRepresentation(String aclRepresentation);
	
	public Date getDate();
	public void setDate(Date date);
	
	public String getComments();
	public void setComments(String comments);
	
	public Long getPayloadLength();
	public void setPayloadLength(Long payloadLength);
	
	public String getPayloadEncoding();
	public void setPayloadEncoding(String payloadEncoding);
	
	public ArrayList<AgentAddress> getIntentedReceiver();
	public void setIntentedReceiver(ArrayList<AgentAddress> intentedReceiver);
	
	public Properties getTransportBehaviour();
	public void setTransportBehaviour(Properties transportBehaviour);
    
    
}
