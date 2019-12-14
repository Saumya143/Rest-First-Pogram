 package com.nt.mapper;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.inject.Singleton;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.nt.resource.GreetResource;
@ApplicationPath("/api/*")
public class MyApplication extends Application {
	
	public MyApplication() {
		System.out.println("MyApplication.MyApplication()");
	}
	
	/*@Override
	public Set<Object> getSingletons() {
		System.out.println("MyApplication.getSingletons()");
		Set<Object> rootClassObject=new HashSet<Object>();
		rootClassObject.add(new GreetResource()  );
		return rootClassObject;
	}*/
	
	
	
	@Override
	public Map<String, Object> getProperties() {
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("jersey.config.server.provider.packages"," com.nt.resource");
		return map;
	}
	@Override
	public Set<Class<?>> getClasses() {
		System.out.println("MyApplication.getClasses()");
		return super.getClasses();
	}
	
}
