package Latihan1ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ucup", 100);
        Hero hero2 = new Hero("Otong", 100);
        Hero heroAgility = new Hero("Dudung", 50);
        Hero heroIntel = new Hero("Johny", 20);

        ArrayList<Hero> listHero = new ArrayList<>();

        // operasi satu: menambah member dengan add 
        System.out.println("Operasi 1: add");
        listHero.add(hero1);
        listHero.add(hero2);
        listHero.add(heroAgility);
        System.out.println(listHero);
        System.out.println();

        // operasi dua: merubah member dengan set 
        System.out.println("Operasi 2: set");
        listHero.set(1, heroIntel);
        System.out.println(listHero);
        System.out.println();

        // operasi ketiga: menghapus member dengan remove 
        System.out.println("Operasi 3: remove");
        listHero.remove(1);
        System.out.println(listHero);
        System.out.println();

        // operasi keempat: mengakses member 
        System.out.println("Operasi 4: get");
        System.out.println(listHero);
        Hero heroAmbil = listHero.get(0);
        heroAmbil.setName("Farhan");
        System.out.println(listHero);
        heroAmbil.display();
        System.out.println();

        // method pada arraylist 
        System.out.println("method2");
        System.out.println("1. size()\t: " + listHero.size());
        System.out.println("2. isEmpty()\t: " + listHero.isEmpty());
        System.out.println("3. contains(hero2)\t: " + listHero.contains(hero2));
        System.out.println("   contains(heroAgility)\t: " + listHero.contains(heroAgility));
        System.out.println("4. indexOf(hero1)\t: " + listHero.indexOf(hero1));
        System.out.println("   indexOf(heroAgility)\t: " + listHero.indexOf(heroAgility));

        for (Hero list : listHero) {
            System.out.println(list);
        }
    }
}
