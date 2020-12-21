a)
public static int arraySum(int[] arr){
	int sum = 0;

	for(int n: arr){
		sum += n;
	}
	return sum;

	//ALT:
	for(int i = 0; i < arr.length; i++){
		sum += arr[i];
	}
}

b)
// grid[0] -> 1D array of the first row

// 1. make a 1d array with the correct # elements
// 2. loop over the 2d array
// 3. use arraySum method and sane result in 1d array
// 4. return your 1d array 

public static int[] rowSums(int[][] arr2D){
	int[] arr1D = new int[arr2D.length];
	for(int r = 0; r < arr2D.length; r++){
			int sum = arraySum(arr2D[r]);
			arr1D[r] = sum;
	}
	return arr1D;
}

c)
public static boolean isDiverse(int[][] arr2D){
	int[] sums = rowSums(arr2D);
	for(int i = 0; i < sums.length; i++){
		for(int j = i+1; j< sums.length; j++){
			if(sums[i] == sums[j])
				return false; //imeadietely returns false
		}
	}
	//get to this line if nothing has been returned yet
	return true;
}