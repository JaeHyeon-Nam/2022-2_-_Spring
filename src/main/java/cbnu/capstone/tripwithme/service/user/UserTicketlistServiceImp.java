package cbnu.capstone.tripwithme.service.user;

import cbnu.capstone.tripwithme.dto.user.UserTicketlistDTO;
import cbnu.capstone.tripwithme.mapper.user.UserTicketlistMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserTicketlistServiceImp implements UserTicketlistService{

    private final UserTicketlistMapper userTicketlistMapper;

    @Override
    public List<UserTicketlistDTO> getUserTicketlist(String user_id) {
        return userTicketlistMapper.getUserTicketlist(user_id);
    }

    @Override
    public void setUserTicketlist(String user_id, String user_ticket) {
        userTicketlistMapper.setUserTicketlist(user_id,user_ticket);
    }


}
