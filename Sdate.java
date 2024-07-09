import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Fdate{
    public static void main(String[] args){
        LocalDateTime fd=LocalDateTime.now();
        System.out.println("Date before formatting : "+fd);
        DateTimeFormatter fdt=DateTimeFormatter.ofPattern("dd-HH-yyyy HH::mm:ss");
        String f=fd.format(fdt);
        System.out.println("The formatted date : "+f);
    }
}