package org.janus.acl;

interface ACLMessageContentEncodingService
{
    public byte[] encode(ACLMessage aMsg);
    
    public ACLMessageContent decode(byte[] byteMsg);
}
