public class SubThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Current Thread: " + Thread.currentThread().getName());
        Thread.currentThread().setName("MyJavaThread");
        System.out.println("Current Thread: " + Thread.currentThread().getName());
        int number = 0;
        for (int i = 2; number < 10; i++) {
            if (checkPrime1(i)) {
                System.out.println("Prime: " + i);
                number++;
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    public static boolean checkPrime1(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}