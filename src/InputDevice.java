import fruits.Apple;
import fruits.Banana;
import fruits.Fruit;
import fruits.Mango;

import java.util.Random;

public class InputDevice {

    public String getType(){
        return "random";
    }

    public int[] getNumbers(int n){
        int[] numbers = new int[n];
        for(int idx = 0; idx < n;idx++){
            numbers[idx] = this.nextInt();
        }

        return numbers;
    }

    public String getLine() {
        return "The quick brown fox jumps over the lazy dog";
    }

    public int nextInt() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    public Fruit[] readFruit(){
        return new Fruit[]{new Banana(15, 3, 6), new Banana(25, 19, 2),
        new Apple(11, 4, 8, Fruit.Color.RED), new Mango(20, 4, 4, Fruit.Color.GREEN)};
    }
    public Arraylist<Fruit> readFruit(){
        ArrayList<Fruit> fruits = new ArrayList<>();
        Arrays.asList(new Banana(15,3,6),new Banana(25,19,2),new Apple(11,4,8,Fruit.Color.RED),
                new Mango(20,4,4,Fruit.Color.GREEN));
        return fruits;
    }
}
