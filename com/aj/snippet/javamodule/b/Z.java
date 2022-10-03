package com.aj.snippet.javamodule.b;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//import com.aj.snippet.javamodule.a.A; 
//This is not allowed as A has default access modifier

import com.aj.snippet.javamodule.a.B;
//This is allowed as B has public access modifier

public class Z {
    void testMethod() {
        try {
            Class x = Class.forName("com.aj.snippet.javamodule.a.A");
            // But we can access the class A using reflection
            Field[] fields = x.getFields();
            Method[] methods = x.getMethods();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }    
}
