/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.jedrzejczyk.magdalena.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Client side async part of dot product calculation service.
 * @author Jędrzejczyk Magdalena
 * @version 1.0
 */
public interface DotProductInterfaceAsync {

    /**
     * Calculates dot product.
     * @param text first vector x value
     * @param text0 first vector y value
     * @param text1 first vector z value
     * @param text2 second vector x value
     * @param text3 second vector y value
     * @param text4 second vector z value
     * @param callback callback
     */
    public void dotProductCalc(String text, String text0, String text1, String text2, String text3, String text4, AsyncCallback<String> callback);
    
}
