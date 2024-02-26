import src.Store;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addToy("1", 2, "конструктор");
        store.addToy("2", 2, "робот");
        store.addToy("3", 6, "Кукла");

        int count = 0;
        while(count < 10){
            store.get();
            count ++;
        }

    }
}
