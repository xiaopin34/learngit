class SectionJ {

	/**
	数组中特定下边位置的元素交换  (错误的版本,以供以后了解)
	*/
	public static void main(String[] args) {
		int[] arr ={2,5,6,7,3,9,1};
		
		exchange(arr);
		for(int k : arr){
			System.out.print(k+"\t");
		}
	}

	public static void exchange(int[] a){
		for (int i =0;i<a.length & i%2==1 ;i++ ) {//这是错的,一定要记住,这里的条件,for循环进不来
			a[i] = a[i]^a[i+2];          //而且,这里会数组下标越界
			a[i] = a[i]^a[i+2];
			a[i] = a[i]^a[i+2];
		}
	}
}
