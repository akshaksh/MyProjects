package jmspubsub;
import javax.naming.Context;
import javax.naming.InitialContext;                                                                           
import javax.jms.Topic;

import java.util.Properties;

import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.TopicSession;
import javax.jms.TopicSubscriber;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
                                                                            
public class Subscriber
{
    public static void main(String[] args) throws Exception
    {
    	Properties props = new Properties();
        props.setProperty(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
        props.setProperty(Context.PROVIDER_URL, "t3://localhost:7001");
        InitialContext ctx = new InitialContext(props);
        System.out.println("Hello");                   
       // lookup the topic object
        Topic topic = (Topic) ctx.lookup("jms/JMSTopic");
                                                                           
       // lookup the topic connection factory
       TopicConnectionFactory connFactory = (TopicConnectionFactory) ctx.
           lookup("jms/TestConnectionFactory");
       System.out.println("Hello1");                                       
       // create a topic connection
       TopicConnection topicConn = connFactory.createTopicConnection();
                                                                           
       // create a topic session
       TopicSession topicSession = topicConn.createTopicSession(false,
           Session.AUTO_ACKNOWLEDGE);
                                                                           
       // create a topic subscriber
       TopicSubscriber topicSubscriber = topicSession.createSubscriber(topic);
       System.out.println("Hello2");                                          
       // start the connection
       topicConn.start();
       System.out.println("Hello3");                                       
       // receive the message
       TextMessage message = (TextMessage) topicSubscriber.receive();
       System.out.println("Hello4");
       // print the message
       System.out.println("Message received: " + message.getText());
                                                                           
       // close the topic connection
       topicConn.close();
    }
}