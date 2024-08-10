package GetApiMap.GetApiMap.Repository;

import GetApiMap.GetApiMap.Entity.FileMetadata;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileMetadataRepository extends JpaRepository<FileMetadata, Long> {
}