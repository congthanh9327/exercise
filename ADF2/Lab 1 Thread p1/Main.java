public class Main {
    public static void main(String[] args) {
        SubThread subThread = new SubThread();
        Thread thread = new Thread(subThread);
        thread.start();
    }

}