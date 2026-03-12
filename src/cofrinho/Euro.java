package cofrinho;

public class Euro extends Moeda {

	double valorConvertido;
	public Euro(double valor) {
		super(valor);
	}
	
	@Override
	public void info() {
		System.out.println("Euro  | Saldo: " + valor);
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
		valorConvertido = valor * 6.1;
		return valorConvertido;
	}
	
}
