package claseHijos;

import java.util.ArrayList;

import clasePadre.Data;

public class VotoArray {
	private ArrayList<Voto> votoA;
	
	public VotoArray(){
		
		votoA=new ArrayList<Voto>();
		Adicionar(new Voto("sdfdffsd", Data.candA.Obtener(0),Data.partA.Obtener(0)));
		Adicionar(new Voto("sdfdsf", Data.candA.Obtener(1),Data.partA.Obtener(1)));
		Adicionar(new Voto("fdsfds", Data.candA.Obtener(1),Data.partA.Obtener(1)));
		Adicionar(new Voto("dfsdsf", Data.candA.Obtener(0),Data.partA.Obtener(0)));
		Adicionar(new Voto("dsfd", Data.candA.Obtener(1),Data.partA.Obtener(0)));
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
