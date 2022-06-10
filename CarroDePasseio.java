package GerenciamentoAutomoveis;

public class CarroDePasseio extends Automovel{
	private String tipo;
	private int nPortas;
	private double volume;
	
	public CarroDePasseio(double preco, String cor, double velMax, int ano, String tipo, int nPortas, double volume) {
		super(preco, cor, velMax, ano);
		this.tipo = tipo;
		this.nPortas = nPortas;
		this.volume = volume;
		if(cor.equalsIgnoreCase("Branco")){
			double desconto;
			desconto = this.getPreco() * 0.1;
			this.setPreco(this.getPreco() - desconto);
		}
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getnPortas() {
		return nPortas;
	}

	public void setnPortas(int nPortas) {
		this.nPortas = nPortas;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	@Override
	public void confirmaVenda() {
		Automovel.setnTotal(getnTotal() - 1);
	}
}