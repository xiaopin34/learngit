class MyArrays {
	public static void main(String[] args) {
		//元素组元素
		int [] arr ={6,2,1,7,9,2,6,7,8};
		//创建一个新数组,内部元素是原数组的个数;
		
		//调用repeatArr方法,将数组中不重复的元素放进新数组中;
		int[] newArr = repeatArr(arr);

		for (int b: newArr ) {
			System.out.print(b+"\t");
		}


		
	}
	/*该方法遍历原数组,外循环取到原数组中的所有元素,内循环取到新数组中的元素
	判断该元素在原数组中是否是重复的,如果不重复,就放到新数组中;*/
	public static int[] repeatArr(int[] arr){
		int[] newArr = new int[arr.length];     //创建新数组
		int index = 0;						  //定义一个新数组的下标索引

						  //定义一个boolean a
		for (int i =0;i<arr.length ;i++ ) {	  //外循环
			boolean a = false;	
			for (int j = 0;j < index ;j++ ) {  //内循环
				if (arr[i]==arr[j]) {
					a = true;
					break;
				}

			}
			if (!a) {
				newArr[index++] = arr[i];     //如果真的话,就将该元素放到新数组中,再将index下标加一
			}
		}

		int [] returnArr = new int[index];
		for (int i = 0;i<index ;i++ ) {
			returnArr[i] = newArr[i];
		}
		
		return returnArr;
	}
}
