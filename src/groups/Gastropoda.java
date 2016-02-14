package groups;

import java.util.ArrayList;

public class Gastropoda extends Ordem {

	public Gastropoda() {
		ArrayList<Passo> passos = new ArrayList<Passo>();
		Passo p1 = new Passo("Opérculo Presente","Opérculo ausente");
		Passo p2 = new Passo("Abertura arredondada ou oval","Abertura semilunar");
		Passo p3 = new Passo("Concha com enrolamento","Concha sem enrolamento");
		Passo p4 = new Passo("Opérculo ao nivel da abertura","Opérculo recuado para o interior da concha");
		Passo p5 = new Passo("Enrolamento sem seguir plano horizontal","Enrolamento segundo plano horizontal");
		Passo p6 = new Passo("Concha oval","Concha alongada");
		Passo p7 = new Passo("2 ou 3 bandas sombreadas na concha","Sem bandas na concha");
		Passo p8 = new Passo("Umbílico fechado, abertura oval","Umbílico aberto, abertura sub-circular");
		Passo p9 = new Passo("Abertura da concha para a direita","Abertura da concha para a esquerda");
		Passo p10 = new Passo("Ápice aguçado, orientado para a esquerda","Ápice não aguçado, orientado para a direita");
		Passo p11 = new Passo("Concha lisa ou com uma crista mediana espiral apresentando ou não espinhas","Concha rugosa, por vezes com elevações proeminentes pelo menos na primeira e segunda volta.");
		
		Fim f1 = new Fim("Neritidae");
		Fim f2 = new Fim("Ancylidae");
		Fim f3 = new Fim("Planorbidae");
		Fim f4 = new Fim("Viviparidae");
		Fim f5 = new Fim("Bithyniidae");
		Fim f6 = new Fim("Valvatidae");
		Fim f7 = new Fim("Lymnaeidae");
		Fim f8 = new Fim("Physidae");
		Fim f9 = new Fim("Acroloxidae");
		Fim f10 = new Fim("Ferrissidae");
		Fim f11 = new Fim("Hydrobiidae");
		Fim f12 = new Fim("Thiaridae");	
		
		p1.setPasso1(p2);
		p1.setPasso2(p3);
		
		p2.setPasso1(p4);
		p2.setFim2(f1);
		
		p3.setPasso1(p5);
		p3.setPasso2(p6);
		
		p4.setPasso1(p7);
		p4.setPasso2(p8);
		
		p5.setPasso1(p9);
		p5.setFim2(f3);
		
		p6.setFim1(f2);
		p6.setPasso2(p10);
		
		p7.setFim1(f4);
		p7.setFim2(f5);
		
		p8.setPasso1(p11);
		p8.setFim2(f6);
		
		p9.setFim1(f7);
		p9.setFim2(f8);
		
		p10.setFim1(f9);
		p10.setFim2(f10);
		
		p11.setFim1(f11);
		p11.setFim2(f12);
		
		passos.add(p1);
		passos.add(p2);
		passos.add(p3);
		passos.add(p4);
		passos.add(p5);
		passos.add(p6);
		passos.add(p7);
		passos.add(p8);
		passos.add(p9);
		passos.add(p10);
		passos.add(p11);
		super.setPassos(passos);
	}

}
