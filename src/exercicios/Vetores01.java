package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores01 {

	public static void main(String[] args) {
		int vetorInteiros [] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int num; 
		Scanner leia = new Scanner(System.in);
		
		Arrays.sort(vetorInteiros);
		
		System.out.println("\n Vetor ordenado");
		
		for(int indice = 0; indice < vetorInteiros.length; indice++) {
			System.out.println(vetorInteiros[indice]);
		}
		 System.out.println("Digite o valor de um elemento: ");
		 num = leia.nextInt();
		 
		 int posicao = Arrays.binarySearch(vetorInteiros, num);
		 
		 if(posicao >= 0) {
			 System.out.println("\n O elemento "+num+ " foi encontrado e está na posição: " + posicao);
		 } else {
			 System.out.println("\n Elemento não encontrado!");
		 }
		 

	}

}
