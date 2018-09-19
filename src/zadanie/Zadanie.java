package zadanie;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Zadanie {

    public static void main(String[] args) {

        Bank b = new Bank();
        b.atmBanking();

        HashSet mnozina1 = new HashSet();
        System.out.println("Enter 5 number");
        Scanner scan = new Scanner(System.in);
        int number = 0;
        for (int i = 0; i < 5; i++) {
            String input = scan.next();
            mnozina1.add(input);
            number = number + Integer.parseInt(input);
        }
        System.out.println(number / 5);

        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> mnozina = new HashSet();
        HashSet<Integer> mnozina2 = new HashSet();
        HashSet mnozinaZjednotena = new HashSet();

        for (int i = 0; i < 10; i++) {
            String input = scanner.next();
            mnozina.add(Integer.parseInt(input));
        }
        for (int i = 0; i < 10; i++) {
            String input = scanner.next();
            mnozina2.add(Integer.parseInt(input));
        }
        System.out.println("Prienik");
        for (Integer i : mnozina) {
            if (mnozina2.contains(i)) {
                System.out.println(i);
            }
        }
        System.out.println("ROzdiel");
        for (Integer integer : mnozina) {
            if (!mnozina2.contains(integer)) {
                System.out.println(integer);
            }
        }

        mnozinaZjednotena.addAll(mnozina);
        mnozinaZjednotena.addAll(mnozina2);
        System.out.println(mnozinaZjednotena);

        ArrayList<Person> users = new ArrayList();
        Person p1 = new Person();
        Person p2 = new Person();
        p2.setName("Username3");
        p1.setName("UserName1");
        p.setName("UserName");
        users.add(p);
        users.add(p1);
        users.add(p2);

        for (int i = 0; i < 3; i++) {
            System.out.println(users.get(i).getName());
        }

    }
}
