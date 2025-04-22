package modules;

public class Challenge_2 {
    public static void challenge_2() {
        Byte byteNum = 127;
        Short shortNum = 32767;
        Integer intNum = 2147483647;
        Long longNum = 53687106659985459L;
        Float floatNum = 1.21235f;
        Double doubleNum = 3.1415;
        Character charLetter = 'H';
        Boolean boolType = false;

        System.out.println(
            "Byte: " + byteNum + "\nShort: " + shortNum + "\nInteger: " + intNum +
            "\nLong: " + longNum + "\nFloat: " + floatNum + "\nDouble: " + doubleNum +
            "\nCharacter: " + charLetter + "\nBoolean: " + boolType
        );
    }
}


/*
 Très extra : Existe-t-il un moyen de parcourir toutes les variables automatiquement et d'avoir seulement une déclaration print ? Si oui, pourquoi cela n'était-il pas possible avec les types primitifs ?
 Réponse : oui effectivement on peut toutes les appeller dans un seul print contrairement aux primitifs, et la raison est que les types primitifs ne sont pas enregistrés de la même manière que les objets et ne sont
 pas concidérés comme des références vers des données mais comme des données a l'état brute.
 */