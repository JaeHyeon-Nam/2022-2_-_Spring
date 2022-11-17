package cbnu.capstone.tripwithme.dto.placelist;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class TourlistDTO {
    private String tourName;
    private String tourLocation;
    private String category;
    private int adult;
    private int adolescent;
    private int child;
    private int score;
    private String pic;

    @Override
    public String toString(){
        return getTourName()+ " " +
                getTourLocation() + " " +
                getCategory() + " " +
                getAdult() + " " +
                getAdolescent() + " " +
                getChild() + " " +
                getScore() + " " +
                getPic() + " " ;
    }
}