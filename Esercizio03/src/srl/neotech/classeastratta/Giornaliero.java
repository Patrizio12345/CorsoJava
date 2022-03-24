package srl.neotech.classeastratta;

public class Giornaliero extends Impiegato {
     
	
	private double base;
    private int giorno;
     
    public Giornaliero(String n,String i,String t,double b,int g) {
    	nome=n;
		indirizzo=i;
		telefono=t;
		base=b;
		giorno=g;
    }
    
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public int getGiorno() {
		return giorno;
	}

	public void setGiorno(int giorno) {
		this.giorno = giorno;
	}

	@Override
	public String getNome() {
	    return super.getNome();
	}

	@Override
	public String getIndirizzo() {
	    return super.getIndirizzo();
	}

	@Override
	public String getTelefono() {
	    return super.getTelefono();
	}

	@Override
	public Double getPaga() {
	    return super.getPaga();
	
	}
	
	@Override
	public String toString() {
		return nome + "," + indirizzo + "," + telefono + "," + base + "," + giorno;
	}	
}

	
	

