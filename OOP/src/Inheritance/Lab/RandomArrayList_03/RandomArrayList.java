package Inheritance.Lab.RandomArrayList_03;

import java.util.ArrayList;
import java.util.Random;
public class RandomArrayList<T> extends ArrayList<T> {
    public T getRandomElement(){
        Random random = new Random();
        int index = random.nextInt(this.size());
        return this.get(index);
    }
}
