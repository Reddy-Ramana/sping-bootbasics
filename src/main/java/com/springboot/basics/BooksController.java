package com.springboot.basics;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	@RequestMapping("/books")
	public List<Book> getListofBooks() {

		return Arrays.asList(new Book(1l, "Learn Spring1", "Ramana1"),new Book(2l, "Learn Spring2", "Ramana2") );
	}

}
