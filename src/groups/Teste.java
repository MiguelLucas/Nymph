package groups;

import java.util.ArrayList;
import java.util.List;

public class Teste {


	public static void main(String[] args) {
		Ordem o1 = new Ordem();
		Plecoptera o2 = new Plecoptera();
		
		
		System.out.println("\nPasso 1\n" + "Opcao 1: " + o1.getPassos().get(0).getOpcao1());
		System.out.println("\nPasso 1\n" + "Opcao 2: " + o1.getPassos().get(0).getOpcao2());
		
		System.out.println("\nPasso 2\n" + "Opcao 1: " + o1.getPassos().get(0).getPasso1().getOpcao1());
		System.out.println("\nPasso 2\n" + "Opcao 2: " + o1.getPassos().get(0).getPasso1().getOpcao2());
		System.out.println("Passo anterior: " + o1.getPassos().get(0).getPasso1().getPassoAnterior().getId());
		
		System.out.println("\nPasso 3\n" + "Opcao 1: " + o1.getPassos().get(0).getPasso2().getOpcao1());
		System.out.println("\nPasso 3\n" + "Opcao 2: " + o1.getPassos().get(0).getPasso2().getOpcao2());
		System.out.println("Passo anterior: " + o1.getPassos().get(0).getPasso2().getPassoAnterior().getId());
		System.out.println("Passo n: " + o1.getPassos().get(2).getId());
		/*if (o1.getPassos().get(1).getFim() == null)
			System.out.println("verdadeiro");
		else
			System.out.println("falso");

		try {*n();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	}

}
