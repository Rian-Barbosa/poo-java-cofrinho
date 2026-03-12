package cofrinho;

public class Dolar extends Moeda{

	
	double valorConvertido;
	public Dolar(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.println("Dolar | Saldo: " + valor);
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
		valorConvertido = valor * 5.3; // foi considerado a cotação atual do dolar para real
		return valorConvertido;
	}
	
	
}
