package com.utsav.springbootcache;

public interface BookRepository {

	Book getByIsbn(String isbn);
}
