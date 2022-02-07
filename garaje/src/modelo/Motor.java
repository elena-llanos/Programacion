package modelo;

public class Motor {
	
	private int litrosAceiteRestantes = 0;
	private int caballos;
	
	
	public Motor() {
	
	}


	
	
	public Motor(int litrosAceiteRestantes, int caballos) {
		
		this.litrosAceiteRestantes = litrosAceiteRestantes;
		this.caballos = caballos;
	}




	public int getLitrosAceiteRestantes() {
		return litrosAceiteRestantes;
	}


	public void setLitrosAceiteRestantes(int litrosAceiteRestantes) {
		this.litrosAceiteRestantes = litrosAceiteRestantes;
	}


	public int getCaballos() {
		return caballos;
	}


	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}




	@Override
	public String toString() {
		return "Motor [litrosAceiteRestantes=" + litrosAceiteRestantes + ", caballos=" + caballos + "]";
	}
	
	
	
	
	
	
	
	

}
