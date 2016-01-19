package com.android.msahakyan.endlesspager.helper;

import com.android.msahakyan.endlesspager.model.A;
import com.android.msahakyan.endlesspager.model.B;
import com.android.msahakyan.endlesspager.model.C;
import com.android.msahakyan.endlesspager.model.D;
import com.android.msahakyan.endlesspager.model.PagerItem;
import com.android.msahakyan.endlesspager.model.SwipeablePage;

import java.util.ArrayList;
import java.util.List;

/**
 * @author msahakyan
 */
public class DummyDataSource {

    public static List<SwipeablePage> getPageList() {

        List<SwipeablePage> itemList = new ArrayList<>();

        A a = new A();
        a.setType(PagerItem.TYPE_A);
        a.setTitle("PAGE A");

        B b = new B();
        b.setType(PagerItem.TYPE_B);
        b.setTitle("PAGE B");

        C c = new C();
        c.setType(PagerItem.TYPE_C);
        c.setTitle("PAGE C");

        D d = new D();
        d.setType(PagerItem.TYPE_D);
        d.setTitle("PAGE D");

        itemList.add(a);
        itemList.add(b);
        itemList.add(c);
        itemList.add(d);

        return itemList;
    }
}
