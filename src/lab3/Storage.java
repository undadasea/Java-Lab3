package lab3;

import java.util.Random;

public class Storage {
    public int number;

    public int addProduct() {
        Random random = new Random();
        number = random.nextInt(100);
        return number;
    }

    public int getProduct(){
        return number;
    }
}
