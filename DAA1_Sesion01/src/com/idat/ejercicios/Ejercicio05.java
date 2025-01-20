package com.idat.ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio05 {

	public static void main(String [] args) {
		// Pag 17. Problema 03
		double diagonalMenor, diagonalMayor, area;
		
		diagonalMenor = Double.parseDouble(JOptionPane.
				showInputDialog("Ingrese diagonal menor"));
		diagonalMayor = Double.parseDouble(JOptionPane.
				showInputDialog("Ingrese diagonal mayor"));
		
		area = (diagonalMayor * diagonalMenor)/2;
		
		JOptionPane.showMessageDialog(null, "Area : "+area);
		
	}
	
	
}
