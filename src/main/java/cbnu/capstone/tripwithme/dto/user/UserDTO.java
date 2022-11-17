package cbnu.capstone.tripwithme.dto.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    private String userName;
    private String userPassword;
    private String e_mail;
    private String usernickname;
    private int age;
    private int mbti_I;
    private int mbti_E;
    private int mbti_T;
    private int mbti_F;
    private int mbti_S;
    private int mbti_N;
    private int mbti_J;
    private int mbti_P;
    private int wantPlace1;
    private int wantPlace2;
    private int wantPlace3;
    private int wantPlace4;
    private int wantPlace5;

    @Override
    public String toString(){
        System.out.println("userName : " + getUserName() +
                        "\nuserPassword : " + getUserPassword() +
                        "\ne_mail : " + getE_mail() +
                        "\nusernickname : " + getUsernickname() +
                        "\nage : " + getAge() +
                        "\nmbti_I : " + getMbti_I() +
                        "\nmbti_E : " + getMbti_E() +
                        "\nmbti_T : " + getMbti_T() +
                        "\nmbti_F : " + getMbti_F() +
                        "\nmbti_S : " + getMbti_S() +
                        "\nmbti_N : " + getMbti_N() +
                        "\nmbti_J : " + getMbti_J() +
                        "\nmbti_P : " + getMbti_P() +
                        "\nwantPlace1 : " + getWantPlace1() +
                        "\nwantPlace2 : " + getWantPlace2() +
                        "\nwantPlace3 : " + getWantPlace3() +
                        "\nwantPlace4 : " + getWantPlace4() +
                        "\nwantPlace5 : " + getWantPlace5()

                );
        return "완료";
    }

}
