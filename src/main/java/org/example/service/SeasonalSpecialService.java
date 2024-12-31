package org.example.service;

import org.example.model.SeasonalSpecial;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;


public class SeasonalSpecialService {

    private List<SeasonalSpecial> specials = new ArrayList<>();

    public void addSpecial(SeasonalSpecial special) {
        specials.add(special);
    }

    public void checkAndApplySpecials() {
        for (SeasonalSpecial special : specials) {
            if (special.isActive()) {
                System.out.println("Active Seasonal Special: " + special.getDescription() + " - Discount: " + special.
                        getDiscountPercentage() + "%");
            }
        }
    }

    public static void main(String[] args) {

        SeasonalSpecial special = new SeasonalSpecial("Winter Sale: 20% off on all toppings", new Date
                (2024, 12, 1), new Date(2024, 12, 31), 20);


        SeasonalSpecialService service = new SeasonalSpecialService();
        service.addSpecial(special);


        service.checkAndApplySpecials();
    }


}
