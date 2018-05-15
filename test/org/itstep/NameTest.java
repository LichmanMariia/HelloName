package org.itstep;

import static org.junit.Assert.*;

import org.junit.Test;

public class NameTest {

	@Test
	public void testGetName() {
		Name firstName = new Name();
		String name = firstName.getName("Mariia");
		assertEquals("Hello Mariia", name);
	}

}
