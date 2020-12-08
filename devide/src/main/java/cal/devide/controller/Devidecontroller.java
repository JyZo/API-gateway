package cal.devide.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/devs")
public class Devidecontroller {
	@GetMapping("/test")
	public String home() {
		return "devide test";
	}
	
	@GetMapping("/dev")
	public Object add(@RequestParam(value="num1",required = false, defaultValue = "1")int num1,
			@RequestParam(value="num2",required = false,defaultValue = "1")int num2) {
		
		if(num2==0) {
			return "not devide";
		}else if(num1==0) {
			return "Devide:Result "+"["+"num1:"+num1+", "+"num2:"+num2+", "+"result:0"+"]";
		}
		else if(num1>=num2) {
			Result result = new Result(num1,num2);
			return "Devide:"+result;
		}else if(num1<num2) {
			int temp=0;
			temp=num1;
			num1=num2;
			num2=temp;
			Result result = new Result(num1,num2);
			return "Devide:"+result;
		}
		return null;
	}
}