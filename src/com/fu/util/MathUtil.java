/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.util;

/**
 *
 * @author DELL
 */

//class chứa những hàm toán học, tính toán gì đó giúp cho mọi nơi khác, phàm cái gì amng tính chất xài chung cho mọi nơi ta sẽ dùng kỹ thuật static
public class MathUtil {
    
    //tính dây thừa
    public static long computeFactorial(int n){
        if(n<0 || n>15){
            throw new IllegalArgumentException("Invalid Arugement");
        }
        if(n==0 || n==1 ){
            return 1;
        }    
        //đệ quy
        
        return n * computeFactorial(n-1);
    }
}
