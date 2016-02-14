package groups;

import java.util.ArrayList;

public class Trichoptera extends Ordem {

	public Trichoptera() {
		ArrayList<Passo> passos = new ArrayList<Passo>();
		Passo p1 = new Passo("Ganchos anais inseridos directamente no abdómen, casulo presente","Ganchos anais inseridos em pseudópodes, casulo ausente");
		Passo p2 = new Passo("Metanotum totalmente membranoso ou com vários escleritos ou com manchas esclerificadas","Casulo bivalve e membranoso, metanotum totalmente esclerificado");
		Passo p3 = new Passo("Metanotum membranoso","Metanotum esclerificado");
		Passo p4 = new Passo("Metanotum com escleritos ou manchas esclerificadas","Metanotum membranoso");
		Passo p5 = new Passo("Placa tergale membranosa","Placa tergale esclerificada");
		Passo p6 = new Passo("Brânquias abdominais presentes","Brânquias abdominais ausentes");///////
		Passo p7 = new Passo("Primeiro segmento abdominal com 3 protuberâncias (1 dorsal e 2 laterais) ou apenas 2 laterais","Primeiro segmento abdominal sem protuberâncias");
		Passo p8 = new Passo("Mesonotum membranoso","Mesonotum com escleritos ou manchas esclerificadas");
		Passo p9 = new Passo("Garras curtas","Garras longas e arqueadas");
		Passo p10 = new Passo("Mesonotum com 2 escleritos mais ou menos unidos","Mesonotum com 4 a 6 escleritos mais ou menos unidos");
		Passo p11 = new Passo("Primeiro segmento abdominal com 1 protuberância dorsal e 2 laterais ou somente 2 laterais","Primeiro segmento abdominal curvado mas sem protuberâncias");
		Passo p12 = new Passo("1 par de escleritos unidos no mesonotum","2 manchas esclerificadas no mesonotum");
		Passo p13 = new Passo("Trocantino em ponta mas truncado, PII e PIII pouco diferentes de PI","Trocantino arredondado, PII e PIII mais frágeis que PI");
		Passo p14 = new Passo("Primeiro segmento abdominal com 2 protuberâncias laterais e uma dorsal","Primeiro segmento abdominal com 2 protuberâncias laterais");
		Passo p15 = new Passo("Bordos anteriores do pronotum terminando numa grande expansão em ponta","Bordos anteriores do pronotum sem expansões");
		Passo p16 = new Passo("2 fileiras de sedas inseridas sobre o meso e metanotum","Sedas raras sobre o meso e metanotum");
		Passo p17 = new Passo("Casulo cilindro-cónico","Casulo heliforme");
		Passo p18 = new Passo("Primeiro segmento abdominal com 1 protuberância dorsal e 2 laterais","Primeiro segmento abdominal curvado mas sem protuberâncias");
		Passo p19 = new Passo("Escleritos dispersos","Escleritos medianos com disposição tranversal");
		Passo p20 = new Passo("Pronotum sem crista transversal","Pronotum com uma crista transversal que termina numa expansão do bordo anterior");
		Passo p21 = new Passo("Bordo anterior ventral do pronotum em ponta","Bordo anterior ventral do pronotum arredondado");
		Passo p22 = new Passo("Garra das PIII sem sedas","Garra das PIII coberta de sedas curtas");
		Passo p23 = new Passo("Trocanter 2 a 3 vezes mais curto que o fémur","Trocanter quase tão longo como o fémur");
		Passo p24 = new Passo("Garra das PIII mais comprida que o tarso","Garra das PIII tão comprida quanto o tarso");
		
		Fim f1 = new Fim("Hydroptilidae");
		Fim f2 = new Fim("Rhyacophilidae");
		Fim f3 = new Fim("Hydropsychidae");
		Fim f4 = new Fim("Polycentropodidae");
		Fim f5 = new Fim("Philopotamidae");
		Fim f6 = new Fim("Psychomyiidae");
		Fim f7 = new Fim("Ecnomidae");
		Fim f8 = new Fim("Dipseudopsidae");
		Fim f9 = new Fim("Brachycentridae");
		Fim f10 = new Fim("Glossosomatidae");
		Fim f11 = new Fim("Helicopsychidae");
		Fim f12 = new Fim("Phryganeidae");
		Fim f13 = new Fim("Sericostomatidae");
		Fim f14 = new Fim("Molannidae");
		Fim f15 = new Fim("Beraeidae");
		Fim f16 = new Fim("Leptoceridae");
		Fim f17 = new Fim("Lepidostomatidae");
		Fim f18 = new Fim("Goeridae");
		Fim f19 = new Fim("Uenoidae");
		Fim f20 = new Fim("Odontoceridae");
		Fim f21 = new Fim("Calamoceratidae");
		Fim f22 = new Fim("Limnephilidae");
		Fim f23 = new Fim("Apataniidae");
		
		p1.setPasso1(p2);
		p1.setPasso2(p3);
		
		p2.setPasso1(p4);
		p2.setFim2(f1);
		
		p3.setPasso1(p5);
		p3.setPasso2(p6);
		
		p4.setPasso1(p7);
		p4.setPasso2(p8);
		
		p5.setPasso1(p9);
		p5.setFim2(f2);
		//
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
