public class SortQuck {
    public static void main(String[] args) {
        sortQuick(new int[] {5, 3, 4, 7, 2}, 0, 4);
    }

    private static int[] sortQuick(int[] data, int left, int right) {
        int key = data[left];
        int start = left;
        int end = right;
        while (start < end) {
            while (start < end && key <= data[end]) end--;
            data[start] = data[end];
            while (start < end && key > data[start]) start++;
            data[end] = data[start];
        }

        data[start] = key;
        if (start > left) sortQuick(data, left, start - 1);
        if (start < right) sortQuick(data, start + 1, right);

        return data;
    }

}
