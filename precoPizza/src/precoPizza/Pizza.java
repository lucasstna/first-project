package precoPizza;
import java.util.Map ;
import java.util.HashMap ; 

public class Pizza {
	
	static Map<String, Integer> mapaIngredientes = new HashMap<String, Integer>() ;
	static int contadorIngredientes = 0 ;
	int ingredientes = 0 ;
	int preco ;
	
	//get pizzas' price, according to it's number of ingredients
	public int getPreco (int tamanho) {
	
		if (tamanho == 0) {
			this.preco = 0 ;
		}
		else {
			if (tamanho >= 1 && tamanho <= 2) {
				this.preco = 15 ;
			}
			else if (tamanho >=3 && tamanho <= 5) {
				this.preco = 20 ;
			}
			else {
				this.preco = 23 ;	
			}
		}
		
		return preco ;
	}
	
	//add ingredients to the pizza, and count them.
	public void adicionaIngrediente (String ingrediente){
		this.ingredientes++ ;
		//take note of the amount of every ingredient
		Pizza.contabilizaIngrediente(ingrediente) ;
	}
	
	static void contabilizaIngrediente (String ingrediente) {
		//verify if the ingredient is in the map
		if (mapaIngredientes.containsKey(ingrediente)) {
			mapaIngredientes.replace(ingrediente, mapaIngredientes.get(ingrediente), mapaIngredientes.get(ingrediente) + 1) ;
		}
		//if the ingredient isn't in the map
		else {
			mapaIngredientes.put(ingrediente, 1) ;
		}
	}
}
