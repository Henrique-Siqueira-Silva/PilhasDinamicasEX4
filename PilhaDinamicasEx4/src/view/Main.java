package view;

import javax.swing.JOptionPane;

import controller.PilhaBinario;

public class Main {

	public static void main(String[] args) {
		PilhaBinario pi = new PilhaBinario();
		int num = 0;
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para ser convertido para binario"));
		
			while (num > 1000) {
			System.out.println("Digite um numero ate 1000");
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para ser convertido para binario"));
			}
			
		pi.Binario(num);

	}

}
