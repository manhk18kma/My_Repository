package GetApiMap.GetApiMap.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Ward {
    @Id
    private String id;
    private String name;
    private String name_en;
    private String full_name;
    private String full_name_en;
    private String latitude;
    private String longitude;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "district_id")
    private District district;

    // Getters and Setters
}