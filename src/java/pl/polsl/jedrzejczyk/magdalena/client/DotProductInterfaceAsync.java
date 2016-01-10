/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.jedrzejczyk.magdalena.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 *
 * @author CerroMeetsJava
 */
public interface DotProductInterfaceAsync {

    public void myMethod(String text, String text0, String text1, String text2, String text3, String text4, AsyncCallback<String> callback);
    
}
