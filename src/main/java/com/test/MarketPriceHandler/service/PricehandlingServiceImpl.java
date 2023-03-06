/**
 * The PricehandlingService program implements an application that
 * This is the class to call  addCommission to calculate the margib price  
 *
 * @author  Sudheeraprasad
 * @version 1.0
 * @since   29/10/2022 
 * 
 * 
 */

package com.test.MarketPriceHandler.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.test.MarketPriceHandler.model.Price;

@Service
public class PricehandlingServiceImpl implements PricehandlingService {

	private static final Logger LOGGER = LoggerFactory.getLogger(PricehandlingServiceImpl.class);

	/**
	 * This is the service implimetation method called onMessage then it call
	 * addCommision method
	 */
	public List<Price> onMessage(List<String> priceFeed) {
		List<Price> priceList = new ArrayList<Price>();
		priceList = addCommision(priceFeed);
		return priceList;
	}

	/**
	 * This is the service implimetation method called addCommission to take market
	 * price feed and calculate the margin price and return it back to controller.
	 */
	public List<Price> addCommision(List<String> priceFeed) {
		LOGGER.info(" >>>>>> calling addCommission method");
		List<Price> priceList = new ArrayList<Price>();
		for (int i = 0; i < priceFeed.size(); i++) {

			// splitting the comma seperated market price feed
			List<String> s = Arrays.asList(priceFeed.get(i).split("\\s*,\\s*"));
			double total = Double.parseDouble(s.get(2));
			double bid = total - (0.1 * total) / 100;
			double ask = total + (0.1 * total) / 100;

			Price price = new Price();
			price.setId(s.get(0));
			price.setInstrument_name(s.get(1));
			price.setBid(bid + "");
			price.setAsk(ask + "");
			price.setTimestamp(s.get(4));

			priceList.add(price);
			price = null;
		}
		return priceList;
	}
}
