package controller;

import br.edu.fateczl.pilhasINT.PilhasINT;

public class PilhaBinario {

	public PilhaBinario() {
		super();
		
	}

	public void Binario (int n) {
 		PilhasINT p = new PilhasINT();
		while (n > 0 ) {
			int r = n % 2;
			n = (int) n / 2;
			p.Push(r);
			
		}
		
		String valor = "";
		while (!p.Empy()) {
			
			valor = valor + Integer.toString(p.Pop());
			
		}
		System.out.println(valor);
		
	}
}
