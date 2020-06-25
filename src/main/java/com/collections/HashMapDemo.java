package com.collections;

import io.opentelemetry.correlationcontext.Entry;

import java.util.HashMap;
import java.util.Map;


public class HashMapDemo {

    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String,String>();

        // Add keys and values (Country, City)
        capitalCities.put("", "Toronto");

        capitalCities.put("", "Windsor");

        capitalCities.put("Canada", "");

        capitalCities.put("Canada", "Ontario");

//Edminton
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities.get("England"));
        System.out.println(capitalCities.get("Canada"));

        //

        for (Map.Entry m : capitalCities.entrySet())
        {
            System.out.println(m.getKey()+""+m.getValue());
        }

        System.out.println(capitalCities);

        capitalCities.remove("Norway");
        System.out.println(capitalCities);


    }
}