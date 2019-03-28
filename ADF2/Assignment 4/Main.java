public class Main {
    public static void main(String[] args) {
        KhoGao khoGao = new KhoGao();
        NhapGaoThread nhapGaoThread = new NhapGaoThread(khoGao);
        BanGaoThread banGaoThread = new BanGaoThread(khoGao);
        BanGaoThread banGaoThread2 = new BanGaoThread(khoGao);
        banGaoThread.start();
        nhapGaoThread.start();
        banGaoThread2.start();
    }


}