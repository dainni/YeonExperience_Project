package finalProject.controller.ArtWork;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import finalProject.command.ArtworkCommand;
import finalProject.service.artwork.ArtWorkService;

@Controller
public class ArtWorkController {
	
	@Autowired
	ArtWorkService artworkSerivce;
	
	@ModelAttribute
	ArtworkCommand setArtworkCommand() {
		return new ArtworkCommand();
	} 

	@RequestMapping("artworkList")
	public String artworkList() {
		return "thymeleaf/artwork/artWorkList";
	} //전시품 등록 리스트 페이지 오픈
	
	
	@RequestMapping(value = "artworkForm", method = RequestMethod.GET)
	public String artworkForm() {
		return "thymeleaf/artwork/artWorkForm";
	} //전시품 등록 폼 페이지 오픈 get이니까 ?뒤에 값이 보여지는거!
	
	@RequestMapping(value = "artworkFormPro", method = RequestMethod.POST)
    public String artworkFormPro(ArtworkCommand artworkCommand, HttpSession session) {
		artworkSerivce.artworkPro(artworkCommand,session);
		return "redirect:/artworkList";
	} //post값 안보여지게 값넘어가는거
	  //command값 넘겨주는거니까 form에 적은 값 넘겨주기!
	
	
	

	
}
