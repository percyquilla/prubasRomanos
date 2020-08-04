package prueba;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class numerosRomanoTest {

	private pruebaRomanos prueba= new pruebaRomanos();
	@Test
	void test() {
		
		//assertEquals("X", prueba.name(10));
	List<String> listaromanos=new  ArrayList<String>(Arrays.asList("I",
			"II",
			"III",
			"IV",
			"V",
			"VI",
			"VII",
			"VIII",
			"IX",
			"X",
			"XI",
			"XII",
			"XIII",
			"XIV",
			"XV",
			"XVI",
			"XVII",
			"XVIII",
			"XIX",
			"XX",
			"XXI",
			"XXII",
			"XXIII",
			"XXIV",
			"XXV",
			"XXVI",
			"XXVII",
			"XXVIII",
			"XXIX",
			"XXX",
			"XXXI",
			"XXXII",
			"XXXIII",
			"XXXIV",
			"XXXV",
			"XXXVI",
			"XXXVII",
			"XXXVIII",
			"XXXIX",
			"XL",
			"XLI",
			"XLII",
			"XLIII",
			"XLIV",
			"XLV",
			"XLVI",
			"XLVII",
			"XLVIII",
			"XLIX",
			"L",
			"LI",
			"LII",
			"LIII",
			"LIV",
			"LV",
			"LVI",
			"LVII",
			"LVIII",
			"LIX"));
		
	
	 for (int i = 1; i <=50; i++) {
		 String valor=listaromanos.get(i-1);
		 assertEquals(valor, prueba.name(i));
		
	}
	
		
		
	}

}
