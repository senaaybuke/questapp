package com.example.questapp.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="p_like")
@Data
public class Like {
    @Id
    Long id;
    Long postId;
    Long userId;
}
