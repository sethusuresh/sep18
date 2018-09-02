package com.king.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import org.springframework.util.ObjectUtils;

public class TestAlgs {
	public static void main(String[] args) {
		//staircase
		int n=5;
		int k =n;
        for(int j=0; j<k; j++){
             StringBuilder str = new StringBuilder();
            for(int i=1;i<=k;i++){
                if(i<n){
                    str.append("");
                }else{
                    str.append("#");
                }
                        
            }
            
                System.out.println(str);
                n=n-1;      
        }
        //max and min sum
		int[] arr ={140638725, 436257910, 953274816, 734065819, 362748590};
		for(int i=0;i<arr.length;i++){
            
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int s = arr[j];
                    arr[j]= arr[i];
                    arr[i]=s;
                }
            }
        }
		for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
        }
        Long min = (long) (arr[0])+ (long) (arr[1])+ (long) (arr[2])+ (long) (arr[3]);
        Long max = (long) (arr[1])+ (long) (arr[2])+ (long) (arr[3])+(long) (arr[4]);
        System.out.println(min.toString()+"  "+max.toString());
        System.out.println(min+"  "+max);
        //tallest candle-find occurrence of largest num in an array
        int[] ar ={1, 5, 6, 7, 7};
        for(int i=0;i<ar.length;i++){
            
            for(int j=i+1;j<ar.length;j++){
                if(ar[i]>ar[j]){
                    int m = ar[j];
                    ar[j]= ar[i];
                    ar[i]=m;
                }
            }
        }
        int count=1;
        for(int i=0;i<ar.length-1;i++){
       
        	if(ar[i]==ar[ar.length-1]){
        		count =count+1;
        	}
        }
        System.out.println(count);
      //tallest candle - 2nd method
    	Integer[] ever = IntStream.of( ar ).boxed().toArray( Integer[]::new );
    	List<Integer> arList = Arrays.asList(ever);
    	int maxVal=Collections.max(arList);
    	 int count1=0;
         for(int i=0;i<ar.length;i++){
        
         	if(ar[i]==maxVal){
         		count1 =count1+1;
         	}
         }
    		
         System.out.println(count1);
	}
	

}
