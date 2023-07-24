package Project.Unit;

public class main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat("Dimka", 4, "Oleg"))
                .addAnimal(new Dog("Tuzik", 4, "Petr"))
                .addAnimal(new Duck("Donald", 2, "Ivan"))
                .addAnimal(new Eagle("Trut", 2, "Sasha"));
        System.out.println(zoo.toString());
        System.out.println(zoo.talk());
        for (Runable i: zoo.getRunable()) {
            System.out.println(i.runSpeed());
        }
        System.out.println(zoo.getChampion());
        System.out.println("-------------");
        for (Flyable i: zoo.getFlyable()) {
            System.out.println(i.flySpeed());
        }
        SaveManagerAnimal saveManagerAnimal = new SaveManagerAnimal();
        saveManagerAnimal.save(zoo.getAnimals());
    }
}
