package com.idat.ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Pag 17. Ejercicio 01
		double area, perimetro, base, altura;
		
		base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese base"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese altura"));
		
		
		area = base * altura;
		perimetro = 2 * (base + altura);
		
		JOptionPane.showMessageDialog(null, "Area : "+ area +
											"\nPerimetro: "+ perimetro);
		
		
		
		
		
		
	}
	
	
	

}
