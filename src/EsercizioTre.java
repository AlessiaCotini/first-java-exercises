public class EsercizioTre {
    int perimetroRettangolo (int lato, int altroLato){
        return lato * altroLato/2;}
    int pariOdispari (int numero){
        if (numero % 2 == 0){
            return 0;
        } else {return 1;}
    }
    double areaTriangolo (double lato, double altroLato, double ultimoLato){
        double s = (lato+altroLato+ultimoLato)/2;
        double risultato = s*(s-lato)*(s-altroLato)*(s-ultimoLato);
        return Math.sqrt(risultato);
    }
}
