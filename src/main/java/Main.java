import zoo.record.Animal;
import zoo.record.Owner;
import zoo.record.Specie;
import zoo.record.Zoo;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Some name", 29, "Some city, some street, 10");
        Specie cat = new Specie("Cat", 200);
        Specie dog = new Specie("Dog", 300);
        Animal chamberlain = new Animal(1, "Chamberlain", dog, 3, owner);
        Animal fedor = new Animal(2, "Fedor", cat, 10, owner);
        Animal anotherFedor = new Animal(2, "Fedor", cat, 10, owner);
        System.out.println(chamberlain);
        System.out.println(chamberlain.equals(fedor));
        System.out.println(anotherFedor.equals(fedor));
        // Returns IllegalArgumentException!
//        Zoo zoo = new Zoo(Set.of(chamberlain, fedor, anotherFedor));
        Set<Animal> animals = new HashSet<>();
        animals.add(chamberlain);
        animals.add(fedor);
        animals.add(anotherFedor);
        Zoo zoo = new Zoo(animals);
        System.out.println(zoo.totalFoodRequirement());
    }
}
