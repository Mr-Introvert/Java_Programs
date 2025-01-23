package Array2;
public class Array2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] arr3 =new int[n1+n2];
        int k= 0;

        for(int i=0; i<n1; i++){
            for(int j=0; j<n2; j++){
                if(arr1[i] <= arr2[i]){
                    arr3[k] = arr1[i];
                    k++;
                    break;
                }
                else{
                    arr3[k] = arr2[i];
                    k++;
                    break;
                }
            }
        }
        System.out.print("Merged array: ");
        for (int p=0; p<=arr3; p++) {
            System.out.print();
        }

    }
}
