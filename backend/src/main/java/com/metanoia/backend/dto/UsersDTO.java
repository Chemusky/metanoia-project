package com.metanoia.backend.dto;

// import lombok.AllArgsConstructor; // <-- COMENTADA/ELIMINADA: Ya no se necesita
// import lombok.Data;             // <-- COMENTADA/ELIMINADA: Ya no se necesita

public class UsersDTO {
    private Long id;
    private String username;
    private String email;

    // --- CONSTRUCTOR CON TODOS LOS CAMPOS (equivalente a @AllArgsConstructor) ---
    public UsersDTO(Long id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    // --- GETTERS (equivalente a @Data) ---
    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    // Nota: @Data también genera setters, toString, equals, y hashCode.
    // Para DTOs, los setters raramente se usan si son objetos de transferencia inmutables.
    // Si necesitas setters para algún caso específico, o equals/hashCode/toString, puedes añadirlos manualmente.
}