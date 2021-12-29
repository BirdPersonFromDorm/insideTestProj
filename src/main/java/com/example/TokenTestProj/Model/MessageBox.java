package com.example.TokenTestProj.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "message_box")
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class MessageBox {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_box_id")
    private Integer messageBoxId;

    @Column(name = "name")
    private String name;

    @Column(name = "message")
    private String message;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MessageBox messageBox = (MessageBox) o;

        return messageBoxId != null ? messageBoxId.equals(messageBox.messageBoxId) : messageBox.messageBoxId == null;
    }

    @Override
    public int hashCode() {
        return messageBoxId != null ? messageBoxId.hashCode() : 0;
    }
}
