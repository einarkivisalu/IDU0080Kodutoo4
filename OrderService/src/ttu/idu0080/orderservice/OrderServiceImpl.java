
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ttu.idu0080.orderservice;

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
 * 2017-05-15T08:09:19.948+03:00
 * Generated source version: 2.7.18
 * 
 */

@javax.jws.WebService(
                      serviceName = "OrderServiceService",
                      portName = "OrderServicePort",
                      targetNamespace = "http://server.order.idu0080.ttu/",
                      wsdlLocation = "file:/C:/Users/rmg/workspace4test3/OrderService/src/collect.wsdl",
                      endpointInterface = "ttu.idu0080.orderservice.OrderService")
                      
public class OrderServiceImpl implements OrderService {

	private static final String DB_DRIVER = "org.postgresql.Driver";
    private static final String DB_CONNECTION = "jdbc:postgresql://localhost:5432/orders"; 
    private static final String DB_USER = "IDU0080";
	private static final String DB_PASSWORD = "IDU0080";
	
    private static final Logger LOG = Logger.getLogger(OrderServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see ttu.idu0080.orderservice.OrderService#getAllOrders(*
     */
    public java.util.List<ttu.idu0080.orderservice.Order> getAllOrders() { 
        LOG.info("Executing operation getAllOrders");
        try {
            java.util.List<ttu.idu0080.orderservice.Order> _return = new java.util.ArrayList<ttu.idu0080.orderservice.Order>();

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
                ttu.idu0080.orderservice.Order _returnVal1 = fillOrderData(user_id,order_id, seller_id, ship_id);

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

    private ttu.idu0080.orderservice.Order fillOrderData(int user_id, int order_id, int seller_id, int ship_id) {
        LOG.info("Executing operation fillOrderData");
        try {
        
	    	ttu.idu0080.orderservice.Order _returnVal1 = new ttu.idu0080.orderservice.Order();
	         
	    	Class.forName(DB_DRIVER);
	    	Connection connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
	    	String sql = "SELECT * FROM customer WHERE customer=" + user_id;
	    	Statement stmt2 = connection.createStatement();
	    	ResultSet rs2 = stmt2.executeQuery(sql);
			 
	    	ttu.idu0080.orderservice.Customer _returnVal1Customer = new ttu.idu0080.orderservice.Customer();
	    	while (rs2.next()) {
	    		_returnVal1Customer.setCustomer(user_id);
	    		_returnVal1Customer.setFirstName(rs2.getString("first_name"));
	    		_returnVal1Customer.setLastName(rs2.getString("last_name"));
	    	}
         
	    	// lisa kasutaja aadressid 
	    	java.util.List<ttu.idu0080.orderservice.Address> _returnVal1CustomerAddresses = new java.util.ArrayList<ttu.idu0080.orderservice.Address>();
	    	sql = "SELECT * FROM address WHERE subject_fk=" + user_id;
	    	rs2 = stmt2.executeQuery(sql);
	    	while (rs2.next()) {
	    		ttu.idu0080.orderservice.Address _CustomerAddress = new ttu.idu0080.orderservice.Address();
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
         
	    	java.util.List<ttu.idu0080.orderservice.OrderProduct> _returnVal1OrderProducts = new java.util.ArrayList<ttu.idu0080.orderservice.OrderProduct>();
	    	while (rs2.next()) {
	    		ttu.idu0080.orderservice.OrderProduct _returnVal1OrderProductsVal1 = new ttu.idu0080.orderservice.OrderProduct();
	    		_returnVal1OrderProductsVal1.setOrderProduct(rs2.getInt("order_product"));
	    		_returnVal1OrderProductsVal1.setPrice(rs2.getFloat("price"));
	    		_returnVal1OrderProductsVal1.setPriceTotal(rs2.getFloat("price_total"));
	    		_returnVal1OrderProductsVal1.setProductCount(rs2.getInt("product_count"));
	    		_returnVal1OrderProductsVal1.setProductName(rs2.getString("product_name"));
	    		_returnVal1OrderProducts.add(_returnVal1OrderProductsVal1);
	    	}
	    	_returnVal1.getOrderProducts().addAll(_returnVal1OrderProducts);
         
	    	// m��ja info 
	    	ttu.idu0080.orderservice.Seller _returnVal1Seller = new ttu.idu0080.orderservice.Seller();
	    	java.util.List<ttu.idu0080.orderservice.EntAddress> _returnVal1SellerAddresses = new java.util.ArrayList<ttu.idu0080.orderservice.EntAddress>();

	    	sql = "SELECT full_name FROM enterprise WHERE enterprise=" + seller_id;
	    	rs2 = stmt2.executeQuery(sql);

	    	_returnVal1Seller.setEnterprise(seller_id);
	    	while (rs2.next()) {
	    		_returnVal1Seller.setName(rs2.getString("full_name"));
	    	}
         
	    	sql = "SELECT * FROM ent_address WHERE subject_fk=" + seller_id;
	    	rs2 = stmt2.executeQuery(sql);
	    	while (rs2.next()) {
	         	ttu.idu0080.orderservice.EntAddress _EntAddress = new ttu.idu0080.orderservice.EntAddress();
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
         
	    	ttu.idu0080.orderservice.Address _returnVal1ShippingAddress = new ttu.idu0080.orderservice.Address();
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
     * @see ttu.idu0080.orderservice.OrderService#getOrdersByOrderId(int  orderId )*
     */
    public ttu.idu0080.orderservice.Order getOrdersByOrderId(int orderId) { 
        LOG.info("Executing operation getOrdersByOrderId");
        System.out.println(orderId);
        try {
	        ttu.idu0080.orderservice.Order _return = null;
	
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
     * @see ttu.idu0080.orderservice.orders.OrderService#getOrdersByCustomerId(int  customerId )*
     */
    public java.util.List<ttu.idu0080.orderservice.Order> getOrdersByCustomerId(int customerId) { 
        LOG.info("Executing operation getOrdersByCustomerId");
        try {
	        java.util.List<ttu.idu0080.orderservice.Order> _return = new java.util.ArrayList<ttu.idu0080.orderservice.Order>();
	
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
	            ttu.idu0080.orderservice.Order _returnVal1 = fillOrderData(user_id,order_id, seller_id, ship_id);
	
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
     * @see ttu.idu0080.orderservice.CourierService#getCourierById(int  courierId )*
     */
    public ttu.idu0080.orderservice.Courier getCourierById(int courierId) { 
        LOG.info("Executing operation getCourierById");
        System.out.println(courierId);
        try {
        	ttu.idu0080.orderservice.Courier _returnVal1 = null;
        	Class.forName(DB_DRIVER);
        	Connection connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            Statement stmt = connection.createStatement();
            
            String sql = "SELECT enterprise, name, percent_from_order FROM enterprise WHERE enterprise=" + courierId;
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
            	_returnVal1 = new ttu.idu0080.orderservice.Courier();
                java.util.List<ttu.idu0080.orderservice.EntAddress> _returnVal1Addresses = new java.util.ArrayList<ttu.idu0080.orderservice.EntAddress>();
            	int id = rs.getInt("enterprise");
            	_returnVal1.setEnterprise(id);
            	_returnVal1.setName(rs.getString("name"));
            	_returnVal1.setPercentFromOrder(rs.getInt("percent_from_order"));
            	sql = "SELECT * FROM ent_address WHERE subject_fk=" + id;
                Statement stmt2 = connection.createStatement();
            	ResultSet rs2 = stmt2.executeQuery(sql);
            	while (rs2.next()) {
                    ttu.idu0080.orderservice.EntAddress _returnVal1AddressesVal1 = new ttu.idu0080.orderservice.EntAddress();
                    _returnVal1AddressesVal1.setAddress(rs2.getInt("ent_address"));
                    _returnVal1AddressesVal1.setCountry(rs2.getString("country"));
                    _returnVal1AddressesVal1.setCounty(rs2.getString("county"));
                    _returnVal1AddressesVal1.setStreetAddress(rs2.getString("street_address"));
                    _returnVal1AddressesVal1.setTownVillage(rs2.getString("town_village"));
                    _returnVal1AddressesVal1.setZipcode(rs2.getString("zipcode"));
                    _returnVal1Addresses.add(_returnVal1AddressesVal1);
            	}
                _returnVal1.getAddresses().addAll(_returnVal1Addresses);
                stmt2.close();
            }
            
            stmt.close();
            connection.close();        	

            return _returnVal1;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ttu.idu0080.orderservice.couriers.CourierService#getAllCouriers(*
     */
    public java.util.List<ttu.idu0080.orderservice.Courier> getAllCouriers() { 
        LOG.info("Executing operation getAllCouriers");
        try {
            java.util.List<ttu.idu0080.orderservice.Courier> _return = new java.util.ArrayList<ttu.idu0080.orderservice.Courier>();
        	Class.forName(DB_DRIVER);
        	Connection connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            Statement stmt = connection.createStatement();
            
            String sql = "SELECT enterprise, name, percent_from_order FROM enterprise WHERE is_courier='Y'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
            	ttu.idu0080.orderservice.Courier _returnVal1 = new ttu.idu0080.orderservice.Courier();
                java.util.List<ttu.idu0080.orderservice.EntAddress> _returnVal1Addresses = new java.util.ArrayList<ttu.idu0080.orderservice.EntAddress>();
            	int id = rs.getInt("enterprise");
            	_returnVal1.setEnterprise(id);
            	_returnVal1.setName(rs.getString("name"));
            	_returnVal1.setPercentFromOrder(rs.getInt("percent_from_order"));
            	sql = "SELECT * FROM ent_address WHERE subject_fk=" + id;
                Statement stmt2 = connection.createStatement();
            	ResultSet rs2 = stmt2.executeQuery(sql);
            	while (rs2.next()) {
                    ttu.idu0080.orderservice.EntAddress _returnVal1AddressesVal1 = new ttu.idu0080.orderservice.EntAddress();
                    _returnVal1AddressesVal1.setAddress(rs2.getInt("ent_address"));
                    _returnVal1AddressesVal1.setCountry(rs2.getString("country"));
                    _returnVal1AddressesVal1.setCounty(rs2.getString("county"));
                    _returnVal1AddressesVal1.setStreetAddress(rs2.getString("street_address"));
                    _returnVal1AddressesVal1.setTownVillage(rs2.getString("town_village"));
                    _returnVal1AddressesVal1.setZipcode(rs2.getString("zipcode"));
                    _returnVal1Addresses.add(_returnVal1AddressesVal1);
            	}
                _returnVal1.getAddresses().addAll(_returnVal1Addresses);
                stmt2.close();
                _return.add(_returnVal1);
            }
            
            stmt.close();
            connection.close();        	

            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
    

    /* (non-Javadoc)
     * @see ttu.idu0080.orderservice.OrderService#getAllProducts(*
     */
    public java.util.List<ttu.idu0080.orderservice.Product> getAllProducts() { 
        LOG.info("Executing operation getAllProducts");
        try {
            java.util.List<ttu.idu0080.orderservice.Product> _return = new java.util.ArrayList<ttu.idu0080.orderservice.Product>();
            ttu.idu0080.orderservice.Product _returnVal1 = new ttu.idu0080.orderservice.Product();
            _returnVal1.setDescription("Description-309008537");
            _returnVal1.setEshopPrice(0.33165526f);
            _returnVal1.setName("Name681428640");
            _returnVal1.setProduct(959708328);
            _returnVal1.setProductCode("ProductCode492332567");
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
