public class Person {
    String name;
    int age;
    int maxHealth;
    int currentHealth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }
    public void strike(Person opponent) {
        opponent.setCurrentHealth(opponent.getCurrentHealth()-1);
        System.out.println(this.getName()+ " attacked " + opponent.getName() + " and dealt 1 damage!");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", maxHealth=" + maxHealth +
                ", currentHealth=" + currentHealth +
                '}';
    }
}