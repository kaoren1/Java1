import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество воды в мл: ");
        int water = sc.nextInt();
        System.out.println("Введите количество соли в граммах: ");
        int salt = sc.nextInt();
        System.out.println("Введите количество масла в мл: ");
        int oil = sc.nextInt();
        System.out.println("Введите количество муки в граммах: ");
        int flour = sc.nextInt();
        System.out.println("Введите количество сухих дрожжей в граммах: ");
        int yeasts = sc.nextInt();

        System.out.println("Введите количество томатного соуса в граммах: ");
        int sause = sc.nextInt();
        System.out.println("Введите количество пепперони в граммах: ");
        int pepperoni = sc.nextInt();
        System.out.println("Введите количество сыра в граммах: ");
        int cheese = sc.nextInt();

        sc.nextLine();
        System.out.println("Введите рецепт приготовления: ");
        var recipe = sc.nextLine();

        PrintWriter pw = new PrintWriter("recipe_Pepperoni.txt");
        pw.println("Ингридиенты для приготовления пиццы Пепперони: ");
        pw.println(water + "мл воды");
        pw.println(salt + "грамм соли");
        pw.println(oil + "мл масла");
        pw.println(flour + "грамм муки");
        pw.println(yeasts + "грамм сухих дрожжей");
        pw.println(sause + "грамм томатного соуса");
        pw.println(pepperoni + "грамм пепперони");
        pw.println(cheese + "грамм сыра");
        pw.println("Рецепт приготовления: ");
        pw.println(recipe);
        pw.close();
    }
}