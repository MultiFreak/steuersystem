package steuersystem;

public class Person {

	protected double jahresEinkommen;
	protected int steuerSatz = 25;
	
	
	
	public int steuern() {
		
		return (int)(jahresEinkommen / 100 * steuerSatz);
		
	}
	
	public double zuVersteuerndesEinkokommen() {
		return jahresEinkommen;
	}

	public String toString() {		
		return "" + "Einkommen: " + jahresEinkommen + "\n" + "zu versteuerndes Einkomen: " + zuVersteuerndesEinkokommen() + "\n" + "zu zahlende Steuern: " + steuern() + "\n" + "Netto-Einkommen: " + (jahresEinkommen - steuern());
	}
	
	
	public double getJahresEinkommen() {
		return jahresEinkommen;
	}

	public void setJahresEinkommen(double jahresEinkommen) {
		this.jahresEinkommen = jahresEinkommen;
	}
	
}
