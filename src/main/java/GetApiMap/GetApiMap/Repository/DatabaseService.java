package GetApiMap.GetApiMap.Repository;
import GetApiMap.GetApiMap.Entity.District;
import GetApiMap.GetApiMap.Entity.Province;
import GetApiMap.GetApiMap.Entity.Ward;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DatabaseService {

    @Autowired
    private ProvinceRepository provinceRepository;

    @Autowired
    private DistrictRepository districtRepository;

    @Autowired
    private WardRepository wardRepository;

    @Transactional
    public void saveProvince(Province province) {
        provinceRepository.save(province);
    }

    @Transactional
    public void saveDistrict(District district) {
        districtRepository.save(district);
    }

    @Transactional
    public void saveWard(Ward ward) {
        wardRepository.save(ward);
    }
}
