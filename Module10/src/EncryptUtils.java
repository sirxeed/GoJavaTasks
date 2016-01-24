public class EncryptUtils {      //used this: http://rosettacode.org/wiki/Caesar_cipher#Java
    private static final int DEFAULT_CAESAR_SHIFT = 7;  //Shift key
    private static final int DEFAULT_ALPHABET_SIZE = 26;  //Alphabet

    public static String encryptByCaesar(String string, boolean encrypt) {
        return encryptByCaesar(string, encrypt, DEFAULT_CAESAR_SHIFT);
    }

    public static String encryptByCaesar(String string, boolean encrypt, int shift) {
        char[] chars = string.toCharArray();
        StringBuilder crypted = new StringBuilder();

        for (char i : chars) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    crypted.append((char) ('A' + (i - 'A' + shift * defineEncryptDirection(encrypt)) % DEFAULT_ALPHABET_SIZE));
                } else {
                    crypted.append((char) ('a' + (i - 'a' + shift * defineEncryptDirection(encrypt)) % DEFAULT_ALPHABET_SIZE));
                }
            } else {
                crypted.append(i);
            }
        }

        return crypted.toString();
    }

    private static int defineEncryptDirection(boolean encryptedFlag) {
        //Returns '-1' if string is already encrypted or '+1' if it doesn't
        if (encryptedFlag) {
            return -1;
        } else {
            return 1;
        }
    }
}