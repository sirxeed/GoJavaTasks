public class EncryptUtils {      //used this: http://rosettacode.org/wiki/Caesar_cipher#Java
    private static final int DEFAULT_CAESAR_SHIFT = 7;  //Shift key
    private static final int DEFAULT_ALPHABET_SIZE = 26;  //Alphabet

    public static String caesarEncryptionMethod(String string, boolean isEncrypted) {
        char[] chars = string.toCharArray();
        StringBuilder crypted = new StringBuilder();

        for (char i : chars) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    crypted.append((char) ('A' + (i - 'A' + DEFAULT_CAESAR_SHIFT * encrypted(isEncrypted)) % DEFAULT_ALPHABET_SIZE));
                    System.out.println(encrypted(isEncrypted));
                } else {
                    crypted.append((char) ('a' + (i - 'a' + DEFAULT_CAESAR_SHIFT * encrypted(isEncrypted)) % DEFAULT_ALPHABET_SIZE));
                }
            } else {
                crypted.append(i);
            }
        }

        return crypted.toString();
    }

    public static String caesarEncryptionMethod(String string, boolean isEncrypted, int shift) {
        char[] chars = string.toCharArray();
        StringBuilder crypted = new StringBuilder();

        for (char i : chars) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    crypted.append((char) ('A' + (i - 'A' + shift * encrypted(isEncrypted)) % DEFAULT_ALPHABET_SIZE));
                    System.out.println(encrypted(isEncrypted));
                } else {
                    crypted.append((char) ('a' + (i - 'a' + shift * encrypted(isEncrypted)) % DEFAULT_ALPHABET_SIZE));
                }
            } else {
                crypted.append(i);
            }
        }

        return crypted.toString();
    }

    private static int encrypted(boolean isEncrypted) {
        if (isEncrypted) {
            return -1;
        } else {
            return 1;
        }
    }

}
