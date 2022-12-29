public class MythreadJoin {
    public static void main(String[] args){
        System.out.println("Main thread starting.");
        Mythread2 mt1 = Mythread2.createAndStart("Child #1");
        Mythread2 mt2 = Mythread2.createAndStart("Child #2");
        Mythread2 mt3 = Mythread2.createAndStart("Child #3");
        try{
            mt1.thrd.join();
            System.out.println("Child #1 joined.");
            mt2.thrd.join();
            System.out.println("Child #2 joined.");
            mt3.thrd.join();
            System.out.println("Child #2 joined.");
        }
        catch(InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        
        System.out.println("Main thread ending.");
    }
}
