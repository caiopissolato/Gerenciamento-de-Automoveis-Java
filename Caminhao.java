package GerenciamentoAutomoveis;

public class Caminhao extends Automovel{
	private double capacidadeMax;
	
	public Caminhao(double preco, String cor, double velMax, int ano, double capacidadeMax) {
		super(preco, cor, velMax, ano);
		if(capacidadeMax > 2000) {
			double desconto;
			desconto = this.getPreco() * 0.1;
			this.setPreco(this.getPreco() - desconto);
		}
		this.capacidadeMax = capacidadeMax;
	}

	public double getCapacidadeMax() {
		return capacidadeMax;
	}

	public void setCapacidadeMax(double capacidadeMax) {
		this.capacidadeMax = capacidadeMax;
	}

	@Override
	public void confirmaVenda() {
		Automovel.setnTotal(getnTotal() - 1);
	}
}