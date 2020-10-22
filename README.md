# libSDPtransform-android
Java version of the sdp-transform JavaScript library exposing the same API.  libsdptransform is a simple parser and writer of SDP. Defines internal grammar based on RFC4566 - SDP, RFC5245 - ICE, and many more.


## Usage


### parse()

Syntax: `void parse(String sdp): SessionDescription`

Parses an unprocessed SDP string and returns a SessionDescription object. SDP lines can be terminated on `\r\n` (as per specification) or just `\n`.

```private String sdp = "v=0\\r\\no=- 6664106312341408180 2 IN IP4 127.0.0.1\\r\\ns=-\\r\\nt=0 0\\r\\na=group:BUNDLE 0 1\\r\\na=msid-semantic: WMS 6ed39d95-45a1-4b41-ab1a-143daf9e9748\\r\\nm=audio 52125 UDP/TLS/RTP/SAVPF 111 103 104 9 0 8 106 105 13 110 112 113 126\\r\\nc=IN IP4 192.168.1.42\\r\\na=rtcp:9 IN IP4 0.0.0.0\\r\\na=candidate:2447636755 1 udp 2122260223 192.168.1.42 52125 typ host generation 0 network-id 1 network-cost 10\\r\\na=ice-ufrag:a2rv\\r\\na=ice-pwd:BDGAC5wK2pqN7sZ2VuZIuNhn\\r\\na=ice-options:trickle\\r\\na=fingerprint:sha-256 22:D8:AC:A3:36:D2:D5:99:45:E2:57:E5:4E:14:71:1B:C6:DA:3F:41:47:93:20:5E:65:29:E7:AB:6F:54:02:03\\r\\na=setup:actpass\\r\\na=mid:0\\r\\na=extmap:1 urn:ietf:params:rtp-hdrext:ssrc-audio-level\\r\\na=extmap:2 http://www.webrtc.org/experiments/rtp-hdrext/abs-send-time\\r\\na=extmap:3 http://www.ietf.org/id/draft-holmer-rmcat-transport-wide-cc-extensions-01\\r\\na=extmap:4 urn:ietf:params:rtp-hdrext:sdes:mid\\r\\na=extmap:5 urn:ietf:params:rtp-hdrext:sdes:rtp-stream-id\\r\\na=extmap:6 urn:ietf:params:rtp-hdrext:sdes:repaired-rtp-stream-id\\r\\na=sendonly\\r\\na=msid:6ed39d95-45a1-4b41-ab1a-143daf9e9748 69dc5096-7ee8-46ab-83ec-b8c78d735d2e\\r\\na=rtcp-mux\\r\\na=rtpmap:111 opus/48000/2\\r\\na=rtcp-fb:111 transport-cc\\r\\na=fmtp:111 minptime=10;useinbandfec=1\\r\\na=rtpmap:103 ISAC/16000\\r\\na=rtpmap:104 ISAC/32000\\r\\na=rtpmap:9 G722/8000\\r\\na=rtpmap:0 PCMU/8000\\r\\na=rtpmap:8 PCMA/8000\\r\\na=rtpmap:106 CN/32000\\r\\na=rtpmap:105 CN/16000\\r\\na=rtpmap:13 CN/8000\\r\\na=rtpmap:110 telephone-event/48000\\r\\na=rtpmap:112 telephone-event/32000\\r\\na=rtpmap:113 telephone-event/16000\\r\\na=rtpmap:126 telephone-event/8000\\r\\na=ssrc:2460160748 cname:Pyxzfsew0r7N7e5N\\r\\na=ssrc:2460160748 msid:6ed39d95-45a1-4b41-ab1a-143daf9e9748 69dc5096-7ee8-46ab-83ec-b8c78d735d2e\\r\\na=ssrc:2460160748 mslabel:6ed39d95-45a1-4b41-ab1a-143daf9e9748\\r\\na=ssrc:2460160748 label:69dc5096-7ee8-46ab-83ec-b8c78d735d2e\\r\\nm=video 52126 UDP/TLS/RTP/SAVPF 96\\r\\nc=IN IP4 192.168.1.42\\r\\na=rtcp:9 IN IP4 0.0.0.0\\r\\na=candidate:2447636755 1 udp 2122260223 192.168.1.42 52126 typ host generation 0 network-id 1 network-cost 10\\r\\na=ice-ufrag:a2rv\\r\\na=ice-pwd:BDGAC5wK2pqN7sZ2VuZIuNhn\\r\\na=ice-options:trickle\\r\\na=fingerprint:sha-256 22:D8:AC:A3:36:D2:D5:99:45:E2:57:E5:4E:14:71:1B:C6:DA:3F:41:47:93:20:5E:65:29:E7:AB:6F:54:02:03\\r\\na=setup:actpass\\r\\na=mid:1\\r\\na=extmap:14 urn:ietf:params:rtp-hdrext:toffset\\r\\na=extmap:2 http://www.webrtc.org/experiments/rtp-hdrext/abs-send-time\\r\\na=extmap:13 urn:3gpp:video-orientation\\r\\na=extmap:3 http://www.ietf.org/id/draft-holmer-rmcat-transport-wide-cc-extensions-01\\r\\na=extmap:12 http://www.webrtc.org/experiments/rtp-hdrext/playout-delay\\r\\na=extmap:11 http://www.webrtc.org/experiments/rtp-hdrext/video-content-type\\r\\na=extmap:7 http://www.webrtc.org/experiments/rtp-hdrext/video-timing\\r\\na=extmap:8 http://www.webrtc.org/experiments/rtp-hdrext/color-space\\r\\na=extmap:4 urn:ietf:params:rtp-hdrext:sdes:mid\\r\\na=extmap:5 urn:ietf:params:rtp-hdrext:sdes:rtp-stream-id\\r\\na=extmap:6 urn:ietf:params:rtp-hdrext:sdes:repaired-rtp-stream-id\\r\\na=sendonly\\r\\na=msid:6ed39d95-45a1-4b41-ab1a-143daf9e9748 9142a16f-d99e-470a-b435-847bdef02b3e\\r\\na=rtcp-mux\\r\\na=rtcp-rsize\\r\\na=rtpmap:96 VP8/90000\\r\\na=rtcp-fb:96 transport-cc\\r\\na=rtcp-fb:96 ccm fir\\r\\na=rtcp-fb:96 nack\\r\\na=rtcp-fb:96 nack pli\\r\\na=ssrc:1609611864 cname:Pyxzfsew0r7N7e5N\\r\\na=ssrc:1609611864 msid:6ed39d95-45a1-4b41-ab1a-143daf9e9748 9142a16f-d99e-470a-b435-847bdef02b3e\\r\\na=ssrc:1609611864 mslabel:6ed39d95-45a1-4b41-ab1a-143daf9e9748\\r\\na=ssrc:1609611864 label:9142a16f-d99e-470a-b435-847bdef02b3e\\r\\n\"";```

