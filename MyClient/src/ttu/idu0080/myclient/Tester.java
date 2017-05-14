package ttu.idu0080.myclient;

import java.util.List;

public class Tester {

	public static void main(String[] args) {
		OrderService_OrderServicePort_Client Client = new OrderService_OrderServicePort_Client();
		try {
			ttu.idu0080.myclient.Order order = Client._getOrderById(5);   
			printOrders(order);
			
			ttu.idu0080.myclient2.TransportService_TransportServicePort_Client client2 = new ttu.idu0080.myclient2.TransportService_TransportServicePort_Client(); 
			// get kullerfirmade list
			List<Courierdata> cds = client2._getCourierList();
			// get kullerfirmadelt pakkumised ja leida neist miinimum 
			Offerresponse min = null;
			for (Courierdata cd: cds)
			{
				Offerresponse ofresp = client2._getCourierOffer(5, cd.getCourier());
				if (min != null)
				{
					
					if (min.getPrice()*0.01*min.getDays() > ofresp.getPrice()*0.01*ofresp.getDays())
					{
						min = ofresp;
					}
				}
				else 
				{
					min = ofresp;
				}
			}
			
			// set kullerfirmasse tellimus
			String trackid = client2._setOrderTransport(min.getOfferid());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void printOrders(ttu.idu0080.myclient.Order order)	{
		if (order != null)
		{
			System.out.println("order id:" + order.getOrderId() + " price:" + order.getPriceTotal() );
		}
	}

	public static void printOrders(List<ttu.idu0080.myclient.Order> orders)	{
		if (orders != null)
		{
			for (ttu.idu0080.myclient.Order p: orders) {
				System.out.println("order id:" + p.getOrderId() + " price:" + p.getPriceTotal() );
			}
		}
	}

}
