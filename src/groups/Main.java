package groups;

import java.util.Scanner;

import groups.Bivalvia;
import groups.Ordem;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		Ordem o1 = new Odonata();
		boolean ended = false;
		Passo passoAtual;
		passoAtual = o1.getPassos().get(0);
		Fim fim;
		int opt = 0;
		while (true){
			if (!ended){
				System.out.println(passoAtual.getOpcao1());
				System.out.println(passoAtual.getOpcao2());
				if (passoAtual.getOpcao3() != null)
					System.out.println(passoAtual.getOpcao3());
				if (passoAtual.getOpcao4() != null)
					System.out.println(passoAtual.getOpcao4());
			}
			else{
				if (passoAtual.getFim1() != null && opt == 1)
					System.out.println(passoAtual.getFim1().getFamilia());
				if (passoAtual.getFim2() != null && opt == 2)
					System.out.println(passoAtual.getFim2().getFamilia());
				if (passoAtual.getFim3() != null && opt == 3)
					System.out.println(passoAtual.getFim3().getFamilia());
				if (passoAtual.getFim4() != null && opt == 4)
					System.out.println(passoAtual.getFim4().getFamilia());
			}
			System.out.println("Escolha opcao: 1, 2, 3, 4, 5 para voltar ou 0 para sair");
			Scanner sc = new Scanner(System.in);
			opt = sc.nextInt();
			if (opt == 0)
				break;
			if (opt == 1){
				if (passoAtual.getPasso1() != null)
					passoAtual = passoAtual.getPasso1();
				else{
					fim = passoAtual.getFim1();
					ended = true;
				}
			}
			if (opt == 2){
				if (passoAtual.getPasso2() != null)
					passoAtual = passoAtual.getPasso2();
				else{
					fim = passoAtual.getFim2();
					ended = true;
				}
			}
			if (opt == 3){
				if (passoAtual.getPasso3() != null)
					passoAtual = passoAtual.getPasso3();
				else{
					fim = passoAtual.getFim3();
					ended = true;
				}
			}
			if (opt == 4){
				if (passoAtual.getPasso3() != null)
					passoAtual = passoAtual.getPasso3();
				else{
					fim = passoAtual.getFim4();
					ended = true;
				}
			}
			if (opt == 5){
				if (!ended)
					passoAtual = passoAtual.getPassoAnterior();
				else
					ended = false;
			}
		}

	}
}
