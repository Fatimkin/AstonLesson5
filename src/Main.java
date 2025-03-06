public class Main {
    public static void main(String[] args) {
       // Создаем массив товаров
       Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Sumsung S25 Ultra", "01.02.2025", "Samsung.Corp." , "Korea", 599, true);
        productsArray[1] = new Product("Iphone 15", "10.09.2024", "Apple" , "USA", 999, false);
        productsArray[2] = new Product("Xiaomi Mi 15", "05.05.2024", "Xiaomi", "China", 399, true);
        productsArray[3] = new Product("Sony PlayStation 6", "11.11.2025", "Sony" , "Japan", 899, false);
        productsArray[4] = new Product("MacBook Pro M4", "20.08.2024", "Apple" , "USA", 1299, true);

        // Вывод инфо о всех товарах
        for (Product product: productsArray) {
            product.printInfo();
        }
    }


}
