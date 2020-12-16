package com.goodboy.service;

import com.goodboy.entity.Result;
import com.goodboy.util.XMLUtil;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * @author GoodBoy
 * @date 2020-11-21
 */
@WebService(serviceName = "serviceTest", targetNamespace = "http://goodboy.com")
public class WebServiceTest {
    @WebMethod(operationName = "getInfo")
    public String getResult(String esn) {
        Result result = new Result(2, "test", esn, "test", "test", "test", "test", "test", "test", "test");
        return XMLUtil.convertToXml(result);
    }

    public static void main(String[] argv) {
        Object implementor = new WebServiceTest();
        String address = "http://localhost:9000/serviceTest";
        Endpoint.publish(address, implementor);
    }
}
