package org.foobarspam.cotxox.conductores;
import java.util.ArrayList;
public class PoolConductores {
	
	private ArrayList<Conductor> poolConductores = null;
	
	public PoolConductores(){
		
	}
	public PoolConductores(ArrayList<Conductor> conductores){
		this.poolConductores = conductores;
	}
	public ArrayList<Conductor> getConductores(){
		return this.poolConductores;
	}
	public Conductor asignarConductor(){
		getConductores().get(0).setOcupado(true);
		return getConductores().get(0);
	}
	

}


