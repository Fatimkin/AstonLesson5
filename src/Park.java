public class Park {
    String name;
    String location;

    // Внутренний класс для аттракционов
    class Attraction {
        String attractionName;
        String workingHours;
        int price;

        public Attraction(String attractionName, String workingHours, int price) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Аттракцион" + attractionName);
            System.out.println( "Часы работы: " + workingHours);
            System.out.println("Цена: " + price + "$");
        }
    }

    public Park(String name, String location) {
        this.name = name;
        this.location = location;
    }
}
