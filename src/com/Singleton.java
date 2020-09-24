package com;

import java.util.HashMap;

/**
 * @Author: 王文
 * @Date: 2020/9/21 14:07
 * @Version: 1.0
 * @Description:
 */

public class Singleton {
     private volatile static Singleton singleton;
     private Singleton(){

     }
     public static Singleton getUniqueInstance() {
         if (singleton==null){
             synchronized (Singleton.class){
                 if (singleton==null){
                     singleton=new Singleton();
                 }
             }
         }
         return singleton;
     }
}
