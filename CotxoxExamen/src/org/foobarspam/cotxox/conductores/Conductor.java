package org.foobarspam.cotxox.conductores;
import java.util.ArrayList;
public class Conductor {
	private String nombre, modelo, matricula = null;
	private boolean ocupado = false;
	private double valoracionMedia = 0.0d;
	private ArrayList<Byte> valoraciones = new ArrayList<Byte>();
	
	//Constructor por defecto
	public Conductor(){
		
	}
	
	//Constructor con la condición que solicita el Main del examen
	public Conductor(String nombre){
		this.nombre = nombre;
	}
	
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	public void setValoracion(Byte valoracion){
		this.valoraciones.add(valoracion);
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getMatricula(){
		return this.matricula;
	}
	public ArrayList<Byte> getValoraciones(){
		return this.valoraciones;
	}
	public String getModelo(){
		return this.modelo;
	}
	public double getValoracion(){
		double total = 0.0d;
		for(byte valoracion : getValoraciones()){
			total += valoracion;
		}return total/getValoraciones().size();
	}
	
	public boolean isOcupado(){
		return this.ocupado;
	}
	
	public void setOcupado(boolean ocupado){
		this.ocupado = ocupado;
	}
}
