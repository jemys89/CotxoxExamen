package org.foobarspam.cotxox.tarifa;
import org.foobarspam.cotxox.carrera.*;
public class Tarifa {
	//propiedades
	private final double costeMilla = 1.35;
	private final double costeMinimo = 5;
	private final double costeMinuto = 0.35;
	
	//Constructor por defecto
	public Tarifa(){
		
	}
	//Getters de costeMilla y costeMinuto
	public double getCosteMilla(){
		return this.costeMilla;
	}
	public double getCosteMinuto(){
		return this.costeMinuto;
	}
	//Métodos
	public double getCosteDistancia(double distancia){
		return getCosteMilla() * distancia;
	}
	public double getCosteTiempo(double minutos){
		return getCosteMinuto() *  minutos;
		
	}
	
	public double getCosteTotalEsperado(Carrera carrera){
		double costeDistancia = getCosteDistancia(carrera.getDistancia());
		double costeTiempo = getCosteTiempo(carrera.getTiempoEsperado());
		return costeDistancia + costeTiempo;
	}
}
