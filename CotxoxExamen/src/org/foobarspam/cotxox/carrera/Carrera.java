package org.foobarspam.cotxox.carrera;
import org.foobarspam.cotxox.tarifa.*;
import org.foobarspam.cotxox.conductores.*;
public class Carrera {
	
	//Propiedades
	private double tiempoEsperado,distancia, tiempoCarrera, costeTotal = 0.0d;
	private int propina = 0;
	private String origen,tarjetaCredito, destino = null;
	private Conductor conductor = null;
	
	//Constructor por defecto
	public Carrera(){
		
	}
	//Constructor solo con tarjetaCredito como pide el main
	public Carrera(String tarjetaCredito){
		this.tarjetaCredito = tarjetaCredito;
	}
	public void setOrigen(String origen){
		this.origen = origen;
	}
	public void setDestino(String destino){
		this.destino = destino;
	}
	public void setDistancia(double distancia){
		this.distancia = distancia;
	}
	public void setTiempoEsperado(double tiempoEsperado){
		this.tiempoEsperado = tiempoEsperado;
	}
	public String getOrigen(){
		return this.origen;
	}
	public String getDestino(){
		return this.destino;
	}
	public double getDistancia(){
		return this.distancia;
	}
	public String getTarjetaCredito(){
		return this.tarjetaCredito;
	}
	public double getTiempoEsperado(){
		return this.tiempoEsperado;
	}
	
	public Conductor getConductor(){
		return this.conductor;
	}
	public void setConductor(Conductor conductor){
		this.conductor = conductor;
	}
	public void setPropina(int propina){
		this.propina = propina;
	}
	public int getPropina(){
		return this.propina;
	}
	//Métodos
	public double getCosteEsperado(){
		Tarifa tarifa = new Tarifa();
		double coste = tarifa.getCosteTotalEsperado(this);
		return coste;
	}
	
	public Conductor asignarConductor(PoolConductores conductores){
		conductor = conductores.asignarConductor();
		setConductor(conductor);
		return conductor;
	}
	
	public void realizarPago(double pago){
		this.costeTotal = pago;
	}
	
	public void recibirPropina(int propina){
		this.propina = propina;
	}
	
	public void liberarConductor(){
		getConductor().setOcupado(false);
	}
	public double getCosteTotal(){
		return  this.costeTotal;
	}
	
}
