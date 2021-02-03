package steuersystem;

public class Banker extends Person {

	private boolean unterstuetzung = true;
	
	@Override
	public int steuern() {
		int tax = 0;
		
		if(!unterstuetzung)
			tax = (int)(jahresEinkommen / 100 * steuerSatz);
		else {
			tax = (int)(jahresEinkommen / 100 * steuerSatz) + 1000;
			
			if(tax>jahresEinkommen) 
				tax = (int) jahresEinkommen;
			
		}
		
		return tax;
		
	}

	
	
	public boolean isUnterstuetzung() {
		return unterstuetzung;
	}

	public void setUnterstuetzung(boolean unterstuetzung) {
		this.unterstuetzung = unterstuetzung;
	}
	
}
