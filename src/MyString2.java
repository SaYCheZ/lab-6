public class MyString2 {
    private char[] chars;

    public MyString2(char[] chars) {
        this.chars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            this.chars[i] = chars[i];
        }
    }

    public MyString2 substring(int begin) {
        if (begin < 0 || begin >= chars.length) {
            throw new IndexOutOfBoundsException("Неверный индекс начала подстроки");
        }
        char[] subChars = new char[chars.length - begin];
        for (int i = begin; i < chars.length; i++) {
            subChars[i - begin] = chars[i];
        }
        return new MyString2(subChars);
    }

    public MyString2 toUpperCase() {
        char[] upperChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            upperChars[i] = Character.toUpperCase(chars[i]);
        }
        return new MyString2(upperChars);
    }

    public char[] toChars() {
        char[] copy = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            copy[i] = chars[i];
        }
        return copy;
    }

    public static MyString2 valueOf(boolean b) {
        return b ? new MyString2(new char[]{'t', 'r', 'u', 'e'}) : new MyString2(new char[]{'f', 'a', 'l', 's', 'e'});
    }

    @Override
    public String toString() {
        return new String(chars);
    }

    // Метод main для демонстрации использования
    public static void main(String[] args) {
        char[] chars = {'п', 'р', 'и', 'в', 'е', 'т'};
        MyString2 str = new MyString2(chars);

        System.out.println("Оригинал: " + str);
        System.out.println("Подстрока (2): " + str.substring(2));
        System.out.println("Верхний регистр: " + str.toUpperCase());
        System.out.println("Массив символов: " + new String(str.toChars()));
        System.out.println("Значение true: " + MyString2.valueOf(true));
        System.out.println("Значение false: " + MyString2.valueOf(false));
    }
}