package com.example.askri.amanikomutel.service;

import com.example.askri.amanikomutel.dto.ContactsDTO;

import java.util.List;

public interface ContactsService {

    ContactsDTO save(ContactsDTO clientDTO);

    void deleteById(String id);
    List<ContactsDTO> findAll();
}
