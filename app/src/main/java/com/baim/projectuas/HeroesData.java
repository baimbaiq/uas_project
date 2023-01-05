package com.baim.projectuas;

import java.util.ArrayList;

public class HeroesData {
    private static String[] heroNames = {
            "Hyper Evolution Super Saiyan 4 Son Goku",
            "Fuzed Zamasu, Righteous Inquinity",
            "Dr. gero, Evil's Activation",
            "SS Son Gohan, Come What May",
            "Rose Goku Black, Mortals Begone",
            "Chilled, Ruling Through Fear",
            "Bulma, Fighting for Vageta",
            "Frieza, Before the Fall",
            "Absorption Imminentl",
            "Son Goku, Spirit Bomb Absorbed",
            "Hit, Ready to Brawl",
            "Pilaf, Mechanized Partnership"
    };

    private static String[] heroDetails = {
            "[EX-Evolve] (Red)，place 2 cards from your hand in the Drop Area : Red\n" +
                    "<SonGoku : GT> with an energy cost of 6 or more. [Ultimate]（ You can only\n" +
                    "include 1 copy of a card with [Ultimate] in your deck） [Auto] When this card\n" +
                    "attacks, it gains +5000 power for the duration of the turn. Then, if this card's\n" +
                    "power is 60000 or more, it deals 1 damage to your opponent's life.\n" +
                    "[Activate:Main] Place 2 red cards from your hand in the Drop Area : Switch this\n" +
                    "card to Active Mode.",

            "[Z-Awaken] (Yellow), if your life is at 4 or less and you send 1 <Zamasu> card\n" +
                    "and 1 <Goku Black> card from your Z-Energy to your Warp : Yellow <Goku\n" +
                    "Black>. [Auto] When this card attacks, draw 1 card. [Activate : Battle][Once per\n" +
                    "turn] Place 2 non-[Super Combo] <Zamasu> and/or <Goku Black> cards from\n" +
                    "your Drop at the bottom of your deck in any order : This card gets +5000 power\n" +
                    "and [Double Strike] for the battle, then choose up to 1 of your <Zamasu> cards\n" +
                    "and switch it to Active Mode at the end of the turn.",

            "[Auto] If you discard 1 card from your hand : When this card is placed in a Drop\n" +
                    "Area from your Unison Area, your opponent discards 1 card from their hand.\n" +
                    "[+1][Activate : Main] Discard 1 《Android》 card from your hand : Draw 1 card,\n" +
                    "and this card gets +10000 power for the turn.",

            "[Deflect][Blocker] [Permanent] Your yellow <Trunks : Future> cards with\n" +
                    "energy costs of 1 gain [Barrier]. [Auto][Limit 1] When this card is played, you\n" +
                    "may place 1 card from your hand at the bottom of your deck. If you do, play up to\n" +
                    "1 yellow <Trunks : Future> card with an energy cost of 1 from your deck or Drop,\n" +
                    "then shuffle your deck if you looked through it. [Auto] Choose 1 <Trunks :\n" +
                    "Future> card in your Battle Area : When this card attacks or activates [Blocker],\n" +
                    "use 1 card from under the chosen card in a combo, then switch the chosen card to\n" +
                    "Active Mode and it can't attack for the turn.",

            "[Double Strike][Auto] When this card is played, draw 1 card, then choose up to 1\n" +
                    "of your opponent's Battle Cards with an energy cost of 4 or less and place it at the\n" +
                    "bottom of its owner's deck. [Activate : Battle][Limit 1](Blue), if your Leader is\n" +
                    "mono-blue or a <Zamasu> or <Goku Black> card and you have 3 or more Z-\n" +
                    "Energy : Play this card from your hand.",

            "[Energy-Exhaust] Dual Attack][Blocker][Arrival Red/Blue](Red)(Blue)\n" +
                    "[Permanent] If a Red/Blue multicolor card is in your energy, reduce the combo\n" +
                    "cost of this card in your hand by 1.[Auto] When this card is played, look at up to\n" +
                    "5 cards from the top of your deck, add up to 1 red or blue 《Frieza Clan》 card\n" +
                    "with an energy cost of 5 or less among them to your hand, shuffle your deck, and\n" +
                    "choose up to 1 of your opponent's Battle Cards, ignoring [Barrier], and it gets -\n" +
                    "15000 power for the turn.",

            "[Auto] When this card is played, draw 1 card.\n" +
                    "[Auto][Limit 1](Blue), if your Leader is a blue <Vegeta : GT> card and it's your turn : When this card is used in a combo from your hand, choose one—\n" +
                    "・If one of your blue <Vegeta : GT> cards is in a battle, switch up to 1 of your mono-blue energy to Active Mode, and this card gets +5000 combo power for the battle.\n" +
                    "・Choose up to 1 of your blue <Vegeta : GT> cards and it gains [Double Strike] for the battle.",

            "[Deflect]\n" +
                    "[Auto][Limit 1](Green), if your Leader is a green <Frieza> card and you have a green Unison in play : When your Leader skill causes your opponent to discard a card from their hand, play this card from your hand.\n" +
                    "[Auto] When this card is played, draw 1 card, and discard 1 card from your hand.\n" +
                    "[Activate : Main][Limit 1] Choose 1 of your other green 《Frieza's Army》 cards and place it in its owner's Drop : Your opponent discards 1 card from their hand.",

            "[Auto] When this card is played, look at up to 5 cards from the top of your deck, add up to 1 green 《Android》 card among them to your hand, then shuffle your deck.\n" +
                    "[Activate : Main] If your Leader Card is a mono-green <Cell> card : Place this card under your Leader Card.",

            "[Triple Strike][Barrier]\n" +
                    "[Activate : Main](Red)(Red)(Red), if your Leader is a red 《Saiyan》 card and you choose 5 <Son Gohan : Youth>, <Vegeta>, <Trunks : Future>, <Piccolo>, and/or <Krillin> cards—all red—in your Drop : Play this card from your hand, and place the cards chosen with this skill under it.\n" +
                    "[Activate : Battle][Limit 1] Place 5 cards from under this card in their owners' Drops : This card gets +10000 power for the turn, choose all of your opponent's Battle Cards and they get -20000 power for the turn, and at end of turn, place this card in its owner's Drop, and play up to 1 red <Son Goku> card with an energy cost of 1 from your Drop.",

            "[Auto][Once per turn] When this card is attacked by a card with 10000 power or more, switch the target of attack to your Leader.\n" +
                    "[+1][Activate : Main] Add up to 1 card from your life to your hand, place up to 1 skill-less Battle Card with an energy cost of 2 from your deck in your Drop, then shuffle your deck.\n" +
                    "[0][Activate : Main](Red)(Red), if your Leader is a red <Hit> card and your opponent has 3 or more energy : Play up to 1 mono-red <Hit> card with an energy cost of 4 from your hand.",

            "[Auto][Limit 1](Red)(Red), if your Leader is a red <Pilaf> card and there are 1 or more <Pilaf>, <Shu>, and <Mai> cards in your Drop : When this card is used in a combo from your hand, play up to 1 {Pilaf Machine, the Master Bot} from your deck, then shuffle your deck."
    };

