package com.code.teachers.service;

import com.code.teachers.domain.Teachers;

import java.util.Collection;

/**
 * Created by NicholasG on 08.01.2016.
 */
public interface TeachersService {

    Collection<Teachers> getAll();

    Teachers findById(Long id);

    Teachers findByTaskTitle(String title);

    Long getCountRow();


    void save(Teachers task);

    void delete(Long id);
}
