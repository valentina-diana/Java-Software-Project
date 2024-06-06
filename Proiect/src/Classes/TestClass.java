package Classes;

import java.util.ArrayList;

public class TestClass {
	public static ArrayList<Frigider> arrayFrigider = new ArrayList<Frigider>();
	public static ArrayList<CombinaFrigorifica> arrayCombinaFrigorifica = new ArrayList<CombinaFrigorifica>();
	
	public static ArrayList<Frigider> arrayFrigider(){	//static - nu isi va schimba valorile
		arrayFrigider.add(new Frigider("Frigider", "Arctic", 30, 20,2, 25, 2, true));
		arrayFrigider.add(new Frigider("Frigider", "Indesit", 40, 30, 3, 160, 3, false));
		arrayFrigider.add(new Frigider("Frigider", "LG", 50, 28, 4, 180, 1, false));
		arrayFrigider.add(new Frigider("Frigider", "Electrolux", 59, 21, 5, 180, 1, true));
		return arrayFrigider;
	}
	

	public static ArrayList<CombinaFrigorifica> arrayCombinaFrigorifica(){
		arrayCombinaFrigorifica.add(new CombinaFrigorifica("CombinaFrigorica", "Samsung", 29, 102, 10, 110, 35, true));
		arrayCombinaFrigorifica.add(new CombinaFrigorifica("CombinaFrigorica", "Beko", 40, 145 ,75, 100, 44, false));
			return arrayCombinaFrigorifica;
	}
	
	
	public static void main(String[] args) {

	}
}