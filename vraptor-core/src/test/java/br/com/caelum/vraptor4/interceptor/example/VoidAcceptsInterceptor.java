package br.com.caelum.vraptor4.interceptor.example;

import br.com.caelum.vraptor4.Accepts;
import br.com.caelum.vraptor4.Intercepts;
import br.com.caelum.vraptor4.restfulie.controller.ControllerMethod;

@Intercepts
public class VoidAcceptsInterceptor {

	@Accepts
	public void accepts(ControllerMethod controllerMethod){		
	}
}