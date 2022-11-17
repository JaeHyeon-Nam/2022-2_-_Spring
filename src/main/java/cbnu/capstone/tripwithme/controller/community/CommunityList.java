

package cbnu.capstone.tripwithme.controller.community;


import cbnu.capstone.tripwithme.dto.community.CommunityDTO;
import cbnu.capstone.tripwithme.dto.placelist.PaidlistDTO;

import cbnu.capstone.tripwithme.dto.placelist.TourlistDTO;
import cbnu.capstone.tripwithme.dto.user.UserDTO;
import cbnu.capstone.tripwithme.mapper.user.UserInfoMapper;
import cbnu.capstone.tripwithme.python.pythonload_ing;
import cbnu.capstone.tripwithme.service.community.CommunityListService;
import cbnu.capstone.tripwithme.service.placelist.PlacelistService;
import cbnu.capstone.tripwithme.service.user.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.*;

@RequestMapping("/community")
@CrossOrigin(origins ="*", maxAge = 3600)
@RestController
@RequiredArgsConstructor
public class CommunityList
{
    private final CommunityListService communityListService;

    @GetMapping("/")
    public List<CommunityDTO> getTourList(HttpServletRequest request){
        return communityListService.getCommunityList();
    }

}