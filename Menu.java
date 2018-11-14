package com.ArryListDemo.BaodouHan;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Menu {
    public void menu01(){
        System.out.println("请选择要进行的操作：");
        System.out.println("------------------");
        System.out.println("|1.查找学生信息。|");
        line();;
        System.out.println("|2.添加学生信息。|");
        line();
        System.out.println("|3.删除学生信息。|");
        line();
        System.out.println("|4.修改学生信息。|");
        line();
        System.out.println("|5.退出。       |");
        System.out.println("------------------");
    }
    public void line(){
        System.out.println("****************");
    }
}
