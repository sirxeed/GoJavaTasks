public class Encrypt {
    public static String encryptByCaesar(String string) {
        char[] chars = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder("");

        for (int i = 0; i < chars.length; i++) {
            chars[i] += 7; //Magic number
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }

    public static String decryptByCaesar(String string) {
        char[] chars = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder("");

        for (int i = 0; i < chars.length; i++) {
            chars[i] -= 7; //Magic number
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }
}
