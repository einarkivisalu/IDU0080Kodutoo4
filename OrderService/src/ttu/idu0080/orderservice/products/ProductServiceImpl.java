
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ttu.idu0080.orderservice.products;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-05-13T14:29:11.361+03:00
 * Generated source version: 2.7.18
 * 
 */

@javax.jws.WebService(
                      serviceName = "ProductServiceService",
                      portName = "ProductServicePort",
                      targetNamespace = "http://server.order.idu0080.ttu/",
                      wsdlLocation = "file:/C:/Users/Random/workspace4test2/OrderService/src/products.wsdl",
                      endpointInterface = "ttu.idu0080.orderservice.products.ProductService")
                      
public class ProductServiceImpl implements ProductService {

    private static final Logger LOG = Logger.getLogger(ProductServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see ttu.idu0080.orderservice.products.ProductService#getAllProducts(*
     */
    public java.util.List<ttu.idu0080.orderservice.products.Product> getAllProducts() { 
        LOG.info("Executing operation getAllProducts");
        try {
            java.util.List<ttu.idu0080.orderservice.products.Product> _return = new java.util.ArrayList<ttu.idu0080.orderservice.products.Product>();
            ttu.idu0080.orderservice.products.Product _returnVal1 = new ttu.idu0080.orderservice.products.Product();
            _returnVal1.setDescription("Description924685262");
            _returnVal1.setEshopPrice(0.58155906f);
            _returnVal1.setName("Name-1852497951");
            _returnVal1.setProduct(-763023993);
            _returnVal1.setProductCode("ProductCode-1451125528");
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
