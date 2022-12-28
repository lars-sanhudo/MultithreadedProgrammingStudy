public class ThreadVariation {
    public static void main(String[] args){
        System.out.println("Main Thread starting.");

        //Create and start a thread.
        Mythread2 mt = Mythread2.createAndStart("Child #1");

        for(int i = 0; i < 50; i++){
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException e) {
                System.out.println("Main Thread interrupted.");
            }
        }
        System.out.println("Main Thread ending");
    }
}
