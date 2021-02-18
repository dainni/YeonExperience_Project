package finalProject.mapper;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import finalProject.domain.CouponDTO;

@Component
@Repository("finalProject.mapper.CouponMapper")
public interface CouponMapper {
	
	public void couponInsert(CouponDTO cudto);

}
