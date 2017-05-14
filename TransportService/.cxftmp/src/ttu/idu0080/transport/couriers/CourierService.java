package ttu.idu0080.transport.couriers;

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
 * 2017-05-14T14:57:24.086+03:00
 * Generated source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://server.order.idu0080.ttu/", name = "CourierService")
@XmlSeeAlso({ObjectFactory.class})
public interface CourierService {

    @WebMethod
    @Action(input = "http://server.order.idu0080.ttu/CourierService/getCouriersByAddressRequest", output = "http://server.order.idu0080.ttu/CourierService/getCouriersByAddressResponse")
    @RequestWrapper(localName = "getCouriersByAddress", targetNamespace = "http://server.order.idu0080.ttu/", className = "ttu.idu0080.transport.couriers.GetCouriersByAddress")
    @ResponseWrapper(localName = "getCouriersByAddressResponse", targetNamespace = "http://server.order.idu0080.ttu/", className = "ttu.idu0080.transport.couriers.GetCouriersByAddressResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ttu.idu0080.transport.couriers.Courier> getCouriersByAddress(
        @WebParam(name = "country", targetNamespace = "")
        java.lang.String country,
        @WebParam(name = "county", targetNamespace = "")
        java.lang.String county
    );

    @WebMethod
    @Action(input = "http://server.order.idu0080.ttu/CourierService/getCourierByIdRequest", output = "http://server.order.idu0080.ttu/CourierService/getCourierByIdResponse")
    @RequestWrapper(localName = "getCourierById", targetNamespace = "http://server.order.idu0080.ttu/", className = "ttu.idu0080.transport.couriers.GetCourierById")
    @ResponseWrapper(localName = "getCourierByIdResponse", targetNamespace = "http://server.order.idu0080.ttu/", className = "ttu.idu0080.transport.couriers.GetCourierByIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ttu.idu0080.transport.couriers.Courier getCourierById(
        @WebParam(name = "courier_id", targetNamespace = "")
        int courierId
    );

    @WebMethod
    @Action(input = "http://server.order.idu0080.ttu/CourierService/getAllCouriersRequest", output = "http://server.order.idu0080.ttu/CourierService/getAllCouriersResponse")
    @RequestWrapper(localName = "getAllCouriers", targetNamespace = "http://server.order.idu0080.ttu/", className = "ttu.idu0080.transport.couriers.GetAllCouriers")
    @ResponseWrapper(localName = "getAllCouriersResponse", targetNamespace = "http://server.order.idu0080.ttu/", className = "ttu.idu0080.transport.couriers.GetAllCouriersResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ttu.idu0080.transport.couriers.Courier> getAllCouriers();
}