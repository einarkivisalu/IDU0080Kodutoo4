
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ttu.idu0080.orderservice.orders;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Logger;
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
 * 2017-05-13T14:31:10.604+03:00
 * Generated source version: 2.7.18
 * 
 */

@javax.jws.WebService(
                      serviceName = "OrderServiceService",
                      portName = "OrderServicePort",
                      targetNamespace = "http://server.order.idu0080.ttu/",
                      wsdlLocation = "file:/C:/Users/Random/workspace4test2/OrderService/src/orders.wsdl",
                      endpointInterface = "ttu.idu0080.orderservice.orders.OrderService")
                      
public class OrderServiceImpl implements OrderService {

	private static final String DB_DRIVER = "org.postgresql.Driver";
    private static final String DB_CONNECTION = "jdbc:postgresql://localhost:5432/orders"; 
    private static final String DB_USER = "IDU0080";
	private static final String DB_PASSWORD = "IDU0080";
	
    private static final Logger LOG = Logger.getLogger(OrderServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see ttu.idu0080.orderservice.orders.OrderService#getOrdersByCustomerId(int  customerId )*
     */
    public java.util.List<ttu.idu0080.orderservice.orders.Order> getOrdersByCustomerId(int customerId) { 
        LOG.info("Executing operation getOrdersByCustomerId");
        try {
	        java.util.List<ttu.idu0080.orderservice.orders.Order> _return = new java.util.ArrayList<ttu.idu0080.orderservice.orders.Order>();
	
	    	Class.forName(DB_DRIVER);
	    	Connection connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
	        
	        String sql = "SELECT * FROM eshop_order WHERE customer_fk=" + customerId;
	        Statement stmt = connection.createStatement();
	        ResultSet rs = stmt.executeQuery(sql);
	        
	        while (rs.next()) {
	            int user_id = rs.getInt("customer_fk");
	            int order_id = rs.getInt("eshop_order");
	            int seller_id = rs.getInt("seller_fk");
	            int ship_id = rs.getInt("shipping_address_fk");
	            ttu.idu0080.orderservice.orders.Order _returnVal1 = fillOrderData(user_id,order_id, seller_id, ship_id);
	
	            // lisa �ldinfo
	            _returnVal1.setOrderId(order_id);
	            _returnVal1.setPriceTotal(rs.getFloat("price_total"));
	            _return.add(_returnVal1);
	        }            
	        return _return;
	    } catch (java.lang.Exception ex) {
	        ex.printStackTrace();
	        throw new RuntimeException(ex);
	    }
	
    }

    /* (non-Javadoc)
     * @see ttu.idu0080.orderservice.orders.OrderService#getAllOrders(*
     */
    public java.util.List<ttu.idu0080.orderservice.orders.Order> getAllOrders() { 
        LOG.info("Executing operation getAllOrders");
        try {
            java.util.List<ttu.idu0080.orderservice.orders.Order> _return = new java.util.ArrayList<ttu.idu0080.orderservice.orders.Order>();

        	Class.forName(DB_DRIVER);
        	Connection connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            
            String sql = "SELECT * FROM eshop_order";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                int user_id = rs.getInt("customer_fk");
                int order_id = rs.getInt("eshop_order");
                int seller_id = rs.getInt("seller_fk");
                int ship_id = rs.getInt("shipping_address_fk");
                ttu.idu0080.orderservice.orders.Order _returnVal1 = fillOrderData(user_id,order_id, seller_id, ship_id);

                // lisa �ldinfo
                _returnVal1.setOrderId(order_id);
                _returnVal1.setPriceTotal(rs.getFloat("price_total"));
                _return.add(_returnVal1);
            }            
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    private ttu.idu0080.orderservice.orders.Order fillOrderData(int user_id, int order_id, int seller_id, int ship_id) {
        LOG.info("Executing operation fillOrderData");
        try {
        
	    	ttu.idu0080.orderservice.orders.Order _returnVal1 = new ttu.idu0080.orderservice.orders.Order();
	         
	    	Class.forName(DB_DRIVER);
	    	Connection connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
	    	String sql = "SELECT * FROM customer WHERE customer=" + user_id;
	    	Statement stmt2 = connection.createStatement();
	    	ResultSet rs2 = stmt2.executeQuery(sql);
			 
	    	ttu.idu0080.orderservice.orders.Customer _returnVal1Customer = new ttu.idu0080.orderservice.orders.Customer();
	    	while (rs2.next()) {
	    		_returnVal1Customer.setCustomer(user_id);
	    		_returnVal1Customer.setFirstName(rs2.getString("first_name"));
	    		_returnVal1Customer.setLastName(rs2.getString("last_name"));
	    	}
         
	    	// lisa kasutaja aadressid 
	    	java.util.List<ttu.idu0080.orderservice.orders.Address> _returnVal1CustomerAddresses = new java.util.ArrayList<ttu.idu0080.orderservice.orders.Address>();
	    	sql = "SELECT * FROM address WHERE subject_fk=" + user_id;
	    	rs2 = stmt2.executeQuery(sql);
	    	while (rs2.next()) {
	    		ttu.idu0080.orderservice.orders.Address _CustomerAddress = new ttu.idu0080.orderservice.orders.Address();
	    		_CustomerAddress.setAddress(rs2.getInt("address"));
	    		_CustomerAddress.setCountry(rs2.getString("country"));
	    		_CustomerAddress.setCounty(rs2.getString("county"));
	    		_CustomerAddress.setStreetAddress(rs2.getString("street_address"));
	    		_CustomerAddress.setTownVillage(rs2.getString("town_village"));
	    		_CustomerAddress.setZipcode(rs2.getString("zipcode"));
	    		_returnVal1CustomerAddresses.add(_CustomerAddress);
	    	}
	    	_returnVal1Customer.getAddresses().addAll(_returnVal1CustomerAddresses);
	    	_returnVal1.setCustomer(_returnVal1Customer);
         
	    	// lisa toote info
	    	sql = "SELECT * FROM order_product WHERE eshop_order_fk=" + order_id;
	    	rs2 = stmt2.executeQuery(sql);
         
	    	java.util.List<ttu.idu0080.orderservice.orders.OrderProduct> _returnVal1OrderProducts = new java.util.ArrayList<ttu.idu0080.orderservice.orders.OrderProduct>();
	    	while (rs2.next()) {
	    		ttu.idu0080.orderservice.orders.OrderProduct _returnVal1OrderProductsVal1 = new ttu.idu0080.orderservice.orders.OrderProduct();
	    		_returnVal1OrderProductsVal1.setOrderProduct(rs2.getInt("order_product"));
	    		_returnVal1OrderProductsVal1.setPrice(rs2.getFloat("price"));
	    		_returnVal1OrderProductsVal1.setPriceTotal(rs2.getFloat("price_total"));
	    		_returnVal1OrderProductsVal1.setProductCount(rs2.getInt("product_count"));
	    		_returnVal1OrderProductsVal1.setProductName(rs2.getString("product_name"));
	    		_returnVal1OrderProducts.add(_returnVal1OrderProductsVal1);
	    	}
	    	_returnVal1.getOrderProducts().addAll(_returnVal1OrderProducts);
         
	    	// m��ja info 
	    	ttu.idu0080.orderservice.orders.Seller _returnVal1Seller = new ttu.idu0080.orderservice.orders.Seller();
	    	java.util.List<ttu.idu0080.orderservice.orders.EntAddress> _returnVal1SellerAddresses = new java.util.ArrayList<ttu.idu0080.orderservice.orders.EntAddress>();

	    	sql = "SELECT full_name FROM enterprise WHERE enterprise=" + seller_id;
	    	rs2 = stmt2.executeQuery(sql);

	    	_returnVal1Seller.setEnterprise(seller_id);
	    	while (rs2.next()) {
	    		_returnVal1Seller.setName(rs2.getString("full_name"));
	    	}
         
	    	sql = "SELECT * FROM ent_address WHERE subject_fk=" + seller_id;
	    	rs2 = stmt2.executeQuery(sql);
	    	while (rs2.next()) {
	         	ttu.idu0080.orderservice.orders.EntAddress _EntAddress = new ttu.idu0080.orderservice.orders.EntAddress();
	         	_EntAddress.setAddress(rs2.getInt("ent_address"));
	         	_EntAddress.setCountry(rs2.getString("country"));
	         	_EntAddress.setCounty(rs2.getString("county"));
	         	_EntAddress.setStreetAddress(rs2.getString("street_address"));
	         	_EntAddress.setTownVillage(rs2.getString("town_village"));
	         	_EntAddress.setZipcode(rs2.getString("zipcode"));
	         	_returnVal1SellerAddresses.add(_EntAddress);
	    	}
	    	_returnVal1Seller.getAddresses().addAll(_returnVal1SellerAddresses);
	    	_returnVal1.setSeller(_returnVal1Seller);

	    	sql = "SELECT * FROM address WHERE subject_fk=" + ship_id;
	    	rs2 = stmt2.executeQuery(sql);
         
	    	ttu.idu0080.orderservice.orders.Address _returnVal1ShippingAddress = new ttu.idu0080.orderservice.orders.Address();
	    	while (rs2.next()) {
	    		_returnVal1ShippingAddress.setAddress(rs2.getInt("address"));
	    		_returnVal1ShippingAddress.setCountry(rs2.getString("country"));
	    		_returnVal1ShippingAddress.setCounty(rs2.getString("country"));
	    		_returnVal1ShippingAddress.setStreetAddress(rs2.getString("street_address"));
	    		_returnVal1ShippingAddress.setTownVillage(rs2.getString("town_village"));
	    		_returnVal1ShippingAddress.setZipcode(rs2.getString("zipcode"));
	    		_returnVal1.setShippingAddress(_returnVal1ShippingAddress);
	    	}
	    	
	    	stmt2.close();
	    	rs2.close();
	    	return _returnVal1;
	    	
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
    
    /* (non-Javadoc)
     * @see ttu.idu0080.orderservice.orders.OrderService#getOrdersByOrderId(int  orderId )*
     */
    public ttu.idu0080.orderservice.orders.Order getOrdersByOrderId(int orderId) { 
        LOG.info("Executing operation getOrdersByOrderId");
        System.out.println(orderId);
        try {
	        ttu.idu0080.orderservice.orders.Order _return = null;
	
	    	Class.forName(DB_DRIVER);
	    	Connection connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
	        
	        String sql = "SELECT * FROM eshop_order WHERE eshop_order=" + orderId;
	        Statement stmt = connection.createStatement();
	        ResultSet rs = stmt.executeQuery(sql);
	        
	        while (rs.next()) {
	            int user_id = rs.getInt("customer_fk");
	            int order_id = rs.getInt("eshop_order");
	            int seller_id = rs.getInt("seller_fk");
	            int ship_id = rs.getInt("shipping_address_fk");
	            _return = fillOrderData(user_id,order_id, seller_id, ship_id);
	
	            // lisa �ldinfo
	            _return.setOrderId(order_id);
	            _return.setPriceTotal(rs.getFloat("price_total"));
	        }            
	        return _return;
	    } catch (java.lang.Exception ex) {
	        ex.printStackTrace();
	        throw new RuntimeException(ex);
	    }
    }

    /* (non-Javadoc)
     * @see ttu.idu0080.orderservice.orders.OrderService#getOrdersByShippingAddress(java.lang.String  country ,)java.lang.String  county )*
     */
    public java.util.List<ttu.idu0080.orderservice.orders.Order> getOrdersByShippingAddress(java.lang.String country,java.lang.String county) { 
        LOG.info("Executing operation getOrdersByShippingAddress");
        System.out.println(country);
        System.out.println(county);
        try {
            java.util.List<ttu.idu0080.orderservice.orders.Order> _return = new java.util.ArrayList<ttu.idu0080.orderservice.orders.Order>();
            ttu.idu0080.orderservice.orders.Order _returnVal1 = new ttu.idu0080.orderservice.orders.Order();
            ttu.idu0080.orderservice.orders.Customer _returnVal1Customer = new ttu.idu0080.orderservice.orders.Customer();
            java.util.List<ttu.idu0080.orderservice.orders.Address> _returnVal1CustomerAddresses = new java.util.ArrayList<ttu.idu0080.orderservice.orders.Address>();
            _returnVal1Customer.getAddresses().addAll(_returnVal1CustomerAddresses);
            _returnVal1Customer.setCustomer(-1992141254);
            _returnVal1Customer.setFirstName("FirstName1823759403");
            _returnVal1Customer.setLastName("LastName-1547622236");
            _returnVal1.setCustomer(_returnVal1Customer);
            _returnVal1.setOrderId(1312256226);
            java.util.List<ttu.idu0080.orderservice.orders.OrderProduct> _returnVal1OrderProducts = new java.util.ArrayList<ttu.idu0080.orderservice.orders.OrderProduct>();
            ttu.idu0080.orderservice.orders.OrderProduct _returnVal1OrderProductsVal1 = new ttu.idu0080.orderservice.orders.OrderProduct();
            _returnVal1OrderProductsVal1.setOrderProduct(-2080052077);
            _returnVal1OrderProductsVal1.setPrice(0.5873205f);
            _returnVal1OrderProductsVal1.setPriceTotal(0.5940213f);
            _returnVal1OrderProductsVal1.setProductCount(1874410649);
            _returnVal1OrderProductsVal1.setProductName("ProductName7897611");
            _returnVal1OrderProducts.add(_returnVal1OrderProductsVal1);
            _returnVal1.getOrderProducts().addAll(_returnVal1OrderProducts);
            _returnVal1.setPriceTotal(0.38989383f);
            ttu.idu0080.orderservice.orders.Seller _returnVal1Seller = new ttu.idu0080.orderservice.orders.Seller();
            java.util.List<ttu.idu0080.orderservice.orders.EntAddress> _returnVal1SellerAddresses = new java.util.ArrayList<ttu.idu0080.orderservice.orders.EntAddress>();
            _returnVal1Seller.getAddresses().addAll(_returnVal1SellerAddresses);
            _returnVal1Seller.setEnterprise(-1315136860);
            _returnVal1Seller.setName("Name560922286");
            _returnVal1.setSeller(_returnVal1Seller);
            ttu.idu0080.orderservice.orders.Address _returnVal1ShippingAddress = new ttu.idu0080.orderservice.orders.Address();
            _returnVal1ShippingAddress.setAddress(-1508916771);
            _returnVal1ShippingAddress.setCountry("Country252016657");
            _returnVal1ShippingAddress.setCounty("County174564491");
            _returnVal1ShippingAddress.setStreetAddress("StreetAddress-303885016");
            _returnVal1ShippingAddress.setTownVillage("TownVillage1564671433");
            _returnVal1ShippingAddress.setZipcode("Zipcode-1003284417");
            _returnVal1.setShippingAddress(_returnVal1ShippingAddress);
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ttu.idu0080.orderservice.orders.OrderService#getOrdersByCustomerLastName(java.lang.String  lastName )*
     */
    public java.util.List<ttu.idu0080.orderservice.orders.Order> getOrdersByCustomerLastName(java.lang.String lastName) { 
        LOG.info("Executing operation getOrdersByCustomerLastName");
        System.out.println(lastName);
        try {
            java.util.List<ttu.idu0080.orderservice.orders.Order> _return = new java.util.ArrayList<ttu.idu0080.orderservice.orders.Order>();
            ttu.idu0080.orderservice.orders.Order _returnVal1 = new ttu.idu0080.orderservice.orders.Order();
            ttu.idu0080.orderservice.orders.Customer _returnVal1Customer = new ttu.idu0080.orderservice.orders.Customer();
            java.util.List<ttu.idu0080.orderservice.orders.Address> _returnVal1CustomerAddresses = new java.util.ArrayList<ttu.idu0080.orderservice.orders.Address>();
            _returnVal1Customer.getAddresses().addAll(_returnVal1CustomerAddresses);
            _returnVal1Customer.setCustomer(2007201592);
            _returnVal1Customer.setFirstName("FirstName1251730422");
            _returnVal1Customer.setLastName("LastName1065969723");
            _returnVal1.setCustomer(_returnVal1Customer);
            _returnVal1.setOrderId(-1973231694);
            java.util.List<ttu.idu0080.orderservice.orders.OrderProduct> _returnVal1OrderProducts = new java.util.ArrayList<ttu.idu0080.orderservice.orders.OrderProduct>();
            ttu.idu0080.orderservice.orders.OrderProduct _returnVal1OrderProductsVal1 = new ttu.idu0080.orderservice.orders.OrderProduct();
            _returnVal1OrderProductsVal1.setOrderProduct(-794202107);
            _returnVal1OrderProductsVal1.setPrice(0.92671967f);
            _returnVal1OrderProductsVal1.setPriceTotal(0.7408645f);
            _returnVal1OrderProductsVal1.setProductCount(1517433074);
            _returnVal1OrderProductsVal1.setProductName("ProductName1033290147");
            _returnVal1OrderProducts.add(_returnVal1OrderProductsVal1);
            _returnVal1.getOrderProducts().addAll(_returnVal1OrderProducts);
            _returnVal1.setPriceTotal(0.33334535f);
            ttu.idu0080.orderservice.orders.Seller _returnVal1Seller = new ttu.idu0080.orderservice.orders.Seller();
            java.util.List<ttu.idu0080.orderservice.orders.EntAddress> _returnVal1SellerAddresses = new java.util.ArrayList<ttu.idu0080.orderservice.orders.EntAddress>();
            _returnVal1Seller.getAddresses().addAll(_returnVal1SellerAddresses);
            _returnVal1Seller.setEnterprise(489220679);
            _returnVal1Seller.setName("Name-1279371539");
            _returnVal1.setSeller(_returnVal1Seller);
            ttu.idu0080.orderservice.orders.Address _returnVal1ShippingAddress = new ttu.idu0080.orderservice.orders.Address();
            _returnVal1ShippingAddress.setAddress(1621133666);
            _returnVal1ShippingAddress.setCountry("Country-2097791526");
            _returnVal1ShippingAddress.setCounty("County2116015312");
            _returnVal1ShippingAddress.setStreetAddress("StreetAddress1032297992");
            _returnVal1ShippingAddress.setTownVillage("TownVillage-1942129489");
            _returnVal1ShippingAddress.setZipcode("Zipcode2127604966");
            _returnVal1.setShippingAddress(_returnVal1ShippingAddress);
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
