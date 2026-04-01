package cofrinho;

public abstract class Moeda {

	double valor;
	
	
	public Moeda(double valor) {
		this.valor = valor; // inicializa o valor ao criar uma moeda
	}
	
	public double converter() {
		return 0;
	}
	
	public void info() {
		
	}

	@Override
	public boolean equals(Object obj) { // para garantir a busca específica por objeto igual dentro do array
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}


	
	
	
}
