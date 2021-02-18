package finalProject.service.coupon;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import finalProject.command.CouPonCommand;
import finalProject.domain.CouponDTO;
import finalProject.mapper.CouponMapper;

@Service
public class CouponService {
	@Autowired
	CouponMapper couponMapper;

	public void couponFormPro(CouPonCommand couPonCommand) {
		// TODO Auto-generated method stub
		
		CouponDTO cudto = new CouponDTO();
		cudto.setCouponName(couPonCommand.getCouponName());
		cudto.setDiscount(couPonCommand.getDiscount());
		
		SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String modifiedDate = fm.format(couPonCommand.getCouponStart());
		Timestamp couponStart = Timestamp.valueOf(modifiedDate);
		cudto.setCouponStart(couponStart);
		
		SimpleDateFormat fn = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String modifiedDate1 = fn.format(couPonCommand.getCouponEnd());
		Timestamp couponEnd = Timestamp.valueOf(modifiedDate1);
		cudto.setCouponEnd(couponEnd);
		
		couponMapper.couponInsert(cudto);
		
		
		
	}

}
