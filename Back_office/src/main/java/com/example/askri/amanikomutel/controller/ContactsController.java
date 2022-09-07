package com.example.askri.amanikomutel.controller;

import com.example.askri.amanikomutel.service.ContactsService;
import com.example.askri.amanikomutel.dto.ContactsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("contact")
public class ContactsController {

@Autowired
    private ContactsService contactsService;

    //create contacts
    @PostMapping
    public ContactsDTO CreateContacts(@RequestBody ContactsDTO contactsDTO)
    {
        return contactsService.save(contactsDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        contactsService.deleteById(id);
    }
    @GetMapping("/all")
    public List<ContactsDTO> getAllContact() {
        return contactsService.findAll();
    }

}
