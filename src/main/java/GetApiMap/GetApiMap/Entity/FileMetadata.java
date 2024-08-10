package GetApiMap.GetApiMap.Entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class FileMetadata {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String filename;
    private String fileType;

    @Lob
    private byte[] data; // Sử dụng @Lob để chỉ định rằng đây là một loại dữ liệu lớn

    // Getters and Setters
}
