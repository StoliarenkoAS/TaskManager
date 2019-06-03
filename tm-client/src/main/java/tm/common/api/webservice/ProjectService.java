package tm.common.api.webservice;

import javax.annotation.Generated;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.2
 * 2019-06-03T15:21:21.185+03:00
 * Generated source version: 3.3.2
 *
 */
@WebService(targetNamespace = "http://webservice.api.common.tm/", name = "projectService")
@XmlSeeAlso({ObjectFactory.class})
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T15:21:21.185+03:00", comments = "Apache CXF 3.3.2")
public interface ProjectService {

    @WebMethod
    @Action(input = "http://webservice.api.common.tm/projectService/deleteProjectsByNameRequest", output = "http://webservice.api.common.tm/projectService/deleteProjectsByNameResponse")
    @RequestWrapper(localName = "deleteProjectsByName", targetNamespace = "http://webservice.api.common.tm/", className = "tm.common.api.webservice.DeleteProjectsByName")
    @ResponseWrapper(localName = "deleteProjectsByNameResponse", targetNamespace = "http://webservice.api.common.tm/", className = "tm.common.api.webservice.DeleteProjectsByNameResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T15:21:21.185+03:00")
    public java.lang.Boolean deleteProjectsByName(

        @WebParam(name = "arg0", targetNamespace = "")
        tm.common.api.webservice.Session arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );

    @WebMethod
    @Action(input = "http://webservice.api.common.tm/projectService/searchProjectRequest", output = "http://webservice.api.common.tm/projectService/searchProjectResponse")
    @RequestWrapper(localName = "searchProject", targetNamespace = "http://webservice.api.common.tm/", className = "tm.common.api.webservice.SearchProject")
    @ResponseWrapper(localName = "searchProjectResponse", targetNamespace = "http://webservice.api.common.tm/", className = "tm.common.api.webservice.SearchProjectResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T15:21:21.185+03:00")
    public java.util.List<tm.common.api.webservice.Project> searchProject(

        @WebParam(name = "arg0", targetNamespace = "")
        tm.common.api.webservice.Session arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );

    @WebMethod
    @Action(input = "http://webservice.api.common.tm/projectService/getProjectByIdRequest", output = "http://webservice.api.common.tm/projectService/getProjectByIdResponse")
    @RequestWrapper(localName = "getProjectById", targetNamespace = "http://webservice.api.common.tm/", className = "tm.common.api.webservice.GetProjectById")
    @ResponseWrapper(localName = "getProjectByIdResponse", targetNamespace = "http://webservice.api.common.tm/", className = "tm.common.api.webservice.GetProjectByIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T15:21:21.185+03:00")
    public tm.common.api.webservice.Project getProjectById(

        @WebParam(name = "arg0", targetNamespace = "")
        tm.common.api.webservice.Session arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );

    @WebMethod
    @Action(input = "http://webservice.api.common.tm/projectService/deleteAllProjectsRequest", output = "http://webservice.api.common.tm/projectService/deleteAllProjectsResponse")
    @RequestWrapper(localName = "deleteAllProjects", targetNamespace = "http://webservice.api.common.tm/", className = "tm.common.api.webservice.DeleteAllProjects")
    @ResponseWrapper(localName = "deleteAllProjectsResponse", targetNamespace = "http://webservice.api.common.tm/", className = "tm.common.api.webservice.DeleteAllProjectsResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T15:21:21.185+03:00")
    public java.lang.Boolean deleteAllProjects(

        @WebParam(name = "arg0", targetNamespace = "")
        tm.common.api.webservice.Session arg0
    );

    @WebMethod
    @Action(input = "http://webservice.api.common.tm/projectService/getProjectsByNameRequest", output = "http://webservice.api.common.tm/projectService/getProjectsByNameResponse")
    @RequestWrapper(localName = "getProjectsByName", targetNamespace = "http://webservice.api.common.tm/", className = "tm.common.api.webservice.GetProjectsByName")
    @ResponseWrapper(localName = "getProjectsByNameResponse", targetNamespace = "http://webservice.api.common.tm/", className = "tm.common.api.webservice.GetProjectsByNameResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T15:21:21.185+03:00")
    public java.util.List<tm.common.api.webservice.Project> getProjectsByName(

        @WebParam(name = "arg0", targetNamespace = "")
        tm.common.api.webservice.Session arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );

    @WebMethod
    @Action(input = "http://webservice.api.common.tm/projectService/deleteProjectTasksRequest", output = "http://webservice.api.common.tm/projectService/deleteProjectTasksResponse")
    @RequestWrapper(localName = "deleteProjectTasks", targetNamespace = "http://webservice.api.common.tm/", className = "tm.common.api.webservice.DeleteProjectTasks")
    @ResponseWrapper(localName = "deleteProjectTasksResponse", targetNamespace = "http://webservice.api.common.tm/", className = "tm.common.api.webservice.DeleteProjectTasksResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T15:21:21.185+03:00")
    public java.lang.Boolean deleteProjectTasks(

        @WebParam(name = "arg0", targetNamespace = "")
        tm.common.api.webservice.Session arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );

    @WebMethod
    @Action(input = "http://webservice.api.common.tm/projectService/deleteProjectRequest", output = "http://webservice.api.common.tm/projectService/deleteProjectResponse")
    @RequestWrapper(localName = "deleteProject", targetNamespace = "http://webservice.api.common.tm/", className = "tm.common.api.webservice.DeleteProject")
    @ResponseWrapper(localName = "deleteProjectResponse", targetNamespace = "http://webservice.api.common.tm/", className = "tm.common.api.webservice.DeleteProjectResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T15:21:21.185+03:00")
    public java.lang.Boolean deleteProject(

        @WebParam(name = "arg0", targetNamespace = "")
        tm.common.api.webservice.Session arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        tm.common.api.webservice.Project arg1
    );

