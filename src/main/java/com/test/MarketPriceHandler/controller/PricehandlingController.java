/**
 * The PricehandlingController program implements an application that
 * This is the class to price handle related rest end points
 *
 * @author  Sudheeraprasad
 * @version 1.0
 * @since   29/10/2022 
 * 
 * 
 */

package com.test.MarketPriceHandler.controller;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.test.MarketPriceHandler.model.Price;
import com.test.MarketPriceHandler.service.PricehandlingService;

import io.swagger.annotations.ApiOperation;



@RestController
public class PricehandlingController {

	private static final Logger LOGGER = LoggerFactory.getLogger(PricehandlingController.class);

	@Autowired
	PricehandlingService pricehandlingService;
	
	
	/**
	 * This is the controller method called priceHandler
	 *  to take market price feed and call the
	 * onMessage method to calculate margin price
	 */
	@ApiOperation(value = "priceHandler API", response = Price.class, tags = "priceHandler API")
	@PostMapping(value = "/priceHandler")
	public List<Price> priceHandler(@RequestBody List<String> priceFeed) {

		LOGGER.info(" >>>>>> in controller: calling priceHandler method");

		List<Price> priceList = new ArrayList<Price>();
		priceList = pricehandlingService.onMessage(priceFeed);

		System.out.println("printing response into console: " + priceList);
		return priceList;

	}
}
