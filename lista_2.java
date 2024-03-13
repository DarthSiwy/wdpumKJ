import java.util.Arrays;

public class lista_2 {
    // ZADANIE 1
    static int missingNumber (int[] tab) {
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
                System.out.println("element ujemny");
                return -2;
            }
            if (tab[i] == x) {
                System.out.println("element powtarza sie");
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

    // ZADANIE 2
    public static String  isPalindrome (String word) {
        for (int i = 0; i < word.length()/2; i++) {
            if ( word.charAt(i) != word.charAt(word.length()-1-i) )  return "false";
        }
        return "true";
    }

    // ZADANIE 3
    public static void printPascal (int height) {
        for (int i = 0; i < height; i++) {
            for (int space = 0; space < height - i - 1; space++) {
                System.out.print(" ");
            }

            int x = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(x + " ");
                x = x * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // ZADANIE 1
        System.out.println("ZADANIE 1");
        int[] tab = new int[]{2, 4, 5, 3, 0, 6};
        System.out.println(missingNumber(tab));

        // ZADANIE 2
        System.out.println("\nZADANIE 2");
        String word  = "abba";
        System.out.println(isPalindrome(word));

        // ZADANIE 3
        System.out.println("\nZADANIE 3");
        int height = 4;
        printPascal(height);
    }
}