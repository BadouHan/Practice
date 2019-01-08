package QuickSort;
import java.io.*;
import java.util.Scanner;
public class QuickSort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入数字：");
        String input=in.nextLine();
        String[] arry=input.split(",");
        int[] nums=new int[arry.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=Integer.parseInt(arry[i]);
        }
        QuickSort(0,nums.length-1,nums);
        System.out.println(QuickSort(0,3,nums));
        for (int s : nums) {
            System.out.print(s + " ");
        }
    }
    public static int[] QuickSort(int star,int end,int[] str){
        if(star<end) {
            int index = Boundary(star, end, str);
            QuickSort(star, index - 1, str);
            QuickSort(index + 1, end, str);
        }
        return str;
    }


    public static int Boundary(int star,int end,int[] str){
        int indexOfstar,indexOfend;
        indexOfend=end;
        indexOfstar=star;
        if(indexOfstar>=indexOfend) return str[star];
        int x=str[indexOfstar];
        while(indexOfstar<indexOfend){
            while(indexOfstar<indexOfend&&str[indexOfend]>x){
                indexOfend--;
            }
            str[indexOfstar]=str[indexOfend];
            while(indexOfstar<indexOfend&&str[indexOfstar]<=x){
                indexOfstar++;
            }
            str[indexOfend]=str[indexOfstar];
        }
        str[indexOfstar]=x;

        return indexOfstar;
    }
}