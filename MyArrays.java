class MyArrays {
	public static void main(String[] args) {
		//Ԫ����Ԫ��
		int [] arr ={6,2,1,7,9,2,6,7,8};
		//����һ��������,�ڲ�Ԫ����ԭ����ĸ���;
		
		//����repeatArr����,�������в��ظ���Ԫ�طŽ���������;
		int[] newArr = repeatArr(arr);

		for (int b: newArr ) {
			System.out.print(b+"\t");
		}


		
	}
	/*�÷�������ԭ����,��ѭ��ȡ��ԭ�����е�����Ԫ��,��ѭ��ȡ���������е�Ԫ��
	�жϸ�Ԫ����ԭ�������Ƿ����ظ���,������ظ�,�ͷŵ���������;*/
	public static int[] repeatArr(int[] arr){
		int[] newArr = new int[arr.length];     //����������
		int index = 0;						  //����һ����������±�����

						  //����һ��boolean a
		for (int i =0;i<arr.length ;i++ ) {	  //��ѭ��
			boolean a = false;	
			for (int j = 0;j < index ;j++ ) {  //��ѭ��
				if (arr[i]==arr[j]) {
					a = true;
					break;
				}

			}
			if (!a) {
				newArr[index++] = arr[i];     //�����Ļ�,�ͽ���Ԫ�طŵ���������,�ٽ�index�±��һ
			}
		}

		int [] returnArr = new int[index];
		for (int i = 0;i<index ;i++ ) {
			returnArr[i] = newArr[i];
		}
		
		return returnArr;
	}
}
