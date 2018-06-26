import java.io.File;
import java.io.FilenameFilter;

class InputOutputFileSystem2 {
    public static void main(String[] args){
        File file = new File("/home/students/");
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".py")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:list){
            System.out.println(f);
        }
    }
}