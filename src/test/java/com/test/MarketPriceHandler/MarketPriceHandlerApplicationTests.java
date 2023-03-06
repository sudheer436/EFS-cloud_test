package com.test.MarketPriceHandler;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.MarketPriceHandler.model.Price;
import com.test.MarketPriceHandler.service.PricehandlingService;
import com.test.MarketPriceHandler.service.PricehandlingServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MarketPriceHandlerApplicationTests {

	@MockBean
	PricehandlingService pricehandlingService;

	/**
	 * priceHandler test for priceHandler method present in PricehandlingController
	 * class
	 * 
	 */
	@Test
	public void priceHandler() {

		List<String> priceFeed = new ArrayList<String>();
		priceFeed.add("106, EUR/USD, 1.1000,1.2000,01-06-2020 12:01:01:001");
		when(pricehandlingService.onMessage(priceFeed)).thenReturn(
				(List<Price>) new Price("106", "EUR/USD", "1.0989", "1.1011000000000002", "01-06-2020 12:01:01:001"));
		assertEquals(1, pricehandlingService.onMessage(priceFeed).size());
	}

	/**
	 * addCommision test for addCommision method present in PricehandlingServiceImpl
	 * class
	 * 
	 */
	@Test
	public void addCommision() {

		List<String> priceFeed = new ArrayList<String>();
		priceFeed.add("106, EUR/USD, 1.1000,1.2000,01-06-2020 12:01:01:001");
		PricehandlingServiceImpl impl = new PricehandlingServiceImpl();
		when(impl.addCommision(priceFeed)).thenReturn(
				(List<Price>) new Price("106", "EUR/USD", "1.0989", "1.1011000000000002", "01-06-2020 12:01:01:001"));
		assertEquals(1, impl.addCommision(priceFeed).size());
	}
}