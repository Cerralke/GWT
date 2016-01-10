/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.jedrzejczyk.magdalena.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 *
 * @author CerroMeetsJava
 */
public class ProductCalc extends VerticalPanel {
    
    final Label serverReply = new Label();
    final TextBox a1 = new TextBox();
    final TextBox b1 = new TextBox();
    final TextBox a2 = new TextBox();
    final TextBox b2 = new TextBox();
    final TextBox a3 = new TextBox();
    final TextBox b3 = new TextBox();
    final Button btnCalc = new Button("Calculate dot product");
    final Button btnCalc2 = new Button("Calculate cross product");
    
    public ProductCalc() {
        
        add(new Label("Give values to calculate: "));
        add(a1);
        add(b1);
        add(a2);
        add(b2);
        add(a3);
        add(b3);
        add(btnCalc);
        add(btnCalc2);
        add(serverReply);
        
        final AsyncCallback<String> callback = new AsyncCallback<String>() {
            @Override
            public void onSuccess(String result) {
                serverReply.setText("Result: " + result);
            }
            
            @Override
            public void onFailure(Throwable caught) {
                serverReply.setText("Communication failed");
            }
        };
        
        btnCalc.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                // Make remote call. Control flow will continue immediately and later
                // 'callback' will be invoked when the RPC completes.
                getService().myMethod(a1.getText(),b1.getText(),a2.getText(),b2.getText(),a3.getText(),
                        b3.getText(), callback);
            }
        });
        
        btnCalc2.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                getService().myMethod2(a1.getText(),b1.getText(),a2.getText(),b2.getText(),a3.getText(),
                        b3.getText(), callback);
            }
        });
    }
        
    public static ProductCalcInterfaceAsync getService() {
        return GWT.create(ProductCalcInterface.class);
    }
}
