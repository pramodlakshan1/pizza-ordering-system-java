package org.example.chain;

import org.example.model.Customization;
import org.example.model.Pizza;

public abstract class CustomizationHandler {

    protected CustomizationHandler nextHandler;

    public void setNextHandler(CustomizationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleCustomization(Pizza pizza, Customization customization);

}
