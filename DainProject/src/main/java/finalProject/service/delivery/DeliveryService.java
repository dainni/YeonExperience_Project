package finalProject.service.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import finalProject.command.DeliveryCommand;
import finalProject.domain.DeliveryDTO;
import finalProject.domain.GoodsDTO;
import finalProject.mapper.DeliveryMapper;
import finalProject.mapper.GoodsMapper;

@Service
public class DeliveryService {
	@Autowired
	DeliveryMapper deliveryMapper;
	@Autowired
	GoodsMapper goodsMapper;

	public void orderdeliberyPro(DeliveryCommand deliveryCommand) {
		// TODO Auto-generated method stub
		
		DeliveryDTO dvdto = new DeliveryDTO();
		dvdto.setDeliveryAddr(deliveryCommand.getDeliveryAddr());
		dvdto.setDeliveryNote(deliveryCommand.getDeliveryNote());
		dvdto.setReceiverName(deliveryCommand.getReceiverName());
		deliveryMapper.deliveryInsert(dvdto);
		
		
	}
	

}
