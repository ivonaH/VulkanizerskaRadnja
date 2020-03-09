package gume.radnja;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gume.AutoGuma;

public class VulkanizerskaRadnjaTest {
	VulkanizerskaRadnja vr;
	AutoGuma autoGuma;

	@Before
	public void setUp() throws Exception {
		vr = new VulkanizerskaRadnja();
		autoGuma = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		vr = null;
		autoGuma = null;
	}

	@Test
	public void testDodajGumu() {
		autoGuma.setMarkaModel("Starfire WT200");
		autoGuma.setPrecnik(14);
		autoGuma.setSirina(200);
		autoGuma.setVisina(60);
		vr.dodajGumu(autoGuma);
		assertEquals(true, vr.pronadjiGumu("Starfire WT200").contains(autoGuma));
	}

	@Test(expected = java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		vr.dodajGumu(null);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testDodajGumuKojaPostoji() {
		autoGuma.setMarkaModel("Starfire WT200");
		autoGuma.setPrecnik(14);
		autoGuma.setSirina(200);
		autoGuma.setVisina(60);
		vr.dodajGumu(autoGuma);
		vr.dodajGumu(autoGuma);
	}

	@Test
	public void testPronadjiGumuKojaNePostoji() {
		autoGuma.setMarkaModel("Starfire WT200");
		autoGuma.setPrecnik(14);
		autoGuma.setSirina(200);
		autoGuma.setVisina(60);
		vr.dodajGumu(autoGuma);
		assertFalse(vr.pronadjiGumu("Starfire WT888").contains(autoGuma));
	}
	@Test
	public void testPronadjiGumuKojaPostoji() {
		autoGuma.setMarkaModel("Starfire WT200");
		autoGuma.setPrecnik(14);
		autoGuma.setSirina(200);
		autoGuma.setVisina(60);
		vr.dodajGumu(autoGuma);
		assertTrue(vr.pronadjiGumu("Starfire WT200").contains(autoGuma));
	}
	@Test
	public void testPronadjiGumeKojePostoje() {
		autoGuma.setMarkaModel("Starfire WT200");
		autoGuma.setPrecnik(14);
		autoGuma.setSirina(200);
		autoGuma.setVisina(60);
		vr.dodajGumu(autoGuma);
		
		AutoGuma autoGuma2=new AutoGuma();
		autoGuma2.setMarkaModel("Starfire WT200");
		autoGuma2.setPrecnik(15);
		autoGuma2.setSirina(205);
		autoGuma2.setVisina(64);
		vr.dodajGumu(autoGuma2);
		
		AutoGuma autoGuma3=new AutoGuma();
		autoGuma3.setMarkaModel("Starfire WT200");
		autoGuma3.setPrecnik(16);
		autoGuma3.setSirina(221);
		autoGuma3.setVisina(62);
		vr.dodajGumu(autoGuma3);
		
		AutoGuma autoGuma4=new AutoGuma();
		autoGuma4.setMarkaModel("Starfire W433");
		autoGuma4.setPrecnik(13);
		autoGuma4.setSirina(205);
		autoGuma4.setVisina(62);
		vr.dodajGumu(autoGuma4);
	LinkedList<AutoGuma> gumeTest=new LinkedList<AutoGuma>();// {
//			{
//				addLast(autoGuma);
//				add(autoGuma2);
//				add(autoGuma3);
//			}
//		};
	gumeTest.addFirst(autoGuma);
	gumeTest.addFirst(autoGuma2);
	gumeTest.addFirst(autoGuma3);
		
		assertEquals(gumeTest.size(),vr.pronadjiGumu("Starfire WT200").size());
		assertEquals(gumeTest,vr.pronadjiGumu("Starfire WT200"));
	}

	@Test
	public void testPronadjiGumuSaNullMarkaModel() {
		assertEquals(null, vr.pronadjiGumu(null));
	}

}
