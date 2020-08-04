package prueba;

import java.util.TreeMap;

public class pruebaRomanos {

	private final static TreeMap<Integer, String> base = new TreeMap<Integer, String>();
	
	
	static {
		base.put(1, "I");
		base.put(4, "IV");
		base.put(5, "V");
		base.put(9, "IX");
		base.put(10, "X");
		base.put(40, "XL");
		base.put(50, "L");
		base.put(90, "XC");
		base.put(100, "C");
		base.put(900, "CM");
		base.put(1000, "D");
	}
	
	public final static String name(int numero) {
		
		int bases= base.floorKey(numero);
		if(bases ==numero) {
			return base.get(numero);
		}
		return base.get(bases)+name(numero-bases);		
	}

	public static void main(String[] args) {
		
		  
			  System.out.println(name(45));	 
	}
	

}
