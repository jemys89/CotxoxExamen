package org.foobarspam.cotxox.testing;

import static org.junit.Assert.*;

import org.junit.Test;
import org.foobarspam.cotxox.carrera.*;
public class CarreraTest {

	@Test
	public void test() {
		String tarjetaCredito = "4916119711304546";
		String origen = "Aeroport Son Sant Joan";
		String destino= "Magaluf";
		double distancia = 7.75;
		int tiempoEsperadoMinutos = 10;
		
		Carrera carrera = new Carrera(tarjetaCredito);
		carrera.setOrigen(origen);
		carrera.setDestino(destino);
		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(tiempoEsperadoMinutos);
		
		assertEquals("4916119711304546",carrera.getTarjetaCredito());
		assertEquals("Magaluf", carrera.getDestino());
		assertEquals("Aeroport Son Sant Joan", carrera.getOrigen());
		assertEquals(7.75,carrera.getDistancia(),0.1);
		
	}

}
