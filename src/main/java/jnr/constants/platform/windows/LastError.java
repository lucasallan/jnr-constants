// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Sat Apr 17 21:01:31 -0700 2010
package jnr.constants.platform.windows;
public enum LastError implements jnr.constants.Constant {
ERROR_INVALID_FUNCTION(1),
ERROR_FILE_NOT_FOUND(2),
ERROR_PATH_NOT_FOUND(3),
ERROR_TOO_MANY_OPEN_FILES(4),
ERROR_ACCESS_DENIED(5),
ERROR_INVALID_HANDLE(6),
ERROR_ARENA_TRASHED(7),
ERROR_NOT_ENOUGH_MEMORY(8),
ERROR_INVALID_BLOCK(9),
ERROR_BAD_ENVIRONMENT(10),
ERROR_BAD_FORMAT(11),
ERROR_INVALID_ACCESS(12),
ERROR_INVALID_DATA(13),
ERROR_INVALID_DRIVE(15),
ERROR_CURRENT_DIRECTORY(16),
ERROR_NOT_SAME_DEVICE(17),
ERROR_NO_MORE_FILES(18),
ERROR_WRITE_PROTECT(19),
ERROR_BAD_UNIT(20),
ERROR_NOT_READY(21),
ERROR_BAD_COMMAND(22),
ERROR_CRC(23),
ERROR_BAD_LENGTH(24),
ERROR_SEEK(25),
ERROR_NOT_DOS_DISK(26),
ERROR_SECTOR_NOT_FOUND(27),
ERROR_OUT_OF_PAPER(28),
ERROR_WRITE_FAULT(29),
ERROR_READ_FAULT(30),
ERROR_GEN_FAILURE(31),
ERROR_LOCK_VIOLATION(33),
ERROR_SHARING_VIOLATION(32),
ERROR_WRONG_DISK(34),
ERROR_SHARING_BUFFER_EXCEEDED(36),
ERROR_BAD_NETPATH(53),
ERROR_NETWORK_ACCESS_DENIED(65),
ERROR_BAD_NET_NAME(67),
ERROR_FILE_EXISTS(80),
ERROR_CANNOT_MAKE(82),
ERROR_FAIL_I24(83),
ERROR_INVALID_PARAMETER(87),
ERROR_NO_PROC_SLOTS(89),
ERROR_DRIVE_LOCKED(108),
ERROR_BROKEN_PIPE(109),
ERROR_DISK_FULL(112),
ERROR_INVALID_TARGET_HANDLE(114),
ERROR_WAIT_NO_CHILDREN(128),
ERROR_CHILD_NOT_COMPLETE(129),
ERROR_DIRECT_ACCESS_HANDLE(130),
ERROR_NEGATIVE_SEEK(131),
ERROR_SEEK_ON_DEVICE(132),
ERROR_DIR_NOT_EMPTY(145),
ERROR_DIRECTORY(267),
ERROR_NOT_LOCKED(158),
ERROR_BAD_PATHNAME(161),
ERROR_MAX_THRDS_REACHED(164),
ERROR_LOCK_FAILED(167),
ERROR_ALREADY_EXISTS(183),
ERROR_INVALID_STARTING_CODESEG(188),
ERROR_INVALID_STACKSEG(189),
ERROR_INVALID_MODULETYPE(190),
ERROR_INVALID_EXE_SIGNATURE(191),
ERROR_EXE_MARKED_INVALID(192),
ERROR_BAD_EXE_FORMAT(193),
ERROR_ITERATED_DATA_EXCEEDS_64k(194),
ERROR_INVALID_MINALLOCSIZE(195),
ERROR_DYNLINK_FROM_INVALID_RING(196),
ERROR_IOPL_NOT_ENABLED(197),
ERROR_INVALID_SEGDPL(198),
ERROR_AUTODATASEG_EXCEEDS_64k(199),
ERROR_RING2SEG_MUST_BE_MOVABLE(200),
ERROR_RELOC_CHAIN_XEEDS_SEGLIM(201),
ERROR_INFLOOP_IN_RELOC_CHAIN(202),
ERROR_FILENAME_EXCED_RANGE(206),
ERROR_NESTING_NOT_ALLOWED(215),
// ERROR_PIPE_LOCAL not defined
ERROR_BAD_PIPE(230),
ERROR_PIPE_BUSY(231),
ERROR_NO_DATA(232),
ERROR_PIPE_NOT_CONNECTED(233),
ERROR_OPERATION_ABORTED(995),
ERROR_NOT_ENOUGH_QUOTA(1816),
ERROR_MOD_NOT_FOUND(126),
WSAEINTR(10004),
WSAEBADF(10009),
WSAEACCES(10013),
WSAEFAULT(10014),
WSAEINVAL(10022),
WSAEMFILE(10024),
WSAEWOULDBLOCK(10035),
WSAEINPROGRESS(10036),
WSAEALREADY(10037),
WSAENOTSOCK(10038),
WSAEDESTADDRREQ(10039),
WSAEMSGSIZE(10040),
WSAEPROTOTYPE(10041),
WSAENOPROTOOPT(10042),
WSAEPROTONOSUPPORT(10043),
WSAESOCKTNOSUPPORT(10044),
WSAEOPNOTSUPP(10045),
WSAEPFNOSUPPORT(10046),
WSAEAFNOSUPPORT(10047),
WSAEADDRINUSE(10048),
WSAEADDRNOTAVAIL(10049),
WSAENETDOWN(10050),
WSAENETUNREACH(10051),
WSAENETRESET(10052),
WSAECONNABORTED(10053),
WSAECONNRESET(10054),
WSAENOBUFS(10055),
WSAEISCONN(10056),
WSAENOTCONN(10057),
WSAESHUTDOWN(10058),
WSAETOOMANYREFS(10059),
WSAETIMEDOUT(10060),
WSAECONNREFUSED(10061),
WSAELOOP(10062),
WSAENAMETOOLONG(10063),
WSAEHOSTDOWN(10064),
WSAEHOSTUNREACH(10065),
WSAENOTEMPTY(10066),
WSAEPROCLIM(10067),
WSAEUSERS(10068),
WSAEDQUOT(10069),
WSAESTALE(10070),
WSAEREMOTE(10071),
WSASYSNOTREADY(10091),
WSAVERNOTSUPPORTED(10092),
WSANOTINITIALISED(10093),
WSAEDISCON(10101),
WSAENOMORE(10102),
WSAECANCELLED(10103),
WSAEINVALIDPROCTABLE(10104),
WSAEINVALIDPROVIDER(10105),
WSAEPROVIDERFAILEDINIT(10106),
WSASYSCALLFAILURE(10107),
WSASERVICE_NOT_FOUND(10108),
WSATYPE_NOT_FOUND(10109),
WSA_E_NO_MORE(10110),
WSA_E_CANCELLED(10111),
WSAEREFUSED(10112),
WSAHOST_NOT_FOUND(11001),
WSATRY_AGAIN(11002),
WSANO_RECOVERY(11003),
WSANO_DATA(11004);
private final int value;
private LastError(int value) { this.value = value; }
public static final long MIN_VALUE = 1;
public static final long MAX_VALUE = 11004;

static final class StringTable {
  public static final java.util.Map<LastError, String> descriptions = generateTable();
  public static final java.util.Map<LastError, String> generateTable() {
    java.util.Map<LastError, String> map = new java.util.EnumMap<LastError, String>(LastError.class);
  map.put(ERROR_INVALID_FUNCTION, "Incorrect function");
  map.put(ERROR_FILE_NOT_FOUND, "The system cannot find the file specified");
  map.put(ERROR_PATH_NOT_FOUND, "The system cannot find the path specified");
  map.put(ERROR_TOO_MANY_OPEN_FILES, "The system cannot open the file");
  map.put(ERROR_ACCESS_DENIED, "Access is denied");
  map.put(ERROR_INVALID_HANDLE, "The handle is invalid");
  map.put(ERROR_ARENA_TRASHED, "The storage control blocks were destroyed");
  map.put(ERROR_NOT_ENOUGH_MEMORY, "Not enough storage is available to process this command");
  map.put(ERROR_INVALID_BLOCK, "The storage control block address is invalid");
  map.put(ERROR_BAD_ENVIRONMENT, "The environment is incorrect");
  map.put(ERROR_BAD_FORMAT, "An attempt was made to load a program with an incorrect format");
  map.put(ERROR_INVALID_ACCESS, "The access code is invalid");
  map.put(ERROR_INVALID_DATA, "The data is invalid");
  map.put(ERROR_INVALID_DRIVE, "The system cannot find the drive specified");
  map.put(ERROR_CURRENT_DIRECTORY, "The directory cannot be removed");
  map.put(ERROR_NOT_SAME_DEVICE, "The system cannot move the file to a different disk drive");
  map.put(ERROR_NO_MORE_FILES, "There are no more files");
  map.put(ERROR_WRITE_PROTECT, "The media is write protected");
  map.put(ERROR_BAD_UNIT, "The system cannot find the device specified");
  map.put(ERROR_NOT_READY, "The device is not ready");
  map.put(ERROR_BAD_COMMAND, "The device does not recognize the command");
  map.put(ERROR_CRC, "Data error (cyclic redundancy check)");
  map.put(ERROR_BAD_LENGTH, "The program issued a command but the command length is incorrect");
  map.put(ERROR_SEEK, "The drive cannot locate a specific area or track on the disk");
  map.put(ERROR_NOT_DOS_DISK, "The specified disk or diskette cannot be accessed");
  map.put(ERROR_SECTOR_NOT_FOUND, "The drive cannot find the sector requested");
  map.put(ERROR_OUT_OF_PAPER, "The printer is out of paper");
  map.put(ERROR_WRITE_FAULT, "The system cannot write to the specified device");
  map.put(ERROR_READ_FAULT, "The system cannot read from the specified device");
  map.put(ERROR_GEN_FAILURE, "A device attached to the system is not functioning");
  map.put(ERROR_LOCK_VIOLATION, "The process cannot access the file because another process has locked a portion of the file");
  map.put(ERROR_SHARING_VIOLATION, "The process cannot access the file because it is being used by another process");
  map.put(ERROR_WRONG_DISK, "ERROR_WRONG_DISK");
  map.put(ERROR_SHARING_BUFFER_EXCEEDED, "Too many files opened for sharing");
  map.put(ERROR_BAD_NETPATH, "The network path was not found");
  map.put(ERROR_NETWORK_ACCESS_DENIED, "Network access is denied");
  map.put(ERROR_BAD_NET_NAME, "The network name cannot be found");
  map.put(ERROR_FILE_EXISTS, "The file exists");
  map.put(ERROR_CANNOT_MAKE, "The directory or file cannot be created");
  map.put(ERROR_FAIL_I24, "Fail on INT 24");
  map.put(ERROR_INVALID_PARAMETER, "The parameter is incorrect");
  map.put(ERROR_NO_PROC_SLOTS, "The system cannot start another process at this time");
  map.put(ERROR_DRIVE_LOCKED, "The disk is in use or locked by another process");
  map.put(ERROR_BROKEN_PIPE, "The pipe has been ended");
  map.put(ERROR_DISK_FULL, "There is not enough space on the disk");
  map.put(ERROR_INVALID_TARGET_HANDLE, "The target internal file identifier is incorrect");
  map.put(ERROR_WAIT_NO_CHILDREN, "There are no child processes to wait for");
  map.put(ERROR_CHILD_NOT_COMPLETE, "ERROR_CHILD_NOT_COMPLETE");
  map.put(ERROR_DIRECT_ACCESS_HANDLE, "Attempt to use a file handle to an open disk partition for an operation other than raw disk I/O");
  map.put(ERROR_NEGATIVE_SEEK, "An attempt was made to move the file pointer before the beginning of the file");
  map.put(ERROR_SEEK_ON_DEVICE, "The file pointer cannot be set on the specified device or file");
  map.put(ERROR_DIR_NOT_EMPTY, "The directory is not empty");
  map.put(ERROR_DIRECTORY, "The directory name is invalid");
  map.put(ERROR_NOT_LOCKED, "The segment is already unlocked");
  map.put(ERROR_BAD_PATHNAME, "The specified path is invalid");
  map.put(ERROR_MAX_THRDS_REACHED, "No more threads can be created in the system");
  map.put(ERROR_LOCK_FAILED, "Unable to lock a region of a file");
  map.put(ERROR_ALREADY_EXISTS, "Cannot create a file when that file already exists");
  map.put(ERROR_INVALID_STARTING_CODESEG, "ERROR_INVALID_STARTING_CODESEG");
  map.put(ERROR_INVALID_STACKSEG, "ERROR_INVALID_STACKSEG");
  map.put(ERROR_INVALID_MODULETYPE, "ERROR_INVALID_MODULETYPE");
  map.put(ERROR_INVALID_EXE_SIGNATURE, "ERROR_INVALID_EXE_SIGNATURE");
  map.put(ERROR_EXE_MARKED_INVALID, "ERROR_EXE_MARKED_INVALID");
  map.put(ERROR_BAD_EXE_FORMAT, "ERROR_BAD_EXE_FORMAT");
  map.put(ERROR_ITERATED_DATA_EXCEEDS_64k, "ERROR_ITERATED_DATA_EXCEEDS_64k");
  map.put(ERROR_INVALID_MINALLOCSIZE, "ERROR_INVALID_MINALLOCSIZE");
  map.put(ERROR_DYNLINK_FROM_INVALID_RING, "The operating system cannot run this application program");
  map.put(ERROR_IOPL_NOT_ENABLED, "The operating system is not presently configured to run this application");
  map.put(ERROR_INVALID_SEGDPL, "ERROR_INVALID_SEGDPL");
  map.put(ERROR_AUTODATASEG_EXCEEDS_64k, "The operating system cannot run this application program");
  map.put(ERROR_RING2SEG_MUST_BE_MOVABLE, "The code segment cannot be greater than or equal to 64K");
  map.put(ERROR_RELOC_CHAIN_XEEDS_SEGLIM, "ERROR_RELOC_CHAIN_XEEDS_SEGLIM");
  map.put(ERROR_INFLOOP_IN_RELOC_CHAIN, "ERROR_INFLOOP_IN_RELOC_CHAIN");
  map.put(ERROR_FILENAME_EXCED_RANGE, "The filename or extension is too long");
  map.put(ERROR_NESTING_NOT_ALLOWED, "Cannot nest calls to LoadModule");
  map.put(ERROR_BAD_PIPE, "The pipe state is invalid");
  map.put(ERROR_PIPE_BUSY, "All pipe instances are busy");
  map.put(ERROR_NO_DATA, "The pipe is being closed");
  map.put(ERROR_PIPE_NOT_CONNECTED, "No process is on the other end of the pipe");
  map.put(ERROR_OPERATION_ABORTED, "The I/O operation has been aborted because of either a thread exit or an application request");
  map.put(ERROR_NOT_ENOUGH_QUOTA, "Not enough quota is available to process this command");
  map.put(ERROR_MOD_NOT_FOUND, "The specified module could not be found");
  map.put(WSAEINTR, "A blocking operation was interrupted by a call to WSACancelBlockingCall");
  map.put(WSAEBADF, "The file handle supplied is not valid");
  map.put(WSAEACCES, "An attempt was made to access a socket in a way forbidden by its access permissions");
  map.put(WSAEFAULT, "The system detected an invalid pointer address in attempting to use a pointer argument in a call");
  map.put(WSAEINVAL, "An invalid argument was supplied");
  map.put(WSAEMFILE, "Too many open sockets");
  map.put(WSAEWOULDBLOCK, "A non-blocking socket operation could not be completed immediately");
  map.put(WSAEINPROGRESS, "A blocking operation is currently executing");
  map.put(WSAEALREADY, "An operation was attempted on a non-blocking socket that already had an operation in progress");
  map.put(WSAENOTSOCK, "An operation was attempted on something that is not a socket");
  map.put(WSAEDESTADDRREQ, "A required address was omitted from an operation on a socket");
  map.put(WSAEMSGSIZE, "A message sent on a datagram socket was larger than the internal message buffer or some other network limit, or the buffer used to receive a datagram into was smaller than the datagram itself");
  map.put(WSAEPROTOTYPE, "A protocol was specified in the socket function call that does not support the semantics of the socket type requested");
  map.put(WSAENOPROTOOPT, "An unknown, invalid, or unsupported option or level was specified in a getsockopt or setsockopt call");
  map.put(WSAEPROTONOSUPPORT, "The requested protocol has not been configured into the system, or no implementation for it exists");
  map.put(WSAESOCKTNOSUPPORT, "The support for the specified socket type does not exist in this address family");
  map.put(WSAEOPNOTSUPP, "The attempted operation is not supported for the type of object referenced");
  map.put(WSAEPFNOSUPPORT, "The protocol family has not been configured into the system or no implementation for it exists");
  map.put(WSAEAFNOSUPPORT, "An address incompatible with the requested protocol was used");
  map.put(WSAEADDRINUSE, "Only one usage of each socket address (protocol/network address/port) is normally permitted");
  map.put(WSAEADDRNOTAVAIL, "The requested address is not valid in its context");
  map.put(WSAENETDOWN, "A socket operation encountered a dead network");
  map.put(WSAENETUNREACH, "A socket operation was attempted to an unreachable network");
  map.put(WSAENETRESET, "The connection has been broken due to keep-alive activity detecting a failure while the operation was in progress");
  map.put(WSAECONNABORTED, "An established connection was aborted by the software in your host machine");
  map.put(WSAECONNRESET, "An existing connection was forcibly closed by the remote host");
  map.put(WSAENOBUFS, "An operation on a socket could not be performed because the system lacked sufficient buffer space or because a queue was full");
  map.put(WSAEISCONN, "A connect request was made on an already connected socket");
  map.put(WSAENOTCONN, "A request to send or receive data was disallowed because the socket is not connected and (when sending on a datagram socket using a sendto call) no address was supplied");
  map.put(WSAESHUTDOWN, "A request to send or receive data was disallowed because the socket had already been shut down in that direction with a previous shutdown call");
  map.put(WSAETOOMANYREFS, "Too many references to some kernel object");
  map.put(WSAETIMEDOUT, "A connection attempt failed because the connected party did not properly respond after a period of time, or established connection failed because connected host has failed to respond");
  map.put(WSAECONNREFUSED, "No connection could be made because the target machine actively refused it");
  map.put(WSAELOOP, "Cannot translate name");
  map.put(WSAENAMETOOLONG, "Name component or name was too long");
  map.put(WSAEHOSTDOWN, "A socket operation failed because the destination host was down");
  map.put(WSAEHOSTUNREACH, "A socket operation was attempted to an unreachable host");
  map.put(WSAENOTEMPTY, "Cannot remove a directory that is not empty");
  map.put(WSAEPROCLIM, "A Windows Sockets implementation may have a limit on the number of applications that may use it simultaneously");
  map.put(WSAEUSERS, "Ran out of quota");
  map.put(WSAEDQUOT, "Ran out of disk quota");
  map.put(WSAESTALE, "File handle reference is no longer available");
  map.put(WSAEREMOTE, "Item is not available locally");
  map.put(WSASYSNOTREADY, "WSAStartup cannot function at this time because the underlying system it uses to provide network services is currently unavailable");
  map.put(WSAVERNOTSUPPORTED, "The Windows Sockets version requested is not supported");
  map.put(WSANOTINITIALISED, "Either the application has not called WSAStartup, or WSAStartup failed");
  map.put(WSAEDISCON, "Returned by WSARecv or WSARecvFrom to indicate the remote party has initiated a graceful shutdown sequence");
  map.put(WSAENOMORE, "No more results can be returned by WSALookupServiceNext");
  map.put(WSAECANCELLED, "A call to WSALookupServiceEnd was made while this call was still processing. The call has been canceled");
  map.put(WSAEINVALIDPROCTABLE, "The procedure call table is invalid");
  map.put(WSAEINVALIDPROVIDER, "The requested service provider is invalid");
  map.put(WSAEPROVIDERFAILEDINIT, "The requested service provider could not be loaded or initialized");
  map.put(WSASYSCALLFAILURE, "A system call that should never fail has failed");
  map.put(WSASERVICE_NOT_FOUND, "No such service is known. The service cannot be found in the specified name space");
  map.put(WSATYPE_NOT_FOUND, "The specified class was not found");
  map.put(WSA_E_NO_MORE, "No more results can be returned by WSALookupServiceNext");
  map.put(WSA_E_CANCELLED, "A call to WSALookupServiceEnd was made while this call was still processing. The call has been canceled");
  map.put(WSAEREFUSED, "A database query failed because it was actively refused");
  map.put(WSAHOST_NOT_FOUND, "No such host is known");
  map.put(WSATRY_AGAIN, "This is usually a temporary error during hostname resolution and means that the local server did not receive a response from an authoritative server");
  map.put(WSANO_RECOVERY, "A non-recoverable error occurred during a database lookup");
  map.put(WSANO_DATA, "The requested name is valid and was found in the database, but it does not have the correct associated data being resolved for");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return value; }
public final int intValue() { return value; }
public final long longValue() { return value; }
}
