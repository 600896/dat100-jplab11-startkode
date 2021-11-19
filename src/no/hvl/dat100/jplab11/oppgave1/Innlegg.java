package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
//deklarering av objekt variabler
	int id; //Objektvariablen id skal brukes om en unik identifikasjon på et innlegg.
	String bruker;
	String dato;
	int likes;
	
	
	public Innlegg() {
		
	}
//som gir verdi til objektvariablene. Konstruktøren som bare tar tre parametre skal sette likes lik 0.
	
	public Innlegg(int id, String bruker, String dato) {
		likes = 0;
		this.id = id;
		this.dato = dato;
		this.bruker = bruker;
		
		
	}

	public Innlegg(int id, String bruker, String dato, int likes) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		
	}
	
	public String getBruker() {
		
		return bruker;

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return dato;
		
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return id;

	}

	public int getLikes() {
		return likes;

	}
	//øker antall likes med +1
	public void doLike () {
		likes += 1;
	}
	
//Implementer metoden public boolean erLik(Innlegg innlegg) som returnerer 
//true hvis og kun hvis innlegget har samme id som innlegget innlegg git med som parameter.
	public boolean erLik(Innlegg innlegg) {
		if(id == innlegg.getId()) {
				return true;
			}
			else return false;
			
	
	}
	
	//"1\nOle Olsen\n23-10\n7\n"
	//der det først tallet er id for innlegget og 7 er antall likes for eksemplet.
	
	@Override
	public String toString() {
		String melding = id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
		return melding;
		
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
