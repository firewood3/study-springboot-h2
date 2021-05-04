package com.gchsj.sbh2.book.model;

import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "BOOK")
@ToString
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

}
