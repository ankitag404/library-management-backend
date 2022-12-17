package com.libraryManagemenr.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.libraryManagemenr.backend.entity.Book;

@Repository
public interface CrudInBookRepository extends JpaRepository<Book, Integer> {

	

	@Query(value = "delete from book where book_id = ?1", nativeQuery = true)
	public void deleteBookById(int id);
	
}
