import java.sql.SQLOutput;

void main() {
    System.out.println("Hello World"); // Wypisz i zrób enter
    System.out.println("sout"); // sout

    System.out.print("Coś bez robienia entera");
    System.out.println("Nowa linia");

    System.out.println("W taki sposób robię znaki specjalne:");
    System.out.println("\ttabulacja");
    System.out.println("\nenter");
    System.out.println("To jest jak na maszynie\rdo pisania");
    System.out.println("\"cudzysłów\"");
    System.out.println("\'apostrof\'");
    System.out.println("backslash: \\");

    int liczbaCalkowita = 5;
    double liczbaRzeczywista;

    liczbaRzeczywista = (double) liczbaCalkowita / 2;
    System.out.println("Wynik dzielenia liczby 5 przez 2 to " + liczbaRzeczywista);

    char znak = 'a';
    System.out.println("Litera a ma wartość " + (znak + 0));

    String napis = "napis";
    System.out.println("Napis wielkimi literami: " + napis.toUpperCase());

    System.out.println("Wynik 1 + 2 + 3 = " + 1 + 2 + 3);
    System.out.println("Wynik 1 + 2 + 3 = " + (1 + 2 + 3));
    System.out.println(1 + 2 + 3 + "to wynik 1 + 2 + 3");


    System.out.println("Ania");
    System.out.println("Bartek");
    System.out.println("Kasia");

    String imie = "Paweł";
    int rokUrodzenia = 2009;
    double czasDoMatury = 0.66;

    int obecnyRok = 2026;
    int wiek = obecnyRok - rokUrodzenia;

    System.out.println("Mam na imię " + imie + ", mam " + wiek + " lat i będę pisać maturę za " + czasDoMatury + " roku.");


}