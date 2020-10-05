package com.company;

import java.lang.reflect.Array;

public class ReverseAndSortFunctions {

    public static void main(String[] args) {
        int [] array = {1,17,16,15,61,2,521,17,16,15,39,234,156,154,153,140,13,18,190,
                191,410,60,41,2,52,1555,123,512,5516,71,1,17,16,15,39,234,156,154,153,
                140,13,18,190,191,410,60,41,2,52,234,3,123,513,1,253,272,274,23456,163,1346,2,62,623,26177};

       sort(array);
        System.out.print("Sorted array:");
        for (int arrayElement: array)
        {
            System.out.print(arrayElement + " ");
        }

    }





    public static int[] reverseArrayOfIntsByIndex(int [] array, int k){                        //reverse method
        if (k <= array.length && k >=0) {
            int[] tempArray = new int[k];

            for (int i=0, j=k-1; i < k ;i++, j--) tempArray[i] = array[j];

            for(int i = 0; i < k; i ++){
                array[i] = tempArray[i];

            }
        }
        return array;
        }




        public static int[] sort(int[] array){                                  //sort method
        int k = 0;                        //reversing coefficient
        int minimum;

            for (int i = 0; i < array.length; i++) {

                int [] resizeableArray = new int[array.length-i];

                for (int p1 = i, p2 = 0; p1 < array.length; p1++,p2++) {     // fill the small array
                    resizeableArray[p2] = array[p1];
                }

                    minimum = resizeableArray[0];

                for (int j = 0; j < resizeableArray.length; j++) {
                    if (resizeableArray[j] <= minimum) {
                        minimum = resizeableArray[j];
                        k = j;
                    }
                }

                reverseArrayOfIntsByIndex(resizeableArray, k + 1);  //reversing

                for (int z = 0,  p = i; z < resizeableArray.length; z++,p++) {
                    array[p] = resizeableArray[z];
                }

                }
                return array;

        }
    }

