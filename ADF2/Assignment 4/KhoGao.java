public class KhoGao {
    public int soGao = 10;

    public synchronized void banGao(int amount){
        if(this.soGao < amount){
            System.out.println(Thread.currentThread().getName()+" Khong du gao ban.");
            try{
                wait();
            }catch (Exception e){}
        }
        this.soGao -= amount;
        System.out.println(Thread.currentThread().getName()+" Ban gao thanh cong, so luong: "+amount);
    }

    public synchronized void nhapGao(int amount){
        this.soGao += amount;
        System.out.println(Thread.currentThread().getName()+" Nhap kho thanh cong, so luong: "+amount+" -- so gao trong kho: "+ this.soGao);
        try {
            notifyAll();
        }catch (Exception e){}
    }
}