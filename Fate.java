import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Fate{
    public static void main(String[] args){
        LocalDateTime fd=LocalDateTime.now();
        System.out.println("Date before formatting : "+fd);
        DateTimeFormatter fdt=DateTimeFormatter.ofPattern("E , dd-HH-yyyy HH::mm:ss");
        String f=fd.format(fdt);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("The formatted date : "+f);
    }
}