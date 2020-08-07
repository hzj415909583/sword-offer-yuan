package upup.sort;

/**
 * 快速排序
 * 通过一趟排序将待排序记录分割成独立的两部分，其中一部分记录的关键字均比另一部分关键字小，
 * 则分别对这两部分继续进行排序，直到整个序列有序。
 *
 * @author shkstart
 * 2018-12-17
 */
public class QuickSort {
    private static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    //left 和 right 都是数组的下标
    private static void partition(int[] data, int left, int right) {
        //如果left等于right，即数组只有一个元素，直接返回
        if (left > right)
            return;

        int pivot = data[left];
        int i = left + 1;//left是否加1 都可以
        int j = right;

        while (true) {
            while (data[i] <= pivot && i < right) i++;
            while (data[j] >= pivot && j > left) j--;
            if (i < j) {
                swap(data, i, j);
            } else break;
        }
        swap(data, left, j);

        partition(data, left, j - 1);//递归调用
        partition(data, j + 1, right);
    }


    public static void quickSort(int[] data) {
        partition(data, 0, data.length - 1);
    }


    public static void main(String[] args) {
//        int[] data = {9, -16, 30, 23, -30, -49, 25, 21, 30};
        int[] data = {293, 108, 161, 783, 376, 265, 330, 598, 646, 812};

        System.out.println("排序之前：\n" + java.util.Arrays.toString(data));
        quickSort(data);
        System.out.println("排序之后：\n" + java.util.Arrays.toString(data));
    }
}
