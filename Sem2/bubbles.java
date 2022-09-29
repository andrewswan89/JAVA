import java.util.Arrays;
import java.util.logging.*;
import java.io.*;
import java.util.logging.Logger;
public class bubbles {

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(bubbles.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("Sem2/log.txt") ;
        logger.addHandler(fh);
        SimpleFormatter sFormatter= new SimpleFormatter();
        fh.setFormatter(sFormatter);
        logger.log(Level.INFO, String.format("Code start %n" ));
        int [] mas = {25,39,11, 3, 14, 16, 7};
 
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf; 
        System.out.println(Arrays.toString(mas));
        try {
            logger.log(Level.INFO, String.format("Next iteration %n" +  Arrays.toString(mas)+ "%n" ));
    
        } catch (Exception e) {}
    }
}            
}    
logger.log(Level.OFF,String.format("Code finish %n" ));
}
}  