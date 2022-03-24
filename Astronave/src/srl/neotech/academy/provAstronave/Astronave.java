package srl.neotech.academy.provAstronave;

public class Astronave implements IAstronave{

	int velocita;

	
	
	
	public int getVelocita() {
		return velocita;
	}

	public void setVelocita(int velocita) {
		this.velocita = velocita;
	}

	@Override
	public String decolla(int velocita) {
		this.velocita=velocita;
		return  "Ho impostato la velocita iniziale a:"+velocita;
	}

	@Override
	public String accelera(int velocita) {
		this.velocita=this.velocita+velocita;
		return "Ho accellerato di:"+velocita;
	}

	@Override
	public String decellera(int velocita) {
		this.velocita=this.velocita-velocita;
		if(this.velocita<0)this.velocita=0;
		return  "Ho decellerato di:"+velocita;
	}
	
	
	
	
}
