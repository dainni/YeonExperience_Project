package finalProject.service.artnotice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import finalProject.command.ArtNoticeCommand;
import finalProject.domain.ArtNoticeDTO;
import finalProject.mapper.ArtNoticeMapper;

@Service
public class ArtNoticeService {
	
	@Autowired
	ArtNoticeMapper artnoticeMapper;
	
	public void artnoticeFormPro(ArtNoticeCommand artNoticeCommand) {
		// TODO Auto-generated method stub
		
		ArtNoticeDTO andto = new ArtNoticeDTO();
		
		andto.setArtnoticeWriter(artNoticeCommand.getArtnoticeWriter());
		
		andto.setArtnoticeCon(artNoticeCommand.getArtnoticeCon());
		
		andto.setArtnoticeNo(artNoticeCommand.getArtnoticeNo());
		
		andto.setArtnoticeSub(artNoticeCommand.getArtnoticeSub());
		
		artnoticeMapper.artnoticeInsert(andto);
		
		
	}
	

}
