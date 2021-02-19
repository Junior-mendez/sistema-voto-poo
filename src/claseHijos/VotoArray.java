package claseHijos;

import java.util.ArrayList;

public class VotoArray {
	private ArrayList<Voto> votoA;
	
	public VotoArray(){
		votoA=new ArrayList<Voto>();
	}
	
	public void Adicionar(Voto x){
		votoA.add(x);
	}
	
	public int tamaño(){
		return votoA.size();
	}
	
	public Voto Obtener(int i){
		return votoA.get(i);
	}
	
	public Voto buscar(String certificado_Encargado) {
		Voto x;
		for (int i=0; i<tamaño(); i++){
			x=Obtener(i);
		if(x.getCertificado().equals(certificado_Encargado)){
			return x;
		}	
	}
		return null;
	}
	public boolean existe(String certificado_Encargado,int s) {
		Voto x;
		for (int i=0; i<tamaño(); i++){
			x=Obtener(i);
		if(x.getCertificado().equals(certificado_Encargado)){
			return false;
		}	
	}	
		return true;
	}
	
	public void eliminar(Voto x) {
		votoA.remove(x);
	}
	
	public void modificar(Voto x,int i){	
		votoA.set(i,x);
	}
	
}
