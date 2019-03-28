public class Main {
    public static void main(String[] args) throws InterruptedException{
        SubThread1 subThread1 = new SubThread1();
        Thread thread1 = new Thread(subThread1);
        SubThread2 subThread2 = new SubThread2();
        Thread thread2 = new Thread(subThread2);
        SubThread3 subThread3 = new SubThread3();
        Thread thread3 = new Thread(subThread3);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}