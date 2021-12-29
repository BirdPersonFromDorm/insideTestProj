package com.example.TokenTestProj.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;


@Table(name = "role")
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private int roleId;
//    @Enumerated(EnumType.STRING)
    @Column(name = "role_name")
    private String name;

//    public enum Roles {
//        ROLE_USER, ROLE_MODERATOR, ROLE_ADMIN;
//    }
//
//    @ManyToMany(cascade=CascadeType.REFRESH, fetch = FetchType.LAZY)
//    @JoinTable(name = "user_role",
//            joinColumns = { @JoinColumn(name = "role_id")},
//            inverseJoinColumns = { @JoinColumn(name = "user_id")})
//    @JsonIgnoreProperties("roles")
//    private Set<User> users;

    @Override
    public int hashCode() {
        return Objects.hashCode(roleId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Role other = (Role) obj;
        return Objects.equals(roleId, other.getRoleId());
    }
}
