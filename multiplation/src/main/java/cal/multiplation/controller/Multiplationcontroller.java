package cal.multiplation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cal")
public class Multiplationcontroller {
	@GetMapping("/muls")
	public String home() {
		return "multiplation test";
	}
	
	}