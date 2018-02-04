public class MyRunnable2  {
    private long x;

    public void m2(float[] arr, int h, int size) {
        long b = System.currentTimeMillis();
        float[]arr2 = new float[size];
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        System.arraycopy(arr, 0, a1 , 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < a1.length ; i++) {
                    a1[i] = (float) (a1[i] * Math. sin(0.2f + i / 5) * Math. cos(0.2f + i / 5) *
                            Math. cos(0.4f + i / 2));
                    }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = h; i < size ; i++) {
                    a2[i-h] = (float) (a2[i-h] * Math. sin(0.2f + (i-h) / 5) * Math. cos(0.2f + (i-h) / 5) *
                            Math. cos(0.4f + (i-h) / 2));
                }
            }
        });

        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.arraycopy(a1 , 0, arr2, 0, h);
        System.arraycopy(a2, 0, arr2, h, h);

        System.currentTimeMillis();
        x = System.currentTimeMillis() - b;
        System.out.println("Время второго метода: " + x + " миллисекунд");

    }
    public long getX() {
        return x;
    }
}
