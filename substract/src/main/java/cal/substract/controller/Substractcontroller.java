package cal.substract.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/subs")
public class Substractcontroller {
	@GetMapping("/test")
	public String home() {
		return "substract test";
	}
	
	@GetMapping("/sub")
	public Object add(@RequestParam(value="num1",required = false, defaultValue = "1")int num1,
			@RequestParam(value="num2",required = false,defaultValue = "1")int num2) {
		
		if(num1<0 | num2<0) {
			return "dont't minus";
		}
		else if(num1>=num2) {
			Result result = new Result(num1,num2);
			return "Substract:"+result;
		}else if(num1<num2) {
			int temp=0;
			temp=num1;
			num1=num2;
			num2=temp;
			Result result = new Result(num1,num2);
			return "Substract:"+result;
		}
		return null;
	}
}