package Classes;

import Classes.ElementeBucatarie;

public class ElementeBucatarie{
	String produs;
    String brand;
    int capacitate;
    int lungime;
    int greutate;
    int latime;
    
    public ElementeBucatarie(){
        produs="";
        capacitate=0;
        lungime=0;
        greutate=0;
        latime=0;
    }
    
    public ElementeBucatarie (String produss, String brandd, int capacitatee, int lungimee, int greutatee, int latimee)
    {
        this.produs=produss;
        this.brand=brandd;
        this.capacitate=capacitatee;
        this.lungime=lungimee;
        this.greutate=greutatee;
        this.latime=latimee;
    }
    
    public ElementeBucatarie (ElementeBucatarie e){
    	this.produs=e.produs;
    	this.brand=e.brand;
    	this.capacitate=e.capacitate;
    	this.lungime=e.lungime;
    	this.greutate=e.greutate;
    	this.latime=e.latime;
    }
    
	public String getProdus() {
		return produs;
	}

	public String getBrand() {
		return brand;
	}

	public int getCapacitate() {
		return capacitate;
	}

	public int getLungime() {
		return lungime;
	}

	public int getGreutate() {
		return greutate;
	}

	public int getLatime() {
		return latime;
	}

	public void setProdus(String produs) {
		this.produs = produs;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setCapacitate(int capacitate) {
		this.capacitate = capacitate;
	}

	public void setLungime(int lungime) {
		this.lungime = lungime;
	}

	public void setGreutate(int greutate) {
		this.greutate = greutate;
	}

	public void setLatime(int latime) {
		this.latime = latime;
	}

	public String toString() {
		return "  Produs = " + produs + " | Brand = " + brand + " | Capacitate = " + capacitate + " | Lungime = "
				+ lungime + " | Greutate = " + greutate + " | Latime = " + latime;
	}
}