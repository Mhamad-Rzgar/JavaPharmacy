
package counter;

public class CounterInstance {
    int counter = 0;

    public CounterInstance() {
        counter += 1;
        System.out.println(counter);
    }
}
