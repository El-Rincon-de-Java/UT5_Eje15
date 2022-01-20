package javier;

public class Main {

    public static void main(String[] args) {

        /* *****    Declaración y creación de arrays   ****/

        //Integer integerNumbers[]; BIEN
        //Integer[] integerNumbers; BIEN
        // = new Integer[10] BIEN       = new integerNumber[10]; MAL

        Integer[] integers = new Integer[10];
        int[] ints = new int[10];


        char[] chars = new char[10];
        Character[] characters = new Character[10];


        String[] days = new String[7];
        days[0] = "lunes";
        days[1] = "martes";
        days[2] = "miércoles";
        days[3] = "jueves";
        days[4] = "viernes";
        days[5] = "sábado";
        days[6] = "domingo";

        String[] literalDays = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};

        /* *****    Bucles y arrays   ****/
        // Podemos recorrer los arrays con cualquier bucle

        for (int i = 0; i < literalDays.length; i++) {
            System.out.println(literalDays[i]);
        }

        System.out.println("------------------------------");
        for (String day : literalDays) {
            System.out.println(day);
        }

        int index = 0;
        System.out.println("------------------------------");
        while (index < 7) {

            System.out.println(literalDays[index]);
            index++;
        }

        System.out.println("------------------------------");
        index = 0;
        do {
            System.out.println(literalDays[index]);
            index++;
        } while (index < 7);

        String word = "palabra";

        char[] charArrayOfWord2 = new char[word.length()];
        for (int i = 0; i < charArrayOfWord2.length; i++) {
            charArrayOfWord2[i] = word.charAt(i);
        }
        char[] charArrayOfWord3 = convertStringToChar(word);
        char[] charArrayOfWord =  word.toCharArray();

        showArrayChar(charArrayOfWord3);
        showArray(literalDays);
    }





    /* *****    String como arrays de char   ****/

    public static void showArrayChar(char[] arrayChar) {
        System.out.println("------------------------------");
        for (int i = 0; i < arrayChar.length; i++) {
            System.out.println(arrayChar[i]);
        }
    }

    public static char[] convertStringToChar(String word) {
        int lengthOfWord = word.length();
        char[] charArrayOfWord = new char[lengthOfWord];
        for (int i = 0; i < lengthOfWord; i++) {
            charArrayOfWord[i] = word.charAt(i);
        }
        return charArrayOfWord;
    }



    public static void showArray(Object[] array) {

        System.out.println("------------------------------");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}





