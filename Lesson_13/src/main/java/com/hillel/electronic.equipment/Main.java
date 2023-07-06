import phones.Androids;
import phones.IPhones;

public class Main {
    public static void main(String[] args) {
        IPhones iPhoneXS = new IPhones(200, "IPhone", "XS", "AMD", "Used",
                "iOS", true);
        iPhoneXS.printAll();
        iPhoneXS.internet(true);
        iPhoneXS.call("Mom");
        iPhoneXS.sms("Dad", "Call to Mom");
        iPhoneXS.iCloud();
        System.out.println("");
        Androids SamsungS9 = new Androids(315, "Samsung", "S9", "Intel", "New",
                "Android", false);
        SamsungS9.printAll();
        SamsungS9.GoogleAcc();
        SamsungS9.internet(false);
        SamsungS9.call("Boss");
        SamsungS9.sms("Boss", "Where is my salary ?");

    }
}
