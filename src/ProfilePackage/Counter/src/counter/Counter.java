
package counter;

public class Counter {

    public static void main(String[] args) {
        System.out.println("----------------------Static exmple---------------------");
       // with static variable
        new CounterStatic();
        new CounterStatic();
        new CounterStatic();
       
        System.out.println("----------------------instance exmple---------------------");
        // with instance variable
        new CounterInstance();
        new CounterInstance();
        new CounterInstance();
    }
    
}

