// Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
public class task3 {
    public static void main(String[] args) {
        if (isPolindrome("12321")) {
            System.out.println("да");
        }
        else{
            System.out.println("нет");
        }
    }
    // Метод определяет является ли строка полиндромом или нет
    public static boolean isPolindrome(String polindrome) {
        int lengthPol = polindrome.length();
        // При строоках длинной в 1 или 0 символов возвращаем False
        if (lengthPol == 0 || lengthPol == 1) {
            return false;
        }
        for (int i = 0; i < lengthPol/2; i++) {
            if (polindrome.charAt(i) != polindrome.charAt(lengthPol-1 - i)) {
                return false;
            }
        }
        return true;
    }
}
