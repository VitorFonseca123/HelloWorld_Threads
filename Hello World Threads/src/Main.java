class threadHelloWorld extends Thread{
    static int indice=0;
    public void run(){
        int i=indice;
        avança();
        System.out.println("Hello Wolrd "+i);
    }
    public void avança(){
        indice++;
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        int nThreads = 5;

        threadHelloWorld[] threads = new threadHelloWorld[nThreads];
        for(int i = 0; i < nThreads; i++){

            threads[i] = new threadHelloWorld();
            threads[i].start();
        }
        for(int i = 0; i < nThreads; i++){
            threads[i].join();
            System.out.println("A thread "+i+" acabou");
        }

    }
}