package GerenciamentoAutomoveis;

public abstract class Automovel {
	private double preco;
	private String cor;
	private double velMax;
	private int ano;
	private static int nTotal;
	
	public Automovel(double preco, String cor, double velMax, int ano) {
		this.preco = preco;
		this.cor = cor;
		this.velMax = velMax;
		this.ano = ano;
		nTotal++;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getVelMax() {
		return velMax;
	}

	public void setVelMax(double velMax) {
		this.velMax = velMax;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public static int getnTotal() {
		return nTotal;
	}
	
	public static void setnTotal(int nTotal) {
		Automovel.nTotal = nTotal;
	}
	
	public abstract void confirmaVenda();
}