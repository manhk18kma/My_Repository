package GetApiMap.GetApiMap.Fetch;

import GetApiMap.GetApiMap.Entity.District;
import GetApiMap.GetApiMap.Entity.Province;
import GetApiMap.GetApiMap.Entity.Ward;
import GetApiMap.GetApiMap.Fetch.ApiClient;
import GetApiMap.GetApiMap.Fetch.ApiResponse;
import GetApiMap.GetApiMap.Repository.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer
//        implements CommandLineRunner
{

    @Autowired
    private ApiClient apiClient;

    @Autowired
    private DatabaseService databaseService;

//    @Override
//    public void run(String... args) throws Exception {
//        ApiResponse<Province> provinceResponse = apiClient.fetchData(
//                "https://esgoo.net/api-tinhthanh/1/0.htm",
//                new ParameterizedTypeReference<ApiResponse<Province>>() {}
//        );
//        List<Province> provinces = provinceResponse.getData();
//
//        for (Province province : provinces) {
//            databaseService.saveProvince(province);
//
//            ApiResponse<District> districtResponse = apiClient.fetchData(
//                    "https://esgoo.net/api-tinhthanh/2/" + province.getId() + ".htm",
//                    new ParameterizedTypeReference<ApiResponse<District>>() {}
//            );
//            List<District> districts = districtResponse.getData();
//
//            for (District district : districts) {
//                district.setProvince(province);
//                databaseService.saveDistrict(district);
//
//                ApiResponse<Ward> wardResponse = apiClient.fetchData(
//                        "https://esgoo.net/api-tinhthanh/3/" + district.getId() + ".htm",
//                        new ParameterizedTypeReference<ApiResponse<Ward>>() {}
//                );
//                List<Ward> wards = wardResponse.getData();
//
//                for (Ward ward : wards) {
//                    ward.setDistrict(district);
//                    databaseService.saveWard(ward);
//                }
//            }
//        }
//    }
}