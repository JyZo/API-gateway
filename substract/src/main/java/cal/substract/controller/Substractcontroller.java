package cal.substract.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cal")
public class Substractcontroller {
	@GetMapping("/subs")
	public String home() {
		return "substract test";
	}
	
	}

