/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companyproducts;

/**
 *
 * @author Samkelo Tshabalala
 */
public class ReportData {
    
    //Varibles required for product report
    private static String supplier,code,name,category,warranty;
    private static int levels, totalStockLevel, totalProductCount;
    private static double price, totalPrice;

    //get and set methods to capture report details
    public static String getSupplier() {
        return supplier;
    }

    public static void setSupplier(String supplier) {
        ReportData.supplier = supplier;
    }

    public static String getCode() {
        return code;
    }

    public static void setCode(String code) {
        ReportData.code = code;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        ReportData.name = name;
    }

    public static String getCategory() {
        return category;
    }

    public static void setCategory(String category) {
        ReportData.category = category;
    }

    public static String getWarranty() {
        return warranty;
    }

    public static void setWarranty(String warranty) {
        ReportData.warranty = warranty;
    }

    public static int getLevels() {
        return levels;
    }

    public static void setLevels(int levels) {
        ReportData.levels = levels;
    }

    public static int getTotalStockLevel() {
        return totalStockLevel;
    }

    public static void setTotalStockLevel(int totalStockLevel) {
        ReportData.totalStockLevel = totalStockLevel;
    }

    public static int getTotalProductCount() {
        return totalProductCount;
    }

    public static void setTotalProductCount(int totalProductCount) {
        ReportData.totalProductCount = totalProductCount;
    }

    public static double getPrice() {
        return price;
    }

    public static void setPrice(double price) {
        ReportData.price = price;
    }

    public static double getTotalPrice() {
        return totalPrice;
    }

    public static void setTotalPrice(double totalPrice) {
        ReportData.totalPrice = totalPrice;
    }
    
    
}
