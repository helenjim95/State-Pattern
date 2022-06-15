package de.tum.in.ase.eist;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Controller {

	private int currentFloor;
	private List<Integer> pool;
	private ElevatorState state;

	public Controller(int currentFloor) {
		this.currentFloor = currentFloor;
		pool = new List<Integer>() {
			@Override
			public int size() {
				return 0;
			}

			@Override
			public boolean isEmpty() {
				return false;
			}

			@Override
			public boolean contains(Object o) {
				return false;
			}

			@Override
			public Iterator<Integer> iterator() {
				return null;
			}

			@Override
			public Object[] toArray() {
				return new Object[0];
			}

			@Override
			public <T> T[] toArray(T[] a) {
				return null;
			}

			@Override
			public boolean add(Integer integer) {
				return false;
			}

			@Override
			public boolean remove(Object o) {
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				return false;
			}

			@Override
			public boolean addAll(Collection<? extends Integer> c) {
				return false;
			}

			@Override
			public boolean addAll(int index, Collection<? extends Integer> c) {
				return false;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				return false;
			}

			@Override
			public void clear() {

			}

			@Override
			public Integer get(int index) {
				return null;
			}

			@Override
			public Integer set(int index, Integer element) {
				return null;
			}

			@Override
			public void add(int index, Integer element) {

			}

			@Override
			public Integer remove(int index) {
				return null;
			}

			@Override
			public int indexOf(Object o) {
				return 0;
			}

			@Override
			public int lastIndexOf(Object o) {
				return 0;
			}

			@Override
			public ListIterator<Integer> listIterator() {
				return null;
			}

			@Override
			public ListIterator<Integer> listIterator(int index) {
				return null;
			}

			@Override
			public List<Integer> subList(int fromIndex, int toIndex) {
				return null;
			}
		}
	}

	public void request(int floor) {
		pool.add(floor);
	}

	public void signal(int floor) {
		pool.remove(floor);
	}

	public ElevatorState getState() {
		return state.getName();
	}

	public int getNexthop() {

		if (!pool.isEmpty()) {
			return pool.get(0);
		} else {
			return -1;
		}
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

}
