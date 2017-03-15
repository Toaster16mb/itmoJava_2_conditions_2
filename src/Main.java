public class Main {

    public static void main(String[] args) {
        double m,n;
        n = 10.5;
        m = 8.6;
        // выводим число из m и n, которое ближе к 10
        System.out.println((Math.abs(10.0 - m) < Math.abs(10.0 - n)) ? m : n);
    }
}
