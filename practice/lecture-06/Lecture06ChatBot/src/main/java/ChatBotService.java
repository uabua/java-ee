import java.text.SimpleDateFormat;
import java.util.Date;

public class ChatBotService {
    public static String answer(String question) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");


        String result;

        switch (question) {
            case "გამარჯობა":
                result = "გამარჯობა, რით შემიძლია დაგეხმაროთ?";
                break;
            case "რომელი საათია?":
                result = simpleDateFormat.format(date);
                break;
            default:
                result = "ამ კითხვაზე პასუხი არ მაქვს";
        }

        return result;
    }
}
