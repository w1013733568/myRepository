package com.yusheng.rest.resteasy;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;
import com.yusheng.rest.resteasy.service.HelloWorldRestService;

public class HelloWorldApplication extends Application {
	private Set<Object> singletons = new HashSet<Object>();

	public HelloWorldApplication() {
		singletons.add(new HelloWorldRestService());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
