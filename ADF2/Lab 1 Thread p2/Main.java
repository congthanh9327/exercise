public class Main {
    public static void main(String[] args) {
        CongratSubThread congratSubThread = new CongratSubThread();
        Thread thread1 = new Thread(congratSubThread);
        thread1.start();
    }
}