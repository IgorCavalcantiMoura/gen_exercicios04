package exercicios;

import java.util.Scanner;

public class Vetores02 {

	public static void main(String[] args) {
		int vetor[] = new int [10];
		int soma = 0;
		double media;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite 10 números inteiros: ");
		for(int indice = 0; indice <10; indice++) {
			System.out.println("Número " + (indice +1) + ": ");
			vetor[indice]= leia.nextInt();
		}
		
		System.out.println("\nElemntos nos indices ímpares: ");
		for(int indice = 1; indice <10; indice+=2) {
			System.out.print(vetor[indice] + " ");
		}
		 
		System.out.println("\nElemntos pares: ");
		for(int num : vetor) {
			 if(num % 2 ==0) {
				 System.out.print(num + " ");
			 }
		 }
		 
		for(int num : vetor) {
			soma +=num;
		}
		System.out.println("\nSoma de todos os elementos: " + soma);
		
		media = soma / vetor.length;
		System.out.println("Média de todos os elementos: " + media);
		 

	}

}
