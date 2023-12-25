import java.util.*;
import java.util.stream.Collectors;

class Laptop {
    String brand, os, color;
    int ram, storage;

    public Laptop(String brand, int ram, int storage, String os, String color) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ноутбук{" +
                "Бренд = '" + brand + '\'' +
                ", ОЗУ = " + ram +
                ", Объем ЖД = " + storage +
                ", Операционная система = '" + os + '\'' +
                ", Цвет = '" + color + '\'' +
                '}';
    }
}

public class LaptopStore {
    private Set<Laptop> laptops;

    public LaptopStore() {
        laptops = new HashSet<>();
    }

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    public Set<Laptop> filterLaptops(Map<Integer, Object> filters) {
        return laptops.stream()
                .filter(laptop -> {
                    for (Map.Entry<Integer, Object> entry : filters.entrySet()) {
                        Integer key = entry.getKey();
                        Object value = entry.getValue();

                        switch (key) {
                            case 1:
                                if (!laptop.brand.equals(value)) return false;
                                break;
                            case 2:
                                if (laptop.ram < (int) value) return false;
                                break;
                            case 3:
                                if (laptop.storage < (int) value) return false;
                                break;
                            case 4:
                                if (!laptop.os.equals(value)) return false;
                                break;
                            case 5:
                                if (!laptop.color.equals(value)) return false;
                                break;
                        }
                    }
                    return true;
                })
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        LaptopStore laptopStore = new LaptopStore();

        // Add some laptops to the store
        laptopStore.addLaptop(new Laptop("HP", 8, 512, "Windows", "Silver"));
        laptopStore.addLaptop(new Laptop("Dell", 16, 1024, "Linux", "Black"));
        laptopStore.addLaptop(new Laptop("Lenovo", 12, 256, "Windows", "White"));

        // Display available criteria
        System.out.println("Введите цифру, соответствующую необходимому критерию: \n1 - Бренд \n2 - ОЗУ\n3 - Объем ЖД\n4 - Операционная система\n5 - Цвет");
        Scanner in = new Scanner(System.in);
        int criterion = in.nextInt();


        Scanner scanner = new Scanner(System.in);
        Map<Integer, Object> filters = new HashMap<>();
        if (criterion == 2 || criterion == 3) {
            System.out.print("Введите минимальное значение: ");
            Object value = scanner.nextInt();
            filters.put(criterion, value);
        } else {
            System.out.print("Введите критерий: ");
            Object value = scanner.next();
            filters.put(criterion, value);
        }

        // Filter laptops based on criteria
        Set<Laptop> filteredLaptops = laptopStore.filterLaptops(filters);

        // Display filtered laptops
        System.out.println("Вам подойдут:");
        filteredLaptops.forEach(System.out::println);
    }
}