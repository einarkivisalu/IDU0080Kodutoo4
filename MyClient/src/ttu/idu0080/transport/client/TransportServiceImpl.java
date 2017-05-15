
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ttu.idu0080.transport.client;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-05-15T09:21:54.606+03:00
 * Generated source version: 2.7.18
 * 
 */

@javax.jws.WebService(
                      serviceName = "TransportServiceService",
                      portName = "TransportServicePort",
                      targetNamespace = "http://transport.idu0080.ttu/",
                      wsdlLocation = "http://localhost:8080/TransportService/services/TransportServicePort?wsdl",
                      endpointInterface = "ttu.idu0080.transport.client.TransportService")
                      
public class TransportServiceImpl implements TransportService {

    private static final Logger LOG = Logger.getLogger(TransportServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see ttu.idu0080.transport.client.TransportService#getCourierList(*
     */
    public java.util.List<ttu.idu0080.transport.client.Courierdata> getCourierList() { 
        LOG.info("Executing operation getCourierList");
        try {
            java.util.List<ttu.idu0080.transport.client.Courierdata> _return = new java.util.ArrayList<ttu.idu0080.transport.client.Courierdata>();
            ttu.idu0080.transport.client.Courierdata _returnVal1 = new ttu.idu0080.transport.client.Courierdata();
            _returnVal1.setCourier(950413942);
            _returnVal1.setName("Name-2040769671");
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ttu.idu0080.transport.client.TransportService#getCourierOffer(int  orderid ,)int  courierid )*
     */
    public ttu.idu0080.transport.client.Offerresponse getCourierOffer(int orderid,int courierid) { 
        LOG.info("Executing operation getCourierOffer");
        System.out.println(orderid);
        System.out.println(courierid);
        try {
            ttu.idu0080.transport.client.Offerresponse _return = new ttu.idu0080.transport.client.Offerresponse();
            _return.setOfferid("Offerid-1296808809");
            _return.setPrice(0.5925517f);
            _return.setDays(390657857);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ttu.idu0080.transport.client.TransportService#setOrderTransport(java.lang.String  offerid )*
     */
    public java.lang.String setOrderTransport(java.lang.String offerid) { 
        LOG.info("Executing operation setOrderTransport");
        System.out.println(offerid);
        try {
            java.lang.String _return = "_return-1555735936";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
