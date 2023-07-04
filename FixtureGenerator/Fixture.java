import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fixture {
    public static void main(String[] args) {
        List<String> takimlar = new ArrayList<>();
        takimlar.add("Beşiktaş");
        takimlar.add("Başakşehir");
        takimlar.add("Fenerbahçe");
        takimlar.add("Trabzonspor");
        takimlar.add("Bursaspor");
        takimlar.add("Galatasaray");


        if (takimlar.size() % 2 != 0) {
            takimlar.add("Bay");
        }

        List<String> evSahibiTakimlar = new ArrayList<>();
        List<String> deplasmanTakimlar = new ArrayList<>();

        int takimSayisi = takimlar.size();
        int haftaSayisi = takimSayisi - 1;

        for (int i = 0; i < takimSayisi / 2; i++) {
            evSahibiTakimlar.add(takimlar.get(i));
            deplasmanTakimlar.add(takimlar.get(takimSayisi - 1 - i));
        }

        for (int hafta = 0; hafta < haftaSayisi; hafta++) {
            System.out.println("Hafta " + (hafta + 1) + ":");
            for (int i = 0; i < takimSayisi / 2; i++) {
                System.out.println(evSahibiTakimlar.get(i) + " - " + deplasmanTakimlar.get(i));
            }

            Collections.rotate(evSahibiTakimlar.subList(1, evSahibiTakimlar.size()), 1);
            Collections.rotate(deplasmanTakimlar.subList(0, deplasmanTakimlar.size() - 1), 1);
        }
    }
}
