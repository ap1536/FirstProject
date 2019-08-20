package com.company;

public class Main {

    public static void main(String[] args) {
	    BubbleSort bs = new BubbleSort();
	    SelectionSort ss = new SelectionSort();
	    InsertionSort is = new InsertionSort();
	    OrderedArray oa = new OrderedArray();
		int[] arr = {2,4,6,8,10};
		//bs.implementation(arr);
		//ss.implementation(arr);
		//is.implementation(arr);
		//oa.implementation(arr, 10);
		Linkedlist list = new Linkedlist();
		list.addAtHead(5);
		list.addAtHead(7);
		list.addAtHead(9);
		list.addAtHead(1);
		list.addAtHead(8);
		list.addAtHead(2);
		System.out.println(list);

    }
}
