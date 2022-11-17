package cbnu.capstone.tripwithme.service.placelist;


import cbnu.capstone.tripwithme.dto.placelist.TourlistDTO;

import java.util.List;

public interface PlacelistService {
    List<TourlistDTO> getPlacelist();
    TourlistDTO getTourListCart(String temp);
    List<TourlistDTO> getPlacelist_Category(String temp);
    List<TourlistDTO> getPlacelist_Category_MBTI(int temp);

    List<TourlistDTO> getPlacelistFilter(String region);
    void setPaidlist(String userid,String place_code,int place_price,String region);
    void setUserTicketlist(String place_code, String userid);
}