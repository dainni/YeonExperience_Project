package finalProject.service.artwork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import finalProject.domain.ArtWorkDTO;
import finalProject.mapper.ArtWorkMapper;

@Service
public class AartWorkDetailService {
   
	@Autowired
	ArtWorkMapper artWorkMapper;
	
	public void artworkDetail(String artworkNo, Model model) {
		// TODO Auto-generated method stub
		ArtWorkDTO awdto = artWorkMapper.artList(artworkNo).get(0);
		model.addAttribute("awdto",awdto);		
		
		
	}

}
