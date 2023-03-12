/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reflection;

import java.lang.annotation.Inherited;

/**
 *
 * @author Ilia_Dukhov
 */
//@Invoke
public class A {
    private int a;
    private double aa;
    @Testik(Test.class)//we tell that this methods must be checked by Test.class
    public void test(int x){
        System.out.println("Class A parametr is --> " + x);
    }
    @Testik(Test.class)
    public void test(String x){
        System.out.println("Class A parametr is --> " + x);
    }
    @Testik(Test.class)
    public void test(){
        System.out.println("Class A parametr is --> ");
    }
}

