package com.bimlendu.discountCalculator.model;

public class DiscountSlab {
    private String id;
    private String lowerRange;
    private String upperRange;
    private String discount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLowerRange() {
        return lowerRange;
    }

    public void setLowerRange(String lowerRange) {
        this.lowerRange = lowerRange;
    }

    public String getUpperRange() {
        return upperRange;
    }

    public void setUpperRange(String upperRange) {
        this.upperRange = upperRange;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }
}
