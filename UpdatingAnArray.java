/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class UpdatingAnArray {
    public static void main(String[] args) {
        int[] arr=new int[4];
                    Scanner sc=new Scanner(System.in);

//        Insertion
        for(int i=0;i<4;i++){
            arr[i]=sc.nextInt();
        }
//        Traversing
//        System.out.println("Array ");
//        for(int i=0;i<4;i++){
//            System.out.println(arr[i]);
//        }
//        Updation in an array
        int m=1;
        System.out.println("Enter Element to update ");
        m=sc.nextInt();
        for(int i=0;i<4;i++){
            if(m==arr[i]){
                arr[i]=sc.nextInt();
            }
        }
        System.out.println("Updated Array is: ");
        for(int i=0;i<4;i++){
            System.out.println(arr[i]);
        }
        
    }
}
