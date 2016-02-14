package groups;

import java.util.ArrayList;

public class Plecoptera extends Ordem {

	public Plecoptera() {
		ArrayList<Passo> passos = new ArrayList<Passo>();
		Passo p1 = new Passo("Paraglossas maiores que as glossas","Paraglossas e glossas de tamanho semelhante");
		Passo p2 = new Passo("Brânquias coxais presentes","Brânquias coxais ausentes");
		Passo p3 = new Passo("Artículos do tarso de comprimento crescente","Primeiro artículo da antena de tamanho semelhante aos restantes, prementum sem uma abertura");
		Passo p4 = new Passo("Antenas grossas, com 4 ou menos artículos","Antenas finas, com 6 ou mais artículos");
		Passo p5 = new Passo("Palpos labiais com dentes fortes e bem marcados","Palpos labiais com dentes ténues");
		Passo p6 = new Passo("Prementum com uma fenda mediana","Prementum sem fenda");
		Passo p7 = new Passo("PI e PII mais curtas que PIII, cercos com menos de metade do comprimento do paraprocto","PI e PII semelhantes a PIII, cercos com mais de metade do comprimento do paraprocto");
		Passo p8 = new Passo("Face dorsal do prementum com sedas implantadas horizontalmente","Face dorsal do prementum com sedas implantadas obliquamente");
		Passo p9 = new Passo("Nenhuma ou duas protuberâncias na cabeça","Corno frontal entre as antenas");
		
		Fim f1 = new Fim("Gomphidae");
		Fim f2 = new Fim("Aeshnidae");
		Fim f3 = new Fim("Cordulegasteridae");
		Fim f4 = new Fim("Libellulidae");
		Fim f5 = new Fim("Corduliidae");
		Fim f6 = new Fim("Macromiidae");
		Fim f7 = new Fim("Calopterygidae");
		Fim f8 = new Fim("Lestidae");
		Fim f9 = new Fim("Platycnemididae");
		Fim f10 = new Fim("Coenagrionidae");
		
		p1.setPasso1(p2);
		p1.setPasso2(p3);
		
		p2.setPasso1(p4);
		p2.setPasso2(p5);
		
		p3.setFim1(f7);
		p3.setPasso2(p6);
		
		p4.setFim1(f1);
		p4.setFim2(f2);
		
		p5.setFim1(f3);
		p5.setPasso2(p7);
		
		p6.setFim1(f8);
		p6.setPasso2(p8);
		
		p7.setFim1(f4);
		p7.setPasso2(p9);
		
		p8.setFim1(f9);
		p8.setFim2(f10);
		
		p9.setFim1(f5);
		p9.setFim2(f6);
		
		passos.add(p1);
		passos.add(p2);
		passos.add(p3);
		passos.add(p4);
		passos.add(p5);
		passos.add(p6);
		passos.add(p7);
		passos.add(p8);
		passos.add(p9);
		super.setPassos(passos);

	}
}
	
