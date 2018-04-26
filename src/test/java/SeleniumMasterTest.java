import org.junit.Test;

public class SeleniumMasterTest {

    @Test
    public void orderBannanas() {
        SeleniumMaster seleniumMaster = new SeleniumMaster();

        MasterLogin masterLogin = new MasterLogin();
        masterLogin.username = "cmfit.ro";
        masterLogin.password = "puicupiure";

        seleniumMaster.logMeIn(masterLogin);
        // wait to finish

        seleniumMaster.putProductInBasket("https://www.emag.ro/supermarket/banane-kg-vrac-45788/pd/D44R1BBBM/", 2);

        ClientAddressDetails clientAddressDetails = new ClientAddressDetails();
        // populate this...

        seleniumMaster.placeOrder(clientAddressDetails);
    }

}
