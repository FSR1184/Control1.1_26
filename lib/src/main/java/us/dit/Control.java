//uvus:FSR1184
//pass:441

package us.dit;

public class Control {

    public static void main(String[] args) {
        System.out.println(contarPalabras("IS es muy divertido"));
    }

    public static int contarPalabras(String texto) {
        return texto.trim().split(" ").length;
    }
}
