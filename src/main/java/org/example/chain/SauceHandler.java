package org.example.chain;

import com.sun.net.httpserver.Filter;
import org.example.model.Customization;
import org.example.model.Pizza;

public class SauceHandler extends CustomizationHandler {
    @Override
    public void handleCustomization(Pizza pizza, Customization customization) {
        if (customization.getSauce() != null) {
            pizza.setSauce(customization.getSauce());
            System.out.println("Sauce set to: " + customization.getSauce());
        }


        if (nextHandler != null) {
            nextHandler.handleCustomization(pizza, customization);
        }
    }
}
