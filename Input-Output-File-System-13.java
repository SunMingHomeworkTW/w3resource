import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class InputOutputFileSystem13 {
    public static void main(String[] args){
        String strLine = "";
        String str_data = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("/home/students/test.txt"));
            while (strLine != null)
            {
                str_data += strLine;
                strLine = br.readLine();
            }
            System.out.println(str_data);
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}