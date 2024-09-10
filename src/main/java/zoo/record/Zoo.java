package zoo.record;

import java.util.Set;

public record Zoo(Set<Animal> animals) {
    public int totalFoodRequirement() {
        return animals.stream()
                .map(animal -> animal.specie().foodRequirementInGramsPerDay())
                .reduce(0, Integer::sum);
    }
}
