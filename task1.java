// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
/**
 * task1
 */
public class task1 {
    public static void main(String[] args) throws FileNotFoundException {
        int[] myArray; // объявление массива
        myArray = new int[5]; 
        myArray = arrayGeneration(5);
        System.out.print("Массив до сортировки: \t");
        myLib.printIntArray(myArray);
        delFile();
        sortArray(myArray);
        System.out.println();
        System.out.print("Массив после сортировки:");
        myLib.printIntArray(myArray);
        System.out.println();
        System.out.println("Шаги соортировки");
        readFile();
    }
    
    // Метод создания и заполения массива целыми числами
    public static int[] arrayGeneration(int size) {
        int[] randomArray;
        randomArray = new int[size]; 
        for (int i = 0; i < size; i++) {
            int a = (int) (Math.random() * 10);
            randomArray[i] = a;
        }
        return randomArray;
    }

    // Метод сортировки пузырьком
    public static int[] sortArray(int[] sortThis) {
        int temp;
        for (int i = 0; i < sortThis.length - 1; i++) {
            for (int j = 0; j < sortThis.length - i - 1; j++) {
                if (sortThis[j] > sortThis[j + 1]) {
                    // меняем элементы местами
                    temp = sortThis[j];
                    sortThis[j] = sortThis[j + 1];
                    sortThis[j + 1] = temp;
                    writeRow(sortThis);
                }
            }
        }
        return sortThis;
    }

    //метод записи в файл строки массива
    public static void writeRow(int[] arrayForSave) {
        try(FileWriter writer = new FileWriter("logSort.txt", true))
        {
            writer.write(myLib.arrayToString(arrayForSave));
            writer.append('\n');
            writer.flush();
            writer.close();
        }
        catch(IOException ex){
            
            System.out.println(ex.getMessage());
        } 
    }
    public static void readFile() throws FileNotFoundException {
        FileReader fr= new FileReader("logSort.txt");
        Scanner scan = new Scanner(fr);
            
        int i = 1;
        
        while (scan.hasNextLine()) {
            System.out.println(i + " : " + scan.nextLine());
            i++;
        }
        scan.close();
    }
    public static void delFile() {
        File file = new File("logSort.txt");
        file.delete();
    }
}
