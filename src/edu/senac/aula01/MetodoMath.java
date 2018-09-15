package edu.senac.aula01;

public class MetodoMath {

	public static void main(String[] args) {

		// 11)
		int numero1 = 10;
		int numero2 = 7;
		int numero3 = 20;
		int numero4 = 30;
		int menor1 = Math.min(numero1, numero2);
		int menor2 = Math.min(numero3, numero4);
		int resultadoA = Math.min(menor1, menor2);

		System.out.println("O menor número é: " + resultadoA);
		
		// 12)
		int numeroA = 10;
		int numeroB = 7;
		int numeroC = 20;
		int numeroD = 30;
		int menor = Math.max(numeroA, numeroB);
		menor = Math.max(menor, numeroC);
		menor = Math.max(menor, numeroD);

		System.out.println("O maior número é: " + menor);
		
		// 13)
		double valor = 2;
		double potencia = 8;
		
		System.out.println("2 elevado a potência 8 é: " + Math.pow(valor, potencia));
		
	}
}
