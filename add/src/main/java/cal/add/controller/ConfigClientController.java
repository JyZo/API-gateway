package cal.add.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${who.am.i}")
    private String identity;

    @GetMapping("/test")
    public String test() {
        return identity;
    }
	
//	@GetMapping("/test")
//	public String test() {
//		return "test add config client";
//	}
}
