package com.radhastores;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadhaStoresTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        RadhaStores app = new RadhaStores(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].name);
    }

}
