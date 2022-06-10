package GerenciamentoAutomoveis;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Automovel> carros = new ArrayList<Automovel>();
		CarroDePasseio cp = new CarroDePasseio(100.0, "Branco", 180.0, 2019, "Hatch", 4, 4.0);
		Caminhao ca = new Caminhao(100.0, "Branco", 180.0, 2019, 2500);

//		System.out.println(Automovel.getnTotal());
//		System.out.println(cp.getPreco());
//		System.out.println(ca.getPreco());
		
		carros.add(ca);
		carros.add(cp);
		
		double total = 0.0;
		
		for(Automovel a : carros) {	
			total += a.getPreco();
		}
		
		System.out.println(total);
		cp.confirmaVenda();
		System.out.println(Automovel.getnTotal());
	}
}