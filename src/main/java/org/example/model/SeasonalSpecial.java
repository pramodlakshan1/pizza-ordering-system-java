package org.example.model;

import java.util.Date;

public class SeasonalSpecial {

    private String description;
    private Date startDate;
    private Date endDate;
    private double discountPercentage;

    public SeasonalSpecial(String description, Date startDate, Date endDate, double discountPercentage) {
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.discountPercentage = discountPercentage;
    }

    public boolean isActive() {
        Date currentDate = new Date();
        return (currentDate.after(startDate) && currentDate.before(endDate));
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "SeasonalSpecial [description=" + description + ", startDate=" + startDate + ", endDate=" + endDate + ", discountPercentage=" + discountPercentage + "]";
    }
}
