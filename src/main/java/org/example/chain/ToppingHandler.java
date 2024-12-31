package org.example.chain;

import com.sun.net.httpserver.Filter;
import org.example.model.Customization;
import org.example.model.Pizza;

public class ToppingHandler extends CustomizationHandler {
    @Override
    public void handleCustomization(Pizza pizza, Customization customization) {
        if (customization.getToppings() != null) {
            pizza.setToppings(customization.getToppings());
            System.out.println("Toppings set to: " + String.join(", ", customization.getToppings()));
        }


        if (nextHandler != null) {
            nextHandler.handleCustomization(pizza, customization);
        }
    }
}
