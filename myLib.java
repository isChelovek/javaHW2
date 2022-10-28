import java.util.Scanner; // импортируем класс
public class myLib {
    public static int getInt() 
    {
        int result = 0;
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        System.out.print("Введите целое число: ");
        boolean condition = false;
        while (!condition) 
        {
            condition = sc.hasNextInt();
            if(condition) 
            { 
                result = sc.nextInt(); 
            } 
            else 
            {
                System.out.println("Вы ввели не целое число");
                System.out.print("Введите целое число: ");
                sc.next();
                condition = false;
            }
        }
        sc.close();
        return result;
    }
    public static int getIntMinMax(int min, int max)
    {
        int result = 0;
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        boolean condition = false;
        boolean done      = false;
        while (!done) 
        {
            System.out.printf("Введите целое число (min - %d, max - %d): ", min, max);
            condition = sc.hasNextInt();
            if(condition) 
            { 
                result = sc.nextInt(); 
                if ((result >= min) & (result <= max)) 
                {
                    done = true;
                }
                else
                {
                    condition = false;
                }
            } 
            if(!condition) 
            {
                 System.out.println("Вы ввели не целое число");
                 condition = false;
                 sc.nextLine();
            }
        }
        sc.close();
        return result;
    }
    public static void printIntArray(int[] printThis) {
        if (printThis.length != 0) {
            System.out.printf("[%d", printThis[0]);
            for (int i = 1; i < printThis.length; i++) {
                System.out.printf(", %d", printThis[i]);
            }
            System.out.print("]");
        } else {
            System.out.print("the array is empty");
        }
    }

    public static String arrayToString(int[] intArray)
    {
        if (intArray == null || intArray.length == 0) {
            return "[]";
        }
        
        String str ="[" + String.valueOf(intArray[0]);
        for (int i = 1; i < intArray.length; i++) {
            str = str.concat(", ").concat(String.valueOf(intArray[i]));
        }
        return str + "]";
    }
    public static void name() {
        
    }

    public static void main(String[] args) {
        int[] ar = new int[] {};
        arrayToString(ar);
        printIntArray(ar);
        // int result = getIntMinMax(0, 5);
    }


}