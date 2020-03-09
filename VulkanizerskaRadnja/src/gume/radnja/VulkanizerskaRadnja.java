package gume.radnja;

import java.util.LinkedList;
import gume.AutoGuma;

/**
 * 
 * Klasa VulkanizerskaRadnja predstavlja vulkanizersku radnju.
 * 
 * @author Ivona Heldrih
 * 
 * @version 1.0
 *
 */
public class VulkanizerskaRadnja {
	/**
	 * Dvostruko spregnuta lista AutoGuma.
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	/**
	 * Metoda ubacuje gumu u nasu listu guma.
	 * 
	 * @param a Nova AutoGuma koju zelimo da ubacimo u listu gume.
	 * 
	 * @throws java.lang.RuntimeException     Ukoliko se guma a vec nalazi u listi.
	 * @throws java.lang.NullPointerException Ukoliko je guma prosledjena kao
	 *                                        parametar null.
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}

	/**
	 * Metoda koja pretrazuje gumu na osnovu zadatog parametra.
	 * 
	 * @param markaModel Marka i model gume koju pokusavamo da pronadjemo.
	 * @return novaLista Lista guma zadate marke i modela. Ukoliko je prosledjeni
	 *         parametar markaModel null, ili ako ne postoji guma zadate marke i
	 *         modela, dobija se null.
	 * 
	 */

	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}
}
