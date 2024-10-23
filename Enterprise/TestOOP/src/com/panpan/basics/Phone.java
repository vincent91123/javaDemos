package com.panpan.basics;

import java.util.Objects;

/**
 * @author panpan
 * @create 2024-08-21-下午 02:59
 */
public class Phone {


    int year;
    double price;
    String brand;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Phone() {
    }

    public Phone(int year, double price, String brand) {
        this.year = year;
        this.price = price;
        this.brand = brand;
    }

/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return year == phone.year && Double.compare(price, phone.price) == 0 && Objects.equals(brand, phone.brand);
    }*/

    public boolean equals(Object object) {
        if (object instanceof Phone){ //instansof 判断a 是否是 类b  的实例，如果是返回true 不是则返回false
            Phone other=(Phone)object;
            if(this.year==other.year&&this.price==other.price&&this.brand.equals(other.brand))
                return true;
        }
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, price, brand);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "year=" + year +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }

    public Phone(int year, String brand) {
        this.year = year;
        this.brand = brand;
    }

    public void call() {
        System.out.println("call");
    }

}
