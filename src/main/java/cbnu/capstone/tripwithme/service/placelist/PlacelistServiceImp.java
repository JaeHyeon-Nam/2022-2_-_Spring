package cbnu.capstone.tripwithme.service.placelist;


import cbnu.capstone.tripwithme.dto.placelist.TourlistDTO;
import cbnu.capstone.tripwithme.mapper.placelist.PlacelistMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlacelistServiceImp implements PlacelistService {
    private final PlacelistMapper placelistMapper;


    @Override
    public TourlistDTO getTourListCart(String temp){
        return placelistMapper.getTourListCart(temp);
    }

    @Override
    public List<TourlistDTO> getPlacelist(){ return placelistMapper.getPlacelist();}

    @Override
    public List<TourlistDTO> getPlacelist_Category(String index) {
        return placelistMapper.getPlacelist_Category(index);
    }

    @Override
    public List<TourlistDTO> getPlacelist_Category_MBTI(int temp) {
        return placelistMapper.getPlacelist_Category_MBTI(temp);
    }

    @Override
    public List<TourlistDTO> getPlacelistFilter(String region){ return placelistMapper.getPlacelistFilter(region);}

    @Override
    public void setPaidlist(String userid, String place_code, int place_price, String region) {
        placelistMapper.setPaidlist(userid,place_code,place_price,region);
    }

    @Override
    public void setUserTicketlist(String place_code,String userid) {
        placelistMapper.setUserTicketlist(place_code,userid);
    }

}