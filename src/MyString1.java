public class MyString1 {
    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            this.chars[i] = chars[i];
        }
    }

    public char charAt(int index) {
        if (index < 0 || index >= chars.length) {
            throw new IndexOutOfBoundsException("Индекс вне границ");
        }
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        if (begin < 0 || end > chars.length || begin > end) {
            throw new IndexOutOfBoundsException("Неверный диапазон подстроки");
        }
        char[] subChars = new char[end - begin];
        for (int i = begin; i < end; i++) {
            subChars[i - begin] = chars[i];
        }
        return new MyString1(subChars);
    }

    public MyString1 toLowerCase() {
        char[] lowerChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            lowerChars[i] = Character.toLowerCase(chars[i]);
        }
        return new MyString1(lowerChars);
    }

    public static MyString1 valueOf(int i) {
        return new MyString1(Integer.toString(i).toCharArray());
    }

    public char[] toChars() {
        char[] copy = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            copy[i] = chars[i];
        }
        return copy;
    }

    public boolean equals(MyString1 obj) {
        if (obj == null || this.chars.length != obj.chars.length) {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if (this.chars[i] != obj.chars[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return new String(chars);
    }

    public static void main(String[] args) {
        char[] chars = {'П', 'р', 'и', 'в', 'е', 'т'};
        MyString1 str = new MyString1(chars);

        System.out.println("Оригинал: " + str);
        System.out.println("Символ по индексу 1: " + str.charAt(1));
        System.out.println("Длина: " + str.length());
        System.out.println("Подстрока (1, 4): " + str.substring(1, 4));
        System.out.println("Нижний регистр: " + str.toLowerCase());
        System.out.println("Значение числа 123: " + MyString1.valueOf(123));
        System.out.println("Массив символов: " + new String(str.toChars()));

        MyString1 str2 = new MyString1(new char[]{'П', 'р', 'и', 'в', 'е', 'т'});
        System.out.println("Равны: " + str.equals(str2));
    }
}