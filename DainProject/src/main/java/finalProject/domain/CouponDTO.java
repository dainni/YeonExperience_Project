package finalProject.domain;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CouponDTO {
	String couponNo;
	String couponName;
	Integer discount;
	Timestamp couponStart;
	Timestamp couponEnd;
	String userId;
}
