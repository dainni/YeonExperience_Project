package finalProject.controller.Experience;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import finalProject.service.artwork.AartWorkDetailService;


@Controller
public class ExperienceMainController {
	      @Autowired
	      AartWorkDetailService artworkDetailService;
	     
	
	@RequestMapping("Information_Directions")
	public String InformationDt() {
		return "thymeleaf/In_Directions";
	} // 오시는길
	
	@RequestMapping("Information_Facilities")
	public String InformationFa() {
		return "thymeleaf/In_Facilities";
	} // 편의시설
	
	@RequestMapping("Information_Parking")
	public String InformationPk() {
		return "thymeleaf/In_Parking";
	} // 주차안내
	
	@RequestMapping("Information_ArtManner")
	public String InformationAt() {
		return "thymeleaf/In_ArtManner";
	} //미술관 매너
	
	@RequestMapping("mypage")
	public String mypage() {
		return"thymeleaf/mypage34";
	}
	
	@RequestMapping("art")
	public String art() {
		return"thymeleaf/mypage234";
	}
	
	@RequestMapping("artworkUserDetail")
	   public String artworkDetail(@RequestParam(value = "artworkNo")String artworkNo, Model model) {
		   artworkDetailService.artworkDetail(artworkNo,model);
		   return "thymeleaf/artwork/artWorkUserDetail";
	   }
	
	@RequestMapping("popup")
	public String popup() {
		return"thymeleaf/popup";
	}
	
}
