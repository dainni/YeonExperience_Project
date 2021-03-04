package finalProject.service.artwork;

import java.io.File;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import finalProject.command.ArtworkCommand;
import finalProject.domain.ArtWorkDTO;
import finalProject.mapper.ArtWorkMapper;

@Service
public class ArtWorkService {
	
	@Autowired
	ArtWorkMapper artWorkMapper;
	
	public void artworkPro(ArtworkCommand artworkCommand, HttpSession session) throws Exception{
		// TODO Auto-generated method stub
		
		ArtWorkDTO awdto = new ArtWorkDTO();
		awdto.setArtworkContent(artworkCommand.getArtworkContent());
		awdto.setArtworkName(artworkCommand.getArtworkName());
		awdto.setArtworkNo(artworkCommand.getArtworkNo());
		awdto.setArtworkPrice(artworkCommand.getArtworkPrice());
		SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String modifiedDate = fm.format(artworkCommand.getArtworktime());
		Timestamp artworktime = Timestamp.valueOf(modifiedDate);
		awdto.setArtworktime(artworktime);
		
		awdto.setArtworkType(artworkCommand.getArtworkType());
		awdto.setArtworkWriter(artworkCommand.getArtworkWriter());
		
		//null이 아니라면 조건 
				//if(goodsCommand.getGoodsImage() != null){}		
				try {
					String PATH  = "/static/artwork/upload";
					//위에 경로 가져오는거
					//String filePath = session.getServletContext().getRealPath(PATH);
					String filePath = "C:/Users/연다인/workspace24/DainProject/src/main/resources"+PATH;
					MultipartFile mf = artworkCommand.getArtworkImage();
					String original = mf.getOriginalFilename();
					String originalFileExtension = original.substring(original.lastIndexOf("."));
					String store = UUID.randomUUID().toString().replace("-", "") + originalFileExtension;
					awdto.setArtworkImage(store);
					//파일 저장하기 위해서 파일 객체 생성
					File file = new File(filePath + "/" + store);
					//파일저장
					mf.transferTo(file);
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					artWorkMapper.artworkInsert(awdto);
				}
			}

		}
