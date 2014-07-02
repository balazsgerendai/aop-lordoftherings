package com.epam.training.lordoftherings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.training.lordoftherings.domain.Battle;


public class App 
{
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(final String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-config.xml");
 
        Battle mordor = applicationContext.getBean("battleOfMordor", Battle.class);
        mordor.doBattle();

        LOGGER.info("The winnder is : " + mordor.getWinner().getSide());
        applicationContext.close();
    }
}
