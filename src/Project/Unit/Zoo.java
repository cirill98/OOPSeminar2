package Project.Unit;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public Zoo addAnimal(Animal animal) {
        animals.add(animal);
        return this;
    }

    public String talk() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Speakable item: getSpeakable()) {
            stringBuilder.append(item.speak()+"\n");
        }
        return stringBuilder.toString();
    }

    private List<Speakable> getSpeakable() {
        List<Speakable> result = new ArrayList<>();
        for (Animal a : animals) {
            if (a instanceof Speakable) {
                result.add((Speakable) a);
            }
        }
        result.add(new Radio());
        return result;
    }

    public List<Runable> getRunable(){
       List<Runable> result = new ArrayList<>();
        for (Animal item:animals) {
            if(item instanceof Runable){
                result.add((Runable) item);
            }
        }
        return result;
    }
    public int getChampion(){
        int max = 0;
        for (Runable item:getRunable()) {
            if (item.runSpeed()> max){
                max = item.runSpeed();
            }
        }
        return max;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Flyable> getFlyable(){
        List<Flyable> flyables = new ArrayList<>();
        for (Animal item:animals) {
            if (item instanceof Flyable) {
                flyables.add((Flyable) item);
            }
        }
        return flyables;
    }


    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + animals +
                '}';
    }
}
