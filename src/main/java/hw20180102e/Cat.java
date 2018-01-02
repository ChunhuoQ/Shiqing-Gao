/**
 * Project Name:dt59homework
 * File Name:Cat.java
 * Package Name:Qbaba20180102
 * Date:2018年1月2日下午6:42:42
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102e;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午6:42:42 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class Cat  extends Pet{
    
    private String name;
    private String food="鱼";
    

    public void Eat(Pet eat){
        if(food.equals("鱼")){
            super.food=eat;
        }
        
     };
    public void setFood(String food){
        
    }
    public Cat(String print){
        
    }

}

