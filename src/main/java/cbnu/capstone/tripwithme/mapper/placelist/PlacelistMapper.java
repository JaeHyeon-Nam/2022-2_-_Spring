package cbnu.capstone.tripwithme.mapper.placelist;

import cbnu.capstone.tripwithme.dto.placelist.TourlistDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PlacelistMapper {
    List<TourlistDTO> getPlacelist();

    TourlistDTO getTourListCart(String temp);

    List<TourlistDTO> getPlacelist_Category(String temp);

    List<TourlistDTO> getPlacelist_Category_MBTI(int temp);

    List<TourlistDTO> getPlacelistFilter(String region);

    void setPaidlist(String userid, String place_code, int place_price, String region);

    void setUserTicketlist(String place_code,String userid);
}