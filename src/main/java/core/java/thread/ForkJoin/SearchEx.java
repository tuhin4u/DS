package core.java.thread.ForkJoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class SearchEx {
    public static void main(String[] args) {
        Integer arr[]={1,2,3,4,5,6,7,8,9,6,2,6,2,3,4,5,6};
        Integer start=0;
        Integer end=arr.length-1;
        Integer element=6;

        SearchTask task=new SearchTask(arr,start,end,element);
        ForkJoinPool pool=ForkJoinPool.commonPool();
        Integer result = pool.invoke(task);
        System.out.println(element+" : occurs "+result);


    }
}
class SearchTask extends RecursiveTask<Integer>
{
    private Integer arr[];
    private Integer start;
    private Integer end;
    private Integer element;

    public SearchTask(Integer[] arr, Integer start, Integer end, Integer element) {
        this.arr = arr;
        this.start = start;
        this.end = end;
        this.element = element;
    }

    @Override
    protected Integer compute() {
        System.out.println(Thread.currentThread());
        int size=end-start+1;
        if(size>3){
            int mid=(start+end)/2;
            SearchTask t1=new SearchTask(arr,start,mid,element);
            SearchTask t2=new SearchTask(arr,mid+1,end,element);
            t1.fork();
            t2.fork();
            return t1.join()+t2.join();
        }
        else {
            return processSearch();
        }
    }
    private int processSearch(){
        int count=0;
        for(int i=start;i<=end;i++){
            if(arr[i]==element){
                count++;
            }
        }
        return count;
    }
}
