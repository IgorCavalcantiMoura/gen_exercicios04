package exercicios;

import java.util.Scanner;

public class Matriz01 {

	public static void main(String[] args) {
		int matriz [][]= new int [3][3];
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite os elementos da Matriz 3x3: ");
		for(int linha = 0; linha<3; linha++) {
			for(int coluna = 0; coluna<3; coluna++) {
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		System.out.println("Os elementos da diagonal principal são: " + matriz[0][0]+ ", " + matriz[1][1] + " e " + matriz[2][2]);
		System.out.println("Os elementos da diagonal secundária são: " + matriz[2][0]+ ", " + matriz[1][1] + " e " + matriz[0][2]);
		System.out.println("A soma de todos os elementos da diagonal principal são: " + (matriz[0][0] + matriz[1][1]+ matriz[2][2]));
		System.out.println("A soma de todos os elementos da diagonal secundária são: " + (matriz[2][0] + matriz[1][1]+ matriz[0][2]));
	}

}
