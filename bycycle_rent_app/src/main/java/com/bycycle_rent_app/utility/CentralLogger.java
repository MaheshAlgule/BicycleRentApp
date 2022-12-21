package com.bycycle_rent_app.utility;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CentralLogger {
	private static Log LOGGER = LogFactory.getLog(CentralLogger.class);

	@AfterThrowing(pointcut = "execution(* com.bycycle_rent_app.service.*.*(..))", throwing = "exception")
	public void afterThrowingAspec(Exception exception) {
		LOGGER.error(exception.getMessage(), exception);

	}
}
