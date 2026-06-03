import java.util.Arrays;

public class Main {
public static void main(String[] args) {
    System.out.println("Hello");
    EsercizioUno esempio = new EsercizioUno();
    int prodotto = esempio.moltiplica(5, 6);
    System.out.println(prodotto);


    String concatenata = esempio.concatena("ciao", 5);
    System.out.println(concatenata);


    String[] lista = {"mela", "arancia", "susina", "banana", "fragola"};
    String[] inserisci = esempio.InserisciInArray(lista, "pera");
    System.out.println(Arrays.toString(inserisci));

    EsercizioTre altroEsempio = new EsercizioTre();
    int areaRettangolo = altroEsempio.perimetroRettangolo(6,4);
    System.out.println(areaRettangolo);

    int modulo = altroEsempio.pariOdispari(9);
    System.out.println(modulo);

    double areatriangolo = altroEsempio.areaTriangolo(6,8,4);
    System.out.println(areatriangolo);
}
}
