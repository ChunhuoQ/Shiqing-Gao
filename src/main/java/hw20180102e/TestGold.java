/**
 * Project Name:dt59homework
 * File Name:TestGold.java
 * Package Name:Qbaba20180102
 * Date:2018年1月2日下午7:21:04
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102e;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午7:21:04 <br/>
 * @author   Qbaba
 * @version
 * @see 很懵 。
 */
public class TestGold {

    public static void main(String[] args) {
        Gold gold=new Gold();
        
        gold.setName("Qbaba");
        gold.getName();
        gold.adopt(new Cat("Qbaba的猫"));
        Gold gold1=new Gold();
        gold1.setName("Qbaba");
        gold1.adopt(new Dog("Qbaba的狗"));
        
      

        
    
}}

