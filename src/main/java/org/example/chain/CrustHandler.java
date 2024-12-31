package org.example.chain;


import org.example.model.Customization;
import org.example.model.Pizza;

public class CrustHandler extends CustomizationHandler {

    @Override
    public void handleCustomization(Pizza pizza, Customization customization) {
        if (customization.getCrust() != null) {
            pizza.setCrust(customization.getCrust());
            System.out.println("Crust set to: " + customization.getCrust());
        }


        if (nextHandler != null) {
            nextHandler.handleCustomization(pizza, customization);
        }
    }
}
