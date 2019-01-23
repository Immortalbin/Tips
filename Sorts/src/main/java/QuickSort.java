public class QuickSort  {

    private QuickSort(){}

    public static <T extends Comparable<? super T>> void sort(T[] array) {
        sort(array, 0, array.length - 1);
    }

    private static <T extends Comparable<? super T>> void sort(T[] array, int left, int right) {
        // номер элемента массива относительно которого слева лежат элементы меньше, чем этот, а справа больше, чем этот
        int partition = partition(array, left, right);
        if (left < right) {
            if (left < partition - 1) {
                sort(array, left, partition -1);
            }
            if (partition < right) {
                sort(array, partition, right);
            }
        }
    }

    private static <T extends Comparable<? super T>> int partition(T[] array, int i, int j) {
        T tmp, pivot = array[(i + j) / 2];
        while (i <= j) {
            while (array[i].compareTo(pivot) < 0) {
                i++;
            }
            while (array[j].compareTo(pivot) > 0) {
                j--;
            }
            if (i <= j) {
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }

}

