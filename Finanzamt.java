package steuersystem;

public class Finanzamt {

	public int berechnundSteuern(Person[] personen) {
		
		int tax = 0;
		
		for(int i = 0; i < personen.length; i++) {
			tax += personen[i].steuern();
		}
		
		return tax;
	}
	
}
