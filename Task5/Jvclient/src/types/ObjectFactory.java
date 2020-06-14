
package types;

import types.ListOfTable;
import types.Table;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import service.endpoint.DelDogovor;
import service.endpoint.DelDogovorResponse;
import service.endpoint.GetAllTovar;
import service.endpoint.GetAllTovarResponse;
import service.endpoint.GetNumber;
import service.endpoint.GetNumberResponse;
import service.endpoint.SetNewDogovor;
import service.endpoint.SetNewDogovorResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service.endpoint package. 
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

    private final static QName _GetNumber_QNAME = new QName("http://endpoint.service/", "getNumber");
    private final static QName _SetNewDogovorResponse_QNAME = new QName("http://endpoint.service/", "setNewDogovorResponse");
    private final static QName _DelDogovorResponse_QNAME = new QName("http://endpoint.service/", "delDogovorResponse");
    private final static QName _GetNumberResponse_QNAME = new QName("http://endpoint.service/", "getNumberResponse");
    private final static QName _DelDogovor_QNAME = new QName("http://endpoint.service/", "delDogovor");
    private final static QName _SetNewDogovor_QNAME = new QName("http://endpoint.service/", "setNewDogovor");
    private final static QName _GetAllTovarResponse_QNAME = new QName("http://endpoint.service/", "getAllTovarResponse");
    private final static QName _GetAllTovar_QNAME = new QName("http://endpoint.service/", "getAllTovar");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service.endpoint
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetNumber }
     * 
     */
    public GetNumber createGetNumber() {
        return new GetNumber();
    }

    /**
     * Create an instance of {@link SetNewDogovorResponse }
     * 
     */
    public SetNewDogovorResponse createSetNewDogovorResponse() {
        return new SetNewDogovorResponse();
    }

    /**
     * Create an instance of {@link DelDogovorResponse }
     * 
     */
    public DelDogovorResponse createDelDogovorResponse() {
        return new DelDogovorResponse();
    }

    /**
     * Create an instance of {@link SetNewDogovor }
     * 
     */
    public SetNewDogovor createSetNewDogovor() {
        return new SetNewDogovor();
    }

    /**
     * Create an instance of {@link GetNumberResponse }
     * 
     */
    public GetNumberResponse createGetNumberResponse() {
        return new GetNumberResponse();
    }

    /**
     * Create an instance of {@link DelDogovor }
     * 
     */
    public DelDogovor createDelDogovor() {
        return new DelDogovor();
    }

    /**
     * Create an instance of {@link GetAllTovar }
     * 
     */
    public GetAllTovar createGetAllTovar() {
        return new GetAllTovar();
    }

    /**
     * Create an instance of {@link GetAllTovarResponse }
     * 
     */
    public GetAllTovarResponse createGetAllTovarResponse() {
        return new GetAllTovarResponse();
    }

    /**
     * Create an instance of {@link ListOfTable }
     * 
     */
    public ListOfTable createListOfTable() {
        return new ListOfTable();
    }

    /**
     * Create an instance of {@link Table }
     * 
     */
    public Table createTable() {
        return new Table();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getNumber")
    public JAXBElement<GetNumber> createGetNumber(GetNumber value) {
        return new JAXBElement<GetNumber>(_GetNumber_QNAME, GetNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNewDogovorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "setNewDogovorResponse")
    public JAXBElement<SetNewDogovorResponse> createSetNewDogovorResponse(SetNewDogovorResponse value) {
        return new JAXBElement<SetNewDogovorResponse>(_SetNewDogovorResponse_QNAME, SetNewDogovorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelDogovorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "delDogovorResponse")
    public JAXBElement<DelDogovorResponse> createDelDogovorResponse(DelDogovorResponse value) {
        return new JAXBElement<DelDogovorResponse>(_DelDogovorResponse_QNAME, DelDogovorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getNumberResponse")
    public JAXBElement<GetNumberResponse> createGetNumberResponse(GetNumberResponse value) {
        return new JAXBElement<GetNumberResponse>(_GetNumberResponse_QNAME, GetNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelDogovor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "delDogovor")
    public JAXBElement<DelDogovor> createDelDogovor(DelDogovor value) {
        return new JAXBElement<DelDogovor>(_DelDogovor_QNAME, DelDogovor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNewDogovor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "setNewDogovor")
    public JAXBElement<SetNewDogovor> createSetNewDogovor(SetNewDogovor value) {
        return new JAXBElement<SetNewDogovor>(_SetNewDogovor_QNAME, SetNewDogovor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTovarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getAllTovarResponse")
    public JAXBElement<GetAllTovarResponse> createGetAllTovarResponse(GetAllTovarResponse value) {
        return new JAXBElement<GetAllTovarResponse>(_GetAllTovarResponse_QNAME, GetAllTovarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTovar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getAllTovar")
    public JAXBElement<GetAllTovar> createGetAllTovar(GetAllTovar value) {
        return new JAXBElement<GetAllTovar>(_GetAllTovar_QNAME, GetAllTovar.class, null, value);
    }

}
