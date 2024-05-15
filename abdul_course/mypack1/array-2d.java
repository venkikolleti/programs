class array{
	public static void main(String args[]){
		int arr[][]={{1,2,3,4},{5,6,7,8},{6,5,4,3}};
		int arr1[][]={{1,2,3,4},{5,6,7,8},{6,5,4,3}};
		int arr2[][]={{0,0,0,0},{0,0,0,0},{0,0,0,0}};

		for(int x[]:arr){
			for(int y:x){
				System.out.print(y+" ");
			}
			System.out.println();
		}


		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				//System.out.println(arr[i][j]);
				arr2[i][j]=arr[i][j]+arr1[i][j];
			}
		}

		for(int x[]:arr2){
			for(int y:x){
				System.out.print(y+" ");
			}
			System.out.println();
		}


	}
}
