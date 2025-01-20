package com.idat.ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {

		System.out.println("*****Ejercicio01**************");
		// suma de 02 numeros
		// Declaracion de variables
		int numero1, numero2, resultado;
		//double precio;
		// Entrada de datos
		// numero1= int(input("Ingrese numero1:))
		numero1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero1"));
		numero2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero2"));
		
		//precio= Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio"));
		
		// Proceso
		resultado = numero1+numero2;
		// Salida
		System.out.println("Resultado : " + resultado);
		
	}

}
