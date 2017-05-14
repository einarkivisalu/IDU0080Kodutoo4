
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ttu.idu0080.transport;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

//import ttu.idu0080.transport.courierclient.*;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-05-14T11:28:59.182+03:00
 * Generated source version: 2.7.18
 * 
 */

@javax.jws.WebService(
                      serviceName = "TransportServiceService",
                      portName = "TransportServicePort",
                      targetNamespace = "http://transport.idu0080.ttu/",
                      wsdlLocation = "file:/C:/Users/Random/workspace4test2/TransportService/src/transport.wsdl",
                      endpointInterface = "ttu.idu0080.transport.TransportService")
                      
public class TransportServiceImpl implements TransportService {

    private static final Logger LOG = Logger.getLogger(TransportServiceImpl.class.getName());
	
    /* (non-Javadoc)
     * @see ttu.idu0080.transport.TransportService#getCourierList(*
     */
    public java.util.List<ttu.idu0080.transport.Courierdata> getCourierList() { 
        LOG.info("Executing operation getCourierList");
        try {
        	// get data from db
        	System.out.println("001\n");
        	
        	ttu.idu0080.transport.courierclient.CourierService_CourierServicePort_Client client = new ttu.idu0080.transport.courierclient.CourierService_CourierServicePort_Client();
            java.util.List<ttu.idu0080.transport.Courierdata> _return = new java.util.ArrayList<ttu.idu0080.transport.Courierdata>();
        	java.util.List<ttu.idu0080.transport.courierclient.Courier> couriers = client._getAllCouriers();
        	System.out.println("002\n");
            
            for (ttu.idu0080.transport.courierclient.Courier p: couriers) {
            	ttu.idu0080.transport.Courierdata _returnVal1 = new ttu.idu0080.transport.Courierdata();
            	_returnVal1.setCourier(p.getEnterprise());
            	_returnVal1.setName(p.getName());
            	_return.add(_returnVal1);
            }
        	System.out.println("003\n");
            
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
    
    /* (non-Javadoc)
     * @see ttu.idu0080.transport.TransportService#getCourierOffer(int  orderid )*
     */
    public ttu.idu0080.transport.Offerresponse getCourierOffer(int orderid, int courierid) { 
        LOG.info("Executing operation getCourierOffer");
        System.out.println(orderid);
        try {
        	ttu.idu0080.transport.orderclient.OrderService_OrderServicePort_Client client2 = new ttu.idu0080.transport.orderclient.OrderService_OrderServicePort_Client();
        	ttu.idu0080.transport.courierclient.CourierService_CourierServicePort_Client client = new ttu.idu0080.transport.courierclient.CourierService_CourierServicePort_Client();
        	
            System.out.println("001\n");
        	ttu.idu0080.transport.orderclient.Order order = client2._getOrderById(orderid);
        	
            System.out.println("002\n");
        	ttu.idu0080.transport.courierclient.Courier courier = client._getCourierById(courierid);
            System.out.println("003\n");
        	float _alla = 1; 
        	float _price = order.getPriceTotal();// * courier.getPercentFromOrder() / 100;

        	List<ttu.idu0080.transport.courierclient.EntAddress> addr = courier.getAddresses();
        	String target_county = order.getShippingAddress().getCounty();
        	for (ttu.idu0080.transport.courierclient.EntAddress ad: addr)
        	{
        		if (ad.getCounty().equals(target_county))
        		{
    				_alla = _alla - 0.3f;
    				break;
        		}
        	}        	
        	
            System.out.println("004\n");
        	List<ttu.idu0080.transport.orderclient.EntAddress> ship_addr = order.getSeller().getAddresses(); 
        	for (ttu.idu0080.transport.courierclient.EntAddress ad: addr)
        	{
        		boolean b = false;
        		for (ttu.idu0080.transport.orderclient.EntAddress sh_ad: ship_addr)
        		{
        			if (ad.getCounty() == sh_ad.getCounty())
        			{
        				_alla = _alla - 0.3f;
        				b = true;
        				break;
        			}
        		}
        		if (b)
        		{
        			break;
        		}
        	}
        	_price = _price *_alla;

        	System.out.println("005\n");
            ttu.idu0080.transport.Offerresponse _return = new ttu.idu0080.transport.Offerresponse();
            _return.setOfferid(getSaltString());
            _return.setPrice(_price);
            _return.setDays(ThreadLocalRandom.current().nextInt(1, 8));
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ttu.idu0080.transport.TransportService#setOrderTransport(java.lang.String  offerid )*
     */
    public java.lang.String setOrderTransport(java.lang.String offerid) { 
        LOG.info("Executing operation setOrderTransport");
        System.out.println(offerid);
        try {
        	DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd"); 
            java.lang.String _return = offerid.toLowerCase() + '#' + dateFormat.format(new Date());
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