Resulting `sessionDescription` is an object as follows:

```
{
    	"groups":[
    		{
    			"mids":"0 1",
    			"type":"BUNDLE"
    		}
    	],
    	"media":[
    		{
    			"candidates":[
    				{
    					"component":1,
    					"foundation":"2447636755",
    					"generation":0,
    					"ip":"192.168.1.42",
    					"network-cost":10,
    					"network-id":1,
    					"port":52125,
    					"priority":2122260223,
    					"transport":"udp",
    					"type":"host"
    				}
    			],
    			"connection":{
    				"ip":"192.168.1.42",
    				"version":4
    			},
    			"direction":"sendonly",
    			"ext":[
    				{
    					"uri":"urn:ietf:params:rtp-hdrext:ssrc-audio-level",
    					"value":1
    				},
    				{
    					"uri":"http://www.webrtc.org/experiments/rtp-hdrext/abs-send-time",
    					"value":2
    				},
    				{
    					"uri":"http://www.ietf.org/id/draft-holmer-rmcat-transport-wide-cc-extensions-01",
    					"value":3
    				},
    				{
    					"uri":"urn:ietf:params:rtp-hdrext:sdes:mid",
    					"value":4
    				},
    				{
    					"uri":"urn:ietf:params:rtp-hdrext:sdes:rtp-stream-id",
    					"value":5
    				},
    				{
    					"uri":"urn:ietf:params:rtp-hdrext:sdes:repaired-rtp-stream-id",
    					"value":6
    				}
    			],
    			"fingerprint":{
    				"hash":"22:D8:AC:A3:36:D2:D5:99:45:E2:57:E5:4E:14:71:1B:C6:DA:3F:41:47:93:20:5E:65:29:E7:AB:6F:54:02:03",
    				"type":"sha-256"
    			},
    			"fmtp":[
    				{
    					"config":"minptime=10;useinbandfec=1",
    					"payload":111
    				}
    			],
    			"iceOptions":"trickle",
    			"icePwd":"BDGAC5wK2pqN7sZ2VuZIuNhn",
    			"iceUfrag":"a2rv",
    			"mid":"0",
    			"msid":"6ed39d95-45a1-4b41-ab1a-143daf9e9748 69dc5096-7ee8-46ab-83ec-b8c78d735d2e",
    			"payloads":"111 103 104 9 0 8 106 105 13 110 112 113 126",
    			"port":52125,
    			"protocol":"UDP/TLS/RTP/SAVPF",
    			"rtcp":{
    				"address":"0.0.0.0",
    				"ipVer":4,
    				"netType":"IN",
    				"port":9
    			},
    			"rtcpFb":[
    				{
    					"payload":"111",
    					"type":"transport-cc"
    				}
    			],
    			"rtcpMux":"rtcp-mux",
    			"rtp":[
    				{
    					"codec":"opus",
    					"encoding":"2",
    					"payload":111,
    					"rate":48000
    				},
    				{
    					"codec":"ISAC",
    					"payload":103,
    					"rate":16000
    				},
    				{
    					"codec":"ISAC",
    					"payload":104,
    					"rate":32000
    				},
    				{
    					"codec":"G722",
    					"payload":9,
    					"rate":8000
    				},
    				{
    					"codec":"PCMU",
    					"payload":0,
    					"rate":8000
    				},
    				{
    					"codec":"PCMA",
    					"payload":8,
    					"rate":8000
    				},
    				{
    					"codec":"CN",
    					"payload":106,
    					"rate":32000
    				},
    				{
    					"codec":"CN",
    					"payload":105,
    					"rate":16000
    				},
    				{
    					"codec":"CN",
    					"payload":13,
    					"rate":8000
    				},
    				{
    					"codec":"telephone-event",
    					"payload":110,
    					"rate":48000
    				},
    				{
    					"codec":"telephone-event",
    					"payload":112,
    					"rate":32000
    				},
    				{
    					"codec":"telephone-event",
    					"payload":113,
    					"rate":16000
    				},
    				{
    					"codec":"telephone-event",
    					"payload":126,
    					"rate":8000
    				}
    			],
    			"setup":"actpass",
    			"ssrcs":[
    				{
    					"attribute":"cname",
    					"id":2460160748,
    					"value":"Pyxzfsew0r7N7e5N"
    				},
    				{
    					"attribute":"msid",
    					"id":2460160748,
    					"value":"6ed39d95-45a1-4b41-ab1a-143daf9e9748 69dc5096-7ee8-46ab-83ec-b8c78d735d2e"
    				},
    				{
    					"attribute":"mslabel",
    					"id":2460160748,
    					"value":"6ed39d95-45a1-4b41-ab1a-143daf9e9748"
    				},
    				{
    					"attribute":"label",
    					"id":2460160748,
    					"value":"69dc5096-7ee8-46ab-83ec-b8c78d735d2e"
    				}
    			],
    			"type":"audio"
    		},
    		{
    			"candidates":[
    				{
    					"component":1,
    					"foundation":"2447636755",
    					"generation":0,
    					"ip":"192.168.1.42",
    					"network-cost":10,
    					"network-id":1,
    					"port":52126,
    					"priority":2122260223,
    					"transport":"udp",
    					"type":"host"
    				}
    			],
    			"connection":{
    				"ip":"192.168.1.42",
    				"version":4
    			},
    			"direction":"sendonly",
    			"ext":[
    				{
    					"uri":"urn:ietf:params:rtp-hdrext:toffset",
    					"value":14
    				},
    				{
    					"uri":"http://www.webrtc.org/experiments/rtp-hdrext/abs-send-time",
    					"value":2
    				},
    				{
    					"uri":"urn:3gpp:video-orientation",
    					"value":13
    				},
    				{
              "uri":"http://www.ietf.org/id/draft-holmer-rmcat-transport-wide-cc-extensions-01",
    					"value":3
    				},
    				{
    					"uri":"http://www.webrtc.org/experiments/rtp-hdrext/playout-delay",
    					"value":12
    				},
    				{
    					"uri":"http://www.webrtc.org/experiments/rtp-hdrext/video-content-type",
    					"value":11
    				},
    				{
    					"uri":"http://www.webrtc.org/experiments/rtp-hdrext/video-timing",
    					"value":7
    				},
    				{
    					"uri":"http://www.webrtc.org/experiments/rtp-hdrext/color-space",
    					"value":8
    				},
    				{
    					"uri":"urn:ietf:params:rtp-hdrext:sdes:mid",
    					"value":4
    				},
    				{
    					"uri":"urn:ietf:params:rtp-hdrext:sdes:rtp-stream-id",
    					"value":5
    				},
    				{
    					"uri":"urn:ietf:params:rtp-hdrext:sdes:repaired-rtp-stream-id",
    					"value":6
    				}
    			],
    			"fingerprint":{
    				"hash":"22:D8:AC:A3:36:D2:D5:99:45:E2:57:E5:4E:14:71:1B:C6:DA:3F:41:47:93:20:5E:65:29:E7:AB:6F:54:02:03",
    				"type":"sha-256"
    			},
    			"fmtp":[],
    			"iceOptions":"trickle",
    			"icePwd":"BDGAC5wK2pqN7sZ2VuZIuNhn",
    			"iceUfrag":"a2rv",
    			"mid":"1",
    			"msid":"6ed39d95-45a1-4b41-ab1a-143daf9e9748 9142a16f-d99e-470a-b435-847bdef02b3e",
    			"payloads":"96",
    			"port":52126,
    			"protocol":"UDP/TLS/RTP/SAVPF",
    			"rtcp":{
    				"address":"0.0.0.0",
    				"ipVer":4,
    				"netType":"IN",
    				"port":9
    			},
    			"rtcpFb":[
    				{
    					"payload":"96",
    					"type":"transport-cc"
    				},
    				{
    					"payload":"96",
    					"subtype":"fir",
    					"type":"ccm"
    				},
    				{
    					"payload":"96",
    					"type":"nack"
    				},
    				{
    					"payload":"96",
    					"subtype":"pli",
    					"type":"nack"
    				}
    			],
    			"rtcpMux":"rtcp-mux",
    			"rtcpRsize":"rtcp-rsize",
    			"rtp":[
    				{
    					"codec":"VP8",
    					"payload":96,
    					"rate":90000
    				}
    			],
    			"setup":"actpass",
    			"ssrcs":[
    				{
    					"attribute":"cname",
    					"id":1609611864,
    					"value":"Pyxzfsew0r7N7e5N"
    				},
    				{
    					"attribute":"msid",
    					"id":1609611864,
    					"value":"6ed39d95-45a1-4b41-ab1a-143daf9e9748 9142a16f-d99e-470a-b435-847bdef02b3e"
    				},
    				{
    					"attribute":"mslabel",
    					"id":1609611864,
    					"value":"6ed39d95-45a1-4b41-ab1a-143daf9e9748"
    				},
    				{
    					"attribute":"label",
    					"id":1609611864,
    					"value":"9142a16f-d99e-470a-b435-847bdef02b3e"
    				}
    			],
    			"type":"video"
    		}
    	],
    	"msidSemantic":{
    		"semantic":"WMS",
    		"token":"6ed39d95-45a1-4b41-ab1a-143daf9e9748"
    	},
    	"name":"-",
    	"origin":{
    		"address":"127.0.0.1",
    		"ipVer":4,
    		"netType":"IN",
    		"sessionId":6664106312341408180,
    		"sessionVersion":2,
    		"username":"-"
    	},
    	"timing":{
    		"start":0,
    		"stop":0
    	},
    	"version":"0"
    }
```

