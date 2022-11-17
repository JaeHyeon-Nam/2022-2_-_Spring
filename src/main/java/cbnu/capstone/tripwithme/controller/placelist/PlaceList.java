package cbnu.capstone.tripwithme.controller.placelist;


import cbnu.capstone.tripwithme.dto.placelist.PaidlistDTO;

import cbnu.capstone.tripwithme.dto.placelist.TourlistDTO;
import cbnu.capstone.tripwithme.dto.user.UserDTO;
import cbnu.capstone.tripwithme.mapper.user.UserInfoMapper;
import cbnu.capstone.tripwithme.python.pythonload_ing;
import cbnu.capstone.tripwithme.service.placelist.PlacelistService;
import cbnu.capstone.tripwithme.service.user.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.*;

@RequestMapping("/placelist")
@CrossOrigin(origins ="*", maxAge = 3600)
@RestController
@RequiredArgsConstructor
public class PlaceList
{

    private final PlacelistService placelistService;
    private final pythonload_ing pythonload_ing;
    private final UserInfoService userInfoService;


    @GetMapping("/")
    public List<TourlistDTO> getTourList(HttpServletRequest request){
        return placelistService.getPlacelist();
    }


    @GetMapping("/{index}/{id}")
    public List<TourlistDTO> getTourlistCategory(@PathVariable(value = "index") int index
            ,@PathVariable(value = "id") String id
    ) throws IOException, InterruptedException {
        String temp= "";
        if(index==0) return placelistService.getPlacelist();
        else if(index==1){

            UserDTO userDTO = userInfoService.getUserInfo(id);

            String score = pythonload_ing.getMBTIlist(userDTO);


            return placelistService.getPlacelist_Category_MBTI(Integer.parseInt(score));

        }
        else if(index==2){temp="산";}
        else if(index==3){temp="바다";}
        else if(index==4){temp="도시";}
        else if(index==5){temp="액티비티";}
        else if(index==6){temp="숙소";}
        else if(index==7){temp="기타";}

        return placelistService.getPlacelist_Category(temp);
    }

    @GetMapping("/cart/{placename}")
    public TourlistDTO getTourListCart(@PathVariable String placename){

        System.out.println(placelistService.getTourListCart(placename).toString());

        return placelistService.getTourListCart(placename);
    }

    @GetMapping("/filter")
    public List<TourlistDTO> getTourListFilter(HttpServletRequest request){
        String region = request.getParameter("region");
        System.out.println(region);
        return  placelistService.getPlacelistFilter(region);
    }


    @PostMapping("/paidplace")
    public void setPaidPlace(@RequestBody PaidlistDTO paidlistDTO){
        System.out.println(paidlistDTO.getPlace_code());
        placelistService.setPaidlist(paidlistDTO.getUserid(),paidlistDTO.getPlace_code(),
                paidlistDTO.getPlace_price(),paidlistDTO.getRegion());
        placelistService.setUserTicketlist(paidlistDTO.getPlace_code(), paidlistDTO.getUserid());
    }



}