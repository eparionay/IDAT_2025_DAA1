package com.idat.ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {

		double f, c, k, r;

		c = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Grado Centigrado"));

		f = (9 * c / 5) + 32;
		r = c + 460;
		k = r - 187;

		System.out.println("Grado f : " + f);
		System.out.println("Grado k : " + k);
		System.out.println("Grado r : " + r);

	}

}
