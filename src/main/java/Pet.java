public class Pet {

    protected String name;
    protected String weight;

    public Pet(String name, String weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet pet)) return false;

        if (getName() != null ? !getName().equals(pet.getName()) : pet.getName() != null) return false;
        return getWeight() != null ? getWeight().equals(pet.getWeight()) : pet.getWeight() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getWeight() != null ? getWeight().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
