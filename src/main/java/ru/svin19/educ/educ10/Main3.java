package ru.svin19.educ.educ10;

public class Main3 {
    volatile boolean keepRunning = true; //volatile   - говорит, что поле нельзя
    // оптимизировать, поскольку его могут менять разные потоки
    int x = 0;
    public static void main(String[] args) throws InterruptedException {
        Main3 main = new Main3();

        new Thread(()->{
            main.run();
        }).start();

        Thread.sleep(5);
        main.stop();
    }

    private void stop() {
        keepRunning = false;
    }

    public void run() {
        int i = 0;
        while (keepRunning){
            ++x;
        }
        System.out.println(x);
    }
}
