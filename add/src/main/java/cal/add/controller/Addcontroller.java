package cal.add.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adds")
public class Addcontroller {
	@GetMapping("/test")
	public String home() {
		return "add test";
	}
	
	@GetMapping("/add")
	public Object add(@RequestParam(value="num1",required = false, defaultValue = "1")int num1,
			@RequestParam(value="num2",required = false,defaultValue = "1")int num2) {
		Result result= new Result(num1,num2);
		if(num1<0 | num2<0 | num1+num2<0) {
			return "don't minus";
		}else if(num1+num2>=10000) {
			return "10000 over!!";
		}
		return "Add:"+result;
	}
}