package edu.nuaa.netty.util;

import edu.nuaa.netty.domain.MsgBody;

/**
 * @author brain
 * @version 1.0
 * @date 2023/5/30 20:51
 */
public class MsgUtil {
    /**
     * 构建protobuf消息体
     */
    public static MsgBody buildMsg(String channelId, String msgInfo) {
        MsgBody.Builder msg = MsgBody.newBuilder();
        msg.setChannelId(channelId);
        msg.setMsgInfo(msgInfo);
        return msg.build();
    }
}
