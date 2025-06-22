package com.metanoia.backend.dto;

// import lombok.AllArgsConstructor; // <-- COMENTADA/ELIMINADA: Ya no se necesita
// import lombok.Data;             // <-- COMENTADA/ELIMINADA: Ya no se necesita
// import lombok.NoArgsConstructor;  // <-- COMENTADA/ELIMINADA: Ya no se necesita

public class EventsDTO {
    private Long id;
    private String name;
    private String description;
    private String address;
    private String imageUrl;   // Nombre ajustado a camelCase
    private String web_url;
    private String organizer;
    private String centerName; // Nombre del centro asociado
    private String phone;      // Teléfono
    private String mail;       // Email

    // --- CONSTRUCTOR VACÍO (equivalente a @NoArgsConstructor) ---
    public EventsDTO() {
    }

    // --- CONSTRUCTOR CON TODOS LOS CAMPOS (equivalente a @AllArgsConstructor) ---
    public EventsDTO(Long id, String name, String description, String address, String imageUrl, String web_url, String organizer, String centerName, String phone, String mail) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.address = address;
        this.imageUrl = imageUrl;
        this.web_url = web_url;
        this.organizer = organizer;
        this.centerName = centerName;
        this.phone = phone;
        this.mail = mail;
    }

    // --- GETTERS (equivalente a @Data) ---
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

    public String getImageUrl() {
        return imageUrl;
    }

    public String getWeb_url() {
        return web_url;
    }

    public String getOrganizer() {
        return organizer;
    }

    public String getCenterName() {
        return centerName;
    }

    public String getPhone() {
        return phone;
    }

    public String getMail() {
        return mail;
    }

    // Nota: @Data también genera setters, toString, equals, y hashCode.
    // Para DTOs, los setters raramente se usan si son objetos de transferencia inmutables.
    // Si necesitas setters para algún caso específico, o equals/hashCode/toString, puedes añadirlos manualmente.
}