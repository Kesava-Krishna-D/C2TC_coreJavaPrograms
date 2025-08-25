package shoppingmall;

public class ShoppingMallDemo {
	public static void main(String[] args) {
		Shopping s = new Clothes();
		s.purchase();
	
		s = new Electronics();
		s.purchase();
	}
}
