package hilos;

public class ConHilosRunnable implements Runnable{
        String atributo;
        
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            Thread chr=new Thread(new ConHilosRunnable(i));
            chr.start();
        }
    }
    public ConHilosRunnable(int i){
        atributo="algo" +i;
    }
    
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i+":"+atributo);
        }
    }
    //FRANK WMM
}