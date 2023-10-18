package com.myblog9.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title",nullable = false,unique = true)
    private String title;
    @Column(name = "description",nullable = false,unique = true)
    private String description;
    @Column(name = "content",nullable = false,unique = true)
    private String content;

    public Post() {
    }
}

