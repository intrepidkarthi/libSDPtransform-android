package com.brytecam.sdptransform;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TransformActivity extends AppCompatActivity {

    SdpTransform
            sdpTransform;

    private String sdp = "v=0\\r\\no=- 1002656428889516107 2 IN IP4 127.0.0.1\\r\\ns=-\\r\\nt=0 0\\r\\na=group:BUNDLE 0 1\\r\\na=msid-semantic: WMS 2f64244a-7546-41f8-ba9e-1c8dc0116cbc\\r\\nm=audio 49670 UDP/TLS/RTP/SAVPF 111 103 104 9 0 8 106 105 13 110 112 113 126\\r\\nc=IN IP4 192.168.1.42\\r\\na=rtcp:9 IN IP4 0.0.0.0\\r\\na=candidate:2447636755 1 udp 2122260223 192.168.1.42 49670 typ host generation 0 network-id 1 network-cost 10\\r\\na=ice-ufrag:XuxQ\\r\\na=ice-pwd:xkOC83twMfoT8n1NQkUfsf8F\\r\\na=ice-options:trickle\\r\\na=fingerprint:sha-256 AE:37:DE:51:3A:8D:31:92:B9:F8:7C:6B:EE:5B:7D:05:B4:6A:07:95:09:19:2E:8F:AE:9C:07:BF:9F:2C:7E:06\\r\\na=setup:actpass\\r\\na=mid:0\\r\\na=extmap:1 urn:ietf:params:rtp-hdrext:ssrc-audio-level\\r\\na=extmap:2 http://www.webrtc.org/experiments/rtp-hdrext/abs-send-time\\r\\na=extmap:3 http://www.ietf.org/id/draft-holmer-rmcat-transport-wide-cc-extensions-01\\r\\na=extmap:4 urn:ietf:params:rtp-hdrext:sdes:mid\\r\\na=extmap:5 urn:ietf:params:rtp-hdrext:sdes:rtp-stream-id\\r\\na=extmap:6 urn:ietf:params:rtp-hdrext:sdes:repaired-rtp-stream-id\\r\\na=sendonly\\r\\na=msid:2f64244a-7546-41f8-ba9e-1c8dc0116cbc 84cab5b6-eb84-4c15-a210-157518aca971\\r\\na=rtcp-mux\\r\\na=rtpmap:111 opus/48000/2\\r\\na=rtcp-fb:111 transport-cc\\r\\na=fmtp:111 minptime=10;useinbandfec=1\\r\\na=rtpmap:103 ISAC/16000\\r\\na=rtpmap:104 ISAC/32000\\r\\na=rtpmap:9 G722/8000\\r\\na=rtpmap:0 PCMU/8000\\r\\na=rtpmap:8 PCMA/8000\\r\\na=rtpmap:106 CN/32000\\r\\na=rtpmap:105 CN/16000\\r\\na=rtpmap:13 CN/8000\\r\\na=rtpmap:110 telephone-event/48000\\r\\na=rtpmap:112 telephone-event/32000\\r\\na=rtpmap:113 telephone-event/16000\\r\\na=rtpmap:126 telephone-event/8000\\r\\na=ssrc:1475007658 cname:oIJKNZL1LCwWDk2x\\r\\na=ssrc:1475007658 msid:2f64244a-7546-41f8-ba9e-1c8dc0116cbc 84cab5b6-eb84-4c15-a210-157518aca971\\r\\na=ssrc:1475007658 mslabel:2f64244a-7546-41f8-ba9e-1c8dc0116cbc\\r\\na=ssrc:1475007658 label:84cab5b6-eb84-4c15-a210-157518aca971\\r\\nm=video 49671 UDP/TLS/RTP/SAVPF 96\\r\\nc=IN IP4 192.168.1.42\\r\\na=rtcp:9 IN IP4 0.0.0.0\\r\\na=candidate:2447636755 1 udp 2122260223 192.168.1.42 49671 typ host generation 0 network-id 1 network-cost 10\\r\\na=ice-ufrag:XuxQ\\r\\na=ice-pwd:xkOC83twMfoT8n1NQkUfsf8F\\r\\na=ice-options:trickle\\r\\na=fingerprint:sha-256 AE:37:DE:51:3A:8D:31:92:B9:F8:7C:6B:EE:5B:7D:05:B4:6A:07:95:09:19:2E:8F:AE:9C:07:BF:9F:2C:7E:06\\r\\na=setup:actpass\\r\\na=mid:1\\r\\na=extmap:14 urn:ietf:params:rtp-hdrext:toffset\\r\\na=extmap:2 http://www.webrtc.org/experiments/rtp-hdrext/abs-send-time\\r\\na=extmap:13 urn:3gpp:video-orientation\\r\\na=extmap:3 http://www.ietf.org/id/draft-holmer-rmcat-transport-wide-cc-extensions-01\\r\\na=extmap:12 http://www.webrtc.org/experiments/rtp-hdrext/playout-delay\\r\\na=extmap:11 http://www.webrtc.org/experiments/rtp-hdrext/video-content-type\\r\\na=extmap:7 http://www.webrtc.org/experiments/rtp-hdrext/video-timing\\r\\na=extmap:8 http://www.webrtc.org/experiments/rtp-hdrext/color-space\\r\\na=extmap:4 urn:ietf:params:rtp-hdrext:sdes:mid\\r\\na=extmap:5 urn:ietf:params:rtp-hdrext:sdes:rtp-stream-id\\r\\na=extmap:6 urn:ietf:params:rtp-hdrext:sdes:repaired-rtp-stream-id\\r\\na=sendonly\\r\\na=msid:2f64244a-7546-41f8-ba9e-1c8dc0116cbc 0262f12b-0af4-4a41-b28b-e45a7912f76a\\r\\na=rtcp-mux\\r\\na=rtcp-rsize\\r\\na=rtpmap:96 VP8/90000\\r\\na=rtcp-fb:96 transport-cc\\r\\na=rtcp-fb:96 ccm fir\\r\\na=rtcp-fb:96 nack\\r\\na=rtcp-fb:96 nack pli\\r\\na=ssrc:1165565098 cname:oIJKNZL1LCwWDk2x\\r\\na=ssrc:1165565098 msid:2f64244a-7546-41f8-ba9e-1c8dc0116cbc 0262f12b-0af4-4a41-b28b-e45a7912f76a\\r\\na=ssrc:1165565098 mslabel:2f64244a-7546-41f8-ba9e-1c8dc0116cbc\\r\\na=ssrc:1165565098 label:0262f12b-0af4-4a41-b28b-e45a7912f76a\\r\\n";


    private final int DefaultPayloadTypePCMU = 0;
    private final int DefaultPayloadTypePCMA = 8;
    private final int DefaultPayloadTypeG722 = 9;
    private final int DefaultPayloadTypeOpus = 111;
    private final int DefaultPayloadTypeVP8 = 96;
    private final int DefaultPayloadTypeVP9 = 98;
    private final int DefaultPayloadTypeH264 = 102;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transform);
        sdpTransform = new SdpTransform();
        SessionDescription sd = payloadModify(parse(sdp), "vp8", "sender");
        writeSdp(sd);
    }

    SessionDescription parse(String sdp) {
        String msdp = sdp.replaceAll("(\\\\r\\\\n|\\\\n)", "\\\n");
        SessionDescription sessionDescription = sdpTransform.parse(msdp);
        Log.v("Parsed data ", JSON.toJSONString(sessionDescription, true).toString());
        return sessionDescription;
    }

    private SessionDescription payloadModify(SessionDescription sessionDescription, String codec, String sendrcv) {
        if (sessionDescription.getMedia().size() > 0) {
            for (int i = 0; i < sessionDescription.getMedia().size(); i++) {
                Log.v("Hola", sessionDescription.getMedia().get(i).getType());
                if (sessionDescription.getMedia().get(i).getType().equals("audio")) {
                    sessionDescription.getMedia().get(i).setPayloads("111");
                    MediaAttributes.Rtp rtp = new MediaAttributes.Rtp(111, "OPUS", 48000, "2");
                    MediaAttributes.Fmtp fmtp = new MediaAttributes.Fmtp(111, "minptime=10;useinbandfec=1");

                    sessionDescription.getMedia().get(i).setRtp(Collections.singletonList(rtp));
                    sessionDescription.getMedia().get(i).setFmtp(Collections.singletonList(fmtp));
                    if (sendrcv.equals("sender"))
                        sessionDescription.getMedia().get(i).setDirection("sendonly");
                    else
                        sessionDescription.getMedia().get(i).setDirection("recvonly");
                }
                if (sessionDescription.getMedia().get(i).getType().equals("video")) {

                    int payload;
                    int rtx = 97;
                    String codeName = "";
                    if (codec.equalsIgnoreCase("vp8")) {
                        payload = DefaultPayloadTypeVP8;
                        codeName = "VP8";
                    } else if (codec.equalsIgnoreCase("vp9")) {
                        payload = DefaultPayloadTypeVP9;
                        codeName = "VP9";
                    } else if (codec.equalsIgnoreCase("h264")) {
                        payload = 102;
                        codeName = "H264";
                    } else {
                        return sessionDescription;
                    }

                    MediaAttributes.Rtp rtp = new MediaAttributes.Rtp(payload, codeName, 90000, null);
                    MediaAttributes.Fmtp fmtp = null;

                    if (payload == DefaultPayloadTypeH264) {
                        fmtp = new MediaAttributes.Fmtp(payload, "level-asymmetry-allowed=1;packetization-mode=1;profile-level-id=42e01f");
                    }

                    List<MediaAttributes.RtcpFb> rtcpFbList = new ArrayList<MediaAttributes.RtcpFb>();
                    rtcpFbList.add(new MediaAttributes.RtcpFb(String.valueOf(payload), "goog-remb", null));
                    rtcpFbList.add(new MediaAttributes.RtcpFb(String.valueOf(payload), "transport-cc", null));
                    rtcpFbList.add(new MediaAttributes.RtcpFb(String.valueOf(payload), "ccm", null));
                    rtcpFbList.add(new MediaAttributes.RtcpFb(String.valueOf(payload), "ccm", "fir"));
                    rtcpFbList.add(new MediaAttributes.RtcpFb(String.valueOf(payload), "nack", null));
                    rtcpFbList.add(new MediaAttributes.RtcpFb(String.valueOf(payload), "nack", "pli"));

                    sessionDescription.getMedia().get(i).setPayloads(String.valueOf(payload));
                    sessionDescription.getMedia().get(i).setRtp(Collections.singletonList(rtp));
                    sessionDescription.getMedia().get(i).setFmtp(Collections.singletonList(fmtp));
                    sessionDescription.getMedia().get(i).setRtcpFb(rtcpFbList);

                    if (sessionDescription.getMedia().get(i).getSsrcGroups() != null) {
                        MediaAttributes.SsrcGroup ssrcGroup = sessionDescription.getMedia().get(i).getSsrcGroups().get(0);
                        String ssrcs = ssrcGroup.getSsrcs();
                        String videoSsrc = ssrcs.split(" ")[0];


                        List<MediaAttributes.Ssrc> newSsrcs = sessionDescription.getMedia().get(i).getSsrcs();
                        for (MediaAttributes.Ssrc myssrc : newSsrcs) {
                            if (String.valueOf(myssrc.getId()) != videoSsrc)
                                newSsrcs.remove(myssrc);
                        }

                        sessionDescription.getMedia().get(i).setSsrcGroups(Collections.<MediaAttributes.SsrcGroup>emptyList());
                        sessionDescription.getMedia().get(i).setSsrcs(newSsrcs);

                    }
                    if (sendrcv.equals("sender"))
                        sessionDescription.getMedia().get(i).setDirection("sendonly");
                    else
                        sessionDescription.getMedia().get(i).setDirection("recvonly");
                }
            }
        }
        return sessionDescription;
    }

    private String writeSdp(SessionDescription sdp)
    {
        String result = sdpTransform.write(sdp);
        Log.v("Write SDP data ", result );
        return result;
    }
}








