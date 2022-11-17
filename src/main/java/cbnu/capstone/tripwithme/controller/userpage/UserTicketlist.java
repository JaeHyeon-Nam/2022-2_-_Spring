package cbnu.capstone.tripwithme.controller.userpage;



import cbnu.capstone.tripwithme.dto.user.UserDTO;
import cbnu.capstone.tripwithme.dto.user.UserTicketlistDTO;

import cbnu.capstone.tripwithme.service.user.UserTicketlistService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("/userticket")
@CrossOrigin(origins ="*", maxAge = 3600)
@RestController
@RequiredArgsConstructor
public class UserTicketlist {

    private final UserTicketlistService userTicketlistService;

    @PostMapping("/")
    public void setUserTicketlist(@RequestBody UserTicketlistDTO userTicketlistDTO){
        userTicketlistService.setUserTicketlist(userTicketlistDTO.getUser_id(),userTicketlistDTO.getUser_ticket());
        System.out.println(userTicketlistDTO.getUser_id() + userTicketlistDTO.getUser_ticket());
    }

    @GetMapping("/{user_id}")
    public List<UserTicketlistDTO> getUserTicketlist(@PathVariable String user_id){
        System.out.println(user_id);
        return userTicketlistService.getUserTicketlist(user_id);
    }
}
