package hu.nive.ujratervezes.adddigits;

public class AddDigits {
    public int addDigits(String message) {
        int sumOfDigits = 0;

        if (message == null || message.length() == 0) {
            return -1;
        }

        for (int i = 0; i < message.length(); i++) {
            char nextLetter = message.charAt(i);
            if (nextLetter >= '0' && nextLetter <= '9') {
                int foundedNextDigit = Integer.parseInt(String.valueOf(nextLetter));
                sumOfDigits += foundedNextDigit;
            }
        }
        return sumOfDigits;
    }
}
