package finalProject.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import finalProject.domain.ArtNoticeDTO;

@Component
@Repository("finalProject.mapper.ArtNoticeMapper")
public interface ArtNoticeMapper {
	public void artnoticeInsert(ArtNoticeDTO andto);
	public List<ArtNoticeDTO>artnoticeList ();		 
	

}
