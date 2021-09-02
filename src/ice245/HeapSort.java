package ice245;

public class HeapSort {
	  
    public void sort(int arr[]) {
      int n = arr.length;
  
      //Rearrange array (building heap)
      for (int i = n / 2 - 1; i >= 0; i--) {
        heapify(arr, n, i);
      }
  
      //Extract elements from heap one by one
      for (int i = n - 1; i >= 0; i--) {
        //Current root moved to the end
        int tmp = arr[0];
        arr[0] = arr[i];
        arr[i] = tmp;
  
        heapify(arr, i, 0);//calling max heapify on the heap reduced
      }
    }
}