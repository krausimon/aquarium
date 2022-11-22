public class FischMain {
    public static void main(String[] args) throws InterruptedException {
        Aquarium aq = new Aquarium(400, 400);
         aq.addFisch(new Rotfisch(100, 300));
         aq.addFisch(new Gelbfisch(200, 200));
         aq.addFisch(new Blaufisch(300, 100));
        aq.addFisch(new SlowFish(300, 50));

         while (true) {
             aq.bewege();
             aq.zeichne();
             Thread.sleep(30);
        }
    }
}
