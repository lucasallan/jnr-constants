// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Sat May 02 18:23:31 +1000 2009
package com.kenai.constantine.platform;
@Deprecated
public enum Sock implements com.kenai.constantine.Constant {
SOCK_STREAM,
SOCK_DGRAM,
SOCK_RAW,
SOCK_RDM,
SOCK_SEQPACKET,
SOCK_MAXADDRLEN,
__UNKNOWN_CONSTANT__;
private static final ConstantResolver<Sock> resolver = 
ConstantResolver.getResolver(Sock.class, 20000, 29999);
public final int value() { return resolver.intValue(this); }
public final int intValue() { return (int) resolver.longValue(this); }
public final long longValue() { return resolver.longValue(this); }
public final String description() { return resolver.description(this); }
public final String toString() { return description(); }
public final static Sock valueOf(int value) { 
    return resolver.valueOf(value);
}
}
