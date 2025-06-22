package com.metanoia.backend.dto;

// import lombok.AllArgsConstructor; // <-- COMENTADA/ELIMINADA: Ya no se necesita
// import lombok.Data;             // <-- COMENTADA/ELIMINADA: Ya no se necesita

public class CentersDTO {
    private Long id;
    private String name;
    private String type;
    private String description;
    private String address;
    private String phone; // Este campo es String debido a la conversión
    private String mail;
    private String webUrl;

    // --- CONSTRUCTOR (equivalente a @AllArgsConstructor) ---
    public CentersDTO(Long id, String name, String type, String description, String address, String phone, String mail, String webUrl) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.address = address;
        this.phone = phone;
        this.mail = mail;
        this.webUrl = webUrl;
    }

    // --- GETTERS (equivalente a @Data) ---
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

    public String getMail() {
        return mail;
    }

    public String getWebUrl() {
        return webUrl;
    }

    // Nota: @Data también genera equals(), hashCode() y toString().
    // Para los DTOs, estos son a menudo menos críticos que para las entidades, pero pueden añadirse manualmente si es necesario.
    // Los setters no suelen ser necesarios para los DTOs que se pasan del backend al frontend,
    // ya que suelen ser inmutables después de su creación. Si necesitas setters, puedes añadirlos.
}