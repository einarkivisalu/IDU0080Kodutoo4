
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ttu.idu0080.order.client;

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
 * 2017-05-15T09:20:28.012+03:00
 * Generated source version: 2.7.18
 * 
 */

@javax.jws.WebService(
                      serviceName = "OrderServiceService",
                      portName = "OrderServicePort",
                      targetNamespace = "http://server.order.idu0080.ttu/",
                      wsdlLocation = "http://localhost:8080/OrderService/services/OrderServicePort?wsdl",
                      endpointInterface = "ttu.idu0080.order.client.OrderService")
                      
public class OrderServiceImpl implements OrderService {

    private static final Logger LOG = Logger.getLogger(OrderServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see ttu.idu0080.order.client.OrderService#getOrdersByCustomerId(int  customerId )*
     */
    public java.util.List<ttu.idu0080.order.client.Order> getOrdersByCustomerId(int customerId) { 
        LOG.info("Executing operation getOrdersByCustomerId");
        System.out.println(customerId);
        try {
            java.util.List<ttu.idu0080.order.client.Order> _return = new java.util.ArrayList<ttu.idu0080.order.client.Order>();
            ttu.idu0080.order.client.Order _returnVal1 = new ttu.idu0080.order.client.Order();
            ttu.idu0080.order.client.Customer _returnVal1Customer = new ttu.idu0080.order.client.Customer();
            java.util.List<ttu.idu0080.order.client.Address> _returnVal1CustomerAddresses = new java.util.ArrayList<ttu.idu0080.order.client.Address>();
            _returnVal1Customer.getAddresses().addAll(_returnVal1CustomerAddresses);
            _returnVal1Customer.setCustomer(-2030434128);
            _returnVal1Customer.setFirstName("FirstName1341759260");
            _returnVal1Customer.setLastName("LastName197542833");
            _returnVal1.setCustomer(_returnVal1Customer);
            _returnVal1.setOrderId(-467862468);
            java.util.List<ttu.idu0080.order.client.OrderProduct> _returnVal1OrderProducts = new java.util.ArrayList<ttu.idu0080.order.client.OrderProduct>();
            ttu.idu0080.order.client.OrderProduct _returnVal1OrderProductsVal1 = new ttu.idu0080.order.client.OrderProduct();
            _returnVal1OrderProductsVal1.setOrderProduct(138606428);
            _returnVal1OrderProductsVal1.setPrice(0.6655283f);
            _returnVal1OrderProductsVal1.setPriceTotal(0.5495778f);
            _returnVal1OrderProductsVal1.setProductCount(1402479505);
            _returnVal1OrderProductsVal1.setProductName("ProductName1531246842");
            _returnVal1OrderProducts.add(_returnVal1OrderProductsVal1);
            _returnVal1.getOrderProducts().addAll(_returnVal1OrderProducts);
            _returnVal1.setPriceTotal(0.2803774f);
            ttu.idu0080.order.client.Seller _returnVal1Seller = new ttu.idu0080.order.client.Seller();
            java.util.List<ttu.idu0080.order.client.EntAddress> _returnVal1SellerAddresses = new java.util.ArrayList<ttu.idu0080.order.client.EntAddress>();
            _returnVal1Seller.getAddresses().addAll(_returnVal1SellerAddresses);
            _returnVal1Seller.setEnterprise(-998977922);
            _returnVal1Seller.setName("Name-1771762387");
            _returnVal1.setSeller(_returnVal1Seller);
            ttu.idu0080.order.client.Address _returnVal1ShippingAddress = new ttu.idu0080.order.client.Address();
            _returnVal1ShippingAddress.setAddress(50723676);
            _returnVal1ShippingAddress.setCountry("Country-1234009635");
            _returnVal1ShippingAddress.setCounty("County89885538");
            _returnVal1ShippingAddress.setStreetAddress("StreetAddress-1863200355");
            _returnVal1ShippingAddress.setTownVillage("TownVillage304113903");
            _returnVal1ShippingAddress.setZipcode("Zipcode-1369426355");
            _returnVal1.setShippingAddress(_returnVal1ShippingAddress);
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ttu.idu0080.order.client.OrderService#getAllOrders(*
     */
    public java.util.List<ttu.idu0080.order.client.Order> getAllOrders() { 
        LOG.info("Executing operation getAllOrders");
        try {
            java.util.List<ttu.idu0080.order.client.Order> _return = new java.util.ArrayList<ttu.idu0080.order.client.Order>();
            ttu.idu0080.order.client.Order _returnVal1 = new ttu.idu0080.order.client.Order();
            ttu.idu0080.order.client.Customer _returnVal1Customer = new ttu.idu0080.order.client.Customer();
            java.util.List<ttu.idu0080.order.client.Address> _returnVal1CustomerAddresses = new java.util.ArrayList<ttu.idu0080.order.client.Address>();
            _returnVal1Customer.getAddresses().addAll(_returnVal1CustomerAddresses);
            _returnVal1Customer.setCustomer(-368259691);
            _returnVal1Customer.setFirstName("FirstName-1804942104");
            _returnVal1Customer.setLastName("LastName182709828");
            _returnVal1.setCustomer(_returnVal1Customer);
            _returnVal1.setOrderId(2120098082);
            java.util.List<ttu.idu0080.order.client.OrderProduct> _returnVal1OrderProducts = new java.util.ArrayList<ttu.idu0080.order.client.OrderProduct>();
            ttu.idu0080.order.client.OrderProduct _returnVal1OrderProductsVal1 = new ttu.idu0080.order.client.OrderProduct();
            _returnVal1OrderProductsVal1.setOrderProduct(1815440562);
            _returnVal1OrderProductsVal1.setPrice(0.094836f);
            _returnVal1OrderProductsVal1.setPriceTotal(0.22458762f);
            _returnVal1OrderProductsVal1.setProductCount(358721361);
            _returnVal1OrderProductsVal1.setProductName("ProductName-203105420");
            _returnVal1OrderProducts.add(_returnVal1OrderProductsVal1);
            _returnVal1.getOrderProducts().addAll(_returnVal1OrderProducts);
            _returnVal1.setPriceTotal(0.65128374f);
            ttu.idu0080.order.client.Seller _returnVal1Seller = new ttu.idu0080.order.client.Seller();
            java.util.List<ttu.idu0080.order.client.EntAddress> _returnVal1SellerAddresses = new java.util.ArrayList<ttu.idu0080.order.client.EntAddress>();
            _returnVal1Seller.getAddresses().addAll(_returnVal1SellerAddresses);
            _returnVal1Seller.setEnterprise(2063020003);
            _returnVal1Seller.setName("Name1363772211");
            _returnVal1.setSeller(_returnVal1Seller);
            ttu.idu0080.order.client.Address _returnVal1ShippingAddress = new ttu.idu0080.order.client.Address();
            _returnVal1ShippingAddress.setAddress(1312428889);
            _returnVal1ShippingAddress.setCountry("Country-1288028703");
            _returnVal1ShippingAddress.setCounty("County-657558257");
            _returnVal1ShippingAddress.setStreetAddress("StreetAddress334622584");
            _returnVal1ShippingAddress.setTownVillage("TownVillage-159312254");
            _returnVal1ShippingAddress.setZipcode("Zipcode-1259291130");
            _returnVal1.setShippingAddress(_returnVal1ShippingAddress);
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ttu.idu0080.order.client.OrderService#getOrdersByOrderId(int  orderId )*
     */
    public ttu.idu0080.order.client.Order getOrdersByOrderId(int orderId) { 
        LOG.info("Executing operation getOrdersByOrderId");
        System.out.println(orderId);
        try {
            ttu.idu0080.order.client.Order _return = new ttu.idu0080.order.client.Order();
            ttu.idu0080.order.client.Customer _returnCustomer = new ttu.idu0080.order.client.Customer();
            java.util.List<ttu.idu0080.order.client.Address> _returnCustomerAddresses = new java.util.ArrayList<ttu.idu0080.order.client.Address>();
            ttu.idu0080.order.client.Address _returnCustomerAddressesVal1 = new ttu.idu0080.order.client.Address();
            _returnCustomerAddressesVal1.setAddress(-1297342328);
            _returnCustomerAddressesVal1.setCountry("Country-211022502");
            _returnCustomerAddressesVal1.setCounty("County864824285");
            _returnCustomerAddressesVal1.setStreetAddress("StreetAddress2062842491");
            _returnCustomerAddressesVal1.setTownVillage("TownVillage567414011");
            _returnCustomerAddressesVal1.setZipcode("Zipcode965278228");
            _returnCustomerAddresses.add(_returnCustomerAddressesVal1);
            _returnCustomer.getAddresses().addAll(_returnCustomerAddresses);
            _returnCustomer.setCustomer(975321477);
            _returnCustomer.setFirstName("FirstName111818945");
            _returnCustomer.setLastName("LastName-1654182518");
            _return.setCustomer(_returnCustomer);
            _return.setOrderId(352077717);
            java.util.List<ttu.idu0080.order.client.OrderProduct> _returnOrderProducts = new java.util.ArrayList<ttu.idu0080.order.client.OrderProduct>();
            ttu.idu0080.order.client.OrderProduct _returnOrderProductsVal1 = new ttu.idu0080.order.client.OrderProduct();
            _returnOrderProductsVal1.setOrderProduct(1863180648);
            _returnOrderProductsVal1.setPrice(0.8715761f);
            _returnOrderProductsVal1.setPriceTotal(0.7159532f);
            _returnOrderProductsVal1.setProductCount(308333681);
            _returnOrderProductsVal1.setProductName("ProductName-1913699287");
            _returnOrderProducts.add(_returnOrderProductsVal1);
            _return.getOrderProducts().addAll(_returnOrderProducts);
            _return.setPriceTotal(0.43609577f);
            ttu.idu0080.order.client.Seller _returnSeller = new ttu.idu0080.order.client.Seller();
            java.util.List<ttu.idu0080.order.client.EntAddress> _returnSellerAddresses = new java.util.ArrayList<ttu.idu0080.order.client.EntAddress>();
            ttu.idu0080.order.client.EntAddress _returnSellerAddressesVal1 = new ttu.idu0080.order.client.EntAddress();
            _returnSellerAddressesVal1.setAddress(-1624248894);
            _returnSellerAddressesVal1.setCountry("Country413531927");
            _returnSellerAddressesVal1.setCounty("County-1884516792");
            _returnSellerAddressesVal1.setStreetAddress("StreetAddress-1716336752");
            _returnSellerAddressesVal1.setTownVillage("TownVillage1239385263");
            _returnSellerAddressesVal1.setZipcode("Zipcode-1709486007");
            _returnSellerAddresses.add(_returnSellerAddressesVal1);
            _returnSeller.getAddresses().addAll(_returnSellerAddresses);
            _returnSeller.setEnterprise(-1166298240);
            _returnSeller.setName("Name-1079755202");
            _return.setSeller(_returnSeller);
            ttu.idu0080.order.client.Address _returnShippingAddress = new ttu.idu0080.order.client.Address();
            _returnShippingAddress.setAddress(-67940852);
            _returnShippingAddress.setCountry("Country-2068694840");
            _returnShippingAddress.setCounty("County4324464");
            _returnShippingAddress.setStreetAddress("StreetAddress-1748107035");
            _returnShippingAddress.setTownVillage("TownVillage672777554");
            _returnShippingAddress.setZipcode("Zipcode-1066996146");
            _return.setShippingAddress(_returnShippingAddress);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ttu.idu0080.order.client.OrderService#getAllCouriers(*
     */
    public java.util.List<ttu.idu0080.order.client.Courier> getAllCouriers() { 
        LOG.info("Executing operation getAllCouriers");
        try {
            java.util.List<ttu.idu0080.order.client.Courier> _return = new java.util.ArrayList<ttu.idu0080.order.client.Courier>();
            ttu.idu0080.order.client.Courier _returnVal1 = new ttu.idu0080.order.client.Courier();
            java.util.List<ttu.idu0080.order.client.EntAddress> _returnVal1Addresses = new java.util.ArrayList<ttu.idu0080.order.client.EntAddress>();
            ttu.idu0080.order.client.EntAddress _returnVal1AddressesVal1 = new ttu.idu0080.order.client.EntAddress();
            _returnVal1AddressesVal1.setAddress(1286359677);
            _returnVal1AddressesVal1.setCountry("Country-2012816304");
            _returnVal1AddressesVal1.setCounty("County791596490");
            _returnVal1AddressesVal1.setStreetAddress("StreetAddress-179637312");
            _returnVal1AddressesVal1.setTownVillage("TownVillage1563244022");
            _returnVal1AddressesVal1.setZipcode("Zipcode-316803958");
            _returnVal1Addresses.add(_returnVal1AddressesVal1);
            _returnVal1.getAddresses().addAll(_returnVal1Addresses);
            _returnVal1.setEnterprise(-2111604910);
            _returnVal1.setName("Name-1834223453");
            _returnVal1.setPercentFromOrder(1346136696);
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ttu.idu0080.order.client.OrderService#getCourierById(int  courierId )*
     */
    public ttu.idu0080.order.client.Courier getCourierById(int courierId) { 
        LOG.info("Executing operation getCourierById");
        System.out.println(courierId);
        try {
            ttu.idu0080.order.client.Courier _return = new ttu.idu0080.order.client.Courier();
            java.util.List<ttu.idu0080.order.client.EntAddress> _returnAddresses = new java.util.ArrayList<ttu.idu0080.order.client.EntAddress>();
            ttu.idu0080.order.client.EntAddress _returnAddressesVal1 = new ttu.idu0080.order.client.EntAddress();
            _returnAddressesVal1.setAddress(-368643217);
            _returnAddressesVal1.setCountry("Country-770258080");
            _returnAddressesVal1.setCounty("County159693776");
            _returnAddressesVal1.setStreetAddress("StreetAddress151315859");
            _returnAddressesVal1.setTownVillage("TownVillage1552026751");
            _returnAddressesVal1.setZipcode("Zipcode-1900026297");
            _returnAddresses.add(_returnAddressesVal1);
            _return.getAddresses().addAll(_returnAddresses);
            _return.setEnterprise(890037603);
            _return.setName("Name2003172269");
            _return.setPercentFromOrder(-1440749067);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ttu.idu0080.order.client.OrderService#getAllProducts(*
     */
    public java.util.List<ttu.idu0080.order.client.Product> getAllProducts() { 
        LOG.info("Executing operation getAllProducts");
        try {
            java.util.List<ttu.idu0080.order.client.Product> _return = new java.util.ArrayList<ttu.idu0080.order.client.Product>();
            ttu.idu0080.order.client.Product _returnVal1 = new ttu.idu0080.order.client.Product();
            _returnVal1.setDescription("Description-1635131207");
            _returnVal1.setEshopPrice(0.56286687f);
            _returnVal1.setName("Name-1811593434");
            _returnVal1.setProduct(-571549929);
            _returnVal1.setProductCode("ProductCode1925598604");
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
