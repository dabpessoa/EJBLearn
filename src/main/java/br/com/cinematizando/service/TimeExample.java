package br.com.cinematizando.service;

import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.ejb.Timeout;
import javax.interceptor.AroundTimeout;
import javax.interceptor.InvocationContext;

import br.com.cinematizando.interceptors.Logger;

@Stateless
public class TimeExample {
  
//  @Logger//É possivel apontar para um interceptor e caso ele possua algum @AroundTimeout também sera chamado
  @Timeout
  @Schedule(hour="*", minute="*", second="30/10" )
  public void agendado() {
    System.out.println("agendado pela anotacao @Schedule");
  }
  
  @AroundTimeout
  public Object timeoutInterceptorMethod(InvocationContext ctx) throws Exception {
    System.out.println("TimeExample.timeoutInterceptorMethod()");
    return ctx.proceed();
  }
  
}
