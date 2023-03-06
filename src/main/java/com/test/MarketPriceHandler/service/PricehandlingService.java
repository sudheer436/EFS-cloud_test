/**
 * The PricehandlingService program implements an application that
 * This is the interface to call  PricehandlingService 
 *
 * @author  Sudheeraprasad
 * @version 1.0
 * @since   29/10/2022 
 * 
 * 
 */

package com.test.MarketPriceHandler.service;

import java.util.List;
import com.test.MarketPriceHandler.model.Price;

public interface PricehandlingService {
	public List<Price> onMessage(List<String> priceFeed);
}
