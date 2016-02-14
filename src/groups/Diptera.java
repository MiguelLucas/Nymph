package groups;

import java.util.ArrayList;

public class Diptera extends Ordem {

	public Diptera() {
		ArrayList<Passo> passos = new ArrayList<Passo>();
		Passo p1 = new Passo("Cápsula cefálica bem individualizada, não retráctil","Cápsula cefálica parcialmente ou mal individualizada, retráctil");
		Passo p2 = new Passo("Mais que 6 segmentos toráxicos/abdominais, ventosas ausentes","6 segmentos toráxicos/abdominais, ventosas ventrais presentes");
		Passo p3 = new Passo("Mastigação por farpa em plano vertical","Mastigação por mandíbulas em plano horizontal");
		Passo p4 = new Passo("Pseudópodes presentes","Pseudópodes ausentes");
		Passo p5 = new Passo("Extremidade abdominal ou sem prolongamentos ou com 1, 2 ou 5 pares de prolongamentos de forma variada","Um prolongamento impar na extremidade do abdómen que corresponde a um sifão respiratório");
		Passo p6 = new Passo("Corpo sem prolongamentos","Corpo com prolongamentos bífidos perfeitamente dentados");
		Passo p7 = new Passo("Somente pseudópodes toráxicos","Pseudópodes toráxicos e anais","Pseudópodes abdominais nos segmentos 1 e 2","Pseudópodes anais retrácteis");
		Passo p8 = new Passo("Torax semelhante ao abdómen","Torax avolumado com segmentação indistinta");
		Passo p9 = new Passo("0 a 5 lóbulos em torno da cúpula respiratória","mais que 6 lóbulos em torno da cúpula respiratória");
		Passo p10 = new Passo("Corpo sem protuberâncias espinhosas","Corpo com protuberâncias espinhosas");
		Passo p11 = new Passo("Extremidade do abdómen sem sifão e brânquias","Extremidade do abdómen com 1 sifão e brânquias");
		Passo p12 = new Passo("Antenas arqueadas filtradoras","Antenas não arqueadas");
		Passo p13 = new Passo("Movimentação por bandas locomotoras","Movimentação por pseudópodes");
		Passo p14 = new Passo("1 prolongamento longo telescópico","1 prolongamento curto, semi-retráctil","1 prolongamento cilindro-cónico suportando 2 prolongamentos tubulares retrácteis");
		Passo p15 = new Passo("Cabeça com protuberâncias","Cabeça sem protuberâncias");
		Passo p16 = new Passo("Cápsula cefálica esclerificada, com coloração","Cápsula cefálica não esclerificada, esbranquiçada");
		Passo p17 = new Passo("4 lóbulos cónicos","Ou numerosos lóbulos cónicos curtos cercando 2 estigmas ou 2 pares de prolongamentos arqueados na extremidade abdominal","Vários lóbulos carnudos, estigmas protegidos por sedas ramificadas na extremidade abdominal","4 lóbulos foliáceos na extremidade abdominal");
		Passo p18 = new Passo("Ou 1 par de prolongamentos afilados suportando 1 franja de sedas, ou 5 pares de prolongamentos afilados","Diferente do anterior");
		Passo p19 = new Passo("Corpo achatado dorso-ventralmente","Corpo em forma de agulha");
		Passo p20 = new Passo("12 segmentos visíveis","Mais que 15 segmentos visíveis");
		
		Fim f1 = new Fim("Blephariceridae");
		Fim f2 = new Fim("Cylindrotomidae");
		Fim f3 = new Fim("Simullidae");
		Fim f4 = new Fim("Dixidae");
		Fim f5 = new Fim("Ceratopogonidae");
		Fim f6 = new Fim("Limoniidae");
		Fim f7 = new Fim("Tipulidae");
		Fim f8 = new Fim("Thaumaleidae");
		Fim f9 = new Fim("Chironomidae");
		Fim f10 = new Fim("Ptychopteridae");
		Fim f11 = new Fim("Chaoboridae");
		Fim f12 = new Fim("Culicidae");
		Fim f13 = new Fim("Syrphidae");
		Fim f14 = new Fim("Tabanidae");
		Fim f15 = new Fim("Ephydridae");
		Fim f16 = new Fim("Stratiomyidae");
		Fim f17 = new Fim("Psychodidae");
		Fim f18 = new Fim("Dolichopodidae");
		Fim f19 = new Fim("Muscidae");
		Fim f20 = new Fim("Sciomyzidae");
		Fim f21 = new Fim("Rhagionidae");
		Fim f22 = new Fim("Athericidae");
		Fim f23 = new Fim("Empididae");
		
		p1.setPasso1(p2);
		p1.setPasso2(p3);
		
		p2.setPasso1(p4);
		p2.setFim2(f1);
		
		p3.setPasso1(p5);
		p3.setPasso2(p6);
		
		p4.setPasso1(p7);
		p4.setPasso2(p8);
		
		p5.setPasso1(p13);
		p5.setPasso2(p14);
		
		p6.setPasso1(p9);
		p6.setFim2(f2);
		
		p7.setFim1(f3);
		p7.setPasso2(p10);
		p7.setFim3(f4);
		p7.setFim4(f5);
		
		p8.setPasso1(p11);
		p8.setPasso2(p12);
		
		p9.setFim1(f6);
		p9.setFim2(f7);
		
		p10.setPasso1(p15);
		p10.setFim2(f5);
		
		p11.setPasso1(p16);
		p11.setFim2(f10);
		
		p12.setFim1(f11);
		p12.setFim2(f12);
		
		p13.setPasso1(p17);
		p13.setPasso2(p18);
		
		p14.setFim1(f13);
		p14.setFim2(f14);
		p14.setFim3(f15);
		
		p15.setFim1(f8);
		p15.setFim2(f9);
		
		p16.setPasso1(p19);
		p16.setFim2(f5);
		
		p17.setFim1(f18);
		p17.setFim2(f19);
		p17.setFim3(f20);
		p17.setFim4(f21);
		
		p18.setFim1(f22);
		p18.setFim2(f23);
		
		p19.setPasso1(p20);
		p19.setFim2(f5);
		
		p20.setFim1(f16);
		p20.setFim2(f17);
		
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
		passos.add(p17);
		passos.add(p18);
		passos.add(p19);
		passos.add(p20);
		super.setPassos(passos);
	}

}
