package com.example.askri.amanikomutel.dao;

import com.example.askri.amanikomutel.model.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactsDAO extends JpaRepository<Contacts, String> {
}
