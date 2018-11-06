package com.trungtamjava.model;

public class Bill {
	private int idBill;
	private int amount;
	private long totalMoney;
	private int idDrink;
	private String time;

	public int getIdBill() {
		return idBill;
	}

	public void setIdBill(int idBill) {
		this.idBill = idBill;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public long getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(long totalMoney) {
		this.totalMoney = totalMoney;
	}

	public int getIdDrink() {
		return idDrink;
	}

	public void setIdDrink(int idDrink) {
		this.idDrink = idDrink;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
