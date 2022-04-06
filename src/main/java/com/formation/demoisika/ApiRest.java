/**
 * 
 */
package com.formation.demoisika;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.formation.demoisika.service.CaclulatorService;

/**
 * @author songo
 *
 */

@RestController
public class ApiRest {
	
	@Autowired
	private CaclulatorService service;

	@RequestMapping("/")
	public String hello() {
		return "Hello Friend";
	}
	
	@RequestMapping("/sum")
	public int add(@RequestParam("a")int a,@RequestParam("b") int b) {
		return service.add(a, b);
	}
	
}
