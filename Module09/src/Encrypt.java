public class Encrypt {
    public static String encryptByCaesar(String string) {
        char[] chars = string.toCharArray();
        int k = 7;  //Ключ коду
        StringBuilder encrypted = new StringBuilder("");

        for (char i : chars) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encrypted.append((char) ('A' + (i - 'A' + k) % 26));
                } else {
                    encrypted.append((char) ('a' + (i - 'a' + k) % 26));
                }
            } else {
                encrypted.append(i);
            }
        }
        return encrypted.toString();
    }

    public static String decryptByCaesar(String string) {
        char[] chars = string.toCharArray();
        int k = 7; //Ключ коду
        StringBuilder decrypted = new StringBuilder("");

        for (char i : chars) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    decrypted.append((char) ('A' + (i - 'A' - k) % 26));
                } else {
                    decrypted.append((char) ('a' + (i - 'a' - k) % 26));
                }
            } else {
                decrypted.append(i);
            }
        }
        return decrypted.toString();
    }
}
