package com.geoffdraper.ohare2;

public class SecretSauce {

    private Room startingLocation;
    private Room treasureRoom;
    private boolean foundBackpack = false;
    private boolean openedBackpack = false;
    private boolean brassDoorOpen = false;
    private boolean steelDoorOpen = false;
    private boolean copperDoorOpen = false;
    private boolean vaultOpen = false;
    private boolean sarcophagusOpen = false;
    private boolean saidOPEN = false;
    private boolean saidSPHINX = false;
    private boolean bottleFull = false;
    private boolean messageRead = false;
    private boolean readSymbols = false;
    private boolean armorAlive = true;
    private boolean tigerAlive = true;
    private boolean snakeCharmed = false;
    private boolean mummyIsAlive = true;
    private boolean readDangerSign = false;
    private boolean grandpaThere = true;
    private Room epilogue1, epilogue2;

    public SecretSauce(/*Player testing*/) {
        ////////////////////////////////
        // Here, we define all the rooms
        ////////////////////////////////
        Room r1 = new Room("You are in a desert, with sand stretching in all directions. A canvas tent is to the south.");
        Room r2 = new Room("You are in an old tent.");
        Room r3 = new Room("You are in a desert. Sand dunes as far as the eye can see.");
        Room r4 = new Room("You are in a desert. The sand shifts under your feet.");
        Room r5 = new Room("You are in a desert. Nothing but sand for miles around.");
        Room r6 = new Room("You are standing in front of a great pyramid. The walls appear climbable.");
        Room r7 = new Room("You are standing behind the pyramid.");
        r7.setAdditionalDescription("The only entrance is blocked by a heavy brass door which is closed.");
        Room r8 = new Room("Carefully, you climb the walls of the pyramid until you reach the top. From here, you can see the endless desert all around you. In the distance, you see a small tent.");
        Room r9 = new Room("You are in the Main Chamber.");
        Room r10 = new Room("You are in a dusty room. There is a large sign here which reads: LEAVE *TREASURE* HERE. (Tap the \"Check Score\" option in your device's toolbar to see your score.)");
        Room r11 = new Room("You are in a low tunnel which leads straight up.");
        Room r12 = new Room("You are in the workers' chambers.");
        Room r13 = new Room("You are in the uppermost room in the pyramid.");
        Room r14 = new Room("You are in the tool room.");
        Room r15 = new Room("You are in the burial room. There is an ancient sarcophagus here.");
        Room r16 = new Room("You are in the west end of the Grand Gallery.");
        Room r17 = new Room("You are in a crawl space. There is a message written on the wall.");
        Room r18 = new Room("You are in a secret chamber.");
        Room r19 = new Room("You are in the preparation room. Some mouldy wrappings, probably used for mummification in years past, lay scattered on the floor.");
        Room r20 = new Room("You are in a hieroglyphic room. Strange symbols adorn the walls.");
        Room r21 = new Room("You are in the east end of the Grand Gallery.");
        r21.setAdditionalDescription("A massive copper door (currently closed and locked) is built into the east wall.");
        Room r22 = new Room("You are in a damp room. A feeling of magic surrounds you.");
        Room r23 = new Room("You are in an ancient chapel. A sacrificial altar stands in the center of the room.");
        Room r24 = new Room("You are in the west end of a long hallway.");
        r24.setAdditionalDescription("A heavy vault door is embedded in the south wall. A combination dial adorns the vault.");
        Room r25 = new Room("You are in the east end of a long hallway. Additional exits lead north and south.");
        Room r26 = new Room("You are in the cat chamber.");
        r26.setAdditionalDescription("A ferocious tiger prowls back and forth, guarding a treasure.");
        Room r27 = new Room("You are in large room.");
        r27.setAdditionalDescription("A solid-looking steel door is built into the south wall.");
        Room r28 = new Room("You are inside the sarcophagus. You can get out by going back up. However, there appears to be stairway leading down further.");
        Room r29 = new Room("You are in a musty old room. The is a hole in the floor and a passage leading west.");
        r29.setAdditionalDescription("A dangerous-looking mummy wrapped in dry bandages guards the west passage.");
        Room r30 = new Room("You are in an empty pit. A shallow underground stream slowly trickles along the floor, making your feet wet.");
        Room r31 = new Room("You are in the Queen's Chamber.");
        Room r32 = new Room("You are in a small vault.");
        Room r33 = new Room("You are in the Guard Room. Open doorways lead north and south.");
        r33.setAdditionalDescription("A magically-animated suit of armor stands protectively in front of the south doorway, blocking your path.");
        Room r34 = new Room("You are at the east end of a long corridor. A wide fissure stands between you and the western end of the corridor. There is a sign next to the fissure, with writing on it. There is also a small hole in the ground which appears big enough for you to climb into.");
        Room r35 = new Room("You are in a subterranean chamber.");
        Room r36 = new Room("You are in the center of a long corridor. The corridor continues west. There is a wide fissure to your east.");
        Room r37 = new Room("You are at the west end of a long corridor. The corridor continues east.");
        r37.setAdditionalDescription("A low passage leads south; unfortunately that way is blocked by a deadly cobra.");
        Room r38 = new Room("You are in the King's Chamber.");
        Room intro1 = new Room("""
                The huge green serpent slithers across the cavern floor towards you, its fangs dripping with venom.
                                
                "Not today," you whisper.
                                
                With a flick of the wrist, you open the birdcage. The raven bolts out of its cage and, in an astounding flurry, assaults the viper with beak and talon. Writhing in anger, the snake turns around and recedes into the darkness, the bird following close behind.
                                
                "Jane? Jane O'Hare? Time to wake up!"
                                
                Slowly, you open your eyes, and the dream fades. You see your mother standing over you.
                                
                "Grandpa John is here to see you."
                                
                You sit up in bed. You haven't seen your grandfather John O'Hare since the family Christmas party a few months ago.
                                
                A familiar-looking gray-haired man in a well-worn tweed coat saunters in.
                                
                "Hey kiddo! How're you feeling?"
                                
                You roll your eyes with exasperation. "I just sleep all day. Having COVID is negative fun."
                                
                "I'll leave you two to talk. Call me if you need anything." With that, your mother turns to leave.
                """);
        Room intro2 = new Room("""
                Pulling up a chair, Grandpa looks at you curiously and asks, "Did you read the book I gave you?"
                                
                "THE CAVERN OF RICHES? Yes, I've read it lots of times," you say. Then, hesitatingly, you admit, "Sometimes I even dream that I'm the one exploring the cave, hunting for treasures."
                                
                The old man chuckles softly. "I knew you were a kindred spirit." Reaching into his satchel, he retrieves a leather-bound book. "Have I ever told you about the time I visited the Great Pyramid?"
                                
                "Um... no?"
                                
                "It's all written down in here," he pats the book with pride. "May I read it to you?"                                
                """);
        Room intro3 = new Room("""
                Listening to Grandpa tell one of his adventure stories sounds better than doing nothing. "Sure, Grandpa. I'd like that." You settle into your pillow and get comfortable.
                                
                Grandpa John puts on his reading glasses and opens the book to the first page. "This story starts in a desert... a kind of maze."
                                
                "Ugh, really? As in 'twisty little passages?' Maybe I don't want to hear this story."
                                
                "Oh, it's not that bad," Grandpa attempts to reassure you. "You just go south to get the shovel, then north again. Then go east and south, then dig a hole. Then east one more time and you're at the pyramid."
                                
                "Okay, I think I can remember that. But promise me no more mazes after that."
                                
                "I promise. Let's begin, shall we?"                              
                """);
        Room intro4 = new Room("""
                "Mom!" you call out. "Please don't go. I don't have enough energy to listen to one of Grandpa's adventure stories."
                                
                Your grandfather looks disappointed, but nods his head understandingly.
                                
                "Of course, you need your rest. Here's a book to help you pass the time." He sets a small leather-bound book on your nightstand, then turns and leaves your room. Once he's gone, you glance at the cover:
                                
                THE GREAT PYRAMID
                 by John O'Hare
                \s
                You decide to take a look at it. Maybe it will help you sleep.
                """);
        Room intro5 = new Room("""
                Your grandfather looks disappointed, but nods his head understandingly.
                                
                "Of course, you need your rest. Here, I'll give you a copy of the book. Maybe it will help you pass the time." He sets a small leather-bound book on your nightstand, then turns and leaves your room. Once he's gone, you glance at the cover:
                                
                THE GREAT PYRAMID
                 by John O'Hare
                \s
                You decide to take a look at it. Maybe it will help you sleep.
                """);
        epilogue1 = new Room("""
                As you put the final treasure into its place, you hear a friendly voice call out, "Congratulations, you won!"
                                
                You look around. Who said that?
                                
                Suddenly, your surroundings change. You are no longer in the pyramid; you are home in your bed.
                                
                Grandpa John closes the book. "And that's the end of the story," he says.
                                
                "Wait -- don't I get to keep the treasures?"
                                
                "That's just how adventures worked in the 1980s, kiddo. You gather the treasures, put them in a safe location, then you're done!"
                                
                You ponder his words. "Well, I guess the adventure is the journey, not the destination. And besides, I wouldn't know what to do with a bronze cat, anyway."
                                
                John O'Hare chuckles. "That's my girl." He stands up to leave. "You'd better get some rest now. The book is yours; read it as often as you'd like."
                                
                "Thanks, Grandpa."
                                
                As he ambles towards the door, you ask, "Grandpa? Do you have any more adventures you could tell me?"
                                
                The elderly man pauses for a few seconds, his back towards you. He slowly turns around and smiles mysteriously.
                                
                "Yes... for another day."
                                
                With that, he walks out the door. You hope that you won't have to wait too long for your next O'HARE'S ADVENTURE.                                
                """);
        epilogue2 = new Room("""
                As you put the final treasure into its place, you hear a friendly voice call out, "Congratulations, you won!"
                                
                You look around. Who said that?
                                
                Suddenly, your surroundings change. You are no longer in the pyramid; you are home in your bed.
                                
                Grandpa John's book lies open on your lap. Were you reading it? Or dreaming it?
                                
                You can't wait to see where your next O'HARE'S ADVENTURE will take you!
                """);

        r1.markAsOutside();
        r2.markAsOutside();
        r3.markAsOutside();
        r4.markAsOutside();
        r5.markAsOutside();
        r6.markAsOutside();
        r7.markAsOutside();
        r8.markAsOutside();
        intro1.markAsOutside();
        intro2.markAsOutside();
        intro3.markAsOutside();
        intro4.markAsOutside();
        intro5.markAsOutside();
        epilogue1.markAsOutside();
        epilogue2.markAsOutside();

        ///////////////////////////////////////////////////////////////
        // Here, we state which locations lead to which other locations
        ///////////////////////////////////////////////////////////////
        r1.addExit(Direction.SOUTH, r2).addExit(Direction.NORTH, r1).addExit(Direction.EAST, r3);
        r2.addExit(Direction.NORTH, r1);
        r3.addExit(Direction.NORTH, r3).addExit(Direction.SOUTH, r4).addExit(Direction.EAST, r5).addExit(Direction.WEST, r1);
        r4.addExit(Direction.NORTH, r3).addExit(Direction.SOUTH, r4).addExit(Direction.EAST, r6).addExit(Direction.WEST, r4);
        r5.addExit(Direction.NORTH, r5).addExit(Direction.SOUTH, r6).addExit(Direction.EAST, r5).addExit(Direction.WEST, r3);
        r6.addExit(Direction.NORTH, r5).addExit(Direction.SOUTH, r7).addExit(Direction.EAST, r7).addExit(Direction.WEST, r4).addExit(Direction.UP, r8);
        r7.addExit(Direction.NORTH, r6).addExit(Direction.SOUTH, r6).addExit(Direction.WEST, r6).addExit(Direction.UP, r8);
        r8.addExit(Direction.DOWN, r6);
        r9.addExit(Direction.UP, r7).addExit(Direction.NORTH, r10).addExit(Direction.EAST, r15);
        r10.addExit(Direction.NORTH, r11).addExit(Direction.SOUTH, r9);
        r11.addExit(Direction.SOUTH, r10).addExit(Direction.UP, r12);
        r12.addExit(Direction.EAST, r14).addExit(Direction.UP, r13).addExit(Direction.DOWN, r11);
        r13.addExit(Direction.DOWN, r12);
        r14.addExit(Direction.WEST, r12);
        r15.addExit(Direction.WEST, r9).addExit(Direction.EAST, r16);
        r16.addExit(Direction.SOUTH, r19).addExit(Direction.EAST, r21).addExit(Direction.WEST, r15).addExit(Direction.UP, r17);
        r17.addExit(Direction.DOWN, r16);
        r18.addExit(Direction.WEST, r17);
        r19.addExit(Direction.NORTH, r16).addExit(Direction.EAST, r20);
        r20.addExit(Direction.NORTH, r21).addExit(Direction.SOUTH, r22).addExit(Direction.WEST, r16);
        r21.addExit(Direction.SOUTH, r20).addExit(Direction.WEST, r16);
        r22.addExit(Direction.NORTH, r20);
        r23.addExit(Direction.EAST, r22);
        r24.addExit(Direction.EAST, r25).addExit(Direction.WEST, r21);
        r25.addExit(Direction.WEST, r24).addExit(Direction.NORTH, r26).addExit(Direction.SOUTH, r27);
        r26.addExit(Direction.SOUTH, r25);
        r27.addExit(Direction.NORTH, r25);
        r28.addExit(Direction.UP, r15).addExit(Direction.DOWN, r29);
        r29.addExit(Direction.UP, r28).addExit(Direction.DOWN, r30);
        r30.addExit(Direction.UP, r29);
        r31.addExit(Direction.EAST, r29);
        r32.addExit(Direction.NORTH, r24);
        r33.addExit(Direction.NORTH, r27);
        r34.addExit(Direction.NORTH, r33).addExit(Direction.DOWN, r35);
        r35.addExit(Direction.UP, r34);
        r36.addExit(Direction.WEST, r37);
        r37.addExit(Direction.EAST, r36);
        r38.addExit(Direction.NORTH, r37);

        ////////////////////////////////////////
        // Here, we create all the items in the game that the player can interact with
        ////////////////////////////////////////
        Item backpack = new Item("Backpack");
        Item shovel = new Item("Shovel");
        Item flute = new Item("Small flute");
        LightSource flashlight = new LightSource("Flashlight");
        Item matches = new Item("Matches");
        Item crowbar = new Item("Crowbar");
        Item copperKey = new Item("Copper key");
        Item brassKey = new Item("Brass key");
        Item gems = new Item("*Gems*");
        gems.markAsTreasure();
        Item steelKey = new Item("Steel key");
        Item sarcophagus = new Item("Sarcophagus");
        sarcophagus.setNotLuggable("The sarcophagus is too heavy to lift!");
        Item tapestry = new Item("*Rare Tapestry*");
        tapestry.markAsTreasure();
        Item silverSword = new Item("*Silver Sword*");
        silverSword.markAsTreasure();
        Item bronzeCat = new Item("*Bronze Cat*");
        bronzeCat.markAsTreasure();
        bronzeCat.setNotLuggable("The tiger prevents you from taking the bronze cat. Do you have a weapon you could use against the tiger?");
        Item water = new Item("Water");
        water.setNotLuggable("The water spills between your fingers. Do you have a bottle you could use instead?");
        Item ruby = new Item("*Ruby*");
        ruby.markAsTreasure();
        Item bottle = new Item("Empty bottle");
        Item wrappings = new Item("Mouldy wrappings");
        wrappings.setNotLuggable("Leave them alone. You don't need them.");
        Item chalace = new Item("*Golden Chalice*");
        chalace.markAsTreasure();
        Item tiger = new Item("Tiger");
        tiger.setNotLuggable("No way am I touching that!!");
        Item crown = new Item("*Crown of Jewels*");
        crown.setNotLuggable("The mummy stops you from taking the crown!");
        crown.markAsTreasure();
        Item jewelry = new Item("*Jewelry*");
        jewelry.markAsTreasure();
        Item goldBars = new Item("*Gold Bars*");
        goldBars.markAsTreasure();
        Item suitOfArmor = new Item("Animated suit of armor");
        suitOfArmor.setNotLuggable();
        Item diamond = new Item("*Large Diamond*");
        diamond.markAsTreasure();
        diamond.setNotLuggable("The suit of armor stops you from taking the diamond.");
        Item coins = new Item("*Ancient Coins*");
        coins.markAsTreasure();
        Item royalTreasure = new Item("*Royal Treasure*");
        royalTreasure.markAsTreasure();
        Item mummy = new Item("Mummy");
        mummy.setNotLuggable();
        Item cobra = new Item("Venomous cobra");
        cobra.setNotLuggable();

        ////////////////////////////////////////////////
        // Here, we assign possible actions to each item
        ////////////////////////////////////////////////
        flashlight.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                if (flashlight.isOn()) {
                    return "Turn off flashlight.";
                } else {
                    return "Turn on flashlight.";
                }
            }

