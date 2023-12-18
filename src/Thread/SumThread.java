package Thread;

public class SumThread implements Runnable{
    int []a;
    int leftIndex, rightIndex;
     int sum=0;
    SumThread(int[]a,int leftIndex,int rightIndex){
        this.a=a;
        this.leftIndex=leftIndex;
        this.rightIndex=rightIndex;

    }

    @Override
    public void run() {
        for (int i=leftIndex;i<=rightIndex;i++){
            sum+=a[i];
            System.out.println("thread sum: "+sum);
        }
    }
}
