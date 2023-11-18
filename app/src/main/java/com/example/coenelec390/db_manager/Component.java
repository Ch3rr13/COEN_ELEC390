package com.example.coenelec390.db_manager;
import com.example.coenelec390.Utils;

import java.util.Map;

public class Component {
    private Map<String, Object> characteristics;//sdehjiodp3o

    private String tag;
    private String location;
    private String MainCategory;
    private String SubCategory;
    private String PartNumber;
    private double unitPrice;
    private int quantity;
    private double totalPrice;

    public Component(Map<String, Object> characteristics, String location, int quantity) {
        this.characteristics = characteristics;
        this.location = location;
        this.quantity = quantity;
    }
    public Component() {
        // Default constructor required for Firebase
    }
    public Component(String mainCategory, String subCategory, String partNumber, double unitPrice, int quantity,String location, Map<String, Object> characteristics) {
        this.characteristics = characteristics;
        this.location = location;
        this.MainCategory = mainCategory;
        this.SubCategory = subCategory;
        this.PartNumber = partNumber;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.totalPrice = quantity * unitPrice;
    }

    public Component(String tag, String mainCategory, String subCategory, String partNumber, double unitPrice, int quantity,String location, Map<String, Object> characteristics) {
        this.characteristics = characteristics;
        this.location = location;
        this.MainCategory = mainCategory;
        this.SubCategory = subCategory;
        this.PartNumber = partNumber;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.totalPrice = quantity * unitPrice;
        this.tag = tag;
    }


    public Map<String, Object> getCharacteristics() {
        return characteristics;
    }

    public String getLocation() {
        return location;
    }

    public String getMainCategory() {
        return MainCategory;
    }

    public String getSubCategory() {
        return SubCategory;
    }

    public String getPartNumber() {
        return PartNumber;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getTag() {
        return tag;
    }

    public void setMainCategory(String mainCategory) {
        MainCategory = mainCategory;
    }

    public void setSubCategory(String subCategory) {
        SubCategory = subCategory;
    }
    public void setPartNumber(String Partnumber) {
        PartNumber = Partnumber;
    }

    public void display(){
        StringBuilder builder = new StringBuilder();
        builder.append("Tag: ").append(tag).append("\n");
        builder.append("Location: ").append(location).append("\n");
        builder.append("Main Category: ").append(MainCategory).append("\n");
        builder.append("Sub Category: ").append(SubCategory).append("\n");
        builder.append("Part Number: ").append(PartNumber).append("\n");
        builder.append("Unit Price: ").append(unitPrice).append("\n");
        builder.append("Quantity: ").append(quantity).append("\n");
        builder.append("Total Price: ").append(totalPrice).append("\n");
        builder.append("Characteristics: ").append(characteristics).append("\n");

        Utils.print(builder.toString());
    }
    public String getComponent(){
            StringBuilder builder = new StringBuilder();
            builder.append("Tag: ").append(tag).append("\n");
            builder.append("Location: ").append(location).append("\n");
            builder.append("Main Category: ").append(MainCategory).append("\n");
            builder.append("Sub Category: ").append(SubCategory).append("\n");
            builder.append("Part Number: ").append(PartNumber).append("\n");
            builder.append("Unit Price: ").append(unitPrice).append("\n");
            builder.append("Quantity: ").append(quantity).append("\n");
            builder.append("Total Price: ").append(totalPrice).append("\n");
            builder.append("Characteristics: ").append(characteristics).append("\n");

            return builder.toString();
    }
}