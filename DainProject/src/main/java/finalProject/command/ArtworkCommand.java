package finalProject.command;



import java.sql.Date;

import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArtworkCommand {
	
	String artworkContent;
	String artworkType;

	@NotNull
	String artworkNo;
	String artworkName;
	String artworkWriter;
	String artworkPrice;
	Date artworktime;
	MultipartFile artworkImage;
 
}
