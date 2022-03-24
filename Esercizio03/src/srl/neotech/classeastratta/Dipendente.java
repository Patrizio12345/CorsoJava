package srl.neotech.classeastratta;

public class Dipendente extends Impiegato{

    private double stipendio;
	    
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
	public double getStipendio() {
		return stipendio;
	}
	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
    
    
    
    
}
