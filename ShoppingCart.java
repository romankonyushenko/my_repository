package ua.kiev.home.prog_it.graduate_work.project1;

import java.util.List;

public class ShoppingCart {
	private List<Strategy> str;
	private String String;

	public void addToCart(Strategy strategy) {
		str.add(strategy);
	}

	public List<Strategy> getStr() {
		return str;
	}

	public void deleteFromCart(Strategy strategy) {

		for (Strategy s : str) {
			if (s == strategy) {
				str.remove(s);
			}
		}
	}
	public String checkout(){
		return  String ;
	}

}
