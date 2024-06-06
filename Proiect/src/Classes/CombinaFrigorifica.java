package Classes;


public class CombinaFrigorifica extends ElementeBucatarie{
	int putere;
	boolean dozatorGheata;
	
	public CombinaFrigorifica() {
		super();
		putere=0;
		dozatorGheata=false;
    }
    public CombinaFrigorifica (String produs,String brand, int capacitate, int lungime, int greutate, int latime, int putere, boolean dozatorGheata)
    {
        super(produs,brand,capacitate,lungime,greutate,latime);
        this.putere=putere;
        this.dozatorGheata=dozatorGheata;
    }

    public CombinaFrigorifica (CombinaFrigorifica c)
    {
        super(c);
        putere=c.putere;
        dozatorGheata=c.dozatorGheata;
    }    
    
    public int getputere() {
		return putere;
	}
    
	public void setputere(int puteree) {
		this.putere = puteree;
	}
	
	public boolean isdozatorGheata() {
		return dozatorGheata;
	}
	
	public void setdozatorGheata(boolean dozatorGheataa) {
		this.dozatorGheata = dozatorGheataa;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Putere = " + putere + "W" + " | dozatorGheata: " +  ((dozatorGheata == true)?"Da":"Nu");
	}
}
