package steuersystem;

public class Arbeiter extends Person{

	private double steuerfreibetrag = 2400;
	
	@Override
	public int steuern() {
		
		return (int)((jahresEinkommen - steuerfreibetrag) / 100 * steuerSatz);
		
	}
	
	@Override
	public double zuVersteuerndesEinkokommen() {
		return (jahresEinkommen - steuerfreibetrag);
	}
	
}
