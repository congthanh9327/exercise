public class NhapGaoThread extends Thread {
    public KhoGao khoGao = new KhoGao();

    public NhapGaoThread(KhoGao kg){
        this.khoGao = kg;
    }

    public void run(){
        this.khoGao.nhapGao(50);
    }
}