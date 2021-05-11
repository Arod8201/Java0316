package test_order_system;

import com.ocp.lab.oder_system.ServiceCenter;
import org.junit.Test;



public class TestServiceCenter {

    @Test
    public void test_printCatalog() {
        ServiceCenter sc = new ServiceCenter();
        sc.printCatalog();
    }
}
