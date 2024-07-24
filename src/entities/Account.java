package entities;

public class Account {

	private int accNumber;
	private String name;
	private double balance;

	public Account() {
	};

	public Account(int accNumber, String name, double initialQuantity) {
		this.accNumber = accNumber;
		this.name = name;
		deposit(initialQuantity);
	}

	public Account(int accNumber, String name) {
		this.accNumber = accNumber;
		this.name = name;

	}

	public int getAccNumber() {
		return accNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double quantity) {
		this.balance += quantity;
	}

	public void withdraw(double quantity) {
		this.balance -= quantity + 5;
	}

	public String toString() {
		return "Holder : " + name + " , Account Number: " + accNumber + " Value in account: " + String.format("%.2f", balance);
	}

}
