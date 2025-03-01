public class ParkTest {
    public static void main(String[] args) {
        // Создаём парк
        Park disneyland = new Park("Disneyland", "USA");
        // Создаём аттракцион через внутренний класс
        Park.Attraction rollerCoaster = disneyland.new Attraction("Американские горки", "10:00 - 22:00", 500);
        Park.Attraction ferrisWheel = disneyland.new Attraction("Колесо обозрения", "09:00 - 20:00", 300);

        // Выводим  инфу
        rollerCoaster.printInfo();
        ferrisWheel.printInfo();
    }
    }
