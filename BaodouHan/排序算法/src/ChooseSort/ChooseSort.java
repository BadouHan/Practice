package ChooseSort;

import java.util.Scanner;

public class ChooseSort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入数字：");
        String input=in.nextLine();
        String[] arry=input.split(",");
        int[] nums=new int[arry.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=Integer.parseInt(arry[i]);
        }
        ChooseSort(nums);
        for(int s:nums){
            System.out.print(s+" ");
        }
    }
    public static int[] ChooseSort(int[] str){
        int indexOfmin,indexOfmax,minValue,temp;
        for(int i=0;i<str.length-1;i++){
            indexOfmin=i;
            minValue=str[i];
            for(int j=i+1;j<str.length;j++){
                if(str[j]<minValue){
                    indexOfmin=j;
                    minValue=str[j];
                }
            }
            temp=str[i];
            str[i]=minValue;
            str[indexOfmin]=temp;
        }
        return str;
    }
}
