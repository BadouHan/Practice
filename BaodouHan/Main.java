package com.FileIODemo.BaodouHan;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
       String filename="c:\\学生信息管理系统.txt";
        Scanner input = new Scanner(System.in);
        Student s1=new Student();
        ArrayList<Student> one = new ArrayList<Student>();
        ReadTxt(filename,one);
        System.out.println("欢迎使用学生信息管理系统！");
        while (true) {
            Menu s = new Menu();
            s.menu01();
            int Cho = input.nextInt();

            switch (Cho) {
                case 1:
                    See();               //添加
                    break;
                case 2:
                    Add();               //删除
                    break;
                case 3:
                    Delete();            //修改
                    break;
                case 4:
                    Make();              //查找
                    break;
                case 5:
                default:
                    System.out.println("退出");
                    System.exit(0);//JVM退出
                    break;
            }
        }
    }
    public static void See() throws IOException {
        ArrayList<Student> s=new ArrayList<Student>();
        ReadTxt("c:\\学生信息管理系统.txt",s);
        if(s.size()==0){
            System.out.println("目前没有学生数据，请添加。");
            return;
        }
       for(int i=0;i<s.size();i++){
           Student s1=new Student();
           s1=s.get(i);
           System.out.print(s1.getName()+","+s1.getSex()+","+s1.getAge()+","+s1.getID());
           System.out.println();
       }
    }

    public static void Add() throws IOException{
        Scanner input = new Scanner(System.in);
        ArrayList<Student> s=new ArrayList<Student>();
ReadTxt("c:\\学生信息管理系统.txt",s);
        System.out.println("请输入学生的姓名，性别，年龄，ID：");
        int index=-1;
        String name = input.next();
        String sex = input.next();
        String age = input.next();
        String ID = input.next();
        for(int i=0;i<s.size();i++){
            Student s1=s.get(i);
            if(s1.getID().equals(ID)){
                System.out.println("对不起，该学号已被占用。请重新确认学号或修改学生信息。");
               return;
            }
        }
        Student p = new Student(name,sex,age,ID);
        s.add(p);
        WriteTxt("c:\\学生信息管理系统.txt",s);
        System.out.println("信息录入成功！");
    }

    public static void Delete() throws IOException{
       ArrayList<Student> s=new ArrayList<Student>();
       ReadTxt("c:\\学生信息管理系统.txt",s);
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要删除的学生的学号：");
        String in = input.next();
        for (int i = 0; i < s.size(); i++) {
          Student s1=new Student();
          s1=s.get(i);
            if (s1.getID().equals(in)) {
                s.remove(i);
                WriteTxt("c:\\学生信息管理系统.txt",s);
            }
        }
        System.out.println("删除学生成功！");
    }
    public static void Make()throws IOException{
        ArrayList<Student> s=new ArrayList<Student>();
        ReadTxt("c:\\学生信息管理系统.txt",s);
     Scanner input=new Scanner(System.in);
     System.out.println("请输入要修改的学生的学号:");
     String in=input.next();
     for(int i=0;i<s.size();i++){
         Student s1=s.get(i);
         if(s1.getID().equals(in)){
             s.remove(i);
             System.out.println("请重新输入该学生的信息:");
             System.out.println("学生姓名:");
             String name=input.next();
             System.out.println("性别:");
             String sex=input.next();
             System.out.println("年龄:");
             String age=input.next();
             System.out.println("学生ID:");
             String ID=input.next();
            s1.setName(name);
            s1.setSex(sex);
            s1.setAge(age);
            s1.setID(ID);
             s.add(i,s1);
             WriteTxt("c:\\学生信息管理系统.txt",s);
             System.out.println("修改成功.");
         }

     }

    }
    public static void ReadTxt(String filename,ArrayList<Student> s) throws IOException{
        BufferedReader see=new BufferedReader(new FileReader(filename));
        String ch;
       while((ch=see.readLine())!=null){
           Student s1=new Student();
           String[] get=ch.split(",");
            s1.setName(get[0]);
            s1.setSex(get[1]);
            s1.setAge(get[2]);
            s1.setID(get[3]);
s.add(s1);
WriteTxt("c:\\学生信息管理系统.txt",s);
        }
        see.close();
    }
    public static void WriteTxt(String filename,ArrayList<Student> arry) throws IOException{
        BufferedWriter change=new BufferedWriter(new FileWriter(filename));
            for(int i=0;i<arry.size();i++){
                Student s=arry.get(i);
                StringBuilder str=new StringBuilder();
                str.append(s.getName()).append(",").append(s.getSex()).append(",").append(s.getAge()).append(",").append(s.getID());
                str.append("\r\n");
                change.write(str.toString());
                change.flush();
            }
            change.close();
    }
}