package interfaces;

import java.util.Scanner;
import java.util.ArrayList;
import dados.*;

public class Comeco {
	private static Scanner scan = new Scanner(System.in);
	private static String linha = "----------------------------";
	private ArrayList<Dado> Test = new ArrayList<>();
	private DadoD12 d12 = new DadoD12();
	private DadoD16 d16 = new DadoD16();
	private DadoD20 d20 = new DadoD20();
	private DadoD6 d6 = new DadoD6();

	public void comeco() {//Eu sei que não é bom botar isso tudo dentro de um método, seria mais plausivel na parte
		//Do main, mas eu queria testar umas coisas xD
		
		System.out.println("Seja bem Vindo Ao Meu Teste ai ;-;");
		System.out.println("Aperte Enter Para Continuar...");
		scan.nextLine();
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
		while (true) {
			System.out.println(linha);
			System.out.println("1) Dados");
			System.out.println("2) Roleta");
			String escolha = scan.next();
			switch (escolha) {
			case "1":
				adicionarDados();
				int escolha1 = dadosEscolha();
				System.out.println("\nNúmero: " + dadoAcao(Test.get(escolha1)));
				break;
			case "2":
				// adicionarRoletas();
				// Roletas...
				break;
			default:
				break;
			}
		}
	}

	public int dadosEscolha() {
		while (true) {
			System.out.println("Escolha um Dado: ");
			System.out.println("1- D6");
			System.out.println("2- D12");
			System.out.println("3- D16");
			System.out.println("4- D20");
			String escolha = scan.next();
			switch (escolha) {
			case "1":
				return 0;
			case "2":
				return 1;
			case "3":
				return 2;
			case "4":
				return 3;
			default:
				break;
			}
		}
	}

	public void adicionarDados() {
		Test.add(d6);
		Test.add(d12);
		Test.add(d16);
		Test.add(d20);
	}

	public int dadoAcao(Dado dado) {
		System.out.println("================");
		System.out.println("\nRolando...");
		return dado.rolarDado();
	}
}
