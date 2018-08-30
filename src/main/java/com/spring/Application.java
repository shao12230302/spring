package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    public static void main(String[] args)  throws Exception{
//
//            Thread thread=new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println("保存用户信息到用户表开始...");
//                    try {
//
//                        Thread.sleep(300*10);
//                        System.out.println("1 存用户信息到\"用户\"表 成功");
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//
//                    System.out.print("执行任务完成");
//                }
//            });
//            thread.start();
//        System.out.println("33用户基本信息线程关闭");
//        Thread.interrupted();//
//
//    }
}
