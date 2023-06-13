package br.com.exercicioweb;

import java.util.Scanner;

public class MediaAlunos {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		double somaNotas = 0;

		for (int i = 1; i <= 4; i++) {
			try {
				System.out.print("Digite a " + i + "ª nota: (Casa decimal separada com vírgula.)");
				double nota = leitura.nextDouble();

				if (nota > 10) {
					throw new IllegalArgumentException("Nota inválida! Digite uma nota entre 0 a 10!");
				}

				somaNotas += nota;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Por favor, insira um valor válido.");
				leitura.nextLine(); // Limpa o buffer do scanner para uma nova entrada
				i--; // Repetir a iteração atual para obter uma nota válida
			}
		}

		double media = somaNotas / 4;
		System.out.println("A média das notas é: " + media);

		if (media >= 6) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}
		leitura.close();
	}
}