### write()

Syntax: `private void writeSdp(String sdp)`

The writer is the inverse of the parser, and will need a struct equivalent to the one returned by it.

```
v=0
    o=- 6664106312341408180 2 IN IP4 127.0.0.1
    s=-
    t=0 0
    a=msid-semantic: WMS 6ed39d95-45a1-4b41-ab1a-143daf9e9748
    a=group:BUNDLE 0 1
    m=audio 52125 UDP/TLS/RTP/SAVPF 111 103 104 9 0 8 106 105 13 110 112 113 126
    c=IN IP4 192.168.1.42
    a=rtpmap:111 opus/48000/2
    a=rtpmap:103 ISAC/16000
    a=rtpmap:104 ISAC/32000
    a=rtpmap:9 G722/8000
    a=rtpmap:0 PCMU/8000
    a=rtpmap:8 PCMA/8000
    a=rtpmap:106 CN/32000
    a=rtpmap:105 CN/16000
    a=rtpmap:13 CN/8000
    a=rtpmap:110 telephone-event/48000
    a=rtpmap:112 telephone-event/32000
    a=rtpmap:113 telephone-event/16000
    a=rtpmap:126 telephone-event/8000
    a=fmtp:111 minptime=10;useinbandfec=1
    a=rtcp:9 IN IP4 0.0.0.0
    a=rtcp-fb:111 transport-cc
    a=extmap:1 urn:ietf:params:rtp-hdrext:ssrc-audio-level
    a=extmap:2 http://www.webrtc.org/experiments/rtp-hdrext/abs-send-time
    a=extmap:3 http://www.ietf.org/id/draft-holmer-rmcat-transport-wide-cc-extensions-01
    a=extmap:4 urn:ietf:params:rtp-hdrext:sdes:mid
    a=extmap:5 urn:ietf:params:rtp-hdrext:sdes:rtp-stream-id
    a=extmap:6 urn:ietf:params:rtp-hdrext:sdes:repaired-rtp-stream-id
    a=setup:actpass
    a=mid:0
    a=msid:6ed39d95-45a1-4b41-ab1a-143daf9e9748 69dc5096-7ee8-46ab-83ec-b8c78d735d2e
    a=sendonly
    a=ice-ufrag:a2rv
    a=ice-pwd:BDGAC5wK2pqN7sZ2VuZIuNhn
    a=fingerprint:sha-256 22:D8:AC:A3:36:D2:D5:99:45:E2:57:E5:4E:14:71:1B:C6:DA:3F:41:47:93:20:5E:65:29:E7:AB:6F:54:02:03
    a=candidate:2447636755 1 udp 2122260223 192.168.1.42 52125 typ host generation 0 network-id 1 network-cost 10
    a=ice-options:trickle
    a=ssrc:2460160748 cname:Pyxzfsew0r7N7e5N
    a=ssrc:2460160748 msid:6ed39d95-45a1-4b41-ab1a-143daf9e9748 69dc5096-7ee8-46ab-83ec-b8c78d735d2e
    a=ssrc:2460160748 mslabel:6ed39d95-45a1-4b41-ab1a-143daf9e9748
    a=ssrc:2460160748 label:69dc5096-7ee8-46ab-83ec-b8c78d735d2e
    a=rtcp-mux
    m=video 52126 UDP/TLS/RTP/SAVPF 96
    c=IN IP4 192.168.1.42
    a=rtpmap:96 VP8/90000
    a=rtcp:9 IN IP4 0.0.0.0
    a=rtcp-fb:96 transport-cc
    a=rtcp-fb:96 ccm fir
    a=rtcp-fb:96 nack
    a=rtcp-fb:96 nack pli
    a=extmap:14 urn:ietf:params:rtp-hdrext:toffset
    a=extmap:2 http://www.webrtc.org/experiments/rtp-hdrext/abs-send-time
    a=extmap:13 urn:3gpp:video-orientation
    a=extmap:3 http://www.ietf.org/id/draft-holmer-rmcat-transport-wide-cc-extensions-01
    a=extmap:12 http://www.webrtc.org/experiments/rtp-hdrext/playout-delay
    a=extmap:11 http://www.webrtc.org/experiments/rtp-hdrext/video-content-type
    a=extmap:7 http://www.webrtc.org/experiments/rtp-hdrext/video-timing
    a=extmap:8 http://www.webrtc.org/experiments/rtp-hdrext/color-space
    a=extmap:4 urn:ietf:params:rtp-hdrext:sdes:mid
    a=extmap:5 urn:ietf:params:rtp-hdrext:sdes:rtp-stream-id
    a=extmap:6 urn:ietf:params:rtp-hdrext:sdes:repaired-rtp-stream-id
    a=setup:actpass
    a=mid:1
    a=msid:6ed39d95-45a1-4b41-ab1a-143daf9e9748 9142a16f-d99e-470a-b435-847bdef02b3e
    a=sendonly
    a=ice-ufrag:a2rv
    a=ice-pwd:BDGAC5wK2pqN7sZ2VuZIuNhn
    a=fingerprint:sha-256 22:D8:AC:A3:36:D2:D5:99:45:E2:57:E5:4E:14:71:1B:C6:DA:3F:41:47:93:20:5E:65:29:E7:AB:6F:54:02:03
    a=candidate:2447636755 1 udp 2122260223 192.168.1.42 52126 typ host generation 0 network-id 1 network-cost 10
    a=ice-options:trickle
    a=ssrc:1609611864 cname:Pyxzfsew0r7N7e5N
    a=ssrc:1609611864 msid:6ed39d95-45a1-4b41-ab1a-143daf9e9748 9142a16f-d99e-470a-b435-847bdef02b3e
    a=ssrc:1609611864 mslabel:6ed39d95-45a1-4b41-ab1a-143daf9e9748
    a=ssrc:1609611864 label:9142a16f-d99e-470a-b435-847bdef02b3e
    a=rtcp-mux
    a=rtcp-rsize
```

