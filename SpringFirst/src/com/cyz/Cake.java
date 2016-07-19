package com.cyz;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Primary
@Scope(
		value=WebApplicationContext.SCOPE_SESSION,
		proxyMode=ScopedProxyMode.INTERFACES)
public class Cake implements Dessert{

	
}
