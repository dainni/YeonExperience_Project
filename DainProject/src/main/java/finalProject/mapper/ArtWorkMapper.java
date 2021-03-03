package finalProject.mapper;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import finalProject.domain.ArtWorkDTO;

@Component
@Repository("finalProject.mapper.ArtWorkMapper")
public interface ArtWorkMapper {
	public void artworkInsert(ArtWorkDTO awdto);
		 
	

}
