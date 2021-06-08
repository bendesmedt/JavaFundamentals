package practicetest.entities.animal_entities;

public class Carnivore extends Animal{

    double maxFoodSize;

    public Carnivore(String name) {
        super(name);
    }

    public Carnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    @Override
    public String toString() {
        return "Carnivore[" +
                "name='" + name + '\'' +
                (weight != 0 ?", weight=" + weight : "") +
                (height != 0 ?", height=" + height : "") +
                (length != 0 ?", length=" + length : "") +
                ", maxFoodSize=" + maxFoodSize +
                ']';
    }
}
