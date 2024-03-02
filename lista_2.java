import java.util.Arrays;
public class lista_2 {
    public static int missingNumber (int[] tab) {
        Arrays.sort(tab);
        int x=-1;
        int roznica = tab[tab.length-1] - tab.length;

        // SPRAWDZANIE ILOSCI BRAKUJACYCH ELEMENTOW
        if (roznica>0){
            System.out.println("brakuje wiecej niz 1 element");
            return -1;
        }

        // SPRAWDZANIE CZY WYSTEPUJE ELEMENT UJEMNY BADZ ELEMENTY POWTARZAJA SIE
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                System.out.println("Element ujemny");
                return -2;
            }
            if (tab[i] == x) {
                System.out.println("Element powtarza sie");
                return -3;
            }
            x=tab[i];
        }

        // SZUKANIE BRAKUJACEGO ELEMENTU
        for (int i = 0; i < tab.length; i++) {
            if (tab[i]!=i) return i;
        }

        return 99;
    }

    public static String  isPalindrome (String word) {
        for (int i = 0; i < word.length()/2; i++) {
            if ( word.charAt(i) != word.charAt(word.length()-1-i) )  return "NO";
        }
        return "YES";
    }

    public static String printPascal (int height) {
        System.out.println("1");
        return "";
    }

    public static void main(String[] args) {
        // ZADANIE 1
        System.out.println("ZADANIE 1");
        int[] tab = new int[]{1, 4, 5, 3, 0, 6}; // N = 6
        System.out.println(missingNumber(tab));

        // ZADANIE 2
        System.out.println("\nZADANIE 2");
        String word  = "aabba";
        System.out.println(isPalindrome(word));

        // ZADANIE 3
        System.out.println("\nZADANIE 3");
        int height =3;
        System.out.println(printPascal(height));
    }
}