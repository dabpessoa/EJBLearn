package br.com.cinematizando.interceptors;

import javax.ejb.Timeout;
import javax.interceptor.AroundConstruct;
import javax.interceptor.AroundInvoke;
import javax.interceptor.AroundTimeout;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Logger
@Interceptor
public class OutroInterceptor {
  
  @AroundInvoke
  public Object doSomething(InvocationContext ic) throws Exception{
    
    System.out.println("INTERCEPTOU 2");
    
    return ic.proceed();
    
  }
  
  @AroundTimeout
  public Object doSomething2(InvocationContext ic) throws Exception{
    System.out.println("TIMEOUT");
    System.out.println("OutroInterceptor.doSomething2()");
    
    return ic.proceed();
    
  }
}
  
