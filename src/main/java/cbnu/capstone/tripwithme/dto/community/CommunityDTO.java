package cbnu.capstone.tripwithme.dto.community;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CommunityDTO {
    private String userID;
    private String spaceName;
    private String spaceAddress;
    private String spacePic;
    private String postTitle;
    private String postContext;
    private String postDay;
    private int postWatch;
    private int postRe;

}