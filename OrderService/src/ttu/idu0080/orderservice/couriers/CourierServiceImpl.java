
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ttu.idu0080.orderservice.couriers;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

import org.postgresql.Driver;

@javax.jws.WebService(
                      serviceName = "CourierServiceService",
                      portName = "CourierServicePort",
                      targetNamespace = "http://server.order.idu0080.ttu/",
                      wsdlLocation = "file:/C:/Users/Random/workspace4test2/OrderService/src/couriers.wsdl",
                      endpointInterface = "ttu.idu0080.orderservice.couriers.CourierService")
                      
public class CourierServiceImpl implements CourierService {

	private static final String DB_DRIVER = "org.postgresql.Driver";
    private static final String DB_CONNECTION = "jdbc:postgresql://localhost:5432/orders"; 
    private static final String DB_USER = "IDU0080";
	private static final String DB_PASSWORD = "IDU0080";
	
    private static final Logger LOG = Logger.getLogger(CourierServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see ttu.idu0080.orderservice.couriers.CourierService#getCouriersByAddress(java.lang.String  country ,)java.lang.String  county )*
     */
    public java.util.List<ttu.idu0080.orderservice.couriers.Courier> getCouriersByAddress(java.lang.String country,java.lang.String county) { 
        LOG.info("Executing operation getCouriersByAddress");
        System.out.println(country);
        System.out.println(county);
        try {
            java.util.List<ttu.idu0080.orderservice.couriers.Courier> _return = new java.util.ArrayList<ttu.idu0080.orderservice.couriers.Courier>();
            ttu.idu0080.orderservice.couriers.Courier _returnVal1 = new ttu.idu0080.orderservice.couriers.Courier();
            java.util.List<ttu.idu0080.orderservice.couriers.EntAddress> _returnVal1Addresses = new java.util.ArrayList<ttu.idu0080.orderservice.couriers.EntAddress>();
            ttu.idu0080.orderservice.couriers.EntAddress _returnVal1AddressesVal1 = new ttu.idu0080.orderservice.couriers.EntAddress();
            _returnVal1AddressesVal1.setAddress(-1848755692);
            _returnVal1AddressesVal1.setCountry("Country297191693");
            _returnVal1AddressesVal1.setCounty("County-1533608428");
            _returnVal1AddressesVal1.setStreetAddress("StreetAddress922916601");
            _returnVal1AddressesVal1.setTownVillage("TownVillage-1991861847");
            _returnVal1AddressesVal1.setZipcode("Zipcode760654881");
            _returnVal1Addresses.add(_returnVal1AddressesVal1);
            _returnVal1.getAddresses().addAll(_returnVal1Addresses);
            _returnVal1.setEnterprise(832611148);
            _returnVal1.setName("Name2089800830");
            _returnVal1.setPercentFromOrder(1595753046);
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ttu.idu0080.orderservice.couriers.CourierService#getCourierById(int  courierId )*
     */
    public ttu.idu0080.orderservice.couriers.Courier getCourierById(int courierId) { 
        LOG.info("Executing operation getCourierById");
        System.out.println(courierId);
        try {
        	ttu.idu0080.orderservice.couriers.Courier _returnVal1 = null;
        	Class.forName(DB_DRIVER);
        	Connection connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            Statement stmt = connection.createStatement();
            
            String sql = "SELECT enterprise, name, percent_from_order FROM enterprise WHERE enterprise=" + courierId;
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
            	_returnVal1 = new ttu.idu0080.orderservice.couriers.Courier();
                java.util.List<ttu.idu0080.orderservice.couriers.EntAddress> _returnVal1Addresses = new java.util.ArrayList<ttu.idu0080.orderservice.couriers.EntAddress>();
            	int id = rs.getInt("enterprise");
            	_returnVal1.setEnterprise(id);
            	_returnVal1.setName(rs.getString("name"));
            	_returnVal1.setPercentFromOrder(rs.getInt("percent_from_order"));
            	sql = "SELECT * FROM ent_address WHERE subject_fk=" + id;
                Statement stmt2 = connection.createStatement();
            	ResultSet rs2 = stmt2.executeQuery(sql);
            	while (rs2.next()) {
                    ttu.idu0080.orderservice.couriers.EntAddress _returnVal1AddressesVal1 = new ttu.idu0080.orderservice.couriers.EntAddress();
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
    public java.util.List<ttu.idu0080.orderservice.couriers.Courier> getAllCouriers() { 
        LOG.info("Executing operation getAllCouriers");
        try {
            java.util.List<ttu.idu0080.orderservice.couriers.Courier> _return = new java.util.ArrayList<ttu.idu0080.orderservice.couriers.Courier>();
        	Class.forName(DB_DRIVER);
        	Connection connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            Statement stmt = connection.createStatement();
            
            String sql = "SELECT enterprise, name, percent_from_order FROM enterprise WHERE is_courier='Y'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
            	ttu.idu0080.orderservice.couriers.Courier _returnVal1 = new ttu.idu0080.orderservice.couriers.Courier();
                java.util.List<ttu.idu0080.orderservice.couriers.EntAddress> _returnVal1Addresses = new java.util.ArrayList<ttu.idu0080.orderservice.couriers.EntAddress>();
            	int id = rs.getInt("enterprise");
            	_returnVal1.setEnterprise(id);
            	_returnVal1.setName(rs.getString("name"));
            	_returnVal1.setPercentFromOrder(rs.getInt("percent_from_order"));
            	sql = "SELECT * FROM ent_address WHERE subject_fk=" + id;
                Statement stmt2 = connection.createStatement();
            	ResultSet rs2 = stmt2.executeQuery(sql);
            	while (rs2.next()) {
                    ttu.idu0080.orderservice.couriers.EntAddress _returnVal1AddressesVal1 = new ttu.idu0080.orderservice.couriers.EntAddress();
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

}
