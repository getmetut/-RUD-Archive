package com.archive.application.repository;

import com.archive.application.model.Doc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocRepository extends JpaRepository<Doc, Long> {
}
