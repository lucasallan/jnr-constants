require 'gen/ConstGenerator'
def gen_inetproto_java(options)
  ConstGenerator.new 'platform.shutdown', options do |cg|
    cg.include "netinet/in.h"
    cg.const %w[
      IPPROTO_IP
      IPPROTO_HOPOPTS
      IPPROTO_ICMP
      IPPROTO_IGMP
      IPPROTO_IPIP
      IPPROTO_TCP
      IPPROTO_EGP
      IPPROTO_PUP
      IPPROTO_UDP
      IPPROTO_IDP
      IPPROTO_TP
      IPPROTO_IPV6
      IPPROTO_ROUTING
      IPPROTO_FRAGMENT
      IPPROTO_RSVP
      IPPROTO_GRE
      IPPROTO_ESP
      IPPROTO_AH
      IPPROTO_ICMPV6
      IPPROTO_NONE
      IPPROTO_DSTOPTS
      IPPROTO_MTP
      IPPROTO_ENCAP
      IPPROTO_PIM
      IPPROTO_COMP
      IPPROTO_SCTP
      IPPROTO_RAW
      IPPROTO_MAX
    ]
  end
end