package com.libraryManagemenr.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libraryManagemenr.backend.entity.Book;

@Repository
public interface CrudInStudentRepository extends JpaRepository<Book, Integer> {

	

	
}
