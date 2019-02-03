import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RamStringTester {
	protected void setUp() {
		RamString test1 = new RamString();
		test1.setWackyString("DreamTeam");
		RamString test2 = new RamString();
		test2.setWackyString("Dream Team");
		RamString test3 = new RamString();
		test3.setWackyString("kirtfieldk@vcu.edu");
		RamString test4 = new RamString();
		test4.setWackyString("123kirtfieldk@vcu.edu123");
		RamString test5 = new RamString();
		RamString test6 = new RamString();
		RamString test7 = new RamString();	
	}

	@Test
	void testGetEvenCharacters1() {
		RamString test1 = new RamString();
		test1.setWackyString("DreamTeam");
		
		assertTrue(test1.getEvenCharacters().equals("raTa"));
	}
	@Test
	void testGetEvenCharacters2() {
		RamString test1 = new RamString();
		test1.setWackyString("Dream Team");
		assertTrue(test1.getEvenCharacters().equals("raTa"));
	}
	@Test
	void testGetEvenCharacters3() {
		RamString test1 = new RamString();
		test1.setWackyString("Dream                   Team");
		assertTrue(test1.getEvenCharacters().equals("raTa"));
	}
	@Test
	void testGetEvenCharacters4() {
		RamString test1 = new RamString();
		test1.setWackyString("kirtfieldk@vcu.edu");
		assertTrue(test1.getEvenCharacters().equals("itilkvueu"));
	}
	@Test
	void testGetEvenCharacters5() {
		RamString test1 = new RamString();
		test1.setWackyString(" ");
		assertTrue(test1.getEvenCharacters().equals(""));
	}
	@Test
	void testGetEvenCharacters6() {
		RamString test1 = new RamString();
		test1.setWackyString(" a n d ");
		
		assertTrue(test1.getEvenCharacters().equals("n"));
	}
	
//	@Test
//	void testGetEvenCharacters5() {
//		RamString test1 = new RamString();
//		test1.setWackyString(" ");
//		assertTrue(test1.getEvenCharacters().equals(""));
//	}
//	
	
	@Test 
	void testGetOddCharacters() {
		RamString test = new RamString();
		test.setWackyString("DreamTeam");
		assertTrue(test.getOddCharacters().equals("Demem"));
	}
	
	
	@Test
	void testCountNonDigit1() {
		RamString test = new RamString();
		test.setWackyString("12DreamTeam12");
		assertTrue(test.countNonDigits() == 4);
	}
	@Test
	void testCountNonDigit2() {
		RamString test = new RamString();
		test.setWackyString("1212");
		assertTrue(test.countNonDigits() == 4);
	}
	@Test
	void testCountNonDigit3() {
		RamString test = new RamString();
		test.setWackyString("");
		assertTrue(test.countNonDigits() == 0);
		
	}
	
	
	
	
}