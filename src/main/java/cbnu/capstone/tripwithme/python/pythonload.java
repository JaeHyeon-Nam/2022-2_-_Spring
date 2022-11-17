package cbnu.capstone.tripwithme.python;

import cbnu.capstone.tripwithme.dto.placelist.TourlistDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.Arrays;
import java.util.List;

@RequestMapping("/pythontest")
@CrossOrigin(origins ="*", maxAge = 3600)
@RestController
@RequiredArgsConstructor
public class pythonload {


    @GetMapping("/")
    public void getTourList() throws InterruptedException, IOException {


//        byte[] inputs = {12,11,23,45,6,5,4,3,1,2,3,4,5,6};

        File files = new File("C:/Users/njonh/PycharmProjects/pythonProject/text.txt");
        String inputsss = "12 2 8 1 9 5 5 8 2 99 99 99 88 77";
        FileOutputStream fileOutputStream = new FileOutputStream(files);

        fileOutputStream.write(inputsss.getBytes());
        fileOutputStream.flush();
        fileOutputStream.close();
//        for(byte bt : inputs) {
//            fileOutputStream.write(bt);
//        }
//        fileOutputStream.close();
//        byte[] inputs = {12,11,23,45,6,5,4,3,1,2,3,4,5,6};
//
//        InputStream ipt = new ByteArrayInputStream(inputs);
//
//        InputStreamReader isr = new InputStreamReader(ipt);
//
//        String confirm = new String(String.valueOf(isr.read()));
//        OutputStream opt = new ByteArrayOutputStream(inputs.length);
//        opt.write(inputs);
//
//
//
//        InputStream ist = new InputStreamReader(opt.to);
//
//        String confirm = new String;
//        System.out.println(confirm);

//        System.out.println(Arrays.toString(inputs));
//        for(int a : inputs){
//
//        }
//        InputStream is = new DataInputStream(System.in);
//        System.out.println(is.read());






//        List command1 = new ArrayList
        String command = "C:/Users/njonh/anaconda3/envs/pythonProject/python.exe";
        String arg1 = "C:/Users/njonh/PycharmProjects/pythonProject/pythonInJava1.py";
//        ProcessBuilder builder = new ProcessBuilder(Arrays.asList("C:\\Users\\njonh\\anaconda3\\envs\\pythonProject\\python.exe",arg1));
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
//        line = br.readLine();
//        System.out.println(line);
        while((line= br.readLine()) != null){
            ans1 = line.split("data");
            ans2 = ans1[1].split("[.]");
            ans2[0] = ans2[0].replaceAll("[^0-9]", "");
            System.out.println(ans2[0]);
//            System.out.println(">>> "+ line);
        }
        if(exitVal != 0){
            System.out.println("비정상 종료");
        }


//        System.out.println(br);
//    while ((line = br.readLine()) != null) {
//            System.out.println(">>>  " + line); // 표준출력에 쓴다
//        }
//    if(exitVal != 0) {
//        // 비정상 종료
//        System.out.println("서브 프로세스가 비정상 종료되었다.");
//    }



    }


}
