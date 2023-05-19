package pl.krzysztofskul.sensit5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomePageController {

	@GetMapping({"/home", "/"})
	public String home() {
		return "index";
	}
	
	@GetMapping("/test/home")
	@ResponseBody
	public String testHome() {
		return "test home sensit5";
	}
	
}
