package org.foobarspam.cotxox.testing;

import static org.junit.Assert.*;

import org.junit.Test;
import org.foobarspam.cotxox.tarifa.*;
public class TarifaTest {

	@Test
	public void test() {
		Tarifa tarifa = new Tarifa();
	}
	
	@Test
	public void test_coste_esperado(){
		Tarifa tarifa = new Tarifa();
		double distancia = 10;
		double minutos = 10;
		assertEquals(13.5,tarifa.getCosteDistancia(distancia),0.1);
		assertEquals(3.50,tarifa.getCosteTiempo(minutos),0.1);
		
	}

}
