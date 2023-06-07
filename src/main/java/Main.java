public class Main {

    public static void main(String[] args) {
        Pet pet1 = new Pet("Florian", "3");
        Dog dog1 = new Dog("Christian", "4", true);

        Dog dog2 = new Dog("Zeshan", "5", false);

        Pet[] pets = new Pet[3];

        pets[0] = pet1;
        pets[1] = dog1;
        pets[2] = dog2;


        System.out.println(pets[1].getName());
    }
}
