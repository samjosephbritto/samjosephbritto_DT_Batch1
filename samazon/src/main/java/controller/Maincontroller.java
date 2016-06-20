package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Maincontroller {
	
	@RequestMapping("/")
	public ModelAndView home(){
		
		ModelAndView vw = new ModelAndView("index");
		return vw;
	}
}