    @WebMethod
    @Action(input = "http://webservice.api.common.tm/projectService/deleteProjectByIdRequest", output = "http://webservice.api.common.tm/projectService/deleteProjectByIdResponse")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "deleteProjectByIdResponse", targetNamespace = "http://webservice.api.common.tm/", partName = "parameters")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T15:21:21.185+03:00")
    public DeleteProjectResponse deleteProjectById(

        @WebParam(partName = "parameters", name = "deleteProjectById", targetNamespace = "http://webservice.api.common.tm/")
        DeleteProject parameters
    );

    @WebMethod
    @Action(input = "http://webservice.api.common.tm/projectService/getAllProjectsRequest", output = "http://webservice.api.common.tm/projectService/getAllProjectsResponse")
    @RequestWrapper(localName = "getAllProjects", targetNamespace = "http://webservice.api.common.tm/", className = "tm.common.api.webservice.GetAllProjects")
    @ResponseWrapper(localName = "getAllProjectsResponse", targetNamespace = "http://webservice.api.common.tm/", className = "tm.common.api.webservice.GetAllProjectsResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T15:21:21.185+03:00")
    public java.util.List<tm.common.api.webservice.Project> getAllProjects(

        @WebParam(name = "arg0", targetNamespace = "")
        tm.common.api.webservice.Session arg0
    );

    @WebMethod
    @Action(input = "http://webservice.api.common.tm/projectService/getNewProjectRequest", output = "http://webservice.api.common.tm/projectService/getNewProjectResponse")
    @RequestWrapper(localName = "getNewProject", targetNamespace = "http://webservice.api.common.tm/", className = "tm.common.api.webservice.GetNewProject")
    @ResponseWrapper(localName = "getNewProjectResponse", targetNamespace = "http://webservice.api.common.tm/", className = "tm.common.api.webservice.GetNewProjectResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T15:21:21.185+03:00")
    public tm.common.api.webservice.Project getNewProject()
;

    @WebMethod
    @Action(input = "http://webservice.api.common.tm/projectService/getProjectsByNameSortedRequest", output = "http://webservice.api.common.tm/projectService/getProjectsByNameSortedResponse")
    @RequestWrapper(localName = "getProjectsByNameSorted", targetNamespace = "http://webservice.api.common.tm/", className = "tm.common.api.webservice.GetProjectsByNameSorted")
    @ResponseWrapper(localName = "getProjectsByNameSortedResponse", targetNamespace = "http://webservice.api.common.tm/", className = "tm.common.api.webservice.GetProjectsByNameSortedResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T15:21:21.185+03:00")
    public java.util.List<tm.common.api.webservice.Project> getProjectsByNameSorted(

        @WebParam(name = "arg0", targetNamespace = "")
        tm.common.api.webservice.Session arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        tm.common.api.webservice.ComparatorType arg2
    );

    @WebMethod
    @Action(input = "http://webservice.api.common.tm/projectService/deleteProjectsByIdsRequest", output = "http://webservice.api.common.tm/projectService/deleteProjectsByIdsResponse")
    @RequestWrapper(localName = "deleteProjectsByIds", targetNamespace = "http://webservice.api.common.tm/", className = "tm.common.api.webservice.DeleteProjectsByIds")
    @ResponseWrapper(localName = "deleteProjectsByIdsResponse", targetNamespace = "http://webservice.api.common.tm/", className = "tm.common.api.webservice.DeleteProjectsByIdsResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T15:21:21.185+03:00")
    public java.lang.Boolean deleteProjectsByIds(

        @WebParam(name = "arg0", targetNamespace = "")
        tm.common.api.webservice.Session arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.util.List<java.lang.String> arg1
    );

    @WebMethod
    @Action(input = "http://webservice.api.common.tm/projectService/saveProjectRequest", output = "http://webservice.api.common.tm/projectService/saveProjectResponse")
    @RequestWrapper(localName = "saveProject", targetNamespace = "http://webservice.api.common.tm/", className = "tm.common.api.webservice.SaveProject")
    @ResponseWrapper(localName = "saveProjectResponse", targetNamespace = "http://webservice.api.common.tm/", className = "tm.common.api.webservice.SaveProjectResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T15:21:21.185+03:00")
    public java.lang.Boolean saveProject(

        @WebParam(name = "arg0", targetNamespace = "")
        tm.common.api.webservice.Session arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        tm.common.api.webservice.Project arg1
    );

    @WebMethod
    @Action(input = "http://webservice.api.common.tm/projectService/getAllProjectsSortedRequest", output = "http://webservice.api.common.tm/projectService/getAllProjectsSortedResponse")
    @RequestWrapper(localName = "getAllProjectsSorted", targetNamespace = "http://webservice.api.common.tm/", className = "tm.common.api.webservice.GetAllProjectsSorted")
    @ResponseWrapper(localName = "getAllProjectsSortedResponse", targetNamespace = "http://webservice.api.common.tm/", className = "tm.common.api.webservice.GetAllProjectsSortedResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T15:21:21.185+03:00")
    public java.util.List<tm.common.api.webservice.Project> getAllProjectsSorted(

        @WebParam(name = "arg0", targetNamespace = "")
        tm.common.api.webservice.Session arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        tm.common.api.webservice.ComparatorType arg1
    );
}
