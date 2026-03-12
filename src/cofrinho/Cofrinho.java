package cofrinho;

import java.util.ArrayList;

public class Cofrinho {

	ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>(); // array estoque, onde estarão armazenadas moedas e seus respectivos valores
	
	public void adicionar(Moeda moeda) {
		listaMoedas.add(moeda);
	}
	
	public void remover(Moeda moeda) {
		listaMoedas.remove(moeda);
	}
	
	public void listagemMoedas() {
		for (Moeda m : listaMoedas) {
			m.info(); // método info para apresentar moeda específica e seu respectivo valor, passando por todas as posições do array "listaMoedas"
	}
	}
	
	public double totalConvertido() {
		double totalC = 0;
		for (Moeda m : listaMoedas) {
			totalC += m.converter(); // passa por cada objeto considerado no array e soma o seu valor, que já foi convertido pelo metodo converter() 
									// individual de cada moeda, ao valor total
		}
		
		return totalC;
	}
	
	
}
