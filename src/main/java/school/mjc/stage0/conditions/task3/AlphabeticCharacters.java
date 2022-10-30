package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character < 'A' || (character > 'Z' && character < 'a') || character > 'z') {
            System.out.println("wrong alphabet!");

        }
        else if (character == 'A' ||
                character == 'I' ||
                character == 'O' ||
                character == 'U' ||
                character == 'E' ||
                character == 'a' ||
                character == 'i' ||
                character == 'o' ||
                character == 'u' ||
                character == 'e' ) {System.out.println("Vowel"); }
        else System.out.println("Consonant");
    }
}
