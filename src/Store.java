package src;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

public class Store {
    private PriorityQueue<Toys> toys;
    private List<Toys> list;
    private Writer writer;

    public Store() {
        toys = new PriorityQueue<>();
        list = new ArrayList<>();
        writer = new Writer();
    }

    public void addToy(String id, int dischargeFrequency, String name) {
        Toys toy = new Toys(id, dischargeFrequency, name);
        list.add(toy);
        toys.add(toy);
    }

    public void get() {
        int totalWeight = 0;
        for (Toys toy : toys) {
            totalWeight += toy.getDischargeFrequency();
        }

        Random rand = new Random();
        double randomNumber = rand.nextDouble() * totalWeight;

        Toys randomToy = null;
        for (Toys toy : toys) {
            if (randomNumber < toy.getDischargeFrequency()) {
                randomToy = toy;
                break;
            }
            randomNumber -= toy.getDischargeFrequency();
        }
        writer.write(randomToy.toString());

    }
}
