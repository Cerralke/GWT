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
import pl.polsl.jedrzejczyk.magdalena.shared.FieldVerifier;

/**
 * Creates table for given parameters. Creates buttons to send datas. Calls proper services.
 * @author Jędrzejczyk Magdalena
 * @version 1.0
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

    /**
     * Creates form for product calculation. Creates buttons with events' handlers.
     */
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

            public void onSuccess(String result) {
                serverReply.setText("Result: " + result);
            }

            public void onFailure(Throwable caught) {
                serverReply.setText("Calculation failed");
            }
        };

        btnCalc.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                if (FieldVerifier.isValid(a1.getText()) && FieldVerifier.isValid(a2.getText())
                        && FieldVerifier.isValid(a3.getText()) && FieldVerifier.isValid(b1.getText())
                        && FieldVerifier.isValid(b2.getText()) && FieldVerifier.isValid(b3.getText())) {
                    getDotService().dotProductCalc(a1.getText(), b1.getText(), a2.getText(), b2.getText(), a3.getText(),
                            b3.getText(), callback);
                } else {
                    serverReply.setText("Please fulfill all fields.");
                }
            }
        });

        btnCalc2.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                if (FieldVerifier.isValid(a1.getText()) && FieldVerifier.isValid(a2.getText())
                        && FieldVerifier.isValid(a3.getText()) && FieldVerifier.isValid(b1.getText())
                        && FieldVerifier.isValid(b2.getText()) && FieldVerifier.isValid(b3.getText())) {
                    getCrossService().crossProductCalc(a1.getText(), b1.getText(), a2.getText(), b2.getText(), a3.getText(),
                            b3.getText(), callback);
                } else {
                    serverReply.setText("Please fulfill all fields.");
                }
            }
        });
    }

    /**
     * Calls service for dot product calculation.
     * @return result
     */
    public static DotProductInterfaceAsync getDotService() {
        return GWT.create(DotProductInterface.class);
    }

    /**
     * Calls service for cross product calculation.
     * @return result
     */
    public static CrossProductInterfaceAsync getCrossService() {
        return GWT.create(CrossProductInterface.class);
    }
}
