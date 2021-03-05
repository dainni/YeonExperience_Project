package finalProject.service.artnotice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import finalProject.domain.ArtNoticeDTO;
import finalProject.mapper.ArtNoticeMapper;

@Service
public class ArtNoticeListService {
     
	@Autowired
	ArtNoticeMapper artNoticeMapper;
	
	public void artnoticeList(Model model) {
		// TODO Auto-generated method stub
		
		List<ArtNoticeDTO> antLists = artNoticeMapper.artnoticeList(); 
		model.addAttribute("antLists",antLists);
	}

}
