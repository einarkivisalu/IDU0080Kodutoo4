package ttu.idu0080.transport;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-05-15T08:26:47.662+03:00
 * Generated source version: 2.7.18
 * 
 */
@WebServiceClient(name = "TransportServiceService", 
                  wsdlLocation = "file:/C:/Users/rmg/workspace4test3/TransportService/src/transport.wsdl",
                  targetNamespace = "http://transport.idu0080.ttu/") 
public class TransportServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://transport.idu0080.ttu/", "TransportServiceService");
    public final static QName TransportServicePort = new QName("http://transport.idu0080.ttu/", "TransportServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/rmg/workspace4test3/TransportService/src/transport.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TransportServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/rmg/workspace4test3/TransportService/src/transport.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public TransportServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TransportServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TransportServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TransportServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TransportServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TransportServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns TransportService
     */
    @WebEndpoint(name = "TransportServicePort")
    public TransportService getTransportServicePort() {
        return super.getPort(TransportServicePort, TransportService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TransportService
     */
    @WebEndpoint(name = "TransportServicePort")
    public TransportService getTransportServicePort(WebServiceFeature... features) {
        return super.getPort(TransportServicePort, TransportService.class, features);
    }

}
