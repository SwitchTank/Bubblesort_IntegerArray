public class App {

    public static void main(String[] args) {

        System.out.println("Original Array 1: ");
        int [] intarray1 = {3,654,43,22,9,7892,11,453};
        Bubblesort_Array bubble1 = new Bubblesort_Array();
        watchArray(intarray1);

        System.out.println("Bubbble Sort Iterative Implementation: ");
        bubble1.bubbleSortInt(intarray1);
        watchArray(intarray1);



        System.out.println("Original Array 2: ");
        int [] intarray2 = {100, 7983, 22, 8912, 3, 465};
        Bubblesort_Array bubble2 = new Bubblesort_Array();
        watchArray(intarray2);

        System.out.println("Bubbble Sort Recursive Implementation: ");
        bubble2.bubbleSortRekursiv(intarray2);
        watchArray(intarray2);



        System.out.println("Original Array 3: ");
        int [] intarray3 = {33, 44, 22, 11, 77, 55};
        Bubblesort_Array bubble3 = new Bubblesort_Array();
        watchArray(intarray3);

        System.out.println("Bubbble Sort Recursive Implementation: ");
        bubble3.bubbleSortRekursiv(intarray3);
        watchArray(intarray3);

    }

    public static void watchArray(int [] array) {
        for (int i : array) {
            System.out.print(i + "; ");
        }
        System.out.println("\n");
    }




}
