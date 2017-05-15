
package ttu.idu0080.order.client;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

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

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-05-15T09:20:27.967+03:00
 * Generated source version: 2.7.18
 * 
 */
public final class OrderService_OrderServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://server.order.idu0080.ttu/", "OrderServiceService");

    public OrderService_OrderServicePort_Client() {
    }

    public java.util.List<ttu.idu0080.order.client.Order> _getAllOrdersA() throws Exception {
    	URL wsdlURL = OrderServiceService.WSDL_LOCATION;

    	OrderServiceService ss = new OrderServiceService(wsdlURL, SERVICE_NAME);
    	OrderService port = ss.getOrderServicePort();
		System.out.println("Invoking getAllOrders...");
		port.getAllOrders();
		java.util.List<ttu.idu0080.order.client.Order> _return = port.getAllOrders();
		System.out.println("getAllOrders.result=" + _return);
    	return _return;
    }
    
    public ttu.idu0080.order.client.Order _getOrderByIdA(int orderid) throws Exception {
    	URL wsdlURL = OrderServiceService.WSDL_LOCATION;

    	OrderServiceService ss = new OrderServiceService(wsdlURL, SERVICE_NAME);
    	OrderService port = ss.getOrderServicePort();
		System.out.println("Invoking getOrderById...");
		port.getAllOrders();
		ttu.idu0080.order.client.Order _return = port.getOrdersByOrderId(orderid);
		System.out.println("getOrderById.result=" + _return);
    	return _return;
    }
 
    public java.util.List<ttu.idu0080.order.client.Courier> _getAllCouriersA() throws java.lang.Exception {
        URL wsdlURL = OrderServiceService.WSDL_LOCATION;
        OrderServiceService ss = new OrderServiceService(wsdlURL, SERVICE_NAME);
        OrderService port = ss.getOrderServicePort();
        
        System.out.println("Invoking getAllCouriers...");
        java.util.List<ttu.idu0080.order.client.Courier> _return = port.getAllCouriers();
        System.out.println("getAllCouriers.result=" + _return);
        return _return;
    }    

    public ttu.idu0080.order.client.Courier _getCourierByIdA(int courierid) throws java.lang.Exception {
        URL wsdlURL = OrderServiceService.WSDL_LOCATION;
        OrderServiceService ss = new OrderServiceService(wsdlURL, SERVICE_NAME);
        OrderService port = ss.getOrderServicePort();
        
        System.out.println("Invoking getCourierById...");
        ttu.idu0080.order.client.Courier _return = port.getCourierById(courierid);
        System.out.println("getCourierById.result=" + _return);
        return _return;
    }    
    
    public java.util.List<ttu.idu0080.order.client.Order> _getOrdersByCustomerIdA(int orderid) throws java.lang.Exception {
        URL wsdlURL = OrderServiceService.WSDL_LOCATION;
        OrderServiceService ss = new OrderServiceService(wsdlURL, SERVICE_NAME);
        OrderService port = ss.getOrderServicePort();
        
        System.out.println("Invoking getOrdersByCustomerId...");
        java.util.List<ttu.idu0080.order.client.Order> _return = port.getOrdersByCustomerId(orderid);
        System.out.println("getOrdersByCustomerId.result=" + _return);
        return _return;
    }    
    
    public java.util.List<ttu.idu0080.order.client.Product> _getAllProductsA() throws java.lang.Exception {
        URL wsdlURL = OrderServiceService.WSDL_LOCATION;
        OrderServiceService ss = new OrderServiceService(wsdlURL, SERVICE_NAME);
        OrderService port = ss.getOrderServicePort();
        
        System.out.println("Invoking getAllProducts...");
        java.util.List<ttu.idu0080.order.client.Product> _return = port.getAllProducts();
        System.out.println("getAllProducts.result=" + _return);
        return _return;
    }    

}