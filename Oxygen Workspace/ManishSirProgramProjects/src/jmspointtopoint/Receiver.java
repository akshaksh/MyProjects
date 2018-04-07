package jmspointtopoint;
import javax.naming.Context;
import javax.naming.InitialContext;

import java.util.Properties;

import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.QueueSession;
import javax.jms.QueueReceiver;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
                                                                            
public class Receiver
{
    public static void main(String[] args) throws Exception
    {
    	Properties props = new Properties();
        props.setProperty(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
        props.setProperty(Context.PROVIDER_URL, "t3://localhost:7001");
        InitialContext context = new InitialContext(props);
                                                                
        // lookup the queue object
        Queue queue = (Queue) context.lookup("jms/TestJMSQueue");
                                                                            
        // lookup the queue connection factory
        QueueConnectionFactory conFactory = (QueueConnectionFactory) context.lookup ("jms/TestConnectionFactory");
                                                                           
       // create a queue connection
       QueueConnection queConn = conFactory.createQueueConnection();
                                                                           
       // create a queue session
       QueueSession queSession = queConn.createQueueSession(false,   
       Session.AUTO_ACKNOWLEDGE);
 
       // create a queue receiver
       QueueReceiver queReceiver = queSession.createReceiver(queue);
                                                                           
       // start the connection
       queConn.start();
                                                                           
       // receive a message
       TextMessage message = (TextMessage) queReceiver.receive();
                                                                           
       // print the message
       System.out.println("Message Received: " + message.getText());
                                                                           
       // close the queue connection
       queConn.close();
    }
}