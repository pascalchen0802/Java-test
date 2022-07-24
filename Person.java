public class Person {
    String name;
    int age;
    int maxHealth;
    int currentHealth;
    int attack;
    double counterAttackRate;


    public Person(String name, int age, int maxHealth, int currentHealth, int attack, double counterAttackRate) {
        this.name = name;
        this.age = age;
        this.maxHealth = maxHealth;
        this.currentHealth = currentHealth;
        this.attack = attack;
        this.counterAttackRate= counterAttackRate;
    }

    public void setCounterAttackRate(double counterAttackRate){
        this.counterAttackRate=counterAttackRate;
    }

    public double getCounterAttackRate(){
        return this.counterAttackRate;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge (int age) {
        this.age=age;
    }

    public int getAge(){
        return this.age;
    }

    public void setCurrentHealth(int currentHealth){
        this.currentHealth=currentHealth;
    }

    public int getCurrentHealth(){
        return this.currentHealth;
    }

    public void setMaxHealth(int maxHealth){
        this.maxHealth=maxHealth;
    }
    public int getMaxHealth(){
        return this.maxHealth;
    }
    public void setAttack(int attack){
        this.attack=attack;
    }

    public int getAttack(){
        return this.attack;
    }
    public void strike(Person opponent) {
        opponent.setCurrentHealth(opponent.getCurrentHealth()-this.getAttack());
        System.out.println(this.getName()
                + " attacked "
                + opponent.getName()
                + " and dealt "
                + this.getAttack()
                +" damage!");
    }

    public void counterStrike(Person opponent) {
        opponent.setCurrentHealth(opponent.getCurrentHealth()-this.getAttack());
        System.out.println(this.getName()
                + " counterattacked "
                + opponent.getName()
                + " and dealt "
                + this.getAttack()
                +" damage!");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", maxHealth=" + maxHealth +
                ", currentHealth=" + currentHealth +
                ", attack='" + attack + '\'' +
                '}';
    }
}
