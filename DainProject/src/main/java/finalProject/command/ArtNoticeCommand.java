package finalProject.command;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArtNoticeCommand {
	String artnoticeNo;
	String artnoticeSub;
	String artnoticeCon;
	String artnoticeWriter;
	Integer artreadCount;
	
	

}
