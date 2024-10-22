/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jjg.cliorderlinuxjjg;

import java.util.Date;

/**
 *
 * @author juljimgar
 */
public class Order {
    private Date date;
    private String takeOrRest;
    private int tableNumber;
    private String customerName;
    private String emailCustomer;
    private String customerComments;
    private double  grandTotal;
    private String paymentMethod;
    private int tipping;
    private String request;

    public Order(Date date, String takeorRest, int tableNumber, String customerName, String emailCustomer, String customerComments, double grandTotal, String paymentMethod, int tipping, String request) {
        this.date =date; 
        this.takeOrRest = takeorRest;
        this.tableNumber = tableNumber;
        this.customerName = customerName;
        this.emailCustomer = emailCustomer;
        this.customerComments = customerComments;
        this.grandTotal = grandTotal;
        this.paymentMethod = paymentMethod;
        this.tipping = tipping;
        this.request = request;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTakeOrRest() {
        return takeOrRest;
    }

    public void setTakeOrRest(String takeOrRest) {
        this.takeOrRest = takeOrRest;
    }
    
   

    public String getTakeorRest() {
        return takeOrRest;
    }

    public void setTakeorRest(String takeorRest) {
        this.takeOrRest = takeorRest;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getCustomerComments() {
        return customerComments;
    }

    public void setCustomerComments(String customerComments) {
        this.customerComments = customerComments;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getTipping() {
        return tipping;
    }

    public void setTipping(int tipping) {
        this.tipping = tipping;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }
    
    
    
}
