package ua.kiev.home.prog_it.graduate_work.project1;

public class Account {

	private double account;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(double sum) {
		this.account = sum;
	}

	public double getAccount() {
		return account;
	}

	public void addToAcount(double sum) {
		this.account += sum;
	}

}
