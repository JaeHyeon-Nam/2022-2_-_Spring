
package cbnu.capstone.tripwithme.python;

import cbnu.capstone.tripwithme.dto.user.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class pythonload_ing {



    public String getMBTIlist(UserDTO userDTO) throws InterruptedException, IOException {

        String inputMBTI = userDTO.getAge() + " " + userDTO.getMbti_I()+ " "+ userDTO.getMbti_E() + " "
                            + userDTO.getMbti_T()+ " "+ userDTO.getMbti_F() + " "
                            + userDTO.getMbti_S()+ " "+ userDTO.getMbti_N() + " "
                            + userDTO.getMbti_J()+ " "+ userDTO.getMbti_P() +" "
                            + userDTO.getWantPlace1() + " "
                            + userDTO.getWantPlace2() + " "
                            + userDTO.getWantPlace3() + " "
                            + userDTO.getWantPlace4() + " "
                            + userDTO.getWantPlace5();
        File files = new File("C:/Users/njonh/PycharmProjects/pythonProject/text.txt");
//        inputMBTI = "12 2 8 1 9 5 5 8 2 99 99 99 88 77";
        FileOutputStream fileOutputStream = new FileOutputStream(files);
        System.out.println(inputMBTI);
        fileOutputStream.write(inputMBTI.getBytes());
        fileOutputStream.flush();
        fileOutputStream.close();



        String command = "C:/Users/njonh/anaconda3/envs/pythonProject/python.exe";
        String arg1 = "C:/Users/njonh/PycharmProjects/pythonProject/pythonInJava1.py";
        ProcessBuilder builder = new ProcessBuilder( "python",arg1);
        Process process = builder.start();
        int exitVal = process.waitFor();

        BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream(), "euc-kr")); // 서브 프로세스가 출력하는 내용을 받기 위해
        String line;

        br.readLine();
        br.readLine();
        br.readLine();
        String ans1[] = new String[2];
        String ans2[] = new String[2];

        while((line= br.readLine()) != null){
            ans1 = line.split("data");
            ans2 = ans1[1].split("[.]");
            ans2[0] = ans2[0].replaceAll("[^0-9]", "");
            System.out.println(ans2[0]);
        }
        if(exitVal != 0){
            System.out.println("비정상 종료");
        }


        return ans2[0];

    }


}