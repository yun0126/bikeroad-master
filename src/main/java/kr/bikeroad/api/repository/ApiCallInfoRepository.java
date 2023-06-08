package kr.bikeroad.api.repository;

import kr.bikeroad.api.entity.ApiCallInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApiCallInfoRepository extends JpaRepository<ApiCallInfo, Long> {

}
