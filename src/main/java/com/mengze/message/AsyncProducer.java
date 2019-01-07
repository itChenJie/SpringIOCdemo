package com.mengze.message;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;

public class AsyncProducer {

    public static void main(String[] args) throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer("please_rename_unique_group_name");
        producer.setNamesrvAddr("192.168.192.128:9876");
        producer.start();
        producer.setRetryTimesWhenSendFailed(0);
        for (int i=0; i<100; i++) {
            final int index = 1;
           Message message = new Message("TopicTest",
                   "TagA",
                   "OrderID188",
                   "Hello world".getBytes(RemotingHelper.DEFAULT_CHARSET));
           producer.send(message, new SendCallback() {
               @Override
               public void onSuccess(SendResult sendResult) {
                   System.out.printf("%-10d OK %s %n", index, sendResult.getMsgId());
               }

               @Override
               public void onException(Throwable e) {
                   System.out.printf("%-10d Exception %s %n", index, e);
                   e.printStackTrace();
               }
           });
        }
        producer.shutdown();
    }
}
