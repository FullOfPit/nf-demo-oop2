public class Dog extends Pet{

    private boolean hungry;

    public Dog(String name, String weigth, boolean hungry) {
        super(name, weigth);
        this.hungry = hungry;
    }

    @Override
    public String getName() {
        return "Hund";
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog dog)) return false;
        if (!super.equals(o)) return false;

        return isHungry() == dog.isHungry();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (isHungry() ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "hungry=" + hungry +
                ", name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
