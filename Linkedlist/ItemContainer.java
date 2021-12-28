package com.xworkz.Linkedlist;

import java.util.Collection;
import java.util.LinkedList;

public class ItemContainer implements item{
	Collection LinkList=new LinkedList();

	@Override
	public void addItem(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("Invoked add item");
		LinkList.add(obj);
		
	}

	@Override
	public void addFirstItem(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("Invoked addFirstItem");
		LinkedList list = (LinkedList)LinkList;
		list.addFirst(obj);

		
	}

	@Override
	public void addLastItem(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("Invoked addLastItem");
		LinkedList list = (LinkedList)LinkList;
		list.addLast(obj);
	}
		
	

	@Override
	public void deleteFirstItem() {
		// TODO Auto-generated method stub
		System.out.println("Invoked deleteFirstItem");
		LinkedList list = (LinkedList)LinkList;
		list.removeFirst();
		
	}

	@Override
	public void deleteLastItem() {
		// TODO Auto-generated method stub
		System.out.println("Invoked deleteLastItem");
		LinkedList list = (LinkedList)LinkList;
		list.removeLast();
		
	}

	@Override
	public void getFirstItem() {
		// TODO Auto-generated method stub
		System.out.println("Invoked getFirstItem");
		LinkedList list = (LinkedList)LinkList;
		System.out.println(list.getFirst());
		
	}

	@Override
	public void getLastItem() {
		// TODO Auto-generated method stub
		System.out.println("Invoked getLastItem");
		LinkedList list = (LinkedList)LinkList;
		System.out.println(list.getLast());

		
	}

	@Override
	public void displayItem() {
		// TODO Auto-generated method stub
		System.out.println("Invoked displayItem");
		System.out.println(LinkList);

		
	}

}
