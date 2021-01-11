/**
 * Bubblesort Java Array Integer
 * @author SwitchTank
 */

public class Bubblesort_Array {
    /**
     * Iterative Implementation of Bubblesort Algorithm
     * @param array
     * @return sorted array
     */
    public int[] bubbleSortInt(int[] array) {
        int temp;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    /**
     * Recursive Implementation of Bubblesort Algorithm
     * @param array
     * @return sorted array
     */

    //Version1
    public int[] bubbleSortRekursiv(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) continue;
            {
                int tmp;
                tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                bubbleSortRekursiv(array);
            }
        }
        return array;
    }

    //Version2
    public int[] bubbleSortRekursivBack(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
            {
                int tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                bubbleSortRekursivBack(array);
            }
        }
        return array;
    }




}
