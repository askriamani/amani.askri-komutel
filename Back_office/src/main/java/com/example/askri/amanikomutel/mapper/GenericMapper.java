package com.example.askri.amanikomutel.mapper;

import java.util.List;

public interface GenericMapper<E,D> {

    E asEntity(D dto);
    D asDto(E entity);
    List<D> asDtoList(List<E> entities);
    List<E> asEntityList(List<D> dtos);

}
