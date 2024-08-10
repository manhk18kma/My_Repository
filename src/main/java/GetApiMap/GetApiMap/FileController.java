package GetApiMap.GetApiMap;

import GetApiMap.GetApiMap.Entity.FileMetadata;
import GetApiMap.GetApiMap.Repository.FileMetadataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;

import java.io.IOException;

@RestController
@RequestMapping("/files")
public class FileController {

    @Autowired
    private FileMetadataRepository fileMetadataRepository;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            FileMetadata fileMetadata = new FileMetadata();
            fileMetadata.setFilename(file.getOriginalFilename());
            fileMetadata.setFileType(file.getContentType());
            fileMetadata.setData(file.getBytes());
            fileMetadataRepository.save(fileMetadata);

            return ResponseEntity.ok("File uploaded successfully");
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("File upload failed");
        }
    }

    public FileMetadataDTO getFileMetadataById(Long id) {
        return fileMetadataRepository.findById(id)
                .map(file -> new FileMetadataDTO(file.getId(), file.getFileType(), file.getFilename(), file.getData()))
                .orElse(null);
    }

    @GetMapping("/download/{id}")
    public ResponseEntity<FileMetadataDTO> downloadFile(@PathVariable Long id) {
        FileMetadataDTO fileMetadataDTO = getFileMetadataById(id);
        if (fileMetadataDTO != null) {
            return ResponseEntity.ok(fileMetadataDTO);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

}
