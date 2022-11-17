package cbnu.capstone.tripwithme.mapper.community;

import cbnu.capstone.tripwithme.dto.community.CommunityDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper

public interface CommunityMapper {

    List<CommunityDTO> getCommunityList();
}
