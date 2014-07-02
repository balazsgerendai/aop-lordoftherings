package com.epam.training.lordoftherings.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.epam.training.lordoftherings.domain.Ring;

@Aspect
@Component
public class RingCreatedAspect {

	 private static final Logger LOGGER = LoggerFactory.getLogger(Ring.class);
	 
    @Before("execution (* com.epam.training.lordoftherings.domain.Ainur.stealRing(..))")
    public void ringStealer(final JoinPoint joinPoint) throws Throwable {

        LOGGER.info("The Ring has been stolen!!!");


    }
}
