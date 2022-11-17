package cbnu.capstone.tripwithme.mapper.user;

import cbnu.capstone.tripwithme.dto.user.UserDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper {

    UserDTO getUserInfo(String temp);
    void setUserInfo(String name, String password, String e_mail, String nickname, int age, int i, int e, int t, int f, int s, int n, int j, int p,
                     int wp1, int wp2, int wp3, int wp4, int wp5);
}
