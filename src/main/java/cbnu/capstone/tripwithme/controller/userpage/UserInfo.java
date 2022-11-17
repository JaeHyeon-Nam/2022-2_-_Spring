package cbnu.capstone.tripwithme.controller.userpage;

import cbnu.capstone.tripwithme.dto.placelist.TourlistDTO;
import cbnu.capstone.tripwithme.dto.user.UserDTO;
import cbnu.capstone.tripwithme.service.user.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("/user")
@CrossOrigin(origins ="*", maxAge = 3600)
@RestController
@RequiredArgsConstructor
public class UserInfo {

    private final UserInfoService userInfoService;

    @GetMapping("/{id}")
    public UserDTO getUserInfo(@PathVariable String id){
        return userInfoService.getUserInfo(id);
    }

    @PostMapping("/sign_up")
    public void sign_up_UserInfo(@RequestBody UserDTO userDTO){
        if(userDTO.getMbti_E()+userDTO.getMbti_I() - 10 <0){
            userDTO.setMbti_E(userDTO.getMbti_E()+(10 - userDTO.getMbti_E()+userDTO.getMbti_I())/2);
            userDTO.setMbti_I(userDTO.getMbti_I()+(10 - userDTO.getMbti_E()+userDTO.getMbti_I())/2);
        }
        else if(userDTO.getMbti_E()+userDTO.getMbti_I() - 10 >0){
            userDTO.setMbti_E(userDTO.getMbti_E()-(userDTO.getMbti_E()+userDTO.getMbti_I() - 10)/2);
            userDTO.setMbti_I(userDTO.getMbti_I()-(userDTO.getMbti_E()+userDTO.getMbti_I() - 10)/2);
        }

        if(userDTO.getMbti_S()+userDTO.getMbti_N() - 10 <0){
            userDTO.setMbti_S(userDTO.getMbti_S()+(10 - userDTO.getMbti_S()+userDTO.getMbti_N())/2);
            userDTO.setMbti_N(userDTO.getMbti_N()+(10 - userDTO.getMbti_S()+userDTO.getMbti_N())/2);
        }
        else if(userDTO.getMbti_S()+userDTO.getMbti_N() - 10 >0){
            userDTO.setMbti_S(userDTO.getMbti_S()-(userDTO.getMbti_S()+userDTO.getMbti_N() - 10)/2);
            userDTO.setMbti_N(userDTO.getMbti_N()-(userDTO.getMbti_S()+userDTO.getMbti_N() - 10)/2);
        }

        if(userDTO.getMbti_T()+userDTO.getMbti_F() - 10 <0){
            userDTO.setMbti_T(userDTO.getMbti_T()+(10 - userDTO.getMbti_T()+userDTO.getMbti_F())/2);
            userDTO.setMbti_F(userDTO.getMbti_F()+(10 - userDTO.getMbti_T()+userDTO.getMbti_F())/2);
        }
        else if(userDTO.getMbti_T()+userDTO.getMbti_F() - 10 >0){
            userDTO.setMbti_T(userDTO.getMbti_T()-(userDTO.getMbti_T()+userDTO.getMbti_F() - 10)/2);
            userDTO.setMbti_F(userDTO.getMbti_F()-(userDTO.getMbti_T()+userDTO.getMbti_F() - 10)/2);
        }

        if(userDTO.getMbti_J()+userDTO.getMbti_P() - 10 <0){
            userDTO.setMbti_J(userDTO.getMbti_J()+(10 - userDTO.getMbti_J()+userDTO.getMbti_P())/2);
            userDTO.setMbti_P(userDTO.getMbti_P()+(10 - userDTO.getMbti_J()+userDTO.getMbti_P())/2);
        }
        else if(userDTO.getMbti_J()+userDTO.getMbti_P() - 10 >0){
            userDTO.setMbti_J(userDTO.getMbti_J()-(userDTO.getMbti_J()+userDTO.getMbti_P() - 10)/2);
            userDTO.setMbti_P(userDTO.getMbti_P()-(userDTO.getMbti_J()+userDTO.getMbti_P() - 10)/2);
        }

        userInfoService.setUserInfo(userDTO.getUserName(),userDTO.getUserPassword(),userDTO.getE_mail(),userDTO.getUsernickname(),userDTO.getAge(),userDTO.getMbti_I(),userDTO.getMbti_E(),userDTO.getMbti_T(),
                userDTO.getMbti_F() ,userDTO.getMbti_S() ,userDTO.getMbti_N(),userDTO.getMbti_J(),userDTO.getMbti_P() ,userDTO.getWantPlace1(),userDTO.getWantPlace2(), userDTO.getWantPlace3(), userDTO.getWantPlace4() ,userDTO.getWantPlace5());


        System.out.println(userDTO.toString());
        System.out.println("됨");
    }
}
