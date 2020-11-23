package cal.multiplation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/muls")
public class Multiplationcontroller {
	@GetMapping("/test")
	public String home() {
		return "multiplation test";
	}
	
	@GetMapping("/mul")
	public Object add(@RequestParam(value="num1",required = false, defaultValue = "1")int num1,
			@RequestParam(value="num2",required = false,defaultValue = "1")int num2) {
		Result result= new Result(num1,num2);
		if(num1<0 | num2<0) {
			return "don't minus";
		}else if(num1*num2>=100000) {
			return "100000 over!!";
		}
		return "Multiplation:"+result;
	}
}