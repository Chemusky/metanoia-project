package com.metanoia.backend.models;

import jakarta.persistence.*;
// import lombok.Data; // <-- COMENTADA/ELIMINADA: Ya no se necesita la importación de Lombok

import java.util.Objects; // Importar para equals y hashCode

@Entity
@Table(name = "events")
public class Events {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Estrategia de generación automática basada en identidad
    @Column(name = "id") // Especificación del nombre de la columna en la tabla
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false, columnDefinition = "TEXT")
    private String description;

    @Column(name = "address")
    private String address;

    @Column(name = "image_url")
    private String image_url;

    @Column(name = "web_url")
    private String web_url;

    @Column(name = "phone")
    private Long phone;

    @Column(name = "mail")
    private String mail;

    @Column(name = "organizer")
    private String organizer;

    // Relación con la entidad Users (Muchos eventos pueden ser creados por un usuario)
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false) // Clave foránea que enlaza con la tabla de usuarios
    private Users user;

    // Relación con la entidad Centers (Cada evento puede estar asociado a un centro)
    @ManyToOne
    @JoinColumn(name = "center_id", nullable = false) // Clave foránea que enlaza con la tabla de centros
    private Centers center;

    // --- GETTERS ---
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public String getImage_url() {
        return image_url;
    }

    public String getWeb_url() {
        return web_url;
    }

    public Long getPhone() {
        return phone;
    }

    public String getMail() {
        return mail;
    }

    public String getOrganizer() {
        return organizer;
    }

    public Users getUser() {
        return user;
    }

    public Centers getCenter() {
        return center;
    }

    // --- SETTERS ---
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public void setWeb_url(String web_url) {
        this.web_url = web_url;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public void setCenter(Centers center) {
        this.center = center;
    }

    // --- equals(), hashCode(), toString() (Generados por IntelliJ) ---
    // @Data de Lombok también generaba estos, por lo que es buena práctica incluirlos
    // si son relevantes para comparaciones o depuración.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Events events = (Events) o;
        return Objects.equals(id, events.id) && Objects.equals(name, events.name) && Objects.equals(description, events.description) && Objects.equals(address, events.address) && Objects.equals(image_url, events.image_url) && Objects.equals(web_url, events.web_url) && Objects.equals(phone, events.phone) && Objects.equals(mail, events.mail) && Objects.equals(organizer, events.organizer) && Objects.equals(user, events.user) && Objects.equals(center, events.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, address, image_url, web_url, phone, mail, organizer, user, center);
    }

    @Override
    public String toString() {
        return "Events{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", address='" + address + '\'' +
                ", image_url='" + image_url + '\'' +
                ", web_url='" + web_url + '\'' +
                ", phone=" + phone +
                ", mail='" + mail + '\'' +
                ", organizer='" + organizer + '\'' +
                ", user=" + user +
                ", center=" + center +
                '}';
    }
}