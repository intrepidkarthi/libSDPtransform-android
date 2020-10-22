package com.brytecam.sdptransform;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class TransformActivity extends AppCompatActivity {

    SdpTransform
            sdpTransform;

    private String sdp = "v=0\\r\\no=- 6664106312341408180 2 IN IP4 127.0.0.1\\r\\ns=-\\r\\nt=0 0\\r\\na=group:BUNDLE 0 1\\r\\na=msid-semantic: WMS 6ed39d95-45a1-4b41-ab1a-143daf9e9748\\r\\nm=audio 52125 UDP/TLS/RTP/SAVPF 111 103 104 9 0 8 106 105 13 110 112 113 126\\r\\nc=IN IP4 192.168.1.42\\r\\na=rtcp:9 IN IP4 0.0.0.0\\r\\na=candidate:2447636755 1 udp 2122260223 192.168.1.42 52125 typ host generation 0 network-id 1 network-cost 10\\r\\na=ice-ufrag:a2rv\\r\\na=ice-pwd:BDGAC5wK2pqN7sZ2VuZIuNhn\\r\\na=ice-options:trickle\\r\\na=fingerprint:sha-256 22:D8:AC:A3:36:D2:D5:99:45:E2:57:E5:4E:14:71:1B:C6:DA:3F:41:47:93:20:5E:65:29:E7:AB:6F:54:02:03\\r\\na=setup:actpass\\r\\na=mid:0\\r\\na=extmap:1 urn:ietf:params:rtp-hdrext:ssrc-audio-level\\r\\na=extmap:2 http://www.webrtc.org/experiments/rtp-hdrext/abs-send-time\\r\\na=extmap:3 http://www.ietf.org/id/draft-holmer-rmcat-transport-wide-cc-extensions-01\\r\\na=extmap:4 urn:ietf:params:rtp-hdrext:sdes:mid\\r\\na=extmap:5 urn:ietf:params:rtp-hdrext:sdes:rtp-stream-id\\r\\na=extmap:6 urn:ietf:params:rtp-hdrext:sdes:repaired-rtp-stream-id\\r\\na=sendonly\\r\\na=msid:6ed39d95-45a1-4b41-ab1a-143daf9e9748 69dc5096-7ee8-46ab-83ec-b8c78d735d2e\\r\\na=rtcp-mux\\r\\na=rtpmap:111 opus/48000/2\\r\\na=rtcp-fb:111 transport-cc\\r\\na=fmtp:111 minptime=10;useinbandfec=1\\r\\na=rtpmap:103 ISAC/16000\\r\\na=rtpmap:104 ISAC/32000\\r\\na=rtpmap:9 G722/8000\\r\\na=rtpmap:0 PCMU/8000\\r\\na=rtpmap:8 PCMA/8000\\r\\na=rtpmap:106 CN/32000\\r\\na=rtpmap:105 CN/16000\\r\\na=rtpmap:13 CN/8000\\r\\na=rtpmap:110 telephone-event/48000\\r\\na=rtpmap:112 telephone-event/32000\\r\\na=rtpmap:113 telephone-event/16000\\r\\na=rtpmap:126 telephone-event/8000\\r\\na=ssrc:2460160748 cname:Pyxzfsew0r7N7e5N\\r\\na=ssrc:2460160748 msid:6ed39d95-45a1-4b41-ab1a-143daf9e9748 69dc5096-7ee8-46ab-83ec-b8c78d735d2e\\r\\na=ssrc:2460160748 mslabel:6ed39d95-45a1-4b41-ab1a-143daf9e9748\\r\\na=ssrc:2460160748 label:69dc5096-7ee8-46ab-83ec-b8c78d735d2e\\r\\nm=video 52126 UDP/TLS/RTP/SAVPF 96\\r\\nc=IN IP4 192.168.1.42\\r\\na=rtcp:9 IN IP4 0.0.0.0\\r\\na=candidate:2447636755 1 udp 2122260223 192.168.1.42 52126 typ host generation 0 network-id 1 network-cost 10\\r\\na=ice-ufrag:a2rv\\r\\na=ice-pwd:BDGAC5wK2pqN7sZ2VuZIuNhn\\r\\na=ice-options:trickle\\r\\na=fingerprint:sha-256 22:D8:AC:A3:36:D2:D5:99:45:E2:57:E5:4E:14:71:1B:C6:DA:3F:41:47:93:20:5E:65:29:E7:AB:6F:54:02:03\\r\\na=setup:actpass\\r\\na=mid:1\\r\\na=extmap:14 urn:ietf:params:rtp-hdrext:toffset\\r\\na=extmap:2 http://www.webrtc.org/experiments/rtp-hdrext/abs-send-time\\r\\na=extmap:13 urn:3gpp:video-orientation\\r\\na=extmap:3 http://www.ietf.org/id/draft-holmer-rmcat-transport-wide-cc-extensions-01\\r\\na=extmap:12 http://www.webrtc.org/experiments/rtp-hdrext/playout-delay\\r\\na=extmap:11 http://www.webrtc.org/experiments/rtp-hdrext/video-content-type\\r\\na=extmap:7 http://www.webrtc.org/experiments/rtp-hdrext/video-timing\\r\\na=extmap:8 http://www.webrtc.org/experiments/rtp-hdrext/color-space\\r\\na=extmap:4 urn:ietf:params:rtp-hdrext:sdes:mid\\r\\na=extmap:5 urn:ietf:params:rtp-hdrext:sdes:rtp-stream-id\\r\\na=extmap:6 urn:ietf:params:rtp-hdrext:sdes:repaired-rtp-stream-id\\r\\na=sendonly\\r\\na=msid:6ed39d95-45a1-4b41-ab1a-143daf9e9748 9142a16f-d99e-470a-b435-847bdef02b3e\\r\\na=rtcp-mux\\r\\na=rtcp-rsize\\r\\na=rtpmap:96 VP8/90000\\r\\na=rtcp-fb:96 transport-cc\\r\\na=rtcp-fb:96 ccm fir\\r\\na=rtcp-fb:96 nack\\r\\na=rtcp-fb:96 nack pli\\r\\na=ssrc:1609611864 cname:Pyxzfsew0r7N7e5N\\r\\na=ssrc:1609611864 msid:6ed39d95-45a1-4b41-ab1a-143daf9e9748 9142a16f-d99e-470a-b435-847bdef02b3e\\r\\na=ssrc:1609611864 mslabel:6ed39d95-45a1-4b41-ab1a-143daf9e9748\\r\\na=ssrc:1609611864 label:9142a16f-d99e-470a-b435-847bdef02b3e\\r\\n\"";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transform);

        sdp.replace("\\n","");
        sdpTransform = new SdpTransform();
        String msdp = sdp.replaceAll("(\\\\r\\\\n|\\\\n)", "\\\n");
        parse(msdp);
        parseParameter(msdp);
        parsePayloads(msdp);
        writeSdp(msdp);
    }


    void parse(String sdp)
    {
        // com.brytecam.sdptransform.SdpTransform.class();
        Log.v("Parsed before ", sdp);
        SessionDescription sessionDescription = sdpTransform.parse(sdp);
        Log.v("Parsed data ", JSON.toJSONString(sessionDescription, true).toString());
    }


    /*
     * input: profile-level-id=4d0028;packetization-mode=1
     * output: {
    	"packetization-mode":1,
    	"profile-level-id":"4d0028"
    }
     */
    private void parseParameter(String sdp)
    {
        SessionDescription sessionDescription = sdpTransform.parse(sdp);
        List<MediaAttributes.Fmtp> fmtpList = sessionDescription.getMedia().get(1).getFmtp();
        if (fmtpList.size()>0) {
            String config = fmtpList.get(0).getConfig();
            Log.v("Parsed parameter data ", JSON.toJSONString(sdpTransform.parseParams(config), true).toString());
        }
    }



    /*
     * input: 97 98
     * output: [97, 98]
     */
    private void parsePayloads(String sdp)
    {
        SessionDescription sessionDescription = sdpTransform.parse(sdp);
        String payload = sessionDescription.getMedia().get(1).getPayloads();
        if(payload!=null)
        {
            Log.v("Parsed payload data ", JSON.toJSONString(sdpTransform.parsePayloads(payload), true).toString());
        }
    }


    private void writeSdp(String sdp)
    {
        SessionDescription sessionDescription =  sdpTransform.parse(sdp);
        Log.v("Write SDP data ", sdpTransform.write(sessionDescription).toString());

    }
}