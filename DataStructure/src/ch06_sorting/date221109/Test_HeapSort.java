package ch06_sorting.date221109;

public class Test_HeapSort {
	//--- �迭 ��� a[idx1]�� a[idx2]�� ���� ��ȯ ---//
	 static void swap(int[] a, int idx1, int idx2) {
	     int t = a[idx1];  
	     a[idx1] = a[idx2];  
	     a[idx2] = t;
	 }

	 static void makeHeap(int []bx, int position, int value) {
		 
	 }
	 static void useHeap(int []bx, int cnt) {

	 }
		


	 //--- �� ���� ---//
	 static void heapSort(int[] a, int n) {
		 int[] b = new int[20];
		 for (int ix = 0; ix < a.length; ix ++)
			 makeHeap(b, ix+1, a[ix]);
	     System.out.println();
	     System.out.println("makeHeap:");

	 }

	 public static void main(String[] args) {

		 final int count = 10;
	     int[] x = new int[count];

	     for (int i = 0; i < count; i++) {
	         x[i] = (int)(Math.random() * 30);
	     }
	     System.out.println("������:");
	     for (int i = 0; i < count; i++)
	         System.out.print(" " + x[i]);
	     
	  // �迭 x�� ������
	     heapSort(x, count);
	     
	     System.out.println();
	     System.out.println("������: ");
	     for (int i = 0; i < count; i++)
	         System.out.print(" " + x[i]);
	 }
}
