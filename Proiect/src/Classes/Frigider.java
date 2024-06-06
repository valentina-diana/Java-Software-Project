package Classes;


public class Frigider extends ElementeBucatarie{
	int nivelZgomot;
	boolean noFrost;
	
	public Frigider() {
		super();
		nivelZgomot=0;
		noFrost=false;
    }
    public Frigider (String produs, String brand, int capacitate, int lungime, int greutate, int latime, int nivelZgomot, boolean noFrost)
    {
    	super(produs,brand,capacitate,lungime,greutate,latime);
        this.nivelZgomot=nivelZgomot;
        this.noFrost=noFrost;
    }

    public Frigider (Frigider f)
    {
        super(f);
        nivelZgomot=f.nivelZgomot;
        noFrost=f.noFrost;
    }    
    
    public int getNivelZgomot() {
		return nivelZgomot;
	}
	public void setNivelZgomot(int nivelZgomot) {
		this.nivelZgomot = nivelZgomot;
	}
	public boolean isNoFrost() {
		return noFrost;
	}
	public void setNoFrost(boolean noFrost) {
		this.noFrost = noFrost;
	}
	@Override
	public String toString() {
		return super.toString() + " NivelZgomot = " + nivelZgomot + " | noFrost: " + ((noFrost == true)?"Da":"Nu");
	}
}
