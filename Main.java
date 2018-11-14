package com.ArryListDemo.BaodouHan;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎使用学生信息管理系统！");
		ArrayList<Student> one = new ArrayList<Student>();
		while (true) {
			Menu s = new Menu();
			s.menu01();
			int Cho = input.nextInt();

			switch (Cho) {
				case 1:
					See(one);               //添加
					break;
				case 2:
					Add(one);                       //删除
					break;
				case 3:    Delete(one);                   //修改
					break;
				case 4: Make(one);             //查找
					break;
				case 5:
				default:
					System.out.println("退出");
					System.exit(0);//JVM退出
					break;
			}

		}

	}
	public static void See(ArrayList<Student> one) throws FileNotFoundException {
		FileReader see=new FileReader("c:\\学生信息管理系统.txt");
		if (one.size() == 0) {
			System.out.println("目前没有学生数据。");
			return;
		} else
			for (int i = 0; i < one.size(); i++) {
				Student a = one.get(i);
				System.out.println(a.getName() + "***" + a.getSex() + "***" + a.getAge() + "***" + a.getID());
			}
	}

	public static void Add(ArrayList<Student> one) throws IOException{
		Scanner input = new Scanner(System.in);
		System.out.println("请输入学生的姓名，性别，年龄，ID：");
		String name = input.next();
		String sex = input.next();
		String age = input.next();
		String ID = input.next();
		Student p = new Student(name,sex,age,ID);
		one.add(p);
		FileWriter sc=new FileWriter("c:\\学生信息管理系统.txt",true);
		sc.write(p.getName()+",");
		sc.write(p.getSex()+",");
		sc.write(p.getAge()+",");
		sc.write(p.getID());
		sc.write("\r\n");
		sc.flush();;
		sc.close();
		System.out.println("信息录入成功！");
	}

	public static void Delete(ArrayList<Student> one) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入要删除的学生的学号：");
		String in = input.next();
		for (int i = 0; i < one.size(); i++) {
			Student s1 = one.get(i);
			if (s1.getID().equals(in)) {
                    one.remove(i);
			}
		}
		System.out.println("删除学生成功！");
	}
	public static void Make(ArrayList<Student> one){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入要修改的学生学号:");
		String in=input.next();
		for(int i=0;i<one.size();i++){
			Student s1=one.get(i);
			if(s1.getID().equals(in)){
				System.out.println("请输入学生的新数据：");
				String name=input.next();
				String sex=input.next();
			    String age=input.next();
			    String ID=input.next();
			    Student s3=new Student(name,sex,age,ID);
			    one.set(i,s3);
			    System.out.println("修改成功！");
			}
		}
	}
}
