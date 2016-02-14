package groups;

import java.util.ArrayList;


public class Bivalvia extends Ordem {

		public Bivalvia() {
			ArrayList<Passo> passos = new ArrayList<Passo>();
			Passo p1 = new Passo("Bisso presente","Bisso Ausente");
			Passo p2 = new Passo("Valvas simétricas","Valvas assimétricas");
			Passo p3 = new Passo("Ligamente interno","Ligamento externo");
			Passo p4 = new Passo("Dentes cardinais indistintos","Dentes cardinais bem visíveis");
			Passo p5 = new Passo("Dentes laterais posteriores indistintos","Dentes laterais bem visíveis");
			Fim f1 = new Fim("Dreissenidae");
			Fim f2 = new Fim("Sphaeridae");
			Fim f3 = new Fim("Corbiculidae");
			Fim f4 = new Fim("Unionidae");
			Fim f5 = new Fim("Margaritiferidae");
			
			p1.setPasso2(p2);
			p1.setFim1(f1);
			
			p2.setPasso1(p3);
			p2.setPasso2(p4);
			
			p3.setFim1(f2);
			p3.setFim2(f3);
			
			p4.setFim1(f4);
			p4.setPasso2(p5);
			
			p5.setFim1(f5);
			p5.setFim2(f4);
			
			
			passos.add(p1);
			passos.add(p2);
			passos.add(p3);
			passos.add(p4);
			passos.add(p5);
			super.setPassos(passos);
		}
		
		public void bivTest(){
			System.out.println("Está na ordem Bivalvia");
		}
		
		
}
