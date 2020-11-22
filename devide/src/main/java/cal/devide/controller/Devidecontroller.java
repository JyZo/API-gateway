package cal.devide.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cal.add.controller.Result;

@RestController
@RequestMapping("/cal")
public class Devidecontroller {
	@GetMapping("/devs")
	public String home() {
		return "devide test";
	}
	
	@GetMapping("/dev")
	public Object add(@RequestParam(value="num1",required = false, defaultValue = "1")int num1,
			@RequestParam(value="num2",required = false,defaultValue = "1")int num2) {
		Result result= new Result(num1,num2);
		
		return "Devide"+result.toString();
	}
}