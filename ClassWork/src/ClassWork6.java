import java.nio.file.Paths;
import java.util.Base64;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;


public class ClassWork6 {
    public static void main(String[] args) throws Exception {

        byte[] data = Files.readAllBytes(Paths.get("C:\\Users\\HP\\Desktop\\AndreiRick\\file.txt"));
        String base64String = new String(data); // входная строка в формате Base64
        byte[] bytesbase64 = base64String.getBytes(StandardCharsets.UTF_8);
        Path xmlFilePath = Path.of("C:\\Users\\HP\\Desktop\\AndreiRick\\7733564699_Гринин_30-12-2023.xml");
        byte[] xmlBytes = Files.readAllBytes(xmlFilePath);

        byte[] bytes = Base64.getDecoder().decode(base64String); // декодирование в массив байт
        String decodedData = new String(bytes, "windows-1251");
        System.out.println(decodedData);

//        Path xmlFilePath = Path.of("C:\\Users\\HP\\Desktop\\AndreiRick\\7733564699_Гринин_30-12-2023.xml");
//        byte[] xmlBytes = Files.readAllBytes(xmlFilePath);
//        String base64Xml = Base64.getEncoder().encodeToString(xmlBytes);
//        Path base64FilePath = Path.of("C:\\Users\\HP\\Desktop\\AndreiRick\\file.txt");
//        Files.write(base64FilePath, base64Xml.getBytes());
    }
}

