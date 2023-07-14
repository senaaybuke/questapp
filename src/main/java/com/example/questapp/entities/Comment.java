package com.example.questapp.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "comment")
@Data
public class Comment {
    @Id
    @GeneratedValue
    Long id;
    Long postId;
    Long userId;
    @Lob
    @Column(columnDefinition ="text")
    String text;


}
