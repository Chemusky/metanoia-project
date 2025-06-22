package com.metanoia.backend.models;

import jakarta.persistence.*;
// import lombok.Data; // <-- COMENTADA/ELIMINADA: Ya no se necesita la importación de Lombok

import java.util.List;
import java.util.Objects; // Importar para equals y hashCode

@Entity
@Table(name = "centers")
public class Centers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "web_url")
    private String web_url;

    @Column(name = "mail")
    private String mail;

    // Relación con eventos (Un centro puede tener muchos eventos)
    @OneToMany(mappedBy = "center", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Events> events;

    // Relación opcional con Users (Un centro puede tener un usuario relacionado)
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = true) // Relación opcional
    private Users user;

    // --- GETTERS ---
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getWeb_url() {
        return web_url;
    }

    public String getMail() {
        return mail;
    }

    public List<Events> getEvents() {
        return events;
    }

    public Users getUser() {
        return user;
    }

    // --- SETTERS ---
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setWeb_url(String web_url) {
        this.web_url = web_url;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setEvents(List<Events> events) {
        this.events = events;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    // --- equals(), hashCode(), toString() (Generados por IntelliJ) ---
    // @Data de Lombok también generaba estos, por lo que es buena práctica incluirlos
    // si son relevantes para comparaciones o depuración.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Centers centers = (Centers) o;
        return Objects.equals(id, centers.id) && Objects.equals(name, centers.name) && Objects.equals(type, centers.type) && Objects.equals(description, centers.description) && Objects.equals(address, centers.address) && Objects.equals(phone, centers.phone) && Objects.equals(web_url, centers.web_url) && Objects.equals(mail, centers.mail) && Objects.equals(events, centers.events) && Objects.equals(user, centers.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, description, address, phone, web_url, mail, events, user);
    }

    @Override
    public String toString() {
        return "Centers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", web_url='" + web_url + '\'' +
                ", mail='" + mail + '\'' +
                ", events=" + events +
                ", user=" + user +
                '}';
    }
}