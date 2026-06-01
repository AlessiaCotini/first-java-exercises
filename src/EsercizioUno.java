public class EsercizioUno {
    int moltiplica (int num1 , int num2){
     return num1 * num2;
    }
    String concatena (String stringa , int num){
        return stringa +" "+ Integer.toString(num);
    }

    String[] InserisciInArray (String[] array, String stringa){
       String[] nuovoArray = { array[0],array[1], stringa ,array[2], array[3],array[4]};
       return nuovoArray;
    }
}
