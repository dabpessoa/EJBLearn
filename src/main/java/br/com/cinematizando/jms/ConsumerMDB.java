package br.com.cinematizando.jms;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import br.com.cinematizando.model.Address;

@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName="destinationtype", propertyValue="javax.jms.Topic")
    ,@ActivationConfigProperty(propertyName="destinationLookup", propertyValue="java:/topic/test")
})
public class ConsumerMDB implements MessageListener {

  @Override
  public void onMessage(Message message) {
    System.out.println("### MDB ###");
    try {
      ObjectMessage ob = (ObjectMessage) message;
      System.out.println( ob.getBody(Address.class ) );
    } catch (JMSException e) {
      e.printStackTrace();
    }
    System.out.println("### --- ###");
  }

}
