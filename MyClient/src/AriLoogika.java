import java.util.List;
import ttu.idu0080.order.client.*;
import ttu.idu0080.transport.client.*;

public class AriLoogika {

	public static void main(String[] args) {
		OrderService_OrderServicePort_Client Client = new OrderService_OrderServicePort_Client();
		try {
			int orderid = 2;
			System.out.println(String.format("K�sime tellimuse numbriga %d", orderid)); 
			ttu.idu0080.order.client.Order order = Client._getOrderByIdA(orderid);   
			printOrders(order);
			
			ttu.idu0080.transport.client.TransportService_TransportServicePort_Client client2 = new ttu.idu0080.transport.client.TransportService_TransportServicePort_Client(); 
			// get kullerfirmade list
			List<Courierdata> cds = client2._getCourierListA();
			// get kullerfirmadelt pakkumised ja leida neist miinimum 
			Offerresponse min = null;
			for (Courierdata cd: cds)
			{
				Offerresponse ofresp = client2._getCourierOfferA(orderid, cd.getCourier());
				if (min != null)
				{
					System.out.println(String.format("V�rreldav tulemus: %f, tellimukoodiga %s", ofresp.getPrice()*0.01*ofresp.getDays(), ofresp.getOfferid())); 
					
					if (min.getPrice()*0.01*min.getDays() > ofresp.getPrice()*0.01*ofresp.getDays())
					{
						min = ofresp;
						System.out.println(String.format("Uus v�him kalkuleeritud tulemus: %f, tellimukoodiga %s", min.getPrice()*0.01*min.getDays(), min.getOfferid())); 
					}
				}
				else 
				{
					min = ofresp;
					System.out.println(String.format("Esmane v�him kalkuleeritud tulemus: %f, tellimukoodiga %s", min.getPrice()*0.01*min.getDays(), min.getOfferid())); 
				}
			}
			
			// set kullerfirmasse tellimus
			String trackid = client2._setOrderTransporA(min.getOfferid());
			System.out.println(String.format("Parim tellimus: %s, hind: %f, tellimus aeg :%d", min.getOfferid(), min.getPrice(), min.getDays()) );
			System.out.println("Track Id returned as : " + trackid);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void printOrders(ttu.idu0080.order.client.Order order)	{
		if (order != null)
		{
			System.out.println("order id:" + order.getOrderId() + " price:" + order.getPriceTotal() );
		}
	}

	public static void printOrders(List<ttu.idu0080.order.client.Order> orders)	{
		if (orders != null)
		{
			for (ttu.idu0080.order.client.Order p: orders) {
				System.out.println("order id:" + p.getOrderId() + " price:" + p.getPriceTotal() );
			}
		}
	}

}
