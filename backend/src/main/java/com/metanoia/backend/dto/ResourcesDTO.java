package com.metanoia.backend.dto;

// import lombok.AllArgsConstructor; // <-- COMENTADA/ELIMINADA: Ya no se necesita
// import lombok.Data;             // <-- COMENTADA/ELIMINADA: Ya no se necesita

public class ResourcesDTO {
    private Long id;
    private String title;
    private String type;
    private String description;
    private String url;
    private String imageUrl; // Añadido para incluir la URL de la imagen
    private String userName; // Nombre del usuario asociado

    // --- CONSTRUCTOR CON TODOS LOS CAMPOS (equivalente a @AllArgsConstructor) ---
    public ResourcesDTO(Long id, String title, String type, String description, String url, String imageUrl, String userName) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.description = description;
        this.url = url;
        this.imageUrl = imageUrl;
        this.userName = userName;
    }

    // --- GETTERS (equivalente a @Data) ---
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getUserName() {
        return userName;
    }

    // Nota: @Data también genera setters, toString, equals, y hashCode.
    // Para DTOs, los setters raramente se usan si son objetos de transferencia inmutables.
    // Si necesitas setters para algún caso específico, o equals/hashCode/toString, puedes añadirlos manualmente.
}