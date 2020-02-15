/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 Hello dummy branch ?!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 */
package stringexample;

import java.util.StringTokenizer;

/**
 *
 * @author User
 */
public class StringExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = "abc defg hijk";
        String str2 = "Abc defg hijk";
        String str3 = "   Hello";
        System.out.println(str1.charAt(2));
        System.out.println(str1.compareTo(str3));
        System.out.println(str1.matches("(.)*jk"));
        //another way to split strings
        StringTokenizer token = new StringTokenizer(str1, " ");
        //to get each token
        for(int i=0; i<=token.countTokens()+1;i++){System.out.println(token.nextToken());}
      //  System.out.println(token.nextToken());
      //.trim removes trailing whitespaces
        

    }
    
}