            @Override
            public void thatThingYouDo(Player p) {
                if (flashlight.isOn()) {
                    flashlight.turnOff();
                    MainActivity.success(p.getContext(), "Your flashlight clicks off.");
                } else {
                    flashlight.turnOn();
                    MainActivity.success(p.getContext(), "Your flashlight clicks on.");
                }
                p.callForceRedisplay();
            }
        });
        brassKey.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                String label = "Try to unlock ";
                Room current = p.getCurrentLocation();
                if (current == r7) {
                    label += "the brass door";
                } else if (current == r15) {
                    label += "the sarcophagus";
                } else if (current == r21 || current == r27) {
                    label += "the door";
                } else if (current == r24) {
                    label += "the vault";
                } else {
                    label += "something";
                }
                return label;
            }

            @Override
            public void thatThingYouDo(Player p) {
                Room currentRoom = p.getCurrentLocation();
                if (currentRoom == r7) {
                    if (brassDoorOpen) {
                        MainActivity.failure(p.getContext(), "The brass door is already open!");
                    } else {
                        if (p.has(brassKey)) {
                            brassDoorOpen = true;
                            r7.setAdditionalDescription("An open door reveals stairs leading down into the pyramid.");
                            r7.addExit(Direction.DOWN, r9);
                            MainActivity.success(p.getContext(), "Fitting your brass key into the lock, the door creaks open.");
                            p.callForceRedisplay();
                        } else {
                            MainActivity.failure(p.getContext(), "The brass door is locked and you don't have the right key");
                        }
                    }
                } else if (currentRoom == r15 || currentRoom == r24 || currentRoom == r27 || currentRoom == r21) {
                    MainActivity.failure(p.getContext(), "You try the brass key, but it does not fit the lock.");
                } else {
                    MainActivity.failure(p.getContext(), "There is nothing here to unlock.");
                }
            }
        });
        steelKey.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                String label = "Try to unlock ";
                Room current = p.getCurrentLocation();
                if (current == r27) {
                    label += "the steel door";
                } else if (current == r15) {
                    label += "the sarcophagus";
                } else if (current == r21 || current == r7) {
                    label += "the door";
                } else if (current == r24) {
                    label += "the vault";
                } else {
                    label += "something";
                }
                return label;
            }

            @Override
            public void thatThingYouDo(Player p) {
                Room currentRoom = p.getCurrentLocation();
                if (currentRoom == r27) {
                    if (steelDoorOpen) {
                        MainActivity.failure(p.getContext(), "The steel door is already open!");
                    } else {
                        if (p.has(steelKey)) {
                            steelDoorOpen = true;
                            r27.setAdditionalDescription("An open door on the south wall leads to another room.");
                            r27.addExit(Direction.SOUTH, r33);
                            MainActivity.success(p.getContext(), "Fitting your steel key into the lock, the door creaks open.");
                            p.callForceRedisplay();
                        } else {
                            MainActivity.failure(p.getContext(), "The steel door is locked and you don't have the right key");
                        }
                    }
                } else if (currentRoom == r15 || currentRoom == r24 || currentRoom == r7 || currentRoom == r21) {
                    MainActivity.failure(p.getContext(), "You try the steel key, but it does not fit the lock.");
                } else {
                    MainActivity.failure(p.getContext(), "There is nothing here to unlock.");
                }
            }
        });
        copperKey.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                String label = "Try to unlock ";
                Room current = p.getCurrentLocation();
                if (current == r21) {
                    label += "the copper door";
                } else if (current == r15) {
                    label += "the sarcophagus";
                } else if (current == r27 || current == r7) {
                    label += "the door";
                } else if (current == r24) {
                    label += "the vault";
                } else {
                    label += "something";
                }
                return label;
            }

            @Override
            public void thatThingYouDo(Player p) {
                Room currentRoom = p.getCurrentLocation();
                if (currentRoom == r21) {
                    if (copperDoorOpen) {
                        MainActivity.failure(p.getContext(), "The copper door is already open!");
                    } else {
                        if (p.has(copperKey)) {
                            copperDoorOpen = true;
                            r21.setAdditionalDescription("An open door on the east wall leads to another room.");
                            r21.addExit(Direction.EAST, r24);
                            MainActivity.success(p.getContext(), "Fitting your copper key into the lock, the door creaks open.");
                            p.callForceRedisplay();
                        } else {
                            MainActivity.failure(p.getContext(), "The copper door is locked and you don't have the right key");
                        }
                    }
                } else if (currentRoom == r15 || currentRoom == r24 || currentRoom == r7 || currentRoom == r27) {
                    MainActivity.failure(p.getContext(), "You try the copper key, but it does not fit the lock.");
                } else {
                    MainActivity.failure(p.getContext(), "There is nothing here to unlock.");
                }
            }
        });

        shovel.addAction(new ItemAction() {
            @Override
            public String getName(Player noop) {
                return "Dig here with the shovel.";
            }

            @Override
            public void thatThingYouDo(/*Item i,*/ Player p) {
                if (p.getCurrentLocation() == r4 && foundBackpack == false) {
                    r4.addItem(backpack);
                    foundBackpack = true;
                    MainActivity.success(p.getContext(), "You found something!");
                    p.callForceRedisplay();
                } else {
                    MainActivity.failure(p.getContext(), "You didn't find anything.");
                }
            }
        });
        backpack.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "Look in the backpack.";
            }

            @Override
            public void thatThingYouDo(Player p) {
                if (openedBackpack) {
                    MainActivity.failure(p.getContext(), "It's empty.");
                } else {
                    openedBackpack = true;
                    p.getCurrentLocation().addItem(flute).addItem(flashlight).addItem(matches).addItem(crowbar).addItem(copperKey);
                    MainActivity.success(p.getContext(), "When you open the backpack, some things fell out!");
                    p.callForceRedisplay();
                }
            }
        });

        crowbar.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                String label = "Try to pry open ";
                Room current = p.getCurrentLocation();
                if (current == r15 && !sarcophagusOpen) {
                    label += "the sarcophagus";
                } else if (current == r24) {
                    label += "the vault";
                } else if (current == r7 || current == r27 || current == r21){
                    label += "the door";
                } else {
                    label += "something";
                }
                return label;
            }

            @Override
            public void thatThingYouDo(Player p) {
                Room current = p.getCurrentLocation();
                if (current == r15) {
                    if (sarcophagusOpen) {
                        MainActivity.failure(p.getContext(), "The sarcophagus is already open!");
                    } else {
                        sarcophagusOpen = true;
                        r15.addExit(Direction.DOWN, r28);
                        r15.setAdditionalDescription("The open sarcophagus reveals a secret passageway leading down.");
                        MainActivity.success(p.getContext(), "Using your crowbar, you slowly pry open the lid of the sarcophagus. Inside, there is a secret passageway you could climb down into.");
                        p.callForceRedisplay();
                    }

                } else {
                    MainActivity.failure(p.getContext(), "You fumble with the crowbar for a while but it does not open.");
                }
            }
        });

        //TODO add an action to smash stuff with the crowbar.
        //Have it fail for everything, but program in cute responses for the mummy, suit of armor, and tiger.
        //For everything else, just say "have some respect for the antiquities!"

        matches.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "Light a match.";
            }

            @Override
            public void thatThingYouDo(Player p) {
                if (p.getCurrentLocation() == r29 && mummyIsAlive) {
                    mummyIsAlive = false;
                    crown.setLuggable();
                    mummy.changeDescription("pile of ashes");
                    mummy.setNotLuggable("You sift dispiritedly through the pile of warm ashes, but they slip through your fingers.");
                    r29.addExit(Direction.WEST, r31);
                    r29.setAdditionalDescription("A pile of ashes lies on the floor where a mummy used to be.");
                    MainActivity.success(p.getContext(), "You light a match and casually flick it at the mummy. The mummy is quickly engulfed in flames, and within a few minutes is reduced to ashes.");
                    p.callForceRedisplay();
                } else {
                    MainActivity.failure(p.getContext(), "You light a match, which burns for a few seconds then flickers out.");
                }
            }
        });
        bottle.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                if (bottleFull) {
                    return "Pour out bottle.";
                } else {
                    return "Fill up bottle.";
                }
            }

            @Override
            public void thatThingYouDo(Player p) {
                if (!bottleFull) {
                    if (p.getCurrentLocation() == r30) {
                        bottleFull = true;
                        bottle.changeDescription("Bottle of water");
                        MainActivity.success(p.getContext(), "You fill the bottle with water from the stream.");
                        p.callForceRedisplay();
                    } else {
                        MainActivity.failure(p.getContext(), "I don't have any liquid here to fill the bottle with.");
                    }
                } else {
                    bottleFull = false;
                    bottle.changeDescription("Empty bottle");
                    if (p.getCurrentLocation() == r33 && armorAlive) {
                        armorAlive = false;
                        diamond.setLuggable();
                        r33.addExit(Direction.SOUTH, r34);
                        r33.setAdditionalDescription("A rusty suit of armor lies in a heap upon the floor.");
                        suitOfArmor.changeDescription("Rusty armor");
                        suitOfArmor.setNotLuggable("You have no need for the rusty armor.");
                        MainActivity.success(p.getContext(), "You pour the water on the suit of armor, causing it to rust immediately. It crumples to the ground, powerless.");
                    } else {
                        MainActivity.failure(p.getContext(), "You pour the water onto the floor.");
                    }
                    p.callForceRedisplay();
                }
            }
        });

        silverSword.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "Swing the sword.";
            }

            @Override
            public void thatThingYouDo(Player p) {
                if (p.getCurrentLocation() == r26 && tigerAlive) {
                    tigerAlive = false;
                    bronzeCat.setLuggable();
                    tiger.changeDescription("Dead tiger");
                    r26.setAdditionalDescription("A dead tiger lies on the floor.");
                    tiger.setNotLuggable("Thanks, but... no thanks.");
                    MainActivity.success(p.getContext(), "One two, one two! And through and through the vorpal blade goes snicker-snack! The tiger is slain.");
                    p.callForceRedisplay();
                } else if ((p.getCurrentLocation() == r29 && mummyIsAlive) || (p.getCurrentLocation() == r33 && armorAlive)) {
                    MainActivity.failure(p.getContext(), "Mortal weapons are powerless against the undead.");
                } else if (p.getCurrentLocation() == r37) {
                    MainActivity.failure(p.getContext(), "The cobra deftly avoids your attack.");
                } else {
                    MainActivity.failure(p.getContext(), "Swish! The blade slides harmlessly through the air.");
                }
            }
        });

        flute.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "Play the flute";
            }

            @Override
            public void thatThingYouDo(Player p) {
                if (p.getCurrentLocation() == r37 && !snakeCharmed) {
                    snakeCharmed = true;
                    r37.addExit(Direction.SOUTH, r38);
                    r37.setAdditionalDescription("A harmless charmed snake lies coiled up in the corner. A low passage leads south.");
                    MainActivity.success(p.getContext(), "You play an enchanting tune on the flute. The cobra sways with the music, mesmerized. Good job! You charmed the snake.");
                    p.callForceRedisplay();
                } else {
                    MainActivity.failure(p.getContext(), "You play a nice tune on the flute. If only your music teacher was here to give you extra credit!");
                }
            }
        });


        /////////////////////////////////////////////////////
        // Here, we add the items to their starting locations
        /////////////////////////////////////////////////////
        r2.addItem(shovel);
        r8.addItem(brassKey);
        r13.addItem(gems);
        r14.addItem(steelKey);
        r15.addItem(sarcophagus);
        r15.addItem(tapestry);
        r28.addItem(silverSword);
        r18.addItem(ruby);
        r19.addItem(bottle);
        r19.addItem(wrappings);
        r23.addItem(chalace);
        r26.addItem(tiger);
        r26.addItem(bronzeCat);
        r29.addItem(mummy);
        r29.addItem(crown);
        r30.addItem(water);
        r31.addItem(jewelry);
        r32.addItem(goldBars);
        r33.addItem(suitOfArmor);
        r33.addItem(diamond);
        r35.addItem(coins);
        r37.addItem(cobra);
        r38.addItem(royalTreasure);

        ///////////////////////////////////////////////////////////////////
        // Here, we add special actions that are specific to certain rooms
        ///////////////////////////////////////////////////////////////////
        r17.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "Read the message on the wall.";
            }

            @Override
            public void thatThingYouDo(Player p) {
                MainActivity.success(p.getContext(), "Roughly translated, the message reads: Say the word \"OPEN.\"");
                if (!messageRead) {
                    messageRead = true;
                    p.addMagicWord(new ItemAction() {
                        @Override
                        public String getName(Player p) {
                            return "Open";
                        }

                        @Override
                        public void thatThingYouDo(Player p) {
                            if (p.getCurrentLocation() == r17 && !saidOPEN) {
                                r17.addExit(Direction.EAST, r18);
                                saidOPEN = true;
                                MainActivity.success(p.getContext(), "Before your eyes, a secret passage opens up in the east wall!");
                                p.callForceRedisplay();
                            } else {
                                MainActivity.failure(p.getContext(), "Nothing happens.");
                            }
                        }
                    });
                    /*r17.addAction(new ItemAction() {
                        @Override
                        public String getName(Player p) {
                            return "Say \"OPEN\".";
                        }

                        @Override
                        public void thatThingYouDo(Player p) {
                            if (!saidOPEN) {
                                saidOPEN = true;
                                r17.addExit(Direction.EAST, r18);
                                MainActivity.success(p.getContext(), "Before your eyes, a secret passage opens up in the east wall!");
                                p.callForceRedisplay();
                            } else {
                                MainActivity.failure(p.getContext(), "Nothing happens.");
                            }
                        }
                    });*/
                }
                p.callForceRedisplay();
            }
        });

        //TODO make a general purpose "talk" feature so you can say magic words
        r20.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "Read the strange symbols";
            }

            @Override
            public void thatThingYouDo(Player p) {
                MainActivity.success(p.getContext(), "Roughly translated, the symbols read: \"The magic word is 'Sphinx.' And the combination is 762-112-777.\"");
                if (!readSymbols) {
                    readSymbols = true;
                    p.addMagicWord(new ItemAction() {
                        @Override
                        public String getName(Player p) {
                            return "Sphinx";
                        }

                        @Override
                        public void thatThingYouDo(Player p) {
                            if (p.getCurrentLocation() == r22 && !saidSPHINX) {
                                r22.addExit(Direction.WEST, r23);
                                saidSPHINX = true;
                                MainActivity.success(p.getContext(), "As you speak the word, a misty passage opens up in the west wall.");
                                p.callForceRedisplay();
                            } else {
                                MainActivity.failure(p.getContext(), "Nothing happens.");
                            }
                        }
                    });
                    /*r20.addAction(new ItemAction() {
                        @Override
                        public String getName(Player p) {
                            return "Say \"Sphinx\".";
                        }

                        @Override
                        public void thatThingYouDo(Player p) {
                            MainActivity.failure(p.getContext(), "Nothing happens.");
                        }
                    });
                    r22.addAction(new ItemAction() {
                        @Override
                        public String getName(Player p) {
                            return "Say \"Sphinx\".";
                        }

                        @Override
                        public void thatThingYouDo(Player p) {
                            if (!saidSPHINX) {
                                r22.addExit(Direction.WEST, r23);
                                saidSPHINX = true;
                                MainActivity.success(p.getContext(), "As you speak the word, a misty passage opens up in the west wall.");
                                p.callForceRedisplay();
                            } else {
                                MainActivity.failure(p.getContext(), "Nothing happens.");
                            }
                        }
                    });*/
                    r24.addAction(new ItemAction() {
                        @Override
                        public String getName(Player p) {
                            return "Try the combination 762-112-777.";
                        }

                        @Override
                        public void thatThingYouDo(Player p) {
                            if (!vaultOpen) {
                                vaultOpen = true;
                                r24.addExit(Direction.SOUTH, r32);
                                MainActivity.success(p.getContext(), "Presto! The vault door swings open.");
                                p.callForceRedisplay();
                            } else {
                                MainActivity.failure(p.getContext(), "No need; the vault is already open.");
                            }
                        }
                    });
                }
            }
        });

        r34.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "Read the sign";
            }

            @Override
            public void thatThingYouDo(Player p) {
                MainActivity.success(p.getContext(), "The sign says: DANGER! 250 meter drop");
                if (!readDangerSign) {
                    readDangerSign = true;
                    r34.addAction(new ItemAction() {
                        @Override
                        public String getName(Player p) {
                            return "Try to jump across the fissure.";
                        }

                        @Override
                        public void thatThingYouDo(Player p) {
                            MainActivity.success(p.getContext(), "You made it!");
                            p.go(r36);
                            p.callForceRedisplay();
                        }
                    });
                    p.callForceRedisplay();
                }
            }
        });

        r36.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "Try to jump across the fissure.";
            }

            @Override
            public void thatThingYouDo(Player p) {
                MainActivity.success(p.getContext(), "You made it!");
                p.go(r34);
                p.callForceRedisplay();
            }
        });

        intro1.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "Invite Grandpa to sit down and talk.";
            }

            @Override
            public void thatThingYouDo(Player p) {
                p.go(intro2);
                p.callForceRedisplay();
            }
        });

        intro1.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "Call Mom back.";
            }

            @Override
            public void thatThingYouDo(Player p) {
                grandpaThere = false;
                p.go(intro4);
                p.callForceRedisplay();
            }
        });

        intro2.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "Yes, please!";
            }

            @Override
            public void thatThingYouDo(Player p) {
                p.go(intro3);
                p.callForceRedisplay();
            }
        });

        intro2.addAction(new ItemAction() {
            @Override
            public String getName(Player p) {
                return "No thanks.";
            }

            @Override
            public void thatThingYouDo(Player p) {
                grandpaThere = false;
                p.go(intro5);
                p.callForceRedisplay();
            }
        });

        var begin = new ItemAction() {
            @Override
            public String getName(Player p) {
                return "Begin";
            }

            @Override
            public void thatThingYouDo(Player p) {
                p.go(r1);
                p.callForceRedisplay();
            }
        };

        intro3.addAction(begin);
        intro4.addAction(begin);
        intro5.addAction(begin);

        var closure = new ItemAction() {

            @Override
            public String getName(Player p) {
                return "The End";
            }

            @Override
            public void thatThingYouDo(Player p) {
                ((MainActivity)(p.getContext())).finish();
            }
        };
        epilogue1.addAction(closure);
        epilogue2.addAction(closure);

        ////////////////////////////////////////////////
        // Here, we mark the "special locations" as such
        ////////////////////////////////////////////////
        startingLocation = intro1;
        treasureRoom = r10;


        //TESTING
//        flashlight.turnOn();
//        testing.testing_setStartRoom(r9);
//        testing.addToInventory(flashlight);
    }

    public Room getStartingLocation() {
        return startingLocation;
    }

    public int reportScore() {
        return treasureRoom.combienDeTrésors();
    }

    public int totalPossibleTreasures() {
        return 12;
    }

    public String getAboutText() {
        return """
                Based on the public domain text adventure game for Commodore computers: "O'Hare's Adventure #2: The Great Pyramid" by John O'Hare.
                
                Adapted for Android devices by Geoff Draper.
                
                The laptop on which this game was developed was powered in part by electricity derived from photovoltaic solar panels.
                """;
    }

    public Room getEpilogue() {
        if (grandpaThere) {
            return epilogue1;
        } else {
            return epilogue2;
        }
    }

    public String getFullName() {
        return "O'Hare's Adventure II: The Great Pyramid";
    }
}
