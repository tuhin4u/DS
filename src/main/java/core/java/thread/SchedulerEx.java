package core.java.thread;


import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

interface Work{
    public void process();
}


class  SchedulerTask implements Runnable{
    Work task;

    public SchedulerTask(Work task) {
        this.task=task;
    }

    @Override
    public void run() {
        task.process();
    }

    public void executeTask(){

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        System.out.println("Task Scheduler started");
        scheduledExecutorService.scheduleAtFixedRate(this,5,5,TimeUnit.SECONDS);
    }
}

class MyClass implements Work{

    public void sayHi(){
        System.out.println("Hello, "+ new Date());
    }

    @Override
    public void process() {
        this.sayHi();
    }
}

public class SchedulerEx {
    public static void main(String[] args) {
        Work task= new MyClass();
        SchedulerTask schedulerTask= new SchedulerTask(task);
        schedulerTask.executeTask();

    }
}
