import java.util.Scanner;

public class MemoryManagementDemoRunner {

    public static void main (String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Pick your demo:");
            System.out.println("1 - java.lang.OutOfMemoryError: Java heap space. ");
            System.out.println("2 - java.lang.OutOfMemoryError: Metaspace. ");
            System.out.println("3 - java.lang.StackOverflowError.");
            int num = sc.nextByte();

            switch (num) {
                case 1: {
                    memoryHeap();
                    break;
                }
                case 2: {
                    memoryMetaspace();
                    break;
                }
                case 3: {
                    stack();
                    break;
                }
                default:{
                    System.out.println("Wrong input, enter num from 1 to 3");
                }
            }
        }
    }

    private static void memoryHeap (){
        Long maxMemory = Runtime.getRuntime().maxMemory();
        int[] matrix = new int[(int) (maxMemory + 1)];
        for(int i = 0; i < matrix.length; ++i){
            matrix[i] = i+1;
        }
    }

    private static void memoryMetaspace(){
        Long maxMemory = Runtime.getRuntime().maxMemory();
        int[] matrix = new int[(int) (maxMemory + 1)];
        for(int i = 0; i < matrix.length; ++i){
            matrix[i] = i+1;
        }
    }
    private static void stack (){
        A a = new A();
    }
}
