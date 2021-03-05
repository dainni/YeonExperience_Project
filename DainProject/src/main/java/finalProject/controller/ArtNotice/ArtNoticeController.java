package finalProject.controller.ArtNotice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import finalProject.command.ArtNoticeCommand;
import finalProject.service.artnotice.ArtNoticeListService;
import finalProject.service.artnotice.ArtNoticeService;

@Controller
@RequestMapping("artnotice")
public class ArtNoticeController {
	
	@Autowired
	ArtNoticeService artNoticeService;
	@Autowired
	ArtNoticeListService artNoticeListService;
	
	@ModelAttribute
	ArtNoticeCommand setArtNoticeCommand() {
		return new ArtNoticeCommand();
	}
	
	@RequestMapping("artnoticeList")
	public String artnoticeList(Model model) {
		artNoticeListService.artnoticeList(model);
		return "thymeleaf/artnotice/artnoticeList";
	} //리스트 페이지 열림
	
	@RequestMapping("artworkForm")
	public String artnoticForm() {
		return "thymeleaf/artnotice/artnoticeForm";
	} //form페이지 열림
	
	@RequestMapping(value = "/artnoticeFormPro", method = RequestMethod.POST)
	public String artnotieFormPro(ArtNoticeCommand artNoticeCommand) {
		artNoticeService.artnoticeFormPro(artNoticeCommand);
		return "redirect:/artnotice/artnoticeList";
	}

}
