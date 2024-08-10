package GetApiMap.GetApiMap.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class Province {
    @Id
    private String id;
    private String name;
    private String name_en;
    private String full_name;
    private String full_name_en;
    private String latitude;
    private String longitude;

    @OneToMany(mappedBy = "province", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<District> districts;

    // Getters and Setters
}