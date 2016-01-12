/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.jedrzejczyk.magdalena.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * Client side part of cross product calculation service.
 * @author Jędrzejczyk Magdalena
 * @version 1.0
 */
@RemoteServiceRelativePath("crossproduct")
public interface CrossProductInterface extends RemoteService {

    /**
     * Calculates cross product.
     * @param sa1 first vector x value
     * @param sb1 first vector y value
     * @param sa2 first vector z value
     * @param sb2 second vector x value
     * @param sa3 second vector y value
     * @param sb3 second vector z value
     * @return result
     */
    public String crossProductCalc(String sa1,String sb1,String sa2,String sb2,String sa3,String sb3);

}
