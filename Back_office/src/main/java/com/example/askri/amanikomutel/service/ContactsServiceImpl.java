package com.example.askri.amanikomutel.service;

import com.example.askri.amanikomutel.mapper.ContactsMapper;
import com.example.askri.amanikomutel.dao.ContactsDAO;
import com.example.askri.amanikomutel.dto.ContactsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("contactsservice")
public class ContactsServiceImpl implements ContactsService {


    @Autowired
    private ContactsMapper contactsMapper;

    @Autowired
    private ContactsDAO contactsDAO;

    @Override
    public ContactsDTO save(ContactsDTO contactsDTO) {
        return contactsMapper.asDto(contactsDAO.save(contactsMapper.asEntity(contactsDTO)));
    }
    @Override
    public void deleteById(String id) {

    }

    @Override
    public List<ContactsDTO> findAll() {
        return contactsMapper.asDtoList(contactsDAO.findAll());
    }

}
