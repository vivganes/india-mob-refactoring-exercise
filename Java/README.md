Radha Stores  - Requirements
======================================

Hi and welcome to team **Radha Stores** 👋

As you know, we are a small shop with a prime location in a prominent city run by a friendly storekeeper.

We also buy and sell only the finest goods.

Unfortunately, our goods are constantly degrading in quality as they approach their **sell by date**.

We have a system in place that updates our inventory for us.  It was developed by a no-nonsense engineer named Veeresha, who has moved on to new adventures.

## What are you expected to do?

We will be honest 😁 Right now, the code is a mess.  That's because we were always asking Veeresha to deliver fast.

Your task is to refactor the code in our system so that we can easily add new features in the near future.

## First, an introduction to our system

- All items have a `SellIn` value which denotes the number of days we have to sell the item
- All items have a `Quality` value which denotes how valuable the item is
- At the end of each day, our system lowers both values for every item

Pretty simple, right? 😜

Well this is where it gets interesting:

- Once the sell by date has passed, Quality degrades twice as fast
- The Quality of an item is never negative
- "Himalayan Cheese" actually increases in Quality the older it gets
- The Quality of an item is never more than 50
- "Ganga Jal", being a legendary item, never decreases in Quality so the sell by date is just ignored anytime
- "Ganga Jal", being a legendary item, its Quality is always 80 and it never alters.
- "IPL Tickets ..." increase in Quality as their SellIn value approaches
    - Quality increases by 2 when there are 10 days or less and
    - Quality drops by 3 when there are 5 days or less but
    - Quality drops to 0 after the event

Feel free to make any changes to the UpdateQuality method and add any new code as long as everything
still works correctly.

⚠️⚠️⚠️ However, do not alter the Item class or Items property as those belong to the
_Bhoota_ in the corner who will insta-rage and one-shot you as he doesn't believe in shared code
ownership (you can make the UpdateQuality method and Items property static if you like, we'll cover
for you).
