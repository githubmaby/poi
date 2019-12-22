package com.baizhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PoiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PoiApplication.class, args);
        System.out.println();
        System.out.println("im zhansan");
        System.out.println("小轩在不在");
        System.out.println("在下卢本伟");
        System.out.println("遥控车，玩具车");
        System.out.println("我去你妹卢本伟，抢我玩具棒棒锤");
        System.out.println();
        System.out.println("jafla"); // idea 自动执行添加操作
        System.out.println("官网上的修改");

//<<<<<<< HEAD
        System.out.println("this is old de");
//=======
        System.out.println("this is new de");
// >>>>>>> mby/master

        // commit Ctrl + K
        // Alt + 9 --- 打开git的控制台
    }

}
