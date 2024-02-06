package src.main.java.app;

import src.main.java.app.fileManager.FileManager;
import src.main.java.app.model.Buyer;
import src.main.java.app.model.Order;
import src.main.java.app.model.Product;
import src.main.java.app.model.exception.AmountException;
import src.main.java.app.model.exception.BuyerException;
import src.main.java.app.model.exception.ProductException;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private final static Buyer[] people = {
            new Buyer("Ivan", 20, "+234562362565"),
            new Buyer("Petr", 30, "+568856785464"),
    };
    private final static Product[] items = {
            new Product("Ball", 100),
            new Product("Sandwich", 3456),
            new Product("Table", 34574),
            new Product("Car", 2378),
            new Product("Rocket", 54678)
    };
    private static ArrayList<Order> orders = new ArrayList<>();

    public static void main(String[] args) {
        Object[][] purchasesArray = {
                {people[0], items[1], 4},
                {people[1], items[2], 6},
                {new Buyer("Stepan", 65, "+2938574235"), items[3], 45},
                {people[0], new Product("Pen", 21), 5},
                {people[0], items[1], -45},
        };
        for (var info : purchasesArray) {
            try {
                orders.add(purchase((Buyer) info[0], (Product) info[1], (Integer) info[2]));
            } catch (AmountException | BuyerException | ProductException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(orders.toString());

        FileManager<Order> fileManager = new FileManager<>("Order.txt");
        fileManager.createFile();
        fileManager.writeFile(orders);
        System.out.println("Всего покупок совершено: " + orders.size());

    }

    public static Order purchase(Buyer person, Product item, int amount)
            throws BuyerException, ProductException, AmountException {
        if (!Arrays.asList(people).contains(person))
            throw new BuyerException(String.format("Покупателя \n%s\n не существует! ", person.toString()) );
        if (!Arrays.asList(items).contains(item))
            throw new ProductException(String.format("Товара \n%s\n не существует! ", item.toString()));
        if (amount < 0)
            throw new AmountException("полученные неверные данные о количестве товара! \n");
        return new Order(item, person, amount);
    }

}
