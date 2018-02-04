public class MyRunnable {
    private long y;

    public  void m1(float[] arr){
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (float) (arr[i] * Math. sin(0.2f + i / 5) * Math. cos(0.2f + i / 5) *
                    Math. cos(0.4f + i / 2));
        }
            System.currentTimeMillis();
        y = (System.currentTimeMillis() - a);
        System.out.println("Время первого метода: " + y + " миллисекунд");
    }
    public long getY() {
        return y;
    }
}
