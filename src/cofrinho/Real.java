package cofrinho;

public class Real extends Moeda {

	public Real(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.println("Real  | Saldo: " + valor);
	}



	@Override
	public boolean equals(Object obj) { // para garantir a busca específica por objeto igual dentro do array
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
	
	@Override
	public double converter() {
		return valor; // conversao de real para real, retorna o proprio valor inserido
	}
	
}
