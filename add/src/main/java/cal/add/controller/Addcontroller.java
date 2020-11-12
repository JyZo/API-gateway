package cal.add.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/add")
public class Addcontroller {
	@GetMapping("/adds")
	public String home() {
		return "add test";
	}
	
	}
