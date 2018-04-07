package jmspubsub;

import java.util.Properties;

import javax.jms.DeliveryMode;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;
import javax.naming.Context;
import javax.naming.InitialContext;

public class Publisher
{
    public static void main(String[] args) throws Exception
    {
    	Properties props = new Properties();
        props.setProperty(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
        props.setProperty(Context.PROVIDER_URL, "t3://localhost:7001");
        InitialContext ctx = new InitialContext(props);                                                                           
       // lookup the topic object
       Topic topic = (Topic) ctx.lookup("jms/JMSTopic");
                                                                           
       // lookup the topic connection factory
       TopicConnectionFactory connFactory = (TopicConnectionFactory) ctx.
           lookup("jms/TestConnectionFactory");
                                                                           
       // create a topic connection
       TopicConnection topicConn = connFactory.createTopicConnection();
                                                                           
       // create a topic session
       TopicSession topicSession = topicConn.createTopicSession(false, 
           Session.AUTO_ACKNOWLEDGE);
                                                                           
       // create a topic publisher
       TopicPublisher topicPublisher = topicSession.createPublisher(topic);
       topicPublisher.setDeliveryMode(DeliveryMode.PERSISTENT);
                                                                           
       // create the "Hello World" message
       TextMessage message = topicSession.createTextMessage();
       message.setText("Hello Ajay Kushwaha");
                                                                           
       // publish the messages
       topicPublisher.publish(message);
                                                                           
       // print what we did
       System.out.println("Message published: " + message.getText());
                                                                           
       // close the topic connection
       topicConn.close();
    }
}