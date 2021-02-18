package finalProject.command;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CouPonCommand {
	String couponName;
	Integer discount;
	Date couponStart;
	Date couponEnd;
}
