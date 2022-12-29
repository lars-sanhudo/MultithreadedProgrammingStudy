public class MoreThreads {
    public static void main(String[] args){
        System.out.println("Main thread starting.");
        Mythread2 mt1 = Mythread2.createAndStart("Child #1");
        Mythread2 mt2 = Mythread2.createAndStart("Child #2");
        Mythread2 mt3 = Mythread2.createAndStart("Child #3");

        do{
            System.out.print(".");
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }while(mt1.thrd.isAlive() ||
               mt2.thrd.isAlive() ||
               mt3.thrd.isAlive());
        System.out.println("Main thread ending.");
    }
}