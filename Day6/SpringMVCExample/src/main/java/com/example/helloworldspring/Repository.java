package com.example.helloworldspring;

import java.util.List;

public interface Repository<E> {
	public void add(E e);
	public List<E> getAll();
}
