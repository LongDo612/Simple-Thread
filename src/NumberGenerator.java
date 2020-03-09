public class NumberGenerator implements Runnable{
    @Override
    synchronized public void run() {
        try {
            for (int i=0;i<10;i++){
                System.out.println(i+"\t"+hashCode());
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
