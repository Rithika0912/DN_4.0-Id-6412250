//package com.cognizant.spring_learn;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//public class SpringLearnApplication {
//
//    public static void main(String[] args) {
////        displayDate();
////        displayCountry();
//        SpringApplication.run(SpringLearnApplication.class, args);
//
//    }
//
//    public static void displayDate() {
//        // Load date-format.xml from classpath
//        ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
//
//        // Get SimpleDateFormat bean
//        SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
//
//        try {
//            // Parse the given date string
//            Date date = format.parse("31/12/2018");
//            System.out.println("Parsed Date: " + date);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//    }
//    public static void displayCountry() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
//
//        Country country = context.getBean("country", Country.class);
//
//        System.out.println("Country Details: " + country);
//    }
//
//}
package com.cognizant.spring_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringLearnApplication.class, args);
    }
}


