package com.metanoia.backend.models;

import jakarta.persistence.*;
// import lombok.Data; // <-- COMENTADA/ELIMINADA: Ya no se necesita la importación de Lombok

import java.util.List;
import java.util.Objects; // Importar para equals y hashCode

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Estrategia de generación automática basada en identidad
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    // Relación con eventos (Un usuario puede crear muchos eventos)
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Events> events;

    // --- GETTERS ---
    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public List<Events> getEvents() {
        return events;
    }

    // --- SETTERS ---
    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEvents(List<Events> events) {
        this.events = events;
    }

    // --- equals(), hashCode(), toString() (Generados por IntelliJ) ---
    // @Data de Lombok también generaba estos, por lo que es buena práctica incluirlos
    // si son relevantes para comparaciones o depuración.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(id, users.id) && Objects.equals(username, users.username) && Objects.equals(password, users.password) && Objects.equals(email, users.email) && Objects.equals(events, users.events);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, email, events);
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", events=" + events +
                '}';
    }
}