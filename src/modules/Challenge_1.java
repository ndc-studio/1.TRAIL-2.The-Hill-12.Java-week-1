package modules;

public class Challenge_1 {
    public static void challenge_1() {
        byte byteNum = 127;
        short shortNum = 32767;
        int intNum = 2147483647;
        long longNum = 53687106659985459L;
        float floatNum = 1.21235f;
        double doubleNum = 3.1415;
        char charLetter = 'H';
        boolean boolType = false;

        System.out.println("byte: " + byteNum);
        System.out.println("short: " + shortNum);
        System.out.println("int: " + intNum);
        System.out.println("long: " + longNum);
        System.out.println("float: " + floatNum);
        System.out.println("double: " + doubleNum);
        System.out.println("char: " + charLetter);
        System.out.println("boolean: " + boolType);
    }
}

/* 

EXTRA:
Question 1: Pourquoi peut-on afficher tous ces types de données aussi facilement ?
Réponse 1: Les valeurs des variables sont appellées dans un print sous le nom de la variable precité, le print affiche directement le resultat sur le terminal quand on appelle challenge_1() dans le Main.Java.

Question 2: Pourquoi les appelle-t-on des types primitifs ?
Réponse 2: Ils ne peuvent contenir que des valeurs limitées et que nous ne pouvons pas definir de nouvelles opérations avec ces valeurs

Question 3: Pourquoi ne peut-on pas affecter un double à un int ?
Réponse 3: Le Double es tun chiffre a virgule (décimales) tandis que le int est un nombre entier donc java ne permet pas d'affecter un double en int pour se faire il faudra le transformer en int au préalable.

Question 4: Mais alors, pourquoi peut-on affecter un int à un char ?
Réponse 4: On va dire qu'un char (character) peut etre converti en serie de chiffre unicode en gros si on affecte un int a un char java pourra le retranscrire

Question 5: Pourquoi ne peut-on pas affecter un long à un int ?
Réponse 5: Si j'ai bien compris les primitifs sont contenus dans un espace en bits et certaines variables sont en 2, 4, 8, 16bits etc le long luii utilise 64bits et le int seulement 32
ce qui ne permet pas a un "int" de contenir la longueur d'un "Long"

*/