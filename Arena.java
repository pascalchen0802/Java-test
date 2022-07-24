import java.util.Random;

public class Arena {
    public static void main(String[] args) {

        Person p1 = new Person("Yeti", 1, 10, 10, 2, 0.5);
        Person p2 = new Person("Georgia", 1, 10, 10, 2,0.5);
        System.out.println(p1);
        System.out.println(p2);

        Random rand = new Random();

        int georgiaDeath = 0;
        int yetiDeath = 0;

        for(int j=0; j<=99; j++){
            revive(p1,p2);
            for (int i = 0; i <= 10; i++) {

                if (p1.currentHealth == 0) {
                    System.out.println(p1.getName() + " is dead!");
                    yetiDeath+= 1;
                }

                if (p2.currentHealth == 0) {
                    System.out.println(p2.getName() + " is dead!");
                    georgiaDeath+= 1;
                }

                if (p1.currentHealth == 0 || p2.currentHealth == 0) {
                    break;
                }

                int rand_int1 = rand.nextInt(2);
                double rand_dub1 = rand.nextDouble();
                if (rand_int1 == 0) {
                    p1.strike(p2);
                    if (rand_dub1 < p2.getCounterAttackRate()) {
                        p2.counterStrike(p1);
                    }
                } else {
                    p2.strike(p1);
                    if (rand_dub1 < p1.getCounterAttackRate()) {
                        p1.counterStrike(p2);
                    }
                }
            }
        }
        System.out.println("Georgia died " + georgiaDeath + " times.");
        System.out.println("Yeti died " + yetiDeath + " times.");
    }
    public static void revive(Person p1, Person p2){
        p1.setCurrentHealth(10);
        p2.setCurrentHealth(10);
    }
}

