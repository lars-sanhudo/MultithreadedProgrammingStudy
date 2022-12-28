// This version of Mythread creates
// a Thread when its constructor is called
// and stores it in an instance variable called
// thrd. It also sets the name of the thread and
// provides a factory method to create and start
// a thread.

public class Mythread2 implements Runnable{
    Thread thrd;
    //Construct a new thread suing this Runnable
    // and give it a name.
    Mythread2(String name) {
        thrd = new Thread(this, name);
    }

    //A factory method that creates and starts a thread.
    public static Mythread2 createAndStart(String name){
        Mythread2 mythrd = new Mythread2(name);

        mythrd.thrd.start(); //start the Thread.
        return mythrd;
    } 

    // Entry point of thread.
    public void run(){
        System.out.println(thrd.getName() + " starting.");
        try{
            for(int count = 0; count < 10; count++){
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() +
                ", count is " + count);
            }
        }
        catch(InterruptedException e){
            System.out.println(thrd.getName() + " interrupted");
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}   
