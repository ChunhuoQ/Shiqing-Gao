/**
 * Project Name:dt59homework
 * File Name:Dog.java
 * Package Name:Qbaba20180102
 * Date:2018年1月2日下午6:42:48
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102e;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午6:42:48 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class Dog extends Pet{

    String food="骨头";
    String name;
    public void Eat(Pet eat){
        if(food.equals("骨头")){
            super.food=eat;
        }
    }
 public Dog(String print){
        
    }
public Dog() {
    
    //  Auto-generated constructor stub
    
}
}

