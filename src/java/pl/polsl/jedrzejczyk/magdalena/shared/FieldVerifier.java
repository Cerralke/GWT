/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.jedrzejczyk.magdalena.shared;

/**
 * Verifies if all fields are fullfilled. Created for client side validation.
 * @author Jędrzejczyk Magdalena
 * @version 1.0
 */
public class FieldVerifier {

    /**
     * verifies if field has value given and if this value is not null
     * @param value input of textbox
     * @return false if field is empty or its value is equal to null
     */
    public static boolean isValid(String value) {
        if (value == null) {
            return false;
        }
        return value.length() > 0;
    }
}
