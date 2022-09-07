package com.example.askri.amanikomutel.mapper;

import com.example.askri.amanikomutel.model.Contacts;
import com.example.askri.amanikomutel.dto.ContactsDTO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface ContactsMapper  extends GenericMapper<Contacts, ContactsDTO> {
}
