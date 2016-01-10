/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.jedrzejczyk.magdalena.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dev.asm.Label;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

/**
 *
 * @author CerroMeetsJava
 */
public class MainEntryPoint implements EntryPoint {
    
    //private static final String SERVER_ERROR = "An error occurred while attempting to contact the server";
    
    //private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);
    
    @Override
    public void onModuleLoad() {
        final Button sendButton = new Button("Dot product");
        final Button sendButton2 = new Button("Cross product");
        final TextBox nameField = new TextBox();
        //final Label errorLabel = new Label();
        
        RootPanel.get("nameFieldContainer").add(nameField);
        RootPanel.get("sendButtonContainer").add(sendButton);
        RootPanel.get("sendButtonContainer2").add(sendButton2);
        //RootPanel.get("errorLabelContainer").add(errorLabel);
        
        RootPanel.get().add(new ProductCalc());
    }
}
