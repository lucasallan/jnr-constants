// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Sat May 02 18:23:31 +1000 2009
package com.kenai.constantine.platform;
@Deprecated
public enum SocketOption implements com.kenai.constantine.Constant {
SO_DEBUG,
SO_ACCEPTCONN,
SO_REUSEADDR,
SO_KEEPALIVE,
SO_DONTROUTE,
SO_BROADCAST,
SO_USELOOPBACK,
SO_LINGER,
SO_OOBINLINE,
SO_REUSEPORT,
SO_TIMESTAMP,
SO_ACCEPTFILTER,
SO_DONTTRUNC,
SO_WANTMORE,
SO_WANTOOBFLAG,
SO_SNDBUF,
SO_RCVBUF,
SO_SNDLOWAT,
SO_RCVLOWAT,
SO_SNDTIMEO,
SO_RCVTIMEO,
SO_ERROR,
SO_TYPE,
SO_NREAD,
SO_NKE,
SO_NOSIGPIPE,
SO_NOADDRERR,
SO_NWRITE,
SO_REUSESHAREUID,
SO_LABEL,
SO_PEERLABEL,
SO_ATTACH_FILTER,
SO_BINDTODEVICE,
SO_DETACH_FILTER,
SO_NO_CHECK,
SO_PASSCRED,
SO_PEERCRED,
SO_PEERNAME,
SO_PRIORITY,
SO_SECURITY_AUTHENTICATION,
SO_SECURITY_ENCRYPTION_NETWORK,
SO_SECURITY_ENCRYPTION_TRANSPORT,
__UNKNOWN_CONSTANT__;
private static final ConstantResolver<SocketOption> resolver = 
ConstantResolver.getResolver(SocketOption.class, 20000, 29999);
public final int value() { return resolver.intValue(this); }
public final int intValue() { return (int) resolver.longValue(this); }
public final long longValue() { return resolver.longValue(this); }
public final String description() { return resolver.description(this); }
public final String toString() { return description(); }
public final static SocketOption valueOf(int value) { 
    return resolver.valueOf(value);
}
}
