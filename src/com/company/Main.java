package com.company;
public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(ageAndTemperature(18,35));
        System.out.println(ageAndTemperature(18,20));
        System.out.println(ageAndTemperature(10,35));
        System.out.println(ageAndTemperature(18,5));
        System.out.println(ageAndTemperature(0,5));
    }

    public static String ageAndTemperature(int age, int temperature) {
        if ((age > 20 && age < 45) && (temperature > -20 && temperature < 30)){
            System.out.println("You can go for a walk");
        }else if ((age < 20) && (temperature >= 0 && temperature < 28)){
            System.out.println("You can go for a walk");
        }else if ((age > 45) && (temperature >= -10 && temperature < 25)){
            System.out.println("You can go for a walk");
        }else{
            System.out.println("Stay at home");
        }
        return "Age = " + age + " temperature = " + temperature;



        }
    }





