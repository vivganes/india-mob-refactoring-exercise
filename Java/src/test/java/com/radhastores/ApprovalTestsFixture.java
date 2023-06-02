package com.radhastores;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApprovalTestsFixture {
    String output = "";

    @BeforeEach
    public void beforeEach(){
        this.output = "";
    }

    @Test
    public void testFor2Days(){

        Item[] items = new Item[] {
            new Item("+91 Special Gol gappa kit", 10, 20), //
            new Item("Himalayan Cheese", 2, 0), //
            new Item("Elixir of the Airavata", 5, 7), //
            new Item("Ganga Jal", 0, 80), //
            new Item("Ganga Jal", -1, 80),
            new Item("IPL Tickets to RCB Vs. CSK", 15, 20),
            new Item("IPL Tickets to RCB Vs. CSK", 10, 49),
            new Item("IPL Tickets to RCB Vs. CSK", 5, 49),
            new Item("Aamras", 3, 6) };

        runWithItemsForNDays(items,2);

        String expected="\nNAMASTE!\n" +
            "-------- day 0 --------\n" +
            "name, sellIn, quality\n" +
            "+91 Special Gol gappa kit, 10, 20\n" +
            "Himalayan Cheese, 2, 0\n" +
            "Elixir of the Airavata, 5, 7\n" +
            "Ganga Jal, 0, 80\n" +
            "Ganga Jal, -1, 80\n" +
            "IPL Tickets to RCB Vs. CSK, 15, 20\n" +
            "IPL Tickets to RCB Vs. CSK, 10, 49\n" +
            "IPL Tickets to RCB Vs. CSK, 5, 49\n" +
            "Aamras, 3, 6\n" +
            "\n" +
            "-------- day 1 --------\n" +
            "name, sellIn, quality\n" +
            "+91 Special Gol gappa kit, 9, 19\n" +
            "Himalayan Cheese, 1, 1\n" +
            "Elixir of the Airavata, 4, 6\n" +
            "Ganga Jal, 0, 80\n" +
            "Ganga Jal, -1, 80\n" +
            "IPL Tickets to RCB Vs. CSK, 14, 21\n" +
            "IPL Tickets to RCB Vs. CSK, 9, 50\n" +
            "IPL Tickets to RCB Vs. CSK, 4, 50\n" +
            "Aamras, 2, 5\n";

        assertEquals(expected,output);

    }

    private void runWithItemsForNDays(Item[] items, int days){
        RadhaStores app = new RadhaStores(items);

        printAndAddToOutput("NAMASTE!");

        for (int i = 0; i < days; i++) {
            printAndAddToOutput("-------- day " + i + " --------");
            printAndAddToOutput("name, sellIn, quality");
            for (Item item : items) {
                printAndAddToOutput(item.toString());
            }
            printAndAddToOutput("");
            app.updateQuality();
        }
    }

    private void printAndAddToOutput(String text){
        System.out.println(text);
        output += '\n'+text;
    }
}
