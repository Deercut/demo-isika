package com.formation.demoisika;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.formation.demoisika.service.CaclulatorService;

@SpringBootTest
class DemoIsikaApplicationTests {

	
	@Autowired
	private CaclulatorService service;
	
	@Test
	void contextLoads() {
		
		assertEquals(12, service.add(8, 4));
		
	}

}
