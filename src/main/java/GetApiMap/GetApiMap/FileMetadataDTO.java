package GetApiMap.GetApiMap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class FileMetadataDTO {
    private Long id;
    private String fileType;
    private String filename;
    private byte[] data;

    // Constructors, getters and setters
}