package lab04;

import lab04.refactoring.Configuration;
import lab04.refactoring.DBManager;
import lab04.refactoring.MailHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainHelperTests {

    private String to;
    private String subject;
    private String body;

    private MailHelper mailHelper;

    @BeforeEach
    public void init() {
        Configuration.isDebug = true;
        mailHelper = new MailHelper(new DBManager());
        to = "Receiver";
        subject = "Mail subject";
        body = "Mail body";
        mailHelper.setMail(to, subject, body);
    }

    @Test
    public void mailHasSetTo_ToIsSetToExpectedData_returnTo() {
        Assertions.assertEquals(to, mailHelper.getMail().getTo());
    }

}
