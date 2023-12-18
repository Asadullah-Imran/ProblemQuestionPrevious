package Thread.File_Q;

import java.io.*;

public class QuestionSpring22 {
    public static void main(String[] args) {
        String id="id.txt";
        String odd="odd.txt";
        String even="even.txt";
        try{
            BufferedWriter bw=new BufferedWriter(new FileWriter(id));
            bw.write("0112310574\n");
            bw.write("0112310575\n");
            bw.write("0112310576\n");
            bw.write("0112310577\n");
            bw.write("0112310578\n");
            bw.write("0112310579\n");
            bw.close();

            BufferedReader br= new BufferedReader( new FileReader(id));
            BufferedWriter bwo = new BufferedWriter(new FileWriter(odd));
            BufferedWriter bwe = new BufferedWriter(new FileWriter(even));
            String line;

            while ((line= br.readLine())!=null){
                int idNum=Integer.parseInt(line);
                System.out.println(idNum);
                if(idNum%2==0){
                    bwe.write(line+"\n");
                }else {


                    bwo.write(line + "\n");
                }
            }

            br.close();
            bwo.close();
            bwe.close();
            System.out.println("success");
        }catch(IOException e){

        }
    }
}

