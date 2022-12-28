class Mythread implements Runnable {
    String threadName;
        Mythread(String name){
            threadName = name;
        }

    public void run() {
        System.out.println(threadName + " starting.");
        try {
            for(int count = 0; count < 10; count++){
                Thread.sleep(400);
                System.out.println("in " + threadName +
                ", count is " + count);
            }
        }
        catch(InterruptedException exc){
            System.out.println(threadName + " interrupted.");
        }
        System.out.println(threadName + " terminating");
    }
}