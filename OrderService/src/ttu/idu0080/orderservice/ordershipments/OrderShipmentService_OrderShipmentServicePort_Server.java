
package ttu.idu0080.orderservice.ordershipments;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-05-13T14:36:18.156+03:00
 * Generated source version: 2.7.18
 * 
 */
 
public class OrderShipmentService_OrderShipmentServicePort_Server{

    protected OrderShipmentService_OrderShipmentServicePort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new OrderShipmentServiceImpl();
        String address = "http://localmachine:8080/orderservice/order_shipments";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new OrderShipmentService_OrderShipmentServicePort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
