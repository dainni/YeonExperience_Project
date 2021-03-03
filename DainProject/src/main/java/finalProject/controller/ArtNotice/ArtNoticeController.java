package finalProject.controller.ArtNotice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArtNoticeController {
	
	@RequestMapping("artnoticeList")
	public String artnoticeList() {
		return "thymeleaf/artnotice/artnoticeList";
	}

}
