/**
 * This is the main class MarketPriceHandlerApplication to start the application  
 *
 * @author  Sudheeraprasad
 * @version 1.0
 * @since   29/10/2022 
 * 
 * 
 */

package com.test.MarketPriceHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MarketPriceHandlerApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(MarketPriceHandlerApplication.class);

	public static void main(String[] args) {
		LOGGER.info(" >>>>>> in main class");
		SpringApplication.run(MarketPriceHandlerApplication.class, args);
	}

}
