package cbnu.capstone.tripwithme.service.community;

import cbnu.capstone.tripwithme.dto.community.CommunityDTO;
import cbnu.capstone.tripwithme.mapper.community.CommunityMapper;
import cbnu.capstone.tripwithme.mapper.user.UserInfoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommunityListServiceImp implements CommunityListService{

    private final CommunityMapper communityMapper;


    @Override
    public List<CommunityDTO> getCommunityList() {
        return communityMapper.getCommunityList();
    }
}
