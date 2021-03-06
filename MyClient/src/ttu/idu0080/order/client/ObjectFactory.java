
package ttu.idu0080.order.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ttu.idu0080.order.client package. 
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

    private final static QName _GetOrdersByCustomerId_QNAME = new QName("http://server.order.idu0080.ttu/", "getOrdersByCustomerId");
    private final static QName _GetAllOrders_QNAME = new QName("http://server.order.idu0080.ttu/", "getAllOrders");
    private final static QName _GetAllProductsResponse_QNAME = new QName("http://server.order.idu0080.ttu/", "getAllProductsResponse");
    private final static QName _GetOrdersByOrderId_QNAME = new QName("http://server.order.idu0080.ttu/", "getOrdersByOrderId");
    private final static QName _GetOrdersByCustomerIdResponse_QNAME = new QName("http://server.order.idu0080.ttu/", "getOrdersByCustomerIdResponse");
    private final static QName _GetCourierByIdResponse_QNAME = new QName("http://server.order.idu0080.ttu/", "getCourierByIdResponse");
    private final static QName _GetAllOrdersResponse_QNAME = new QName("http://server.order.idu0080.ttu/", "getAllOrdersResponse");
    private final static QName _GetAllCouriers_QNAME = new QName("http://server.order.idu0080.ttu/", "getAllCouriers");
    private final static QName _GetOrdersByOrderIdResponse_QNAME = new QName("http://server.order.idu0080.ttu/", "getOrdersByOrderIdResponse");
    private final static QName _GetAllCouriersResponse_QNAME = new QName("http://server.order.idu0080.ttu/", "getAllCouriersResponse");
    private final static QName _GetCourierById_QNAME = new QName("http://server.order.idu0080.ttu/", "getCourierById");
    private final static QName _GetAllProducts_QNAME = new QName("http://server.order.idu0080.ttu/", "getAllProducts");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ttu.idu0080.order.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllProducts }
     * 
     */
    public GetAllProducts createGetAllProducts() {
        return new GetAllProducts();
    }

    /**
     * Create an instance of {@link GetCourierById }
     * 
     */
    public GetCourierById createGetCourierById() {
        return new GetCourierById();
    }

    /**
     * Create an instance of {@link GetAllCouriersResponse }
     * 
     */
    public GetAllCouriersResponse createGetAllCouriersResponse() {
        return new GetAllCouriersResponse();
    }

    /**
     * Create an instance of {@link GetAllOrdersResponse }
     * 
     */
    public GetAllOrdersResponse createGetAllOrdersResponse() {
        return new GetAllOrdersResponse();
    }

    /**
     * Create an instance of {@link GetAllCouriers }
     * 
     */
    public GetAllCouriers createGetAllCouriers() {
        return new GetAllCouriers();
    }

    /**
     * Create an instance of {@link GetOrdersByOrderIdResponse }
     * 
     */
    public GetOrdersByOrderIdResponse createGetOrdersByOrderIdResponse() {
        return new GetOrdersByOrderIdResponse();
    }

    /**
     * Create an instance of {@link GetOrdersByOrderId }
     * 
     */
    public GetOrdersByOrderId createGetOrdersByOrderId() {
        return new GetOrdersByOrderId();
    }

    /**
     * Create an instance of {@link GetOrdersByCustomerIdResponse }
     * 
     */
    public GetOrdersByCustomerIdResponse createGetOrdersByCustomerIdResponse() {
        return new GetOrdersByCustomerIdResponse();
    }

    /**
     * Create an instance of {@link GetCourierByIdResponse }
     * 
     */
    public GetCourierByIdResponse createGetCourierByIdResponse() {
        return new GetCourierByIdResponse();
    }

    /**
     * Create an instance of {@link GetOrdersByCustomerId }
     * 
     */
    public GetOrdersByCustomerId createGetOrdersByCustomerId() {
        return new GetOrdersByCustomerId();
    }

    /**
     * Create an instance of {@link GetAllOrders }
     * 
     */
    public GetAllOrders createGetAllOrders() {
        return new GetAllOrders();
    }

    /**
     * Create an instance of {@link GetAllProductsResponse }
     * 
     */
    public GetAllProductsResponse createGetAllProductsResponse() {
        return new GetAllProductsResponse();
    }

    /**
     * Create an instance of {@link Seller }
     * 
     */
    public Seller createSeller() {
        return new Seller();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link EntAddress }
     * 
     */
    public EntAddress createEntAddress() {
        return new EntAddress();
    }

    /**
     * Create an instance of {@link Courier }
     * 
     */
    public Courier createCourier() {
        return new Courier();
    }

    /**
     * Create an instance of {@link OrderProduct }
     * 
     */
    public OrderProduct createOrderProduct() {
        return new OrderProduct();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersByCustomerId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getOrdersByCustomerId")
    public JAXBElement<GetOrdersByCustomerId> createGetOrdersByCustomerId(GetOrdersByCustomerId value) {
        return new JAXBElement<GetOrdersByCustomerId>(_GetOrdersByCustomerId_QNAME, GetOrdersByCustomerId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllOrders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getAllOrders")
    public JAXBElement<GetAllOrders> createGetAllOrders(GetAllOrders value) {
        return new JAXBElement<GetAllOrders>(_GetAllOrders_QNAME, GetAllOrders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getAllProductsResponse")
    public JAXBElement<GetAllProductsResponse> createGetAllProductsResponse(GetAllProductsResponse value) {
        return new JAXBElement<GetAllProductsResponse>(_GetAllProductsResponse_QNAME, GetAllProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersByOrderId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getOrdersByOrderId")
    public JAXBElement<GetOrdersByOrderId> createGetOrdersByOrderId(GetOrdersByOrderId value) {
        return new JAXBElement<GetOrdersByOrderId>(_GetOrdersByOrderId_QNAME, GetOrdersByOrderId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersByCustomerIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getOrdersByCustomerIdResponse")
    public JAXBElement<GetOrdersByCustomerIdResponse> createGetOrdersByCustomerIdResponse(GetOrdersByCustomerIdResponse value) {
        return new JAXBElement<GetOrdersByCustomerIdResponse>(_GetOrdersByCustomerIdResponse_QNAME, GetOrdersByCustomerIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourierByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getCourierByIdResponse")
    public JAXBElement<GetCourierByIdResponse> createGetCourierByIdResponse(GetCourierByIdResponse value) {
        return new JAXBElement<GetCourierByIdResponse>(_GetCourierByIdResponse_QNAME, GetCourierByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getAllOrdersResponse")
    public JAXBElement<GetAllOrdersResponse> createGetAllOrdersResponse(GetAllOrdersResponse value) {
        return new JAXBElement<GetAllOrdersResponse>(_GetAllOrdersResponse_QNAME, GetAllOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCouriers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getAllCouriers")
    public JAXBElement<GetAllCouriers> createGetAllCouriers(GetAllCouriers value) {
        return new JAXBElement<GetAllCouriers>(_GetAllCouriers_QNAME, GetAllCouriers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersByOrderIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getOrdersByOrderIdResponse")
    public JAXBElement<GetOrdersByOrderIdResponse> createGetOrdersByOrderIdResponse(GetOrdersByOrderIdResponse value) {
        return new JAXBElement<GetOrdersByOrderIdResponse>(_GetOrdersByOrderIdResponse_QNAME, GetOrdersByOrderIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCouriersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getAllCouriersResponse")
    public JAXBElement<GetAllCouriersResponse> createGetAllCouriersResponse(GetAllCouriersResponse value) {
        return new JAXBElement<GetAllCouriersResponse>(_GetAllCouriersResponse_QNAME, GetAllCouriersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourierById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getCourierById")
    public JAXBElement<GetCourierById> createGetCourierById(GetCourierById value) {
        return new JAXBElement<GetCourierById>(_GetCourierById_QNAME, GetCourierById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProducts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getAllProducts")
    public JAXBElement<GetAllProducts> createGetAllProducts(GetAllProducts value) {
        return new JAXBElement<GetAllProducts>(_GetAllProducts_QNAME, GetAllProducts.class, null, value);
    }

}
