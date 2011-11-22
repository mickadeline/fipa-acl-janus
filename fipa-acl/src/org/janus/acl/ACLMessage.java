package org.janus.acl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Properties;

import org.janusproject.kernel.address.AgentAddress;
import org.janusproject.kernel.message.ObjectMessage;

public class ACLMessage extends ObjectMessage
{
    public ACLMessage(ACLMessage aMsg) {
		super(aMsg);
		// TODO Auto-generated constructor stub
	}
    
	public class Envelope implements ACLMessageEnvelope {

		@Override
		public ArrayList<AgentAddress> getTo() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setTo(ArrayList<AgentAddress> to) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public AgentAddress getFrom() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setFrom(AgentAddress from) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String getAclRepresentation() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setAclRepresentation(String aclRepresentation) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Date getDate() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setDate(Date date) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String getComments() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setComments(String comments) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Long getPayloadLength() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setPayloadLength(Long payloadLength) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String getPayloadEncoding() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setPayloadEncoding(String payloadEncoding) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public ArrayList<AgentAddress> getIntentedReceiver() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setIntentedReceiver(ArrayList<AgentAddress> intentedReceiver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Properties getTransportBehaviour() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setTransportBehaviour(Properties transportBehaviour) {
			// TODO Auto-generated method stub
			
		}
    	
    }
	
    public class Content implements ACLMessageContent{

		@Override
		public int getPerformative() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void setPerformative(int performative) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public AgentAddress getSender() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setSender(AgentAddress sender) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public ArrayList<AgentAddress> getReceiver() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setReceiver(ArrayList<AgentAddress> receiver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public ArrayList<AgentAddress> getReplyTo() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setReplyTo(ArrayList<AgentAddress> replyTo) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public StringBuffer getContent() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setContent(StringBuffer content) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String getLanguage() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setLanguage(String language) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String getEncoding() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setEncoding(String encoding) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String getOntology() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setOntology(String ontology) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String getProtocol() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setProtocol(String protocol) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String getConversationId() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setConversationId(String conversationId) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String getReplyWith() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setReplyWith(String replyWith) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String getInReplyTo() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setInReplyTo(String inReplyTo) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String getReplyBy() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setReplyBy(String replyBy) {
			// TODO Auto-generated method stub
			
		}
    	
    }
}
