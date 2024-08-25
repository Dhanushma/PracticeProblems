package dhanu.study;

public class DeadLock {
    //Sample code to create a dead lock
    public static void main(String[] args) {
        String a = "Arya";
        String b = "Ayush";

        Thread t1 = new Thread() {
            public void run() {
                synchronized (a) {
                    System.out.println("Thread 1 locked a");
                    try{
                        Thread.sleep(100);
                    }
                    catch (InterruptedException e){
                        System.out.println(e);
                    }

                    synchronized (b) {
                        System.out.println("Thraed 1 locked b");
                    }
                }
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                synchronized(b){
                    System.out.println("Thread 2 locked b");
                    try{
                        Thread.sleep(100);
                    }
                    catch (InterruptedException e){
                        System.out.println(e);
                    }
                    synchronized (a){
                        System.out.println("Thread 2 locked a");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