    private static int[] heroesImages = {
            R.drawable.hyper,
            R.drawable.zamasu,
            R.drawable.gero,
            R.drawable.gohan,
            R.drawable.goku,
            R.drawable.chilled,
            R.drawable.bulma,
            R.drawable.frieza,
            R.drawable.absorption,
            R.drawable.songoku,
            R.drawable.hit,
            R.drawable.pilaf,
            R.drawable.gogo
    };

    private static int[] viewImages = {
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.gaga,
            R.drawable.gigi,
            R.drawable.gege,
            R.drawable.gaga,
            R.drawable.gogo
    };

    private static String[] heroesType ={
            "BT3-123",
            "EX21-28",
            "EX20-02",
            "EX21-29",
            "EX21-04",
            "EX21-16",
            "EX21-06",
            "EX21-07",
            "EX21-04",
            "BT19-008",
            "EX21-02",
            "EX21-01"
    };

    private static String[] heroesTahun ={
            "5th Anniversary Set Premium Edition",
            "5th Anniversary Set Premium Edition",
            "Ultimate Deck 2022 [DBS-BE20]",
            "5th Anniversary Set Premium Edition",
            "5th Anniversary Set Premium Edition",
            "5th Anniversary Set Premium Edition",
            "5th Anniversary Set Premium Edition",
            "Ultimate Deck 2022 [DBS-BE20]",
            "Ultimate Deck 2022 [DBS-BE20]",
            "5th Anniversary Set Premium Edition",
            "5th Anniversary Set Premium Edition",
            "5th Anniversary Set Premium Edition"
    };

    private static String[] heroesLegal ={
            "DBSCG Bo1 Regulation DBSCG Special Bo1 Regulation DBSCG Tournament\n" +
                    "Regulation",

            "DBSCG Bo1 Regulation DBSCG Special Bo1 Regulation DBSCG Tournament\n" +
                    "Regulation",

            "DBSCG Bo1 Regulation DBSCG Special Bo1 Regulation DBSCG Tournament\n" +
                    "Regulation",

            "DBSCG Bo1 Regulation DBSCG Special Bo1 Regulation DBSCG Tournament\n" +
                    "Regulation",

            "DBSCG Bo1 Regulation DBSCG Special Bo1 Regulation DBSCG Tournament\n" +
                    "Regulation",

            "DBSCG Bo1 Regulation DBSCG Special Bo1 Regulation DBSCG Tournament\n" +
                    "Regulation",

            "DBSCG Bo1 Regulation DBSCG Special Bo1 Regulation DBSCG Tournament\n" +
                    "Regulation",

            "DBSCG Bo1 Regulation DBSCG Special Bo1 Regulation DBSCG Tournament\n" +
                    "Regulation",

            "DBSCG Bo1 Regulation DBSCG Special Bo1 Regulation DBSCG Tournament\n" +
                    "Regulation",

            "DBSCG Bo1 Regulation DBSCG Special Bo1 Regulation DBSCG Tournament\n" +
                    "Regulation",

            "DBSCG Bo1 Regulation DBSCG Special Bo1 Regulation DBSCG Tournament\n" +
                    "Regulation",

            "DBSCG Bo1 Regulation DBSCG Special Bo1 Regulation DBSCG Tournament\n" +
                    "Regulation"
    };


    static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setPhoto(heroesImages[position]);
            hero.setTahun(heroesTahun[position]);
            hero.setLegal(heroesLegal[position]);
            hero.setType(heroesType[position]);
            list.add(hero);
        }
        return list;
    }
}
