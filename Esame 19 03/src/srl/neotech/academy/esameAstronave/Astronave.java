package srl.neotech.academy.esameAstronave;

public class Astronave implements IAstronave {

	private int velocita;

	public int getVelocita() {
		return velocita;
	}

	public void setVelocita(int velocita) {
		this.velocita = velocita;
	}

	@Override
	public String decolla() {
		return "Ho impostato la velocità iniziale a:"+velocita;
	}

	@Override
	public String accelera() {
		return "Ho accelerato di:"+ velocita;
	}

	@Override
	public String decelera() {
		// TODO Auto-generated method stub
		return "Ho decelerato di:"+velocita;
	}
	
	
	
}
