package finalProject.controller.cupon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import finalProject.command.CouPonCommand;
import finalProject.service.coupon.CouponService;

@Controller
@RequestMapping("coupon")
public class CouPonController {
	@Autowired
	CouponService couponService;
	@ModelAttribute
	CouPonCommand setCouPonCommand() {
		return new CouPonCommand();
	}
	
	@RequestMapping("couponList")
	public String couponList() {
		return "thymeleaf/coupon/couponList";
	}
	
	@RequestMapping("couponForm")
	public String couponForm() {
		return "thymeleaf/coupon/couponForm";
	}
	
	@RequestMapping("couponFormPro")
	public String couponFormPro(CouPonCommand couPonCommand) {
		couponService.couponFormPro(couPonCommand);
		return "redirect:/coupon/couponList";
	}
}
