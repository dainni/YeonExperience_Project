package finalProject.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import finalProject.domain.ArtWorkDTO;

@Component
@Repository("finalProject.mapper.ArtWorkMapper")
public interface ArtWorkMapper {
	public void artworkInsert(ArtWorkDTO awdto);
	public List<ArtWorkDTO>artList(String artworkNo);
		 
	

}
