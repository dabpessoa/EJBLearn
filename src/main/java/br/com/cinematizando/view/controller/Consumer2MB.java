package br.com.cinematizando.view.controller;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSConnectionFactoryDefinition;
import javax.jms.JMSConnectionFactoryDefinitions;
import javax.jms.JMSConsumer;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;
import javax.jms.Topic;

import br.com.cinematizando.model.Address;



@Named
@RequestScoped
public class Consumer2MB {
  
  @Inject
  
  @JMSConnectionFactory("java:/ConnectionFactory")
  private JMSContext context;
  
  @Resource(name="java:/topic/test")
  private Topic topic;
  
  @PostConstruct
  public void init() throws JMSException{
    System.out.println("ClientId: " + context.getClientID() );
    JMSConsumer createDurableConsumer = context.createDurableConsumer(topic, "SUB#2");
    ObjectMessage receive = (ObjectMessage) createDurableConsumer.receive();
    System.out.println( "Consumer 2");
    System.out.println( receive );
    System.out.println( receive.getBody(Address.class ) );
  }
  
}
