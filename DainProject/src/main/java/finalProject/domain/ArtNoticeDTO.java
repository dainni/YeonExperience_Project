package finalProject.domain;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArtNoticeDTO {
	String artnoticeNo;
	String artnoticeSub;
	String artnoticeCon;
	String artnoticeWriter;
	Integer artreadCount;
	Timestamp artnoticeDate;
	
	
	
}
