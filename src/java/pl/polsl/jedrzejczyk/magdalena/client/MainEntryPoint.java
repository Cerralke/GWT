/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.jedrzejczyk.magdalena.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;

/**
 *
 * @author CerroMeetsJava
 */
public class MainEntryPoint implements EntryPoint {

    @Override
    public void onModuleLoad() {

        RootPanel.get().add(new ProductCalc());

    }
}
