package counter;

public class CounterStatic {
    static int counter = 0;
    
    public CounterStatic() {
        counter++;
        System.out.println(counter);
    }
}
