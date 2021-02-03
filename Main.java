package steuersystem;

public class Main {

	public static void main(String[] args) {
		Finanzamt amt = new Finanzamt();
		Person[] p = {
				new Person(),
				new Arbeiter(),
				new Banker(),
				new Koenigin()
		};

		p[0].setJahresEinkommen(6400);
		p[1].setJahresEinkommen(36000);
		p[2].setJahresEinkommen(4000000);
		p[3].setJahresEinkommen(1000000);

		
		System.out.println("Person\n" + p[0].toString());
		System.out.println("\n Finanzamt bekommt gesamte Steuern = " + amt.berechnundSteuern(p) + "$");
	}

}
