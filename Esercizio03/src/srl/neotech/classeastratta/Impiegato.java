package srl.neotech.classeastratta;

public abstract class Impiegato {
 public interface IImpiegato {

	}
   String nome;
   String indirizzo;
   String telefono;
   Double paga;

 public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getIndirizzo() {
	return indirizzo;
}
public void setIndirizzo(String indirizzo) {
	this.indirizzo = indirizzo;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public Double getPaga() {
	return paga;
}
public void setPaga(Double paga) {
	this.paga = paga;
}


 
}
