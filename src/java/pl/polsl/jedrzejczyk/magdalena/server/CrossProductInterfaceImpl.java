/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.jedrzejczyk.magdalena.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import pl.polsl.jedrzejczyk.magdalena.client.CrossProductInterface;

/**
 *
 * @author CerroMeetsJava
 */
public class CrossProductInterfaceImpl extends RemoteServiceServlet implements CrossProductInterface {
    
    public String myMethod(String sa1,String sb1,String sa2,String sb2,String sa3,String sb3) {
        Double a1,a2,a3,b1,b2,b3;
        a1 = Double.parseDouble(sa1);
        a2 = Double.parseDouble(sa2);
        a3 = Double.parseDouble(sa3);
        b1 = Double.parseDouble(sb1);
        b2 = Double.parseDouble(sb2);
        b3 = Double.parseDouble(sb3);
        Double cross1 = a2 * b3 - a3 * b2;
        Double cross2 = a3 * b1 - a1 * b3;
        Double cross3 = a1 * b2 - a2 * b1;
        return "" + cross1 + "; " + cross2 + "; " + cross3 + "; ";
    }
    
}
