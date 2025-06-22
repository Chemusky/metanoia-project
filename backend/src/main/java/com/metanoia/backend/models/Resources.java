package com.metanoia.backend.models;

// Importación de anotaciones y clases necesarias para JPA
import jakarta.persistence.*;
// import lombok.Data; // <-- COMENTADA/ELIMINADA: Ya no se necesita la importación de Lombok

import java.util.Objects; // Importar para equals y hashCode

// Declaración de la clase como una entidad que representa una tabla en la base de datos
@Entity // Recursos
@Table(name = "resources") // Nombre de la tabla en la base de datos será "resources"
public class Resources {

    // Declaración del campo id como clave primaria con generación automática de valores
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Estrategia de generación automática basada en identidad
    @Column(name = "id") // Especificación del nombre de la columna en la tabla
    private Long id;

    // Declaración del campo title como obligatorio
    @Column(name = "title", nullable = false) // La columna "title" no puede ser nula
    private String title;

    // Declaración del campo type como obligatorio
    @Column(name = "type", nullable = false) // La columna "type" no puede ser nula
    private String type;

    // Declaración del campo description como obligatorio
    // Especifica que esta columna usará el tipo de datos "TEXT" en la base de datos para almacenar textos largos
    @Column(name = "description", nullable = false, columnDefinition = "TEXT")
    private String description;

    // Declaración del campo url como obligatorio y único
    // La columna "url" no puede ser nula y debe tener valores únicos en la tabla
    @Column(name = "url", nullable = false, unique = true)
    private String url;

    @Column(name = "image_url", nullable = false) // Columna para almacenar la URL de la imagen
    private String imageUrl; // Lombok manejaría camelCase a snake_case automáticamente, pero ahora tú lo harás.

    // Relación con la tabla Users (Muchos recursos pueden pertenecer a un usuario)
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false) // Clave foránea a la tabla Users
    private Users user;

    // --- GETTERS ---
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

    public Users getUser() {
        return user;
    }

    // --- SETTERS ---
    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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
        Resources resources = (Resources) o;
        return Objects.equals(id, resources.id) && Objects.equals(title, resources.title) && Objects.equals(type, resources.type) && Objects.equals(description, resources.description) && Objects.equals(url, resources.url) && Objects.equals(imageUrl, resources.imageUrl) && Objects.equals(user, resources.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, type, description, url, imageUrl, user);
    }

    @Override
    public String toString() {
        return "Resources{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", user=" + user +
                '}';
    }
}