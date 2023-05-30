package edu.nuaa;

import com.googlecode.protobuf.format.JsonFormat;
import edu.nuaa.netty.domain.MsgBody;
import org.junit.Test;

/**
 * @author brain
 * @version 1.0
 * @date 2023/5/30 21:15
 */
public class ApiTest {
    @Test
    public void test() throws JsonFormat.ParseException {
        MsgBody.Builder msg = MsgBody.newBuilder();
        msg.setChannelId("abD01223");
        msg.setMsgInfo("hi helloworld");
        MsgBody msgBody = msg.build();

        //protobuf转Json 需要引入protobuf-java-format
        String msgBodyStr = JsonFormat.printToString(msgBody);
        System.out.println(msgBodyStr);

        //json转protobuf 需要引入protobuf-java-format
        JsonFormat.merge("{\"channelId\": \"HBdhi993\",\"msgInfo\": \"hi bugstack虫洞栈\"}", msg);
        msgBody = msg.build();
        System.out.println(msgBody.getChannelId());
        System.out.println(msgBody.getMsgInfo());

    }

}
