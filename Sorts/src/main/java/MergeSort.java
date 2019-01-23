public class MergeSort {

    private MergeSort(){}

    public static void sort(int[] arr) {
        if(arr.length < 2){
            return;
        }
        int arrayLength = arr.length;
        int mid = arrayLength / 2;
        // create 2 sub-arrays
        int[] l = new int[mid];
        int[] r = new int[arrayLength - mid];
        // fill sub-arrays
        System.arraycopy(arr, 0, l, 0, mid);
        System.arraycopy(arr, mid, r, 0, arrayLength - mid);
        // recursively divide sub-arrays
        sort(r);
        sort(l);
        merge(arr, l, r, mid, arrayLength - mid);
    }

    private static void merge(int[] arr, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while(i < left && j < right){
            if(l[i] < r[j]){
                arr[k++] = l[i++];
            } else {
                arr[k++] = r[j++];
            }
        }
        while(i < left){
            arr[k++] = l[i++];
        }
        while(j < right){
            arr[k++] = r[j++];
        }
    }
}
