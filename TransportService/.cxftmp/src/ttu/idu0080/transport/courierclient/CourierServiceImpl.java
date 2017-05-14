
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ttu.idu0080.transport.courierclient;

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
 * 2017-05-14T14:38:53.332+03:00
 * Generated source version: 2.7.18
 * 
 */

@javax.jws.WebService(
                      serviceName = "CourierServiceService",
                      portName = "CourierServicePort",
                      targetNamespace = "http://server.order.idu0080.ttu/",
                      wsdlLocation = "http://localhost:8080/OrderService/services/CourierServicePort?wsdl",
                      endpointInterface = "ttu.idu0080.transport.courierclient.CourierService")
                      
public class CourierServiceImpl implements CourierService {

    private static final Logger LOG = Logger.getLogger(CourierServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see ttu.idu0080.transport.courierclient.CourierService#getCouriersByAddress(java.lang.String  country ,)java.lang.String  county )*
     */
    public java.util.List<ttu.idu0080.transport.courierclient.Courier> getCouriersByAddress(java.lang.String country,java.lang.String county) { 
        LOG.info("Executing operation getCouriersByAddress");
        System.out.println(country);
        System.out.println(county);
        try {
            java.util.List<ttu.idu0080.transport.courierclient.Courier> _return = new java.util.ArrayList<ttu.idu0080.transport.courierclient.Courier>();
            ttu.idu0080.transport.courierclient.Courier _returnVal1 = new ttu.idu0080.transport.courierclient.Courier();
            java.util.List<ttu.idu0080.transport.courierclient.EntAddress> _returnVal1Addresses = new java.util.ArrayList<ttu.idu0080.transport.courierclient.EntAddress>();
            ttu.idu0080.transport.courierclient.EntAddress _returnVal1AddressesVal1 = new ttu.idu0080.transport.courierclient.EntAddress();
            _returnVal1AddressesVal1.setAddress(-1075617078);
            _returnVal1AddressesVal1.setCountry("Country1562757123");
            _returnVal1AddressesVal1.setCounty("County-1516971475");
            _returnVal1AddressesVal1.setStreetAddress("StreetAddress1380208793");
            _returnVal1AddressesVal1.setTownVillage("TownVillage-1733293463");
            _returnVal1AddressesVal1.setZipcode("Zipcode1756835424");
            _returnVal1Addresses.add(_returnVal1AddressesVal1);
            _returnVal1.getAddresses().addAll(_returnVal1Addresses);
            _returnVal1.setEnterprise(1929230970);
            _returnVal1.setName("Name-1185578842");
            _returnVal1.setPercentFromOrder(189005316);
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ttu.idu0080.transport.courierclient.CourierService#getCourierById(int  courierId )*
     */
    public ttu.idu0080.transport.courierclient.Courier getCourierById(int courierId) { 
        LOG.info("Executing operation getCourierById");
        System.out.println(courierId);
        try {
            ttu.idu0080.transport.courierclient.Courier _return = new ttu.idu0080.transport.courierclient.Courier();
            java.util.List<ttu.idu0080.transport.courierclient.EntAddress> _returnAddresses = new java.util.ArrayList<ttu.idu0080.transport.courierclient.EntAddress>();
            ttu.idu0080.transport.courierclient.EntAddress _returnAddressesVal1 = new ttu.idu0080.transport.courierclient.EntAddress();
            _returnAddressesVal1.setAddress(-206760459);
            _returnAddressesVal1.setCountry("Country532911116");
            _returnAddressesVal1.setCounty("County2123594194");
            _returnAddressesVal1.setStreetAddress("StreetAddress-1042112916");
            _returnAddressesVal1.setTownVillage("TownVillage-104202304");
            _returnAddressesVal1.setZipcode("Zipcode-204945555");
            _returnAddresses.add(_returnAddressesVal1);
            _return.getAddresses().addAll(_returnAddresses);
            _return.setEnterprise(-1649374402);
            _return.setName("Name1009672176");
            _return.setPercentFromOrder(-1866121070);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ttu.idu0080.transport.courierclient.CourierService#getAllCouriers(*
     */
    public java.util.List<ttu.idu0080.transport.courierclient.Courier> getAllCouriers() { 
        LOG.info("Executing operation getAllCouriers");
        try {
            java.util.List<ttu.idu0080.transport.courierclient.Courier> _return = new java.util.ArrayList<ttu.idu0080.transport.courierclient.Courier>();
            ttu.idu0080.transport.courierclient.Courier _returnVal1 = new ttu.idu0080.transport.courierclient.Courier();
            java.util.List<ttu.idu0080.transport.courierclient.EntAddress> _returnVal1Addresses = new java.util.ArrayList<ttu.idu0080.transport.courierclient.EntAddress>();
            ttu.idu0080.transport.courierclient.EntAddress _returnVal1AddressesVal1 = new ttu.idu0080.transport.courierclient.EntAddress();
            _returnVal1AddressesVal1.setAddress(-777414651);
            _returnVal1AddressesVal1.setCountry("Country-190304099");
            _returnVal1AddressesVal1.setCounty("County-1080263442");
            _returnVal1AddressesVal1.setStreetAddress("StreetAddress879690262");
            _returnVal1AddressesVal1.setTownVillage("TownVillage1655321297");
            _returnVal1AddressesVal1.setZipcode("Zipcode403547347");
            _returnVal1Addresses.add(_returnVal1AddressesVal1);
            _returnVal1.getAddresses().addAll(_returnVal1Addresses);
            _returnVal1.setEnterprise(-1143423572);
            _returnVal1.setName("Name975491089");
            _returnVal1.setPercentFromOrder(686943314);
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}