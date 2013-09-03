package com.onescreen.flume.interceptor;

import org.apache.flume.Context;
import org.apache.flume.conf.ComponentConfiguration;
import org.apache.flume.interceptor.RegexExtractorInterceptorSerializer;

public class RegexExtractorInterceptorNginxMsecToMillisSerializer implements
		RegexExtractorInterceptorSerializer {

	public String serialize(String value) {
		// TODO Add check to see if in correct format.
		return value.replace(".", "");
	}

	public void configure(ComponentConfiguration conf)

	{
		// NO-OP...
	}

	public void configure(Context arg0) {
		// TODO Auto-generated method stub
	} 
}