public class Parse {
    public static int ParseStringToInt(String string) throws IllegalCharException {
        //Convert string to char array
        char[] chars = string.toCharArray();

        byte[] digits = new byte[chars.length];

        for (int i = 0; i < chars.length; i++) {
            digits[i] = (byte) Character.getNumericValue(chars[i]);
        }

        int number = 0;
        //Convert digits array into number
        for (int i = digits.length - 1; i >= 0; i--) {
            number += digits[i] * Math.pow(10, digits.length - i - 1);
        }

        if (Integer.toString(number).equals(string)) {
            return number;
        }
        else {
            throw new IllegalCharException(string);
        }
    }
}
