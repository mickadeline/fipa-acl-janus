package org.janus.acl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Properties;

import org.janusproject.kernel.address.AgentAddress;

abstract class ACLMessageEnvelope
{
    ArrayList<AgentAddress> to;
    AgentAddress from;
    String aclRepresentation;
    Date date;
    String comments;
    Long payloadLength;
    String payloadEncoding;
    ArrayList<AgentAddress> intentedReceiver;
    Properties transportBehaviour;
}
