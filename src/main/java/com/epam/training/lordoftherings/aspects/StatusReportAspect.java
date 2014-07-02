package com.epam.training.lordoftherings.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StatusReportAspect {

	 private static final Logger LOGGER = LoggerFactory.getLogger(StatusReportAspect.class);

	    @Around("execution (* com.epam.training.lordoftherings.domain..attack(..))")
	    public Object attackAnouncer(final ProceedingJoinPoint joinPoint) throws Throwable {

	    	Object target =  joinPoint.getTarget();

	        LOGGER.info(target.getClass().getName() + " started the attack!");
	        
	        Object result = joinPoint.proceed();
	        
	        LOGGER.info(target.getClass().getName() + " ended the attack!");
	        
	        return result;

	    }
}
