class SectionJ {

	/**
	�������ض��±�λ�õ�Ԫ�ؽ���  (����İ汾,�Թ��Ժ��˽�)
	*/
	public static void main(String[] args) {
		int[] arr ={2,5,6,7,3,9,1};
		
		exchange(arr);
		for(int k : arr){
			System.out.print(k+"\t");
		}
	}

	public static void exchange(int[] a){
		for (int i =0;i<a.length & i%2==1 ;i++ ) {//���Ǵ��,һ��Ҫ��ס,���������,forѭ��������
			a[i] = a[i]^a[i+2];          //����,����������±�Խ��
			a[i] = a[i]^a[i+2];
			a[i] = a[i]^a[i+2];
		}
	}
}
