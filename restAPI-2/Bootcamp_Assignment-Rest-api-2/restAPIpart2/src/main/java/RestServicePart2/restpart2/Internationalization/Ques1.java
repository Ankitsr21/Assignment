package RestServicePart2.restpart2.Internationalization;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class Ques1 {
    private MessageSource messageSource;

    public Ques1(MessageSource messageSource){
        this.messageSource=messageSource;
    }
    @GetMapping("/message")
    public String getMsg(){ //
        Locale locale= LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message",null,"Default Msg",locale);

    }
}
