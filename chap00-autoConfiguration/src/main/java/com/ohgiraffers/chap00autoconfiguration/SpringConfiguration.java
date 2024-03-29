package com.ohgiraffers.chap00autoconfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Configuration
public class SpringConfiguration {

    @Value("${test.value}")
    public String value;

    @Value("${test.list}")
//    public List<String> list;
    private String[] list;

    @Value("${test.greeting}")
    private String greeting;

    @Value("${test.array}")
    private Set<String> array;


    @Value("${username}")
    private String username;



    @Bean
    public Object propertyReadTest() {

        System.out.println("vlaue : " + value);
        for (String listValue : list) {
            System.out.println("listValue : " + listValue);
        }


        System.out.println("greeting : " + greeting);


        Iterator<String> iter = array.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


        System.out.println(username);



        return new Object();
    }
}
