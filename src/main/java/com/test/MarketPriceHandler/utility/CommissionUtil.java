package com.test.MarketPriceHandler.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.test.MarketPriceHandler.model.Price;

public class CommissionUtil {

	public List<Price> addCommission(List<String> priceFeed) {

		System.out.println("priceFeed >>>>>>>>>>>>>>>>> " + priceFeed);
		List<Price> priceList = new ArrayList<Price>();
		for (int i = 0; i < priceFeed.size(); i++) {

			System.out.println("priceFeed.get(i) >>>>>>>>>>>>>>>>> " + priceFeed.get(i));
			List<String> s = Arrays.asList(priceFeed.get(i).split("\\s*,\\s*"));

			// unique id, instrument name, bid, ask and timestamp
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
