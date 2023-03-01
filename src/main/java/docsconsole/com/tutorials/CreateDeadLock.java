package docsconsole.com.tutorials;

class Employee {
    int id;
    Employee(int id) {
        this.id = id;
    }
    public void displayId() {
        System.out.println(this.id);
    }
}
class ThreadExample implements Runnable {
    private Employee employee1;
    private Employee employee2;
    ThreadExample (Employee employee1, Employee employee2){
        this.employee1 = employee1;
        this.employee2 = employee2;
    }
    public void run() {
        synchronized (employee1){
            try {
                employee1.displayId();
                Thread.sleep(1000l);
                synchronized (employee2) {
                    employee2.displayId();
                    Thread.sleep(1000l);
                    System.out.println("Name: "+ Thread.currentThread().getName());
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class CreateDeadLock {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1001);
        Employee employee2 = new Employee(1002);
        Thread thread1 = new Thread(new ThreadExample(employee1,employee2),"t1");
        Thread thread2 = new Thread(new ThreadExample(employee1,employee2),"t2");
        thread1.start();
        thread2.start();


    }
}


