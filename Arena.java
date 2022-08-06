import java.util.Random;

public class Arena {
    public static void main(String[] args) {

        Person p1 = new Person("Yeti", 1, 10, 10, 3, 0.5);
        Person p2 = new Person("Georgia", 1, 10, 10, 3,0.5);
        System.out.println(p1);
        System.out.println(p2);

        Random rand = new Random();

        int georgiaDeath = 0;
        int yetiDeath = 0;

        for(int j=0; j<=100; j++){
            resetStats(p1,p2);
            for (int fightingRounds = 0; fightingRounds <= 10; fightingRounds++) {
                if(p1.getCurrentHealth()==1){
                    int healPackValue= healPack(p1);
                    p1.setCurrentHealth(p1.currentHealth + healPackValue);
                    System.out.println("Yeti got a health pack of " + healPackValue + "!");
                }
                if(p2.getCurrentHealth()==1){
                    int healPackValue= healPack(p2);
                    p2.setCurrentHealth(p2.currentHealth + healPackValue);
                    System.out.println("Georgia got a health pack of " + healPackValue + "!");
                }
                if (p1.currentHealth <= 0) {
                    System.out.println(p1.getName() + " is dead!");
                    yetiDeath+= 1;
                }

                if (p2.currentHealth <= 0) {
                    System.out.println(p2.getName() + " is dead!");
                    georgiaDeath+= 1;
                }

                if (p1.currentHealth <= 0 || p2.currentHealth <= 0) {
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
    public static void resetStats(Person p1, Person p2){
        p1.setCurrentHealth(10);
        p2.setCurrentHealth(10);
    }
    public static int healPack(Person p1){
        Random rand = new Random();
        int randHealPack = rand.nextInt(4);
        return randHealPack;
    }
}

