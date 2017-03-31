class SectionK {
	/**
	数组中特定下边位置的元素交换  (正确的版本,以供以后了解)
	*/
	public static void main(String[] args) {
		int[] arr ={2,5,6,7,3,9,1};
		
		exchange(arr);
		for(int k : arr){
			System.out.print(k+"\t");
		}
	}

	public static void exchange(int[] a){
		for (int i =0;i<a.length ;i++ ) {//这里的条件,for循环进来
			if (i%2==1&&i+2<a.length) {   //这里下标越界的问题得到了解决,要判断i+2是否满足小于a.length
				a[i] = a[i]^a[i+2];          
				a[i+2] = a[i]^a[i+2];
				a[i] = a[i]^a[i+2];
			}
			
			
		}
	}
}
