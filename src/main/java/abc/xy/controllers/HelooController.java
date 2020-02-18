package abc.xy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelooController {
	@RequestMapping(value="hello", method=RequestMethod.GET)
	public void showHellPage() {
		System.out.println("hello");
	}
	

}
