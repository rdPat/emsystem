package com.EMSystem.emsystem_eclipse_01v;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class TestSrcTest {

	private TestSrc code=new TestSrc();
	
	@Test
	public void testSum() {
		Assertions.assertEquals(6,code.sum(2, 4));
	}
}
