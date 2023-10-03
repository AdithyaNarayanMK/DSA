package ArraysHashMap.Algorithms;

public class BinarySearch {


    /*
        T.C - O(log(n)) [Worst Case]

     */
    public static Boolean BinarySearchRecursive(int[] array,int start,int end,int element){
        if(start>end){
            return false;
        }
        int mid = start + (end-start)/2;
        if(array[mid] == element){
            return true;
        } else if (array[mid] >= element) {
            return BinarySearchRecursive(array,start,mid-1,element);
        }else{
          return  BinarySearchRecursive(array,mid+1,end,element);
        }
    }


    public static Boolean BinarySearch(int[] array,int element){
        boolean find = false;
        int start = 0;
        int end = array.length -1;

        while (start <= end ){
            int mid = start + (end - start)/2;
            if(array[mid] == element){
                return true;
            } else if (array[mid] > element) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return find;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int element = 11;
        System.out.println(BinarySearch(array,element));
        System.out.println(BinarySearchRecursive(array,0,array.length-1,element));
    }
}
