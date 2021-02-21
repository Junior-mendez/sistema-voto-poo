package clasePadre;

import claseHijos.CandidatoArray;
import claseHijos.EncargadoArray;
import claseHijos.PartidoArray;
import claseHijos.Votante;
import claseHijos.VotanteArray;
import claseHijos.VotoArray;

public class Data {
	public static PartidoArray partA=new PartidoArray();
	public static CandidatoArray candA=new CandidatoArray();
	public static VotanteArray vtnA=new VotanteArray();
	public static EncargadoArray encargadoA=new EncargadoArray();
	public static VotoArray votoA=new VotoArray();
	public static Data data;
	public static String certi;
	public static boolean inicio;
	
	public static Data create(){
		if(data == null){
			data=new Data();
		}
		return data;
	}
}
