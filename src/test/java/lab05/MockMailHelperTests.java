package lab05;

import lab04.refactoring.DBManager;
import lab04.refactoring.Mail;
import lab04.refactoring.MailHelper;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MockMailHelperTests {
    DBManager mockDbManager = Mockito.mock(DBManager.class);
    MailHelper mailHelper = new MailHelper(mockDbManager);

    @Test
    public void positiveVerifySendMailOnce() {
        mailHelper.sendMail(Mockito.anyInt());
        Mockito.verify(mockDbManager, Mockito.times(1))
                .findMail(Mockito.anyInt());
    }

    @Test
    public void failingVerifyTimesTwo() {
        mailHelper.sendMail(Mockito.anyInt());
        Mockito.verify(mockDbManager, Mockito.times(3))
                .findMail(Mockito.anyInt());
    }

    @Test
    public void mockedTest() {
        int mailId = 1;
        mailHelper.setMail("MockedTo", "MockedSubject", "MockedBody");
        Mail mail = mailHelper.getMail();
        Mockito.when(mockDbManager.findMail(mailId)).thenReturn(mail);
        mailHelper.sendMail(mailId);
        System.out.println(mailHelper.getMail().getBody());
        Mockito.verify(mockDbManager).findMail(mailId);
    }
}
