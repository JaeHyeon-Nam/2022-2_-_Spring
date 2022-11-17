

package cbnu.capstone.tripwithme.service.user;


import cbnu.capstone.tripwithme.dto.user.UserDTO;
import cbnu.capstone.tripwithme.mapper.placelist.PlacelistMapper;
import cbnu.capstone.tripwithme.mapper.user.UserInfoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserInfoServiceImp implements UserInfoService {

    private final UserInfoMapper userInfoMapper;


    @Override
    public UserDTO getUserInfo(String temp) {
        return userInfoMapper.getUserInfo(temp);
    }

    @Override
    public void setUserInfo(String name, String password, String e_mail, String nickname, int age, int i, int e, int t, int f, int s, int n, int j, int p,
                            int wp1, int wp2, int wp3, int wp4, int wp5) {
        userInfoMapper.setUserInfo( name,  password,  e_mail,  nickname,  age,  i,  e,  t,  f,  s,  n,  j,  p,
         wp1,  wp2,  wp3,  wp4,  wp5);
    }
}