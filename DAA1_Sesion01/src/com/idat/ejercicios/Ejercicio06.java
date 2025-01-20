package com.idat.ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		// Pag 18. Problema 01
		int edad;
		double peso, frecuencia;
		edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad:"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese peso:"));
		
		frecuencia = 210 - (0.5*edad)- (0.01*peso+4);
		JOptionPane.showMessageDialog(null, "Frecuencia: "+ frecuencia);
	}

}
