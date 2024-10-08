//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

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
        return "Animal Name: " + this.name + ", Family: " + this.family + ", Age: " + this.age + ", Mammal: " + this.isMammal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj != null && this.getClass() == obj.getClass()) {
            Animal animal = (Animal)obj;
            return this.name.equals(animal.name);
        } else {
            return false;
        }
    }
}
