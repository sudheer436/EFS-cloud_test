package com.test.MarketPriceHandler.model;

import java.util.Date;

public class Price {

	/*
	private Integer id;
	private String instrument_name;
	private Double bid;
	private Double ask;
	private Date timestamp;
	*/
	
	private String id;
	private String instrument_name;
	private String bid;
	private String ask;
	private String timestamp;

	public Price() {
	}

	public Price(String id, String instrument_name, String bid, String ask, String timestamp) {
		super();
		this.id = id;
		this.instrument_name = instrument_name;
		this.bid = bid;
		this.ask = ask;
		this.timestamp = timestamp;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getInstrument_name() {
		return instrument_name;
	}

	public void setInstrument_name(String instrument_name) {
		this.instrument_name = instrument_name;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getAsk() {
		return ask;
	}

	public void setAsk(String ask) {
		this.ask = ask;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "Price [id=" + id + ", instrument_name=" + instrument_name + ", bid=" + bid + ", ask=" + ask
				+ ", timestamp=" + timestamp + "]";
	}

	

}
