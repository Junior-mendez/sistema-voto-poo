package claseHijos;

import java.util.ArrayList;

public class CandidatoArray {
	private ArrayList<Candidato> candidatoA;

	public CandidatoArray() {
		candidatoA=new ArrayList<Candidato>();
	}
	
	public void Adicionar(Candidato x){
		candidatoA.add(x);
	}
	
	public int tama�o(){
		return candidatoA.size();
	}
	
	public Candidato Obtener(int i){
		return candidatoA.get(i);
	}
	
	public Candidato buscar(int cod_Candidato) {
		Candidato x;
		for (int i=0; i<tama�o(); i++){
			x=Obtener(i);
		if(x.getC�digo_candidato()==cod_Candidato)
			return x;
	}
		return null;
	}
	
	public void eliminar(Candidato x) {
		candidatoA.remove(x);
	}
	
	public void modificar(Candidato x,int i){	
		candidatoA.set(i,x);
	}
	
	public int ContarDigitos(Candidato x){
		int c�digo=x.getC�digo_candidato(); 
	            int cifras= 0;
	            while(c�digo!=0){        
	            	c�digo = c�digo/10;     
	                cifras++;         
	            }
		return cifras;
	}
}
