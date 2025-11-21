public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        // Create tasks
        Runnable task1 = new CalculationTask(calculator, 10, 5, "add");
        Runnable task2 = new CalculationTask(calculator, 20, 3, "subtract");
        Runnable task3 = new CalculationTask(calculator, 6, 7, "multiply");
        Runnable task4 = new CalculationTask(calculator, 50, 10, "divide");

        // Assign Runnable tasks to Threads
        Thread t1 = new Thread(task1, "Thread-A");
        Thread t2 = new Thread(task2, "Thread-B");
        Thread t3 = new Thread(task3, "Thread-C");
        Thread t4 = new Thread(task4, "Thread-D");

        // Start threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
