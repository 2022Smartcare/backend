package com.demoRestAPI.account.Repository;

import com.demoRestAPI.account.Entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DocumentRepository extends JpaRepository<Document, Long> {
    List<Document> findDocumentByDocumentId(Long documentId);
}
