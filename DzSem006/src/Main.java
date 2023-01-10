import java.util.HashSet;
import java.util.Set;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
// Реализовать в java. Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет
// ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
//   1 - ОЗУ
//   2 - Объем ЖД
//   3 - Операционная система
//   4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации
// можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
public class Main {
    public static void main(String[] args) {
        NoutBook asus1 = new NoutBook("Intel", "P1", 8, 500, "Windows");
        Brand BrandAsus = new Brand("Asus", "Korea","english");
        asus1.addBrand(BrandAsus);
        NoutBook asus2 = new NoutBook("AMD", "R1", 4, 1000, "Windows");
        asus2.addBrand(BrandAsus);
        NoutBook asus3 = new NoutBook("Intel", "P2", 4, 300, "Windows");
        asus3.addBrand(BrandAsus);
        NoutBook dell1 = new NoutBook("Intel", "P3", 16, 500, "Linux");
        Brand BrandDell = new Brand("Dell", "Korea","english");
        dell1.addBrand(BrandDell);
        NoutBook dell2 = new NoutBook("Intel", "P4", 8, 600, "Windows");
        dell2.addBrand(BrandDell);
        NoutBook dell3 = new NoutBook("AMD", "R2", 8, 1000, "Windows");
        dell3.addBrand(BrandDell);
        NoutBook lenovo1 = new NoutBook("AMD", "R2", 4, 500, "Linux");
        Brand BrandLenovo = new Brand("Lenovo", "China","english");
        lenovo1.addBrand(BrandLenovo);
        NoutBook lenovo2 = new NoutBook("AMD", "R3", 16, 300, "Windows");
        lenovo2.addBrand(BrandLenovo);
        NoutBook lenovo3 = new NoutBook("Intel", "P1", 8, 1000, "Windows");
        lenovo3.addBrand(BrandLenovo);

        Set <NoutBook> books = new HashSet<>();
        books.add(asus1); books.add(asus2); books.add(asus3);
        books.add(dell1); books.add(dell2); books.add(dell3);
        books.add(lenovo1); books.add(lenovo2); books.add(lenovo3);
//        System.out.println(books);


        NoutBook Filter = new NoutBook();
        System.out.println(Filter.FindBook(books));

    }


}