package br.com.cinematizando.interceptors;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Logger
@Interceptor
public class DefaultInterceptor {

  @AroundInvoke
  public Object doSomething(InvocationContext ic) throws Exception {

    System.out.println("INTERCEPTOU");

    return ic.proceed();

  }

}
