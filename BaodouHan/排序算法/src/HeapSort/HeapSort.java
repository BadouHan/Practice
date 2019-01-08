package HeapSort;
import java.io.*;
import java.util.Scanner;

public class HeapSort {
    public static void main(String[] args){
   Day[] days=Day.values();
   for(int i=0;i<days.length;i++){
       System.out.println("name:"+days[i]);
   }
for(Day day:Day.values()){
    System.out.println("name:"+day+"; desc:"+day.getDescribe());
}
        }
    enum Day {
        MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"),
        THURSDAY("星期四"), FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期天");
        private String describe;
        public String getDescribe(){
            return describe;
        }
        private Day(String desc){
            this.describe=desc;
        }
    }
    }



