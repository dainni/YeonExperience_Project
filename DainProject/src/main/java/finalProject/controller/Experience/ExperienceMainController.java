package finalProject.controller.Experience;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExperienceMainController {
	
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
}
