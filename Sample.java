import java.util.concurrent.atomic.AtomicInteger;//using this for the first time (the library)

public class Sample {
    AtomicInteger atomicInt = new AtomicInteger(0);
    Double[] atomicDbl = {0.0};

    void fun1(int x, double y) { // value
        x++;
        y++;
        System.out.println("fun 1 gives " + x + " " + y);
    }

    void fun2(AtomicInteger x, Double[] y) { // address
        x.incrementAndGet();
        y[0] += 1.0;
        System.out.println("fun 2 gives " + x + " " + y[0]);
    }

    void fun3(AtomicInteger x, Double[] y) { // reference
        x.incrementAndGet();
        y[0] += 1.0;
        System.out.println("fun 3 gives " + x + " " + y[0]);
    }

    public static void main(String[] args) {
        int i = 10;
        double j = 20.0;
        Sample s = new Sample();
        s.fun1(i, j);
        s.fun2(s.atomicInt, s.atomicDbl);
        s.fun3(s.atomicInt, s.atomicDbl);
    }
}