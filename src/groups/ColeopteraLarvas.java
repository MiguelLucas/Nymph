package groups;

import java.util.ArrayList;

public class ColeopteraLarvas extends Ordem {

	public ColeopteraLarvas() {
		ArrayList<Passo> passos = new ArrayList<Passo>();
		Passo p1 = new Passo("Patas tor�xicas presentes","Patas tor�xicas ausentes");
		Passo p2 = new Passo("Patas com 4 art�culos","Patas com 5 art�culos");
		Passo p3 = new Passo("8 segmentos abdominais","9 segmentos abdominais","10 segmentos abdominais");
		Passo p4 = new Passo("Br�nquias presentes","Br�nquias ausentes");
		Passo p5 = new Passo("Antenas longas","Antenas curtas");
		Passo p6 = new Passo("Cabe�a vis�vel","Cabe�a escondida sob a carapa�a dorsal");
		Passo p7 = new Passo("Corpo n�o encurvado","Corpo encurvado");
		Passo p8 = new Passo("Br�nquias dorsais e/ou laterais","Br�nquias somente ventrais");
		Passo p9 = new Passo("2 garras","1 garra");
		Passo p10 = new Passo("Br�nquias anais presentes","Br�nquias anais ausentes");
		Passo p11 = new Passo("Abd�men estreito, contra�do posteriormente","Abd�men globuloso");
		Passo p12 = new Passo("Br�nquias dorsais e laterais, tor�xicas e abdominais","Br�nquias laterais e abdominais");
		Passo p13 = new Passo("Mand�bulas longas e arqueadas","Mand�bulas truncadas e robustas");
		
		Fim f1 = new Fim("Curculionidae");
		Fim f2 = new Fim("Scirtidae");
		Fim f3 = new Fim("Hydrophilidae");
		Fim f4 = new Fim("Elmidae");
		Fim f5 = new Fim("Dryopidae");
		Fim f6 = new Fim("Psephenidae");
		Fim f7 = new Fim("Hydroscaphidae");
		Fim f8 = new Fim("Spercheidae");
		Fim f9 = new Fim("Chrysomelidae");
		Fim f10 = new Fim("Haliplidae");
		Fim f11 = new Fim("Gyrinidae");
		Fim f12 = new Fim("Hygrobiidae");
		Fim f13 = new Fim("Dytiscidae");
		Fim f14 = new Fim("Noteridae");
		
		p1.setPasso1(p2);
		p1.setFim2(f1);
		
		p2.setPasso1(p3);
		p2.setPasso2(p4);
		
		p3.setPasso1(p5);
		p3.setPasso2(p6);
		p3.setPasso3(p7);
		
		p4.setPasso1(p8);
		p4.setPasso2(p9);
		
		p5.setFim1(f2);
		p5.setFim2(f3);
		
		p6.setPasso1(p10);
		p6.setFim2(f6);
		
		p7.setPasso1(p11);
		p7.setFim2(f9);
		
		p8.setPasso1(p12);
		p8.setFim2(f12);
		
		p9.setPasso1(p13);
		p9.setFim2(f10);
		
		p10.setFim1(f4);
		p10.setFim2(f5);
		
		p11.setFim1(f7);
		p11.setFim2(f8);
		
		p12.setFim1(f10);
		p12.setFim2(f11);
		
		p13.setFim1(f13);
		p13.setFim2(f14);
		
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
		passos.add(p12);
		passos.add(p13);
		super.setPassos(passos);
	}

}
