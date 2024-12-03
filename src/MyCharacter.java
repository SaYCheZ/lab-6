public class MyCharacter {
    private char value;

    public MyCharacter(char value) {
        this.value = value;
    }

    public char charValue() {
        return value;
    }

    public int compareTo(MyCharacter anotherCharacter) {
        return Character.compare(this.value, anotherCharacter.value);
    }

    public boolean equals(MyCharacter anotherCharacter) {
        return this.value == anotherCharacter.value;
    }

    public boolean isDigit() {
        return value >= '0' && value <= '9';
    }

    public static boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }

    public static boolean isLetter(char ch) {
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
    }

    public static boolean isLetterOrDigit(char ch) {
        return isDigit(ch) || isLetter(ch);
    }

    public static boolean isLowerCase(char ch) {
        return ch >= 'a' && ch <= 'z';
    }

    public static void main(String[] args) {
        MyCharacter ch1 = new MyCharacter('a');
        MyCharacter ch2 = new MyCharacter('1');
        MyCharacter ch3 = new MyCharacter('A');

        System.out.println("Значение символа ch1: " + ch1.charValue());
        System.out.println("Сравнение ch1 и ch3: " + ch1.compareTo(ch3));
        System.out.println("Равны ли ch1 и ch3: " + ch1.equals(ch3));
        System.out.println("Является ли 'a' цифрой: " + ch1.isDigit());
        System.out.println("Является ли '1' цифрой: " + MyCharacter.isDigit('1'));
        System.out.println("Является ли 'a' буквой: " + MyCharacter.isLetter('a'));
        System.out.println("Является ли '1' буквой или цифрой: " + MyCharacter.isLetterOrDigit('1'));
        System.out.println("Является ли 'a' строчной буквой: " + MyCharacter.isLowerCase('a'));
    }
}