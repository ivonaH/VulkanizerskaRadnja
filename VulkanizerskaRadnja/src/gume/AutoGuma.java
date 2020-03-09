package gume;

/**
 * 
 * Klasa AutoGuma koja predstavlja gumu na automobilu
 * 
 * @author Ivona Heldrih
 * 
 * @version 1.0
 *
 */

public class AutoGuma {
/**
 * Marka i model za gumu na automobilu.
 */
	private String markaModel = null;
	/**
	 * Precnik automobilske gume.
	 */
	private int precnik = 0;
	/**
	 * Sirina automobilske gume.
	 */
	private int sirina = 0;
	/**
	 * Visina automobilske gume.
	 */
	private int visina = 0;

	/**
	 * Vraca String vrednost marke i modela.
	 * @return markaModel MarkaModel string vrednost marke i Modela.
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Prima String vrednost markuModel i postavlja markuModel na tu vrednost.
	 * @param markaModel Marka je String vrednost.
	 *            
	 * @throws java.lang.RuntimeException
	 *             Ako je markaModel:
	 *             <ul>
	 *             <li>kraci od tri slova
	 *             <li>null
	 *             </ul>
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}

	/**
	 * Vraca precnik gume.
	 * @return precnik Celobrojna vrednost precnika gume.
	 */
	public int getPrecnik() {
		return precnik;
	}

	/**
	 * Postavljanje vrednosti za precnik gume.
	 * @param precnik Precnik je celobrojna vrednost precnika gume.
	 *            
	 * @throws java.lang.RuntimeException
	 *             Ako se prekoraci opseg precnika, tj ako je precnik veci od 13 ili
	 *             manji od 22.
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 && precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}

	/**
	 * Vraca celobrojnu vrednost sirine gume.
	 * @return sirina Sirina je celobrojna vrednost sirine gume.
	 */
	public int getSirina() {
		return sirina;
	}

	/**
	 * Postavljanje vrednosti sirine gume.
	 * 
	 * @param sirina
	 *            Sirina predstavlja celobrojnu vrednost sirine gume.
	 * @throws java.lang.RuntimeException
	 *             Ako se prekoraci dozvoljeni opseg za sirinu gume, tj. ako je:
	 *             <ul>
	 *             <li>sirina manje od 135
	 *             <li>sirina veca od 355
	 *             </ul>
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 && sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}

	/**
	 * Vraca vrdnost visine gume.
	 * 
	 * @return visina Celobrojna vrednost visine gume.
	 */
	public int getVisina() {
		return visina;
	}
/**
 * Vraca visinu gume.
 * @param visina Visina je celobrojna vrednost visine gume.
 * @throws java.lang.RuntimeException  Ako je visina van opsega, tj visina mora biti: <ul>
 * <li> veca od 25 <li> manja od 95 </ul>
 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}
/**
 * Vraca string sa podacima o auto gumi: <ol>
 * <li> markaModel <li>precnik <li>sirina <visina>
 * @return String Podaci o gumi u tekstualnom formatu.
 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	/**
	 * Proverava da li su dve AutoGume iste. 
	 * Poredi gume po atributima <i><b> markaModel, precnik, sirina, visina</b></i>
	 * @param obj AutoGuma koju zelimo da uporedimo sa zeljenom gumom.
	 * @return true ako su dve AutoGume iste po ovim parametrima, ako nisu vraca <b> false</b>.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}
}
