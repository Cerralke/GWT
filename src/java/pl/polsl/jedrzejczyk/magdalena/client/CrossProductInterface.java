/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.jedrzejczyk.magdalena.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 *
 * @author CerroMeetsJava
 */
@RemoteServiceRelativePath("crossproduct")
public interface CrossProductInterface extends RemoteService {

    public String myMethod(String sa1,String sb1,String sa2,String sb2,String sa3,String sb3);

}