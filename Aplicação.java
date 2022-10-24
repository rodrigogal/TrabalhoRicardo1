package Programa;

import java.util.Scanner;

import entities.TrabalhoVetor;

public class Aplicação {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o tamanho do vetor: ");
		int tamanhoVetor = sc.nextInt();
		TrabalhoVetor tv = new TrabalhoVetor(tamanhoVetor);
		
		
		
		System.out.println("LISTA DE CARRO");
		
		
		for(int i = 0; i < tv.ReceberTamanho(); i++) {
			System.out.println("Insira o nome do carro: ");
			String NomeCarro = sc.next();
			tv.Inserir(NomeCarro);
		}
		
		
		System.out.println("Insira a posição do carro que deseja eliminar: ");
		int RemoverCarro = sc.nextInt();
		tv.Retirar(RemoverCarro);
		
		
		
		System.out.println("Insira a posição do carro que deseja buscar: ");
		int AcharCarro = sc.nextInt();
		System.out.println(tv.AcharElementoVetor(AcharCarro));

		
	sc.close();
		
		
	}
}
