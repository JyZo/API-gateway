package cal.devide.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cal")
public class Devidecontroller {
	@GetMapping("/devs")
	public String home() {
		return "devide test";
	}
	
}