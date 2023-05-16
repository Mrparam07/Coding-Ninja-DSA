 public static void printmin(int arr[], int startIndex, int minsoFar){
        if(startIndex == arr.length){
            System.out.println(minsoFar);
            return;
        }
        int newMin = minsoFar;
        if(newMin > arr[startIndex]){
            newMin = arr[startIndex];
        }
        printmin(arr, startIndex+1, newMin);
    }
