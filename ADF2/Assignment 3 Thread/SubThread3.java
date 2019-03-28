public class SubThread3 implements Runnable {
    @Override
    public void run() {
        for (int i=1;i<51;i++){
            System.out.print(i+" ");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
    }
}