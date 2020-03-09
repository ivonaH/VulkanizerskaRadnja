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

	@Test(expected=java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		autoGuma.setMarkaModel(null);
	}
	
	@Test(expected=java.lang.RuntimeException.class)
	public void testSetMarkaModelEmptyString() {
		autoGuma.setMarkaModel("");
	}
	
	@Test
	public void testSetPrecnik() {
		autoGuma.setPrecnik(13);
		assertEquals(13, autoGuma.getPrecnik());
	}
	@Test(expected=java.lang.RuntimeException.class)
	public void testSetPrecnikPrekoracenaGornjaGranica() {
		autoGuma.setPrecnik(33);
	}
	@Test(expected=java.lang.RuntimeException.class)
	public void testSetPrecnikPrekoracenaDonjaGranica() {
		autoGuma.setPrecnik(4);
	}

	
	
	
	
}
