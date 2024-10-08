class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }



    public String toString() {
        return "Animal : Famille = " + family + ", Nom = " + name + ", Âge = " + age + ", Mammifère = " + isMammal + " ";
    }
}

class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int nbAnimaux=0;
    

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
    }

    public void displayZoo() {
        System.out.println("Nom du Zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }
boolean addAnimal(Animal animal)

    public String toString() {
        return "Zoo : Nom = " + name + ", Ville = " + city + ", Nombre de cages = " + nbrCages + " ";
    }
}

public class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("My Zoo", "Tunis", 20);

        Animal lion = new Animal("Félins", "Lion", 5, true);

        myZoo.displayZoo();

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(lion);
        System.out.println(lion.toString());
    }
}

