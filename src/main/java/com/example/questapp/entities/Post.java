package com.example.questapp.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="post")
@Data
public class Post {
    Long id;
    Long userId;
    String title;
    @Lob
    @Column(columnDefinition = "text")
    String text;
}
