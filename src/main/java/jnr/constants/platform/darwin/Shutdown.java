// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2010-07-31 18:57:13 +1000
package jnr.constants.platform.darwin;
public enum Shutdown implements jnr.constants.Constant {
SHUT_RD(0L),
SHUT_WR(1L),
SHUT_RDWR(2L);
private final long value;
private Shutdown(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 2L;

public final int intValue() { return (int) value; }
public final long longValue() { return value; }
}