package com.epam.training.lordoftherings.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.epam.training.lordoftherings.domain.Army;
import com.epam.training.lordoftherings.domain.Person;

@Aspect
@Component
public class StatusReportAspect {

	 private static final Logger LOGGER = LoggerFactory.getLogger(StatusReportAspect.class);

	    @Around("execution (* com.epam.training.lordoftherings.domain.Person.attack(..))")
	    public Object attackAnouncerForPerson(final ProceedingJoinPoint joinPoint) throws Throwable {

	    	Person target =  (Person)joinPoint.getTarget();

	        LOGGER.info(target.battleCry());
	        
	        Object result = joinPoint.proceed();
	        
	        LOGGER.info(target.getName() + " ended the attack!");
	        
	        return result;

	    }
	    
	    @Around("execution (* com.epam.training.lordoftherings.domain.Army.attack(..))")
	    public Object attackAnouncerForArmy(final ProceedingJoinPoint joinPoint) throws Throwable {

	    	Army target =  (Army)joinPoint.getTarget();

	        LOGGER.info(target.getName() + " have started their attack!");
	        
	        Object result = joinPoint.proceed();
	        
	        LOGGER.info(target.getName() + " ended their attack!");
	        
	        return result;

	    }
}
