package com.iiht.ioc.annotations;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("jdbcConnector")
public class JdbcConnector {

	Logger logger = Logger.getLogger("JdbcConnector");
	public JdbcConnector() {
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void myInit()
	{
		logger.info("init called");
	}
	
	@PreDestroy
	public void myDestroy()
	{
		logger.info(" destroy called");
	}

}
