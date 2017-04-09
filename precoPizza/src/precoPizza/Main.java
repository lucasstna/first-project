package precoPizza ;

public class Main {

	public static void main(String[] args) {		
		
		//test situation
		CarrinhoDeCompra car = new CarrinhoDeCompra() ;

		Pizza p1 = new Pizza() ;
		Pizza p2 = new Pizza() ;
		Pizza p3 = new Pizza() ;
		
		p1.adicionaIngrediente("mussarela") ;
		p1.adicionaIngrediente("calabresa") ;
		p1.adicionaIngrediente("ovo") ;
		
		p2.adicionaIngrediente("palmito") ;
		p2.adicionaIngrediente("mussarela") ;
		p2.adicionaIngrediente("abobora") ;
		p2.adicionaIngrediente("calabresa") ;
		p2.adicionaIngrediente("tomate") ;
		p2.adicionaIngrediente("milho") ;
		
		p3.adicionaIngrediente("presunto") ;
		p3.adicionaIngrediente("champignon") ;
		
		car.addPizza(p1) ;
		car.addPizza(p2) ;
		car.addPizza(p3) ;
		
		p1.preco = p1.getPreco(p1.ingredientes) ;
		p2.preco = p2.getPreco(p2.ingredientes) ;
		p3.preco = p3.getPreco(p3.ingredientes) ;
		
		car.precoTotal() ;
		
		System.out.println("Cart's price: "+ car.total) ;
		
		System.out.println("Amount of every ingredient used in the cart: ");

		//iterates trough the keys collection, and print it's values
		for (String key : Pizza.mapaIngredientes.keySet()) {
			System.out.println(key + ": " + Pizza.mapaIngredientes.get(key)) ;
		}
	}
}


