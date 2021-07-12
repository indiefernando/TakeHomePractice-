package com.fego;

import java.util.Arrays;

public class LargestExample {

    public static void main(String[] args) {



        int [] arr = new int[]{1,2,3,4,2,5,1,66,3,8};

        int largest = arr[0];

        for(int i = 0; i < arr.length; i++){
            if ( arr[i] > largest){
                largest = arr[i];
            }
        }

        System.out.println(largest);


    }



}