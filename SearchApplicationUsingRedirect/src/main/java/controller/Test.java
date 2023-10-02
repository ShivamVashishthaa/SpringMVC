package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Test {
	@RequestMapping(path="/home")
	public String home(Model model) {
		model.addAttribute("shivam","Vashistha");
		return "home";
	}
	@RequestMapping("/Search" )
	public RedirectView search(@RequestParam("QueryBox") String query) {
		String url="https://www.google.com/search?q=" + query;
		RedirectView rv = new RedirectView();
		rv.setUrl(url);
		return rv;
	}
}
