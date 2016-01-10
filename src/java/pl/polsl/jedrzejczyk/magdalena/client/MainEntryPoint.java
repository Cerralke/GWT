/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.jedrzejczyk.magdalena.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

/**
 *
 * @author CerroMeetsJava
 */
public class MainEntryPoint implements EntryPoint {
    
    private static final String SERVER_ERROR = "An error occurred while attempting to contact the server";
    
    private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);
    
    public void onModuleLoad() {
        
    }
}
