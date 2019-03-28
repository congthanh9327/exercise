public class BanGaoThread extends Thread {
    public KhoGao khoGao = new KhoGao();

    public BanGaoThread(KhoGao kg){
        this.khoGao = kg;
    }

    public void run(){
        this.khoGao.banGao(30);
    }
}