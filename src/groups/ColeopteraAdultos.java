package groups;

import java.util.ArrayList;

public class ColeopteraAdultos extends Ordem {

	public ColeopteraAdultos() {
		ArrayList<Passo> passos = new ArrayList<Passo>();
		Passo p1 = new Passo("Metacoxas não fundidas, deixando livres os primeiros segmentos abdominais","Metacoxas fundidas, recobrindo os primeiros segmentos abdominais");
		Passo p2 = new Passo("Rostro com antena constituida por duas partes","Rostro diferente do anterior");
		Passo p3 = new Passo("PIII normal, olhos normais","PIII em forma de remo, olhos divididos em lobo dorsal e ventral");
		Passo p4 = new Passo("Antenas longas e filiformes","Antenas diferentes do anterior");
		Passo p5 = new Passo("Placa metacoxal deixa inteiramente visiveis os fémures","Placa metacoxal recobrindo parcialmente os fémures");
		Passo p6 = new Passo("Palpos maxilares mais longos que as antenas","Palpos maxilares mais curtos que as antenas");
		Passo p7 = new Passo("Metatarso composto por 4 articulos","Metatarso composto por 5 articulos");
		Passo p8 = new Passo("Cabeça afastada do torax, formando um afunilamento semelhante a um pescoço","Cabeça encostada ao torax, nao formando um pescoço");
		Passo p9 = new Passo("Pronotum mais largo na base","Pronotum mais largo na região anterior");
		Passo p10 = new Passo("Élitros normais, cobrindo todo o abdómen","Élitros truncados, deixando parte do abdómen visivel");
		Passo p11 = new Passo("Apófises metacoxais largas","Apófises metacoxais Estreitas");
		Passo p12 = new Passo("Élitros truncados, deixando parte do abdómen visivel","Élitros normais, cobrindo todo o abdómen");
		Passo p13 = new Passo("Pronotum sem sulcos","Pronotum com 5 sulcos longitudinais");
		Passo p14 = new Passo("Antenas com o 2º segmento largo formando uma lingueta","Antenas diferentes do anterior");
		Passo p15 = new Passo("Epistómio direito","Epistómio com chanfradura");
		Passo p16 = new Passo("Olhos proeminentes","Olhos normais");
		
		Fim f1 = new Fim("Curculionidae");
		Fim f2 = new Fim("Gyrinidae");
		Fim f3 = new Fim("Haliplidae");
		Fim f4 = new Fim("Chrysomelidae");
		Fim f5 = new Fim("Elmidae");
		Fim f6 = new Fim("Hygrobiidae");
		Fim f7 = new Fim("Noteridae");
		Fim f8 = new Fim("Dytiscidae");
		Fim f9 = new Fim("Hydraenidae");
		Fim f10 = new Fim("Hydrophilidae");
		Fim f11 = new Fim("Hydrochidae");
		Fim f12 = new Fim("Sphercheidae");
		Fim f13 = new Fim("Helophoridae");
		Fim f14 = new Fim("Dryopidae");
		Fim f15 = new Fim("Hydroscaphidae");
		
		p1.setPasso1(p2);
		p1.setPasso2(p3);
		
		p2.setPasso2(p4);
		p2.setFim1(f1);
		
		p3.setPasso1(p5);
		p3.setFim2(f2);
		
		p4.setPasso2(p6);
		p4.setPasso1(p7);
		
		p5.setPasso1(p8);
		p5.setFim2(f3);
		
		p6.setPasso1(p9);
		p6.setPasso2(p10);
		
		p7.setFim1(f4);
		p7.setFim2(f5);
		
		p8.setPasso2(p11);
		p8.setFim1(f6);
		
		p9.setPasso1(p12);
		p9.setPasso2(p13);
		
		p10.setPasso1(p14);
		p10.setFim2(f15);
		
		p11.setFim1(f7);
		p11.setFim2(f8);
		
		p12.setFim1(f9);
		p12.setFim2(f10);
		
		p13.setPasso1(p15);
		p13.setFim2(f13);
		
		p14.setFim1(f14);
		p14.setFim2(f10);
		
		p15.setPasso1(p16);
		p15.setFim2(f12);
		
		p16.setFim1(f11);
		p16.setFim2(f9);
		
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
		passos.add(p14);
		passos.add(p15);
		passos.add(p16);
		super.setPassos(passos);
	}

}
