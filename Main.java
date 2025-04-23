package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] nums1 = {1,2};
        int [] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        int [] mergedArray = new int[size];
        int p2 =0;
        int p1 = 0;

        if(size == 0){
            return 0;
        }
        for(int i = 0 ; i < size; i ++){
            if(p1 < nums1.length && p2 < nums2.length){
                if(nums1[p1] < nums2[p2]){
                    mergedArray[i] = nums1[p1++];

                }else{
                    mergedArray[i] = nums2[p2++];

                }
            }else{
                if(p1 - (nums1.length-1) == 0){
                    mergedArray[i] = nums1[p1];
                }else if(p2 - (nums2.length-1)== 0){
                    mergedArray[i] = nums2[p2];
                }


                if( (nums1.length)-p1 > 0){
                    int o = i;
                    for(int k = p1; k < nums1.length; k++){
                        mergedArray[o] = nums1[k];
                        o++;
                    }
                }else if((nums2.length)-p2 > 0){
                    int o = i;
                    for(int k = p2; k < nums2.length; k++){
                        mergedArray[o] = nums2[k];
                        o++;
                    }
                }


                break;
            }
        }
        for(int i =0; i < mergedArray.length;i++){
            System.out.println(mergedArray[i]);
        }
        double median;

        if(!isEven(mergedArray.length)){

            int n = (size+1) /2 ;
            median = mergedArray[n-1];
        }else{
            median = (double) (mergedArray[size / 2 - 1] + mergedArray[size / 2]) /2;
        }
        return median;
    }
    public static boolean isEven(int n){
        return n % 2== 0;
    }
}



