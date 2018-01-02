/**
 * Project Name:dt59homework
 * File Name:Pet.java
 * Package Name:Qbaba
 * Date:2018年1月2日下午6:40:30
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102e;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午6:40:30 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public abstract class Pet {

    protected Pet pet;
    Pet food;
    
    /**
     * pet.
     *
     * @return  the pet
     */
    public Pet getPet() {
        return pet;
    }

    /**
     * pet
     *
     * @param   pet    the pet to set
     */
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public abstract void Eat(Pet eat);
    
    public Pet getPat(){
        return pet;
    }
    
}

