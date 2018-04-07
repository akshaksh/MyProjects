package jmspointtopoint;
import javax.naming.Context;
import javax.naming.InitialContext;

import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.QueueSender;

import java.util.Properties;

import javax.jms.DeliveryMode;
import javax.jms.QueueSession;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
                                                                            
public class Sender
{
    public static void main(String[] args) throws Exception
    {
       // get the initial context
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
       QueueSession queSession = queConn.createQueueSession(false, Session.DUPS_OK_ACKNOWLEDGE);
                                                                           
       // create a queue sender
       QueueSender queSender = queSession.createSender(queue);
       queSender.setDeliveryMode(DeliveryMode.PERSISTENT);
                                                                           
       // create a simple message to say "Hello World"
       TextMessage message = queSession.createTextMessage("jhvashjd World");
                                                     
       // send the message
       queSender.send(message);
                                                                          
       // print what we did
       System.out.println("Message Sent: " + message.getText());
                                                                           
       // close the queue connection
       queConn.close();
    }
}