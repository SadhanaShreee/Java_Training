public class MainThread extends Thread {
    public static void main(String[] args) {
        MainThread t1 = new MainThread();
        t1.start();
        t1.sit();

        MainThread t2 = new MainThread();
        t2.start();
        t2.sit();

        MainThread t3 = new MainThread();
        t3.start();
        t3.sit();
    }
    @Override

    public  void run(){
        for(int i=1;i<=20;i++){
            System.out.println(i);
        }

    }

    public void sit(){
        for(int i = 1;i<=20;i++){
            System.out.println("Hi");
        }
    }
}
