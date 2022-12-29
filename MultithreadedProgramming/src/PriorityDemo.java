public class PriorityDemo {
    public static void main(String[] args){
        Priority mt1 = new Priority("High Priority");
        Priority mt2 = new Priority("Low Priority");
        Priority mt3 = new Priority("Normal Priority");
        Priority mt4 = new Priority("Normal Priority");
        Priority mt5 = new Priority("Normal Priority");

        // set the priorities.
        mt1.thrd.setPriority(Thread.NORM_PRIORITY+2);
        mt2.thrd.setPriority(Thread.NORM_PRIORITY-2);
        // Leave the rest at the default, normal priority.

        // start the threads.
        mt1.thrd.start();
        mt2.thrd.start();
        mt3.thrd.start();
        mt4.thrd.start();
        mt5.thrd.start();

        try {
            mt1.thrd.join();
            mt2.thrd.join();
            mt3.thrd.join();
            mt4.thrd.join();
            mt5.thrd.join();
        }
        catch(InterruptedException e) {
            System.out.println("Main Thread interrupted.");
        
        }

        System.out.println("\nHigh Priority thread counted to: "
         + mt1.count);
         System.out.println("Low Priority thread counted to: "
         + mt2.count);
         System.out.println("1st Normal Priority thread counted to: "
         + mt3.count);
         System.out.println("2nd Normal Priority thread counted to: "
         + mt4.count);
         System.out.println("3rd Normal Priority thread counted to: "
         + mt5.count);
    }
}
