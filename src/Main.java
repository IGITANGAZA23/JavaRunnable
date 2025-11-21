public class Main {
    public static void main(String[] args) {

        /*Calculator calculator = new Calculator();


        Runnable task1 = new CalculationTask(calculator, 10, 5, "add");
        Runnable task2 = new CalculationTask(calculator, 20, 3, "subtract");
        Runnable task3 = new CalculationTask(calculator, 6, 7, "multiply");
        Runnable task4 = new CalculationTask(calculator, 50, 10, "divide");


        Thread t1 = new Thread(task1, "Thread-A");
        Thread t2 = new Thread(task2, "Thread-B");
        Thread t3 = new Thread(task3, "Thread-C");
        Thread t4 = new Thread(task4, "Thread-D");

        t1.start();
        t2.start();
        t3.start();
        t4.start();*/

        Calculator calc = new Calculator();

        Thread t1 = new Thread(() -> {
            System.out.println("ADD Result: " + calc.add(10, 5));
        });

        Thread t2 = new Thread(() -> {
            System.out.println("SUBTRACT Result: " + calc.subtract(20, 3));
        });

        Thread t3 = new Thread(() -> {
            System.out.println("MULTIPLY Result: " + calc.multiply(6, 7));
        });

        Thread t4 = new Thread(() -> {
            System.out.println("DIVIDE Result: " + calc.divide(50, 10));
        });

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
