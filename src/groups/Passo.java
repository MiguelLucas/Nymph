package groups;

public class Passo {
	private static int count = 0;
	private int id;
	private String opcao1;
	private String opcao2;
	private String opcao3;
	private String opcao4;
	private Passo passo1;
	private Passo passo2;
	private Passo passo3;
	private Passo passo4;
	private Passo passoAnterior;
	private Fim fim1;
	private Fim fim2;
	private Fim fim3;
	private Fim fim4;
	private String notaAutor;
	
	public Passo(String opcao1, String opcao2) {
		this.opcao1 = opcao1;
		this.opcao2 = opcao2;
		this.opcao3 = null;
		this.opcao4 = null;
		this.id = count++;
		this.passo1 = null;
		this.passo2 = null;
		this.passo3 = null;
		this.passo4 = null;
		this.passoAnterior = null;
		this.fim1 = null;
		this.fim2 = null;
		this.notaAutor = null;
	}
	
	public Passo(String opcao1, String opcao2, String opcao3) {
		this.opcao1 = opcao1;
		this.opcao2 = opcao2;
		this.opcao3 = opcao3;
		this.opcao4 = null;
		this.id = count++;
		this.passo1 = null;
		this.passo2 = null;
		this.passo3 = null;
		this.passo4 = null;
		this.passoAnterior = null;
		this.fim1 = null;
		this.fim2 = null;
		this.notaAutor = null;
	}

	public Passo(String opcao1, String opcao2, String opcao3, String opcao4) {
		this.opcao1 = opcao1;
		this.opcao2 = opcao2;
		this.opcao3 = opcao3;
		this.opcao4 = opcao4;
		this.id = count++;
		this.passo1 = null;
		this.passo2 = null;
		this.passo3 = null;
		this.passo4 = null;
		this.passoAnterior = null;
		this.fim1 = null;
		this.fim2 = null;
		this.notaAutor = null;
	}
	public String getOpcao1() {
		return opcao1;
	}

	public void setOpcao1(String opcao1) {
		this.opcao1 = opcao1;
	}

	public String getOpcao2() {
		return opcao2;
	}

	public void setOpcao2(String opcao2) {
		this.opcao2 = opcao2;
	}

	public Passo getPasso1() {
		return passo1;
	}

	public void setPasso1(Passo passo1) {
		this.passo1 = passo1;
		passo1.passoAnterior = this;
	}

	public Passo getPasso2() {
		return passo2;
	}

	public void setPasso2(Passo passo2) {
		this.passo2 = passo2;
		passo2.passoAnterior = this;
	}

	public String getOpcao3() {
		return opcao3;
	}

	public void setOpcao3(String opcao3) {
		this.opcao3 = opcao3;
	}

	public String getOpcao4() {
		return opcao4;
	}

	public void setOpcao4(String opcao4) {
		this.opcao4 = opcao4;
	}

	public Passo getPasso3() {
		return passo3;
	}

	public void setPasso3(Passo passo3) {
		this.passo3 = passo3;
	}

	public Passo getPasso4() {
		return passo4;
	}

	public void setPasso4(Passo passo4) {
		this.passo4 = passo4;
	}

	public Fim getFim1() {
		return fim1;
	}

	public void setFim1(Fim fim1) {
		this.fim1 = fim1;
	}

	public Fim getFim2() {
		return fim2;
	}

	public void setFim2(Fim fim2) {
		this.fim2 = fim2;
	}
	public Fim getFim3() {
		return fim3;
	}

	public void setFim3(Fim fim3) {
		this.fim3 = fim3;
	}

	public Fim getFim4() {
		return fim4;
	}

	public void setFim4(Fim fim4) {
		this.fim4 = fim4;
	}

	public String getNotaAutor() {
		return notaAutor;
	}

	public void setNotaAutor(String notaAutor) {
		this.notaAutor = notaAutor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Passo getPassoAnterior() {
		return passoAnterior;
	}

	public void setPassoAnterior(Passo passoAnterior) {
		this.passoAnterior = passoAnterior;
	}

}
