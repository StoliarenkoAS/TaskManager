package tm.server.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.annotation.Generated;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;
import tm.common.api.webservice.ServerService;

/**
 * This class was generated by Apache CXF 3.3.2
 * 2019-06-03T15:21:21.623+03:00
 * Generated source version: 3.3.2
 *
 */
@WebServiceClient(name = "ServerWebServiceBeanService",
                  wsdlLocation = "http://localhost:8080/serverService/?wsdl",
                  targetNamespace = "http://webservice.server.tm/")
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T15:21:21.623+03:00", comments = "Apache CXF 3.3.2")
public class ServerWebServiceBeanService extends Service {

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T15:21:21.623+03:00")
    public final static URL WSDL_LOCATION;

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T15:21:21.623+03:00")
    public final static QName SERVICE = new QName("http://webservice.server.tm/", "ServerWebServiceBeanService");
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T15:21:21.623+03:00")
    public final static QName ServerWebServiceBeanPort = new QName("http://webservice.server.tm/", "ServerWebServiceBeanPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/serverService/?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ServerWebServiceBeanService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/serverService/?wsdl");
        }
        WSDL_LOCATION = url;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T15:21:21.623+03:00")
    public ServerWebServiceBeanService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T15:21:21.623+03:00")
    public ServerWebServiceBeanService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T15:21:21.623+03:00")
    public ServerWebServiceBeanService() {
        super(WSDL_LOCATION, SERVICE);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T15:21:21.623+03:00")
    public ServerWebServiceBeanService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T15:21:21.623+03:00")
    public ServerWebServiceBeanService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T15:21:21.623+03:00")
    public ServerWebServiceBeanService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ServerService
     */
    @WebEndpoint(name = "ServerWebServiceBeanPort")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T15:21:21.623+03:00")
    public ServerService getServerWebServiceBeanPort() {
        return super.getPort(ServerWebServiceBeanPort, ServerService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServerService
     */
    @WebEndpoint(name = "ServerWebServiceBeanPort")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T15:21:21.623+03:00")
    public ServerService getServerWebServiceBeanPort(WebServiceFeature... features) {
        return super.getPort(ServerWebServiceBeanPort, ServerService.class, features);
    }

}
