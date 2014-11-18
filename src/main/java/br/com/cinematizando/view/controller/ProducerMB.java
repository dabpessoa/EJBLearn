package br.com.cinematizando.view.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.jms.DeliveryMode;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.JMSProducer;
import javax.jms.ObjectMessage;
import javax.jms.Topic;

import br.com.cinematizando.model.Address;

@Named
@RequestScoped
public class ProducerMB implements Serializable{

  private static final long serialVersionUID = 7662583246021120941L;
  
  @Inject
  @JMSConnectionFactory("java:/ConnectionFactory")
  private JMSContext context;
  
  @Resource(name="java:/topic/test")
  private Topic destination;
  
  @PostConstruct
  public void init() throws JMSException{
    System.out.println( context );
    System.out.println( destination );
    
    Address address = new Address(999 , "Rua t");
    ObjectMessage om = context.createObjectMessage(  address  );
    om.setJMSDeliveryMode( DeliveryMode.PERSISTENT );
    
    JMSProducer producer = context.createProducer();
    producer.setDeliveryMode(DeliveryMode.PERSISTENT);
    
    JMSProducer send = producer.send( destination , om );
  }
  
}
