package cbnu.capstone.tripwithme.service.user;


import cbnu.capstone.tripwithme.dto.user.UserDTO;

public interface UserInfoService {
    UserDTO getUserInfo(String temp);
    void setUserInfo(String name, String password, String e_mail, String nickname, int age, int i, int e, int t, int f, int s, int n, int j, int p,
                     int wp1, int wp2, int wp3, int wp4, int wp5);

}