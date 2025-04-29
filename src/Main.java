import inventory.Inventory;
import products.*;

public class Main {
    public static void main(String[] args) {
        Inventory<Book> books = new Inventory<>();
        Inventory<Notebook> notebooks = new Inventory<>();
        Inventory<Accessory> accessories = new Inventory<>();

        books.addItems(new Book("a" , 20 , "ali" , "b" , "c"));
        books.addItems(new Book("d" , 30 ,"reza" , "e" , "f" ));

        notebooks.addItems(new Notebook("g" , 25, 300 , true));
        notebooks.addItems(new Notebook("h" , 40 , 250 , false));

        accessories.addItems(new Accessory("i" , 35 , "blue"));
        accessories.addItems(new Accessory("j" , 15 , "red"));

        books.displayAll();
        System.out.println();
        notebooks.displayAll();
        System.out.println();
        accessories.displayAll();
        System.out.println();

        books.removeItemsById("1000");
        notebooks.removeItemsById("2000");

        System.out.println(calculateTotalPrice(books));
        System.out.println(calculateTotalPrice(notebooks));
        System.out.println(calculateTotalPrice(accessories));
        System.out.println();

        System.out.println(books.findItemsById("1001"));
        System.out.println();
        System.out.println(notebooks.findItemsById("2000"));
        System.out.println();

        notebooks.applyDiscount("h" , 50);
        accessories.applyDiscount("i" , 20);

        books.displayAll();
        System.out.println();
        notebooks.displayAll();
        System.out.println();
        accessories.displayAll();
        System.out.println();
    }

    public static double calculateTotalPrice (Inventory<? extends Product> inventory){
        double sumPrice = 0;
        for(Product x : inventory.getItems()){
            sumPrice += x.getPrice();
        }
        return sumPrice;
    }
}