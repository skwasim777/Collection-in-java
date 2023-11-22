package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class RenoveAllElementsFromTwoLIst {
	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<>();
		arr1.add("Wasim");
		arr1.add("Salman");
		arr1.add("Lukman");
		arr1.add("Farhan");
		System.out.println(arr1);
		ArrayList<String> arr2 = new ArrayList<>();
		arr2.add("Wasim");
		arr2.add("Salman");
		arr2.add("Lukman");
		arr2.add("Sofiyan");
		arr2.removeAll(arr1);
		System.out.println(arr2);

		// find common element from two list
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		System.out.println("First Array List : ");
		System.out.println(a);
		ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println("Second Array List :");
		System.out.println(a1);
		// return the common elements from both
		a.removeAll(a1);
		System.out.println("Common Elements from both list..");
		System.out.println(a);
		
		// using retainall method
		List<String> firstList = new List<String>() {
			
			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<String> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String set(int index, String element) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public String remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public ListIterator<String> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ListIterator<String> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Iterator<String> iterator() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int indexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String get(int index) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean addAll(int index, Collection<? extends String> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean addAll(Collection<? extends String> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void add(int index, String element) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean add(String e) {
				// TODO Auto-generated method stub
				return false;
			}
		}; 
	}
}
