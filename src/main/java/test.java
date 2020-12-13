public class test {

    /**
     * Exchange sort.
     * @param arr - init array.
     */
    static public void BubbleSort(int[] arr){
        for (int i = 0; i < arr.length; ++i)
            for (int j = 0; j < arr.length - i - 1; ++j)
                if (arr[j] > arr[j+1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
    }

    /**
     * Binary search in array.
     * @param arr - init array
     * @param x - the value we are looking for.
     * @return index of x | if x not found => -1
     */
    static public int BinarySearch(int[] arr, int x){
        int p = 1, r = arr.length, q;

        while (p <= r){
            q = (p + r) / 2;
            if (arr[q] == x)
                return q;
            else{
                if (arr[q] > x)
                    r = q - 1;
                else
                    p = q + 1;
            }
        }
        return -1;
    }

    public abstract class GeometricFigures{

    }

    public class Circle extends GeometricFigures{

    }
    public class Square extends GeometricFigures{

    }
    public class Triangle extends GeometricFigures{

    }
    public class Rect extends GeometricFigures{

    }











    static public void main(String[] args){
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = 10 - i;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
        BubbleSort(arr);

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
