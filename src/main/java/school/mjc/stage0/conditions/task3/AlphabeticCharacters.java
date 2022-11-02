package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character == 'a'|| character == 'e' ||
                character == 'i' || character == 'u'|| character == 'o') {
            System.out.println("Vowel");
        } else if (!(character >= 'a' && character <= 'z' && character >= 'A' && character <= 'Z')) {
            System.out.println("wrong alphabet!");

        }
        else {
            System.out.println("Consonant");
        }
    }
}
