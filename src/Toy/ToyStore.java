package Toy;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyStore {
    private List<Toy> toysList = new ArrayList<>();
    private List<Toy> prizeToysList = new ArrayList<>();

    public void addNewToy(Toy toy) {
        toysList.add(toy);
    }

    public void updateToyWeight(int toyId, double weight) {
        for (Toy toy : toysList) {
            if (toy.getId() == toyId) {
                toy.setWeight(weight);
                break;
            }
        }
    }

    public void drawPrizeToy() {
        double totalWeight = toysList.stream().mapToDouble(Toy::getWeight).sum();
        Random random = new Random();
        double randomWeight = random.nextDouble() * totalWeight;
        double currentWeight = 0;

        for (Toy toy : toysList) {
            currentWeight += toy.getWeight();
            if (randomWeight <= currentWeight) {
                Toy prizeToy = new Toy(toy.getId(), toy.getName(), 1, toy.getWeight());
                prizeToysList.add(prizeToy);

                toy.setQuantity(toy.getQuantity() - 1);

                File file = new File("prize_toys.txt");
                try {
                    FileWriter writer = new FileWriter(file, true);
                    writer.write(toy.getId() + " - " + toy.getName() + " - " + toy.getQuantity() + " - " + toy.getWeight() + "\n");
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                break;
            }
        }
    }

    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

        toyStore.addNewToy(new Toy(1, "Doll", 5, 20));
        toyStore.addNewToy(new Toy(2, "Car", 8, 30));
        toyStore.addNewToy(new Toy(3, "Teddy bear", 10, 50));

        toyStore.drawPrizeToy();
        toyStore.updateToyWeight(1, 15);
    }
}