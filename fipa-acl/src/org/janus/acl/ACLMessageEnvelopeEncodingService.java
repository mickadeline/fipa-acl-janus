package org.janus.acl;

import org.janus.acl.ACLMessage.Envelope;

interface ACLMessageEnvelopeEncodingService
{
    public byte[] encode(Envelope env);
    
    public ACLMessageEnvelope decode(byte[] encodedEnvelope);
}
