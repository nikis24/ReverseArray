public class arrayReverse {

    /*This function swaps the array's first element with last element,  
      second element with last second element and so on*/
    public static void reverse(int a[], int n){
        int t, k, i;
        for(i=0; i < n/2; i++){
            t = a[i];
            a[i]= a[n-i-1];
            a[n-i-1] = t;
        }
        System.out.println("Reversed Array:\n");
        for(k=0; k<n ;k++){
            System.out.println(a[k]);
        }
    }

    /*printing the reversed array*/
    public static void main(String[] args){
        int [] arr = {10,24,34,13,20};
        reverse(arr, arr.length);
    }
    
}
