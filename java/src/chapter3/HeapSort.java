package chapter3;

public class HeapSort {

	public static void main(String[] args) {
		int[] values = {5, 7, 2, 14, 11, 13, 9, 6};
		Heap heap = new Heap(values.length);
		for (int i = 0; i < values.length; ++i) {
			heap.push(values[i]);
		}
		for (int i = 0; i < values.length; ++i) {
			values[i] = heap.pop();
		}
		for (int i : values) {
			System.out.print(i + " ");
		}
	}

}
