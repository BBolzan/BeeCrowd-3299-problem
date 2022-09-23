package hello;

public class SmallUnluckNumbers {
    public String contemNumero13(long numero){
        String number = Long.toString(numero);

        if(number.contains("13")){
            return numero + " es de Mala Suerte";
        }else {
            return numero + " NO es de Mala Suerte";
        }
    }
}

