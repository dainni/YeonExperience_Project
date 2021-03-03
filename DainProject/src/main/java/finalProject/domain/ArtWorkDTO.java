package finalProject.domain;

import java.sql.Timestamp;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArtWorkDTO {
	String artworkNo;
	String artworkType;
	String artworkName;
	String artworkWriter;
	String artworkPrice;
	Timestamp artworktime;
	String artworkContent;
	String artworkImage;

}
