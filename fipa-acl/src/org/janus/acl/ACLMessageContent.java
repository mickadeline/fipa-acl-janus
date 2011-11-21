package org.janus.acl;

import java.util.ArrayList;

import org.janusproject.kernel.address.AgentAddress;

abstract class ACLMessageContent
{
    int performative;
    AgentAddress sender;
    ArrayList<AgentAddress> receiver;
    ArrayList<AgentAddress> replyTo;
    StringBuffer content;
    String language;
    String encoding;
    String ontology;
    String protocol;
    String conversationId;
    String replyWith;
    String inReplyTo;
    String replyBy;
}
