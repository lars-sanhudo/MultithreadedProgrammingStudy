public class MyThread3 implements Runnable{
    Thread thrd;
    static SumArray sa = new SumArray();
    int [] a;
    int answer;

    // Construct a new thread.
    MyThread3(String name, int [] nums) {
        thrd = new Thread(this, name);
        a = nums;
    }

    // A factory method tha creates e starts the thread.
    public static MyThread3 createAndStart(String name, int [] nums){
        MyThread3 myThrd = new MyThread3(name, nums);
        myThrd.thrd.start();
        return myThrd;

    }

    public void run() {
        int sum;
        System.out.println(thrd.getName() + " starting.");
        answer = sa.sumArray(a);
        System.out.println("Sum for " + thrd.getName() +
        " is " + answer);
        System.out.println(thrd.getName() + " terminating.");
    }
}
