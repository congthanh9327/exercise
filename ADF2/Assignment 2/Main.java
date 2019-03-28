import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyGenericArrayList arrayList = new MyGenericArrayList();
        ArrayList<Integer> arrTemp = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            arrTemp.add(i);

        }
        arrayList.setArr(arrTemp);
        for (Integer i : arrayList.arr) {
            System.out.println(i);
        }
    }
}