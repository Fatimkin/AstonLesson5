public class Product {
    String name;
    String productionDate;
    String manufacturer;
    String country;
    int price;
    boolean isReserved; // true - заборонирован, false - свободен

    // Конструктор
    public Product(String name, String productionDate, String manufacturer, String country, int price, boolean isReserved) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.isReserved = isReserved;
    }
    // Метод для ввода инфо
    public void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println( "Произволитель: " + manufacturer);
        System.out.println ("Старна: " + country);
        System.out.println ("$: " + price);
        System.out.println ( "Бронирование: " + (isReserved ? "Забронировано" : "Свободно"));
    }
}
