/**
 * Home work 5.
 * @author Ievlev Andrey.
 * @version Feb 4, 2018.
 * @Link https://github.com/OLskrain/HomeWork5.git
 */

public class HomeWork5 {
    static final int size = 10000000;
    static final int h = size / 2;
    static float[] newarray(){
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static void main(String[] args) {

        //Task 1
        MyRunnable myRunnable = new MyRunnable();
        myRunnable.m1(newarray());

        //Task2
        MyRunnable2 myRunnable2 = new MyRunnable2();
        myRunnable2.m2(newarray(),h,size);
        System.out.println("===============================================");
        System.out.printf("Разница во времени в %.2f раза! \n",(float)myRunnable.getY()/myRunnable2.getX());
        }
}
