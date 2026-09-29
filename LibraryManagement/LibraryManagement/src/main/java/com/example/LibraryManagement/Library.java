package com.example.LibraryManagement;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Library {
    private int bookId;
    private String bookName;
    private String author;
}
