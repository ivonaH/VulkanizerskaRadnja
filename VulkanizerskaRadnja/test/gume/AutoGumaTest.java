package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AutoGumaTest {
	private AutoGuma autoGuma;

	@Before
	public void setUp() throws Exception {
		autoGuma = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		autoGuma = null;
	}

	@Test
	public void testSetMarkaModel() {
		autoGuma.setMarkaModel("Starfire WT200");
		assertEquals("Starfire WT200", autoGuma.getMarkaModel());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		autoGuma.setMarkaModel(null);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelEmptyString() {
		autoGuma.setMarkaModel("");
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelKratakString() {
		autoGuma.setMarkaModel("a");
	}

	@Test
	public void testSetPrecnik() {
		autoGuma.setPrecnik(13);
		assertEquals(13, autoGuma.getPrecnik());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikPrekoracenaGornjaGranica() {
		autoGuma.setPrecnik(33);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikPrekoracenaDonjaGranica() {
		autoGuma.setPrecnik(4);
	}

	@Test
	public void testSetSirina() {
		autoGuma.setSirina(200);
		assertEquals(200, autoGuma.getSirina());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaPrekoracenaGornjaGranica() {
		autoGuma.setSirina(500);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaPrekoracenaDonjaGranica() {
		autoGuma.setSirina(13);
	}

	@Test
	public void testSetVisina() {
		autoGuma.setVisina(60);
		assertEquals(60, autoGuma.getVisina());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaPrekoracenaGornjaGranica() {
		autoGuma.setVisina(660);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaPrekoracenaDonjaGranica() {
		autoGuma.setVisina(6);
	}

	@Test
	public void testToString() {
		autoGuma.setMarkaModel("Starfire WT200");
		autoGuma.setPrecnik(14);
		autoGuma.setSirina(200);
		autoGuma.setVisina(60);
		assertTrue(autoGuma.toString().contains("Starfire WT200"));
		assertTrue(autoGuma.toString().contains("14"));
		assertTrue(autoGuma.toString().contains("200"));
		assertTrue(autoGuma.toString().contains("60"));
	}

	@Test
	public void testEqualsFalse() {
		AutoGuma autoGuma2 = new AutoGuma();
		autoGuma2.setMarkaModel("Starfire WT600");
		autoGuma2.setPrecnik(17);
		autoGuma2.setSirina(250);
		autoGuma2.setVisina(63);

		autoGuma.setMarkaModel("Starfire WT200");
		autoGuma.setPrecnik(14);
		autoGuma.setSirina(200);
		autoGuma.setVisina(60);

		assertFalse(autoGuma.equals(autoGuma2));
	}

	@Test
	public void testEqualsTrue() {
		AutoGuma autoGuma2 = new AutoGuma();

		autoGuma.setMarkaModel("Starfire WT200");
		autoGuma.setPrecnik(14);
		autoGuma.setSirina(200);
		autoGuma.setVisina(60);

		autoGuma2.setMarkaModel("Starfire WT200");
		autoGuma2.setPrecnik(14);
		autoGuma2.setSirina(200);
		autoGuma2.setVisina(60);

		assertTrue(autoGuma.equals(autoGuma2));
	}

	@Test
	public void testEqualsFalse2() {

		autoGuma.setMarkaModel("Starfire WT200");
		autoGuma.setPrecnik(14);
		autoGuma.setSirina(200);
		autoGuma.setVisina(60);

		assertFalse(autoGuma.equals(new Object()));
	}

}
