/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author eduardo
 */
@WebService(serviceName = "CalWS")
public class CalWS {

    /**
     * This is a sample web service operation
     */
//    @WebMethod(operationName = "hello")
//    public String hello(@WebParam(name = "name") String txt) {
//        return "Hello " + txt + " !";
    
    @WebMethod(operationName = "Addition")
    public String Addition(@WebParam(name = "value1") String value1,@WebParam(name = "value2") String value2 ) {
        float value=Float.valueOf(value1)+Float.valueOf(value2);
        return (Float.toString(value));
    }

    
}
