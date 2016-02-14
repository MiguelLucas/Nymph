package groups;

import java.util.ArrayList;

public class Diptera extends Ordem {

	public Diptera() {
		ArrayList<Passo> passos = new ArrayList<Passo>();
		Passo p1 = new Passo("C�psula cef�lica bem individualizada, n�o retr�ctil","C�psula cef�lica parcialmente ou mal individualizada, retr�ctil");
		Passo p2 = new Passo("Mais que 6 segmentos tor�xicos/abdominais, ventosas ausentes","6 segmentos tor�xicos/abdominais, ventosas ventrais presentes");
		Passo p3 = new Passo("Mastiga��o por farpa em plano vertical","Mastiga��o por mand�bulas em plano horizontal");
		Passo p4 = new Passo("Pseud�podes presentes","Pseud�podes ausentes");
		Passo p5 = new Passo("Extremidade abdominal ou sem prolongamentos ou com 1, 2 ou 5 pares de prolongamentos de forma variada","Um prolongamento impar na extremidade do abd�men que corresponde a um sif�o respirat�rio");
		Passo p6 = new Passo("Corpo sem prolongamentos","Corpo com prolongamentos b�fidos perfeitamente dentados");
		Passo p7 = new Passo("Somente pseud�podes tor�xicos","Pseud�podes tor�xicos e anais","Pseud�podes abdominais nos segmentos 1 e 2","Pseud�podes anais retr�cteis");
		Passo p8 = new Passo("Torax semelhante ao abd�men","Torax avolumado com segmenta��o indistinta");
		Passo p9 = new Passo("0 a 5 l�bulos em torno da c�pula respirat�ria","mais que 6 l�bulos em torno da c�pula respirat�ria");
		Passo p10 = new Passo("Corpo sem protuber�ncias espinhosas","Corpo com protuber�ncias espinhosas");
		Passo p11 = new Passo("Extremidade do abd�men sem sif�o e br�nquias","Extremidade do abd�men com 1 sif�o e br�nquias");
		Passo p12 = new Passo("Antenas arqueadas filtradoras","Antenas n�o arqueadas");
		Passo p13 = new Passo("Movimenta��o por bandas locomotoras","Movimenta��o por pseud�podes");
		Passo p14 = new Passo("1 prolongamento longo telesc�pico","1 prolongamento curto, semi-retr�ctil","1 prolongamento cilindro-c�nico suportando 2 prolongamentos tubulares retr�cteis");
		Passo p15 = new Passo("Cabe�a com protuber�ncias","Cabe�a sem protuber�ncias");
		Passo p16 = new Passo("C�psula cef�lica esclerificada, com colora��o","C�psula cef�lica n�o esclerificada, esbranqui�ada");
		Passo p17 = new Passo("4 l�bulos c�nicos","Ou numerosos l�bulos c�nicos curtos cercando 2 estigmas ou 2 pares de prolongamentos arqueados na extremidade abdominal","V�rios l�bulos carnudos, estigmas protegidos por sedas ramificadas na extremidade abdominal","4 l�bulos foli�ceos na extremidade abdominal");
		Passo p18 = new Passo("Ou 1 par de prolongamentos afilados suportando 1 franja de sedas, ou 5 pares de prolongamentos afilados","Diferente do anterior");
		Passo p19 = new Passo("Corpo achatado dorso-ventralmente","Corpo em forma de agulha");
		Passo p20 = new Passo("12 segmentos vis�veis","Mais que 15 segmentos vis�veis");
		
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
