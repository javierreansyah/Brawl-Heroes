

public class Display {
    void gameField (IParty playerParty, IParty cpuParty){
        System.out.println("--------------------------------------------------------------------");
        System.out.println("|                      |    BRAWL HEROES     |                 [ X ]|");
        System.out.println("|===================================================================|");
        System.out.println("|                      |                     |                      |");
        System.out.println("|                      |                     |                      |");
        System.out.println("|----------------------|                     |----------------------|");
        System.out.println("|  HP  |  DEF  |  ATK  |                     |  HP  |  DEF  |  ATK  |");
        System.out.println("|----------------------|                     |----------------------| ");
        System.out.println("|      |       |       |                     |      |       |       |");
        System.out.println("|=======================                     =======================|");
        System.out.println("|                      |  ██    ██  ██████   |                      |");
        System.out.println("|                      |  ██    ██ ██        |                      |");
        System.out.println("|----------------------|   ██  ██   █████    |----------------------|");
        System.out.println("|  HP  |  DEF  |  ATK  |    ████        ██   |  HP  |  DEF  |  ATK  |");
        System.out.println("|----------------------|     ██    ██████    |----------------------|");
        System.out.println("|      |       |       |                     |      |       |       | ");
        System.out.println("|=======================                     =======================|");
        System.out.println("|                      |                     |                      |");
        System.out.println("|                      |                     |                      |");
        System.out.println("|----------------------|                     |----------------------|");
        System.out.println("|  HP  |  DEF  |  ATK  |                     |  HP  |  DEF  |  ATK  |");
        System.out.println("|----------------------|                     |----------------------| ");
        System.out.println("|      |       |       |                     |      |       |       |");
        System.out.println("---------------------------------------------------------------------");
    }

    void winnerBanner (){
        System.out.println("          ██        ██ ██ ███   ██ ███   ██ ███████ ██████           ");
        System.out.println("          ██   ██   ██ ██ ████  ██ ████  ██ ██      ██   ██          ");
        System.out.println("           ██ ████ ██  ██ ██ ██ ██ ██ ██ ██ █████   ██████           ");
        System.out.println("           ████  ████  ██ ██  ████ ██  ████ ██      ██   ██          ");
        System.out.println("            ██    ██   ██ ██   ███ ██   ███ ███████ ██   ██          ");
        System.out.println("                                                                     ");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("|                            TEAM NAME                               |");
        System.out.println("|====================================================================|");
        System.out.println("|                      |                      |                      |");
        System.out.println("|                      |                      |                      |");
        System.out.println("|----------------------|----------------------|----------------------|");
        System.out.println("|  HP  |  DEF  |  ATK  |  HP  |  DEF  |  ATK  |  HP  |  DEF  |  ATK  |");
        System.out.println("|----------------------|----------------------|----------------------|");
        System.out.println("|      |       |       |      |       |       |      |       |       |");
        System.out.println("|====================================================================|");
    }



    void menuGame (){
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                                Menu                               |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                           [a] New Game                            |");
        System.out.println("|                           [b] Load Game                           |");
        System.out.println("|                           [c] Exit Game                           |");
        System.out.println("|                                                                   |");
        System.out.println("|                            Swift Games                            |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                         Select (a | b | c)                        |");
        System.out.println("---------------------------------------------------------------------");
        System.out.print("Your Choice : ");
    }

    void newGameMenu (){
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                              Options                              |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                           [a] Create Party                        |");
        System.out.println("|                           [b] Back                                |");
        System.out.println("|                                                                   |");
        System.out.println("|                                                                   |");
        System.out.println("|                            Swift Games                            |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                         Select (a | b | c)                        |");
        System.out.println("---------------------------------------------------------------------");
        System.out.print("Your Choice : ");
    }

