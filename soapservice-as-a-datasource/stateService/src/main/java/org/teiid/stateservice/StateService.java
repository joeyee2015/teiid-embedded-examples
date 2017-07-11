/*
 * Copyright Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags and
 * the COPYRIGHT.txt file distributed with this work.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.teiid.stateservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import org.teiid.stateservice.jaxb.ObjectFactory;

/**
 * This class was generated by Apache CXF 2.2.6-patch-01
 * Wed Jan 19 13:44:29 EST 2011
 * Generated source version: 2.2.6-patch-01
 * 
 */
 
@WebService(targetNamespace = "http://www.teiid.org/stateService/", name = "stateService")
@XmlSeeAlso({ObjectFactory.class})
public interface StateService {

    @WebResult(name = "AllStateInfo", targetNamespace = "")
    @RequestWrapper(localName = "GetAllStateInfo", targetNamespace = "http://www.teiid.org/stateService/", className = "org.teiid.stateservice.GetAllStateInfo")
    @ResponseWrapper(localName = "GetAllStateInfoResponse", targetNamespace = "http://www.teiid.org/stateService/", className = "org.teiid.stateservice.GetAllStateInfoResponse")
    @WebMethod(operationName = "GetAllStateInfo", action = "http://www.teiid.org/stateService/GetStateInfo")
    public java.util.List<org.teiid.stateservice.jaxb.StateInfo> getAllStateInfo();

    @WebResult(name = "StateInfo", targetNamespace = "")
    @RequestWrapper(localName = "GetStateInfo", targetNamespace = "http://www.teiid.org/stateService/", className = "org.teiid.stateservice.GetStateInfo")
    @ResponseWrapper(localName = "GetStateInfoResponse", targetNamespace = "http://www.teiid.org/stateService/", className = "org.teiid.stateservice.GetStateInfoResponse")
    @WebMethod(operationName = "GetStateInfo", action = "http://www.teiid.org/stateService/GetStateInfo")
    public org.teiid.stateservice.jaxb.StateInfo getStateInfo(
        @WebParam(name = "stateCode", targetNamespace = "")
        java.lang.String stateCode
    ) throws GetStateInfoFault_Exception;
}
