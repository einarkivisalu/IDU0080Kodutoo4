
package ttu.idu0080.myclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ttu.idu0080.myclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCourierOfferResponse_QNAME = new QName("http://transport.idu0080.ttu/", "getCourierOfferResponse");
    private final static QName _SetOrderTransport_QNAME = new QName("http://transport.idu0080.ttu/", "setOrderTransport");
    private final static QName _SetOrderTransportResponse_QNAME = new QName("http://transport.idu0080.ttu/", "setOrderTransportResponse");
    private final static QName _GetCourierListResponse_QNAME = new QName("http://transport.idu0080.ttu/", "getCourierListResponse");
    private final static QName _GetCourierList_QNAME = new QName("http://transport.idu0080.ttu/", "getCourierList");
    private final static QName _GetCourierOffer_QNAME = new QName("http://transport.idu0080.ttu/", "getCourierOffer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ttu.idu0080.myclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCourierOfferResponse }
     * 
     */
    public GetCourierOfferResponse createGetCourierOfferResponse() {
        return new GetCourierOfferResponse();
    }

    /**
     * Create an instance of {@link SetOrderTransport }
     * 
     */
    public SetOrderTransport createSetOrderTransport() {
        return new SetOrderTransport();
    }

    /**
     * Create an instance of {@link SetOrderTransportResponse }
     * 
     */
    public SetOrderTransportResponse createSetOrderTransportResponse() {
        return new SetOrderTransportResponse();
    }

    /**
     * Create an instance of {@link GetCourierListResponse }
     * 
     */
    public GetCourierListResponse createGetCourierListResponse() {
        return new GetCourierListResponse();
    }

    /**
     * Create an instance of {@link GetCourierList }
     * 
     */
    public GetCourierList createGetCourierList() {
        return new GetCourierList();
    }

    /**
     * Create an instance of {@link GetCourierOffer }
     * 
     */
    public GetCourierOffer createGetCourierOffer() {
        return new GetCourierOffer();
    }

    /**
     * Create an instance of {@link Courierdata }
     * 
     */
    public Courierdata createCourierdata() {
        return new Courierdata();
    }

    /**
     * Create an instance of {@link Offerresponse }
     * 
     */
    public Offerresponse createOfferresponse() {
        return new Offerresponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourierOfferResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://transport.idu0080.ttu/", name = "getCourierOfferResponse")
    public JAXBElement<GetCourierOfferResponse> createGetCourierOfferResponse(GetCourierOfferResponse value) {
        return new JAXBElement<GetCourierOfferResponse>(_GetCourierOfferResponse_QNAME, GetCourierOfferResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetOrderTransport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://transport.idu0080.ttu/", name = "setOrderTransport")
    public JAXBElement<SetOrderTransport> createSetOrderTransport(SetOrderTransport value) {
        return new JAXBElement<SetOrderTransport>(_SetOrderTransport_QNAME, SetOrderTransport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetOrderTransportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://transport.idu0080.ttu/", name = "setOrderTransportResponse")
    public JAXBElement<SetOrderTransportResponse> createSetOrderTransportResponse(SetOrderTransportResponse value) {
        return new JAXBElement<SetOrderTransportResponse>(_SetOrderTransportResponse_QNAME, SetOrderTransportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourierListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://transport.idu0080.ttu/", name = "getCourierListResponse")
    public JAXBElement<GetCourierListResponse> createGetCourierListResponse(GetCourierListResponse value) {
        return new JAXBElement<GetCourierListResponse>(_GetCourierListResponse_QNAME, GetCourierListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourierList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://transport.idu0080.ttu/", name = "getCourierList")
    public JAXBElement<GetCourierList> createGetCourierList(GetCourierList value) {
        return new JAXBElement<GetCourierList>(_GetCourierList_QNAME, GetCourierList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourierOffer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://transport.idu0080.ttu/", name = "getCourierOffer")
    public JAXBElement<GetCourierOffer> createGetCourierOffer(GetCourierOffer value) {
        return new JAXBElement<GetCourierOffer>(_GetCourierOffer_QNAME, GetCourierOffer.class, null, value);
    }

}
