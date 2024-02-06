## Домашняя работа четвёртого семинара Java Core

# Эмуляция интернет магазина

1. Написать классы:  
 [покупатель](https://github.com/UrijVig/ru.gb.core.java/blob/main/seminars/sem04/shop/src/main/java/app/model/Buyer.java)  
 [товар](https://github.com/UrijVig/ru.gb.core.java/blob/main/seminars/sem04/shop/src/main/java/app/model/Product.java)  
 [заказ](https://github.com/UrijVig/ru.gb.core.java/blob/main/seminars/sem04/shop/src/main/java/app/model/Order.java)

2. Создать массив покупателей, массив товаров и массив заказов:

    ```java
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
    ```
3. 
    * Cоздать статический метод “совершить покупку” со строковыми параметрами, соответствующими полям объекта заказа.  
    * Метод должен вернуть объект заказа  
    * Если в метод передан несуществующий покупатель, товар или отрицательное количество, метод должен выбросить соответствующее исключение (кастомное с информативным сообщением)

    ```java
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
    ```
4. Вызвать метод совершения покупки несколько раз таким образом, чтобы заполнить массив покупок возвращаемыми значениями. ***Обработать исключения.***

    ```java
    for (var info : purchasesArray) {
            try {
                orders.add(purchase((Buyer) info[0], (Product) info[1], (Integer) info[2]));
            } catch (AmountException | BuyerException | ProductException e) {
                System.out.println(e.getMessage());
            }
        }
    ```
5. Массив заказов записывать в [файл](https://github.com/UrijVig/ru.gb.core.java/blob/main/seminars/sem04/shop/Order.txt) (1 заказ - 1 строка).

    ```java
    FileManager<Order> fileManager = new FileManager<>("Order.txt");
        fileManager.createFile();
        fileManager.writeFile(orders);
    ```

    Класс [FileManager](https://github.com/UrijVig/ru.gb.core.java/blob/main/seminars/sem04/shop/src/main/java/app/fileManager/FileManager.java)

6. Вывести в консоль итоговое количество совершённых покупок после выполнения приложения.
    ```java
    System.out.println("Всего покупок совершено: " + orders.size());
    ```

[Реализация вышеописанного кода](https://github.com/UrijVig/ru.gb.core.java/blob/main/seminars/sem04/shop/src/main/java/app/Main.java)
[проект интернет магазина](https://github.com/UrijVig/ru.gb.core.java/tree/main/seminars/sem04/shop)