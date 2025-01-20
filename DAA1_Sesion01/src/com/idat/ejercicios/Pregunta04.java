package com.idat.ejercicios;

import javax.swing.JOptionPane;

public class Pregunta04 {

	public static void main(String[] args) {
		double area, baseMayor, baseMenor, altura;
		altura = convertirToDouble(entradaCadena("Ingrese altura:"));
		baseMayor= convertirToDouble(entradaCadena("Ingrese base mayor"));
		baseMenor= convertirToDouble(entradaCadena("Ingrese base menor"));
		area = ((baseMayor+baseMenor)*altura)/2;
		mensaje("El area es: "+ area);
				
	}
	public static double convertirToDouble(String variableConvertir) {
		return Double.parseDouble(variableConvertir);
	}
	
	public static String entradaCadena(String mensaje) {
		return JOptionPane.showInputDialog(mensaje);
	}
	
	public static void mensaje(String cadena) {
		JOptionPane.showMessageDialog(null, cadena);
	}
	

}
