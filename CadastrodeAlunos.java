package projeto01;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastrodeAlunos {

	static class Aluno {

		private String nome;
		private int idade;
		private double nota;

		public Aluno(String nome, int idade, double nota) {
			this.nome = nome;
			this.idade = idade;
			this.nota = nota;
		}

		public String getNome() {
			return nome;
		}

		public int getIdade() {
			return idade;
		}

		public double getNota() {
			return nota;
		}

		@Override
		public String toString() {
			return "Aluno{" + "nome='" + nome + '\'' + ", idade=" + idade + ", nota=" + nota + '}';
		}
	}

	public static void main(String[] args) {
		ArrayList alunos = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Menu:");
			System.out.println("1. Cadastrar aluno");
			System.out.println("2. Mostrar todos os alunos cadastrados");
			System.out.println("3. Sair");
			System.out.print("Escolha uma opção: ");

			int opcao = sc.nextInt();

			if (opcao == 1) {
				System.out.print("Digite o nome do aluno: ");
				String nome = sc.next();

				System.out.print("Digite a idade do aluno: ");
				int idade = sc.nextInt();

				System.out.print("Digite a nota do aluno: ");
				double nota = sc.nextDouble();

				Aluno aluno = new Aluno(nome, idade, nota);
				alunos.add(aluno);

				System.out.println("Aluno cadastrado com sucesso!");
			} else if (opcao == 2) {
				System.out.println("Alunos cadastrados:");

				for (Aluno aluno : alunos) {
					System.out.println(aluno);
				}
			} else if (opcao == 3) {
				System.out.println("Saindo...");
				break;
			} else {
				System.out.println("Opção inválida. Tente novamente.");
			}

			sc.close();
		}
	}
}
