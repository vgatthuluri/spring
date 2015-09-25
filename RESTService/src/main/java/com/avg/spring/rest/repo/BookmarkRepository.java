package com.avg.spring.rest.repo;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avg.spring.rest.model.Bookmark;


public interface BookmarkRepository extends JpaRepository<Bookmark, Long>{

	Collection<Bookmark> findByAccountUserName(String username);
}
