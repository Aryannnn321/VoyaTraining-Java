package com.util.list;

public class Customer {
    private  String Customername;
    private String Customerid;
    private String CustomerCity;

    public Customer() {
    }

    public Customer(String customername, String customerid, String customerCity) {
        Customername = customername;
        Customerid = customerid;
        CustomerCity = customerCity;
    }

    public String getCustomername() {
        return Customername;
    }

    public void setCustomername(String customername) {
        Customername = customername;
    }

    public String getCustomerid() {
        return Customerid;
    }

    public void setCustomerid(String customerid) {
        Customerid = customerid;
    }

    public String getCustomerCity() {
        return CustomerCity;
    }

    public void setCustomerCity(String customerCity) {
        CustomerCity = customerCity;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Customername='" + Customername + '\'' +
                ", Customerid='" + Customerid + '\'' +
                ", CustomerCity='" + CustomerCity + '\'' +
                '}';
    }
}