    void readyGameDisplay (IParty playerParty) {
        String team = playerParty.getPartyName() + "'s Team";
        int x = team.length() + 28;
        int y = 68 - x + 1;

        String h1 = playerParty.getCharacters().get(0).getName();String h2 = playerParty.getCharacters().get(1).getName();String h3 = playerParty.getCharacters().get(2).getName();
        int hl1 = 7 + h1.length()+1;
        int hr1 = 22 - hl1 + 1;

        int hl2 = 7 + h2.length();
        int hr2 = 22 - hl2 + 1;

        int hl3 = 7 + h3.length();
        int hr3 = 22 - hl3 + 1;


        int hp1 = playerParty.getCharacters().get(0).getHP();int hp2 = playerParty.getCharacters().get(1).getHP();int hp3 = playerParty.getCharacters().get(2).getHP();
        int hpl1 = 2 + String.valueOf(hp1).length();
        int hpr1 = 6 - hpl1 + 1;

        int hpl2 = 2 + String.valueOf(hp2).length();
        int hpr2 = 6 - hpl2 + 1;

        int hpl3 = 2 + String.valueOf(hp3).length();
        int hpr3 = 6 - hpl2 + 1;


        int def1 = playerParty.getCharacters().get(0).getHP();int def2 = playerParty.getCharacters().get(1).getHP();int def3 = playerParty.getCharacters().get(2).getHP();

        int defl1 = 2 + String.valueOf(def1).length();
        int defr1 = 6 - defl1 + 1;

        int defl2 = 2 + String.valueOf(def2).length();
        int defr2 = 6 - defl2 + 1;

        int defl3 = 2 + String.valueOf(def3).length();
        int defr3 = 6 - defl3 + 1;


        int atk1 = playerParty.getCharacters().get(0).getHP();int atk2 = playerParty.getCharacters().get(1).getHP();int atk3 = playerParty.getCharacters().get(2).getHP();

        int atkl1 = 2 + String.valueOf(atk1).length();
        int atkr1 = 6 - atkl1 + 1;

        int atkl2 = 2 + String.valueOf(atk2).length();
        int atkr2 = 6 - atkl2 + 1;

        int atkl3 = 2 + String.valueOf(atk3).length();
        int atkr3 = 6 - atkl3 + 1;


        System.out.println();
        System.out.println();
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("|%"+ x +"s" +"%" + y +"s\n"  , team, "|");
        System.out.println("|====================================================================|");
        System.out.printf("|%" + hl1 + "s%" + hr1 + "s%" + hl2 + "s%" + hr2 + "s%" + hl3 + "s%" + hr3 + "s\n", h1, "|", h2, "|", h3, "|");
        System.out.println("|                      |                      |                      |");
        System.out.println("|----------------------|----------------------|----------------------|");
        System.out.println("|  HP  |  DEF  |  ATK  |  HP  |  DEF  |  ATK  |  HP  |  DEF  |  ATK  |");
        System.out.println("|----------------------|----------------------|----------------------|");
        System.out.printf("|%" + hpl1 + "s%" + hpr1 + " s%" + defl1 + "s %" + defr1 + "s%" + atkl1 + "s %" + atkr1 + "s%" + hpl2 + "s %" + hpr2 + "s%" + defl2 + "s %" + defr2 + "s%" + atkl2 + "s %" + atkr2 + "s%" + hpl3 + "s %" + hpr3 + "s%" + defl3 + "s %" + defr3 + "s%" + atkl3 + "s %" + atkr3 + "s\n", hp1, "|", def1, "|", atk1, "|", hp2, "|", def2, "|", atk2, "|", hp3, "|", def3, "|", atk3, "|");
        System.out.println("|====================================================================|");
        System.out.println("|                         Start play (y/n) ?                         |");
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Your Choice : ");
    }

