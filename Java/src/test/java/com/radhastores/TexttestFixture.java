package com.radhastores;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("NAMASTE!");

        Item[] items = new Item[] {
                new Item("+5 DIY Gol gappa kit", 10, 20), //
                new Item("Himalayan Cheese", 2, 0), //
                new Item("Elixir of the Airavata", 5, 7), //
                new Item("Ganga Jal", 0, 80), //
                new Item("Ganga Jal", -1, 80),
                new Item("Backstage passes to a Hindustani concert", 15, 20),
                new Item("Backstage passes to a Hindustani concert", 10, 49),
                new Item("Backstage passes to a Hindustani concert", 5, 49),
                // this magical item does not work properly yet
                new Item("Magical Aamras", 3, 6) };

        RadhaStores app = new RadhaStores(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}
