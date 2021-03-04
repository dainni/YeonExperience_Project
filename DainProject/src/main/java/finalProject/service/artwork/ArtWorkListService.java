package finalProject.service.artwork;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import finalProject.domain.ArtWorkDTO;
import finalProject.mapper.ArtWorkMapper;

@Service
public class ArtWorkListService {
	@Autowired
	ArtWorkMapper artWorkMapper;

	public void artworkList(Model model) {
		// TODO Auto-generated method stub
		
		List<ArtWorkDTO> artlists = artWorkMapper.artList(null);
		model.addAttribute("artlists",artlists);
		
	}

}