    void menuGameWhenPlay (){
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                              Options                              | ");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                           [a] Continue                            |");
        System.out.println("|                           [b] Quit Game                           |");
        System.out.println("|                                                                   |");
        System.out.println("|                                                                   |");
        System.out.println("|                            Swift Games                            |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                           Select (a | b)                          |");
        System.out.println("---------------------------------------------------------------------");
        System.out.print("Your Choice : ");
    }

    void validateQuitGame (){
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                     Are you sure to quit game ?                   |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                        [a] Yes (save game)                        |");
        System.out.println("|                        [b] Yes (not save)                         |");
        System.out.println("|                        [c] No                                     |");
        System.out.println("|                                                                   |");
        System.out.println("|                           Swift Games                             |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                        Select (a | b | c)                         |");
        System.out.println("---------------------------------------------------------------------");
        System.out.print("Your Choice : ");
    }

    void listHero (){
        System.out.println("                       !Select Your 3 Heroes!                       ");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                            LIST HERO                              |");
        System.out.println("|===================================================================|");
        System.out.println("|         Fire         |        Grass        |        Water         |");
        System.out.println("|===================================================================|");
        System.out.println("| [1] Murby  | Fighter | [5] Greysn| Tank    | [9]  Theseus| Tank   |");
        System.out.println("| [2] Helda  | Tank    | [6] Elisa | Mage    | [10] Atla   | Archer |");
        System.out.println("| [3] Veldora| Mage    | [7] Lily  | Archer  | [11] Pomi   | Support|");
        System.out.println("| [4] Deus   | Archer  | [8] Fara  | Support | [12] Marie  | Fighter|");
        System.out.println("|                      |                     |                      |");
        System.out.println("|===================================================================|");
        System.out.println("| [c] Create Hero                                                   |");
        System.out.println("|===================================================================|");
    }

    void createTeam(){
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                   Are you ready for the challenge ?               |");
        System.out.println("---------------------------------------------------------------------");
        System.out.print("Enter your name party : ");
    }

    void brawlHeroes (){
        System.out.println("░█▀▀█ ░█▀▀█ ─█▀▀█ ░█──░█ ░█─── 　 ░█─░█ ░█▀▀▀ ░█▀▀█ ░█▀▀▀█ ░█▀▀▀ ░█▀▀▀█ ");
        System.out.println("░█▀▀▄ ░█▄▄▀ ░█▄▄█ ░█░█░█ ░█─── 　 ░█▀▀█ ░█▀▀▀ ░█▄▄▀ ░█──░█ ░█▀▀▀ ─▀▀▀▄▄ ");
        System.out.println("░█▄▄█ ░█─░█ ░█─░█ ░█▄▀▄█ ░█▄▄█ 　 ░█─░█ ░█▄▄▄ ░█─░█ ░█▄▄▄█ ░█▄▄▄ ░█▄▄▄█ ");
        System.out.println();
        System.out.println("               Unleash Your Team's Might in Brawl Heroes               ");
        System.out.println("                    Triumph in Turn-based Battles!                     ");
        System.out.println();
    }

    void createHero(){
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                           Create a Hero                           |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("          Unleash your imagination and forge an extraordinary        ");
        System.out.println("                          hero from scratch!                         ");
        System.out.println();
    }

    void element (){
        System.out.println("                       Choose your hero element                      ");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                              Element                              |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                             [a] Fire                              |");
        System.out.println("|                             [b] Water                             |");
        System.out.println("|                             [c] Grass                             |");
        System.out.println("|                                                                   |");
        System.out.println("|                            Swift Games                            |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                        Select (a | b | c)                         |");
        System.out.println("---------------------------------------------------------------------");
        System.out.print("Your Choice : ");
    }

    void role (){
        System.out.println("                       Choose your role hero                        ");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                               Role                                |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                           [a] Fighter                             |");
        System.out.println("|                           [b] Tank                                |");
        System.out.println("|                           [c] Archer                              |");
        System.out.println("|                           [d] Support                             |");
        System.out.println("|                           [e] Mage                                |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                    Select (a | b | c | d | e)                     |");
        System.out.println("---------------------------------------------------------------------");
        System.out.print("Your Choice : ");
    }
}
