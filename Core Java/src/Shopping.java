
public class Shopping {
	
	void login(){
		
		System.out.println("I am currently logged in to system");
		
	}

	void searchProduct(){
		
		System.out.println(" I liked this phone, I'll select it");
		
	}
	
	
	
	void finalizeCart(){
		
		System.out.println("I don't have enough money so I will settle for Iphone");
		
	}
	
	void proceedToPayment(){
		
		System.out.println("Oh My God what is this payment??? it is not free?");
		
	}
	
	
	void inalizePayment(){
		
		System.out.println("I entered my card details and now I realised that it is blocked ??  OMG???");
		
	}
	
public static void main(String[] args) {
	Shopping shop=new Shopping();
	shop.login();
	shop.searchProduct();
	shop.finalizeCart();
}
	
}//End of my class shopping
