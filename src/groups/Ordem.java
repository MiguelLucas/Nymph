package groups;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Ordem {
	//coment
	private ArrayList<Passo> passos = new ArrayList<Passo>();
	public Ordem() {}
	
	public ArrayList<Passo> getPassos(){
		return passos;
	}
	
	public void setPassos(ArrayList<Passo> passos){
		this.passos = passos;
	}
	
	public void addPasso(String opcao1, String opcao2){
		Passo p1 = new Passo(opcao1,opcao2);
		passos.add(p1);
	}

}
