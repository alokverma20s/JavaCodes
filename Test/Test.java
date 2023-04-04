class Test implements Runnable {
    public static Thread thread1;
    public static Test obj;
    public static void main(String[] args)
    {
        obj = new Test();
        thread1 = new Thread(obj);
        // thread1 created and is currently in the NEW state.
        System.out.println("State of thread1 after creating it - " + thread1.getState() +" -- "+thread1.getName());
        thread1.start();
        // thread1 moved to RUNNABLE state
        System.out.println("State of thread1 after calling .start() method on it - " + thread1.getState() +" -- "+thread1.getName());
    }
    public void run(){
        Thread myThread = new Thread();
        Thread thread2 = new Thread(myThread);
        // thread2 created and is currently in the NEW state.
        System.out.println("State of thread2 after creating it - "+ thread2.getState() +" -- "+thread2.getName());
        thread2.start();
        // thread2 moved to RUNNABLE state
        System.out.println("State of thread2 after calling .start() method on it - " + thread2.getState() +" -- "+thread2.getName());
        try {
            // moving thread2 to timed waiting state
            thread2.sleep(200);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("State of thread2 after calling .sleep() method on it - "+ thread2.getState() +" -- "+thread2.getName());
        try {
            // allows one thread to wait until another thread completes its execution
            // waiting for thread2 to die
            thread2.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("State of thread2 when it has finished it's execution - "+ thread2.getState() +" -- "+thread1.getName());
    }

}