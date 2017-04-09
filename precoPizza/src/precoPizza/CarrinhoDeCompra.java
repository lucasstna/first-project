package precoPizza;

public class CarrinhoDeCompra { 
	Pizza[] pizzas = new Pizza[10] ;
	
	int total = 0;
	int i = 0 ;
	
	//add pizzas in the cart
	public void addPizza(Pizza pizza) {
		//make sure the pizza contains any ingredient
		if(pizza.ingredientes != 0) {
			this.pizzas[i] = pizza ;
			i++;
		}
	}
	//calculates the price
	public void precoTotal() {
		int j = 0 ;
		//get the values of all pizzas in the cart, and then sum everything
		while (pizzas[j] != null) {
			this.total += pizzas[j].preco ;
			j++ ;
		}
	}
}