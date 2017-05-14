
package ttu.idu0080.myclient;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import ttu.idu0080.myclient.OrderService;
import ttu.idu0080.myclient.OrderServiceService;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-05-14T10:54:39.151+03:00
 * Generated source version: 2.7.18
 * 
 */
public final class OrderService_OrderServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://server.order.idu0080.ttu/", "OrderServiceService");
//    private static final QName SERVICE_NAME = new QName("http://transport.idu0080.ttu/", "TransportServiceService");

    public OrderService_OrderServicePort_Client() {
    }
    
    public java.util.List<ttu.idu0080.myclient.Order> _getAllOrders() throws Exception {
    	URL wsdlURL = OrderServiceService.WSDL_LOCATION;

    	OrderServiceService ss = new OrderServiceService(wsdlURL, SERVICE_NAME);
    	OrderService port = ss.getOrderServicePort();
		System.out.println("Invoking getAllProducts...");
		port.getAllOrders();
		java.util.List<ttu.idu0080.myclient.Order> _return = port.getAllOrders();
		System.out.println("getAllOrders.result=" + _return);
    	return _return;
    }

    public ttu.idu0080.myclient.Order _getOrderById(int orderid) throws Exception {
    	URL wsdlURL = OrderServiceService.WSDL_LOCATION;

    	OrderServiceService ss = new OrderServiceService(wsdlURL, SERVICE_NAME);
    	OrderService port = ss.getOrderServicePort();
		System.out.println("Invoking getOrderById...");
		port.getAllOrders();
		ttu.idu0080.myclient.Order _return = port.getOrdersByOrderId(orderid);
		System.out.println("getOrderById.result=" + _return);
    	return _return;
    }

}
