package hilos;

public class SinHilos {
        String atributo;
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            SinHilos sh=new SinHilos(i);
            sh.run();
        }
    }
    public SinHilos(int i){
        atributo="algo" +i;
    }
    
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i+":"+atributo);
        }
    }
    //FRANK WMM
}
