package finalProject.controller.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import finalProject.controller.CookieAction;
import finalProject.service.artwork.ArtWorkListService;

@Controller
public class MainController {
	@Autowired
	ArtWorkListService artworkListService;
	
	@RequestMapping(value = "/")
	public String home(HttpServletRequest request,	HttpServletResponse response, Model model) {
		artworkListService.artworkList(model);
		CookieAction action = new CookieAction();
		action.execute(request, response);
		return "thymeleaf/index";	
	}
	

}