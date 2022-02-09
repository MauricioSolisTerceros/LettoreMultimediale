package it.playermultimediale;

/*
 * Esercizio #1
2 Player multimediale
3 
4 Un Elemento Multimediale è una Immagine, un Video o una registrazione Audio 
identificato da un titolo.
5 Un elemento è riproducibile se ha una durata (un valore positivo di tipo int) e un 
metodo play().
6 
7 Una registrazione Audio è riproducibile e ha associato anche un volume (un valore 
positivo di tipo int) e i metodi abbassaVolume() e alzaVolume() per regolarlo. Se 
riprodotta, ripete per un numero di volte pari alla durata la stampa del titolo 
concatenato a una sequenza di punti esclamativi di lunghezza pari al volume (una stampa 
per riga).
8 
9 Un Video è riproducibile e ha associato un volume regolabile analogo a quello delle 
registrazioni audio e anche una luminosità (un valore positivo di tipo int) e i metodi 
aumentaLuminosita() e diminuisciLuminosita() per regolarla. Se riprodotta, ripete per 
un numero di volte pari alla durata la stampa del titolo concatenato a una sequenza di 
punti esclamativi di lunghezza pari al volume e poi a una sequenza di asterischi di 
lunghezza pari alla luminosità (una stampa per riga).
10 
11 Una Immagine non è riproducibile, ma ha una luminosità regolabile analoga a quella dei 
filmati e un metodo show() che stampa il titolo concatenato a una sequenza di 
asterischi di lunghezza pari alla luminosità
12 
13 Eseguire un oggetto multimediale significa invocarne il metodo show() se è un'immagine 
o il metodo play() se è riproducibile.
14 
15 Organizzare opportunamente con classi astratte, interfacce e classi concrete il codice 
di un lettore multimediale che memorizza 5 elementi (creati con valori letti da 
tastiera) in un array e poi chiede ripetutamente all'utente quale oggetto eseguire 
(leggendo un intero da 1 a 5 oppure 0 per finire)
 */
public class ElementoMultipedialeRiproducibile extends ElementoMultimediale {

	protected int durata;
	protected int volume;

	public ElementoMultipedialeRiproducibile(String titolo, int durata, int volume) {
		super(titolo);
		this.durata = durata;
		this.volume = volume;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void alzaVolume() {
		volume++;
	}

	public void abbassaVolume() {
		volume--;
	}

	// Metodo Play
	public void play() {

		String esclamativo = "";

		for (int i = 0; i < volume; i++) {
			esclamativo += "!";
		}
		for (int i = 0; i < durata; i++) {
			System.out.println(titolo + esclamativo + "\n");

		}
	}

}
