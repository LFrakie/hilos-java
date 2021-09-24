package hilos;

public class ConHilosThread extends Thread{
        String atributo;
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            ConHilosThread cht=new ConHilosThread(i);
            cht.start();
        }
    }
    public ConHilosThread(int i){
        atributo="algo " + i;
    }
    
        @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i+ ": "+atributo);
        }
    }
    //FRANK WMM
}

