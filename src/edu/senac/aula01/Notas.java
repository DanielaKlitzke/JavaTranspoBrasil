package edu.senac.aula01;

import javax.swing.JOptionPane;

public class Notas {

	public static void main(String[] args) {

		// 05)
		double nota1 = 10;
		double nota2 = 9;
		double nota3 = 8;

		JOptionPane.showMessageDialog(null, "A m�dia da soma das tr�s notas �: " + ((nota1 + nota2 + nota3) / 3));

		// 06)
		double base = 8;
		double altura = 15;

		JOptionPane.showMessageDialog(null, "O resultado �: " + (base * altura));

		// 07)
		double pi = 3.1416;
		double raio = 10;

		JOptionPane.showMessageDialog(null, "A �rea do c�rculo �: %d" + (pi * (raio * raio)));

		// 08)
		int minutos = 60;
		int hora = 24;
		int dias = 90;

		JOptionPane.showMessageDialog(null, "90 dias tem " + ((minutos * hora) * dias) + " minutos");

		// 09)
		int lado = 25;

		JOptionPane.showMessageDialog(null, "O perimetro �: " + (lado * lado));

		// 10)
		double valor = 870.50;

		JOptionPane.showMessageDialog(null, "13,5% de 870,50 �: " + (valor * 0.13));

	}
}
