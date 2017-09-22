package lsg;

import characters.Hero;
import characters.Monster;

public class LearningSoulsGame {

    public static void main(String[] args) {

        Hero h1 = new Hero();

        h1.printStats();

        Monster m1 = new Monster("Studentatort");

        m1.printStats();

        Monster m2 = new Monster();

        m2.printStats();

        Monster m3 = new Monster();

        m3.printStats();

        /**6. On peut utiliser la visibilité friendly et public mais la public
         * reste un meilleur choix en vue d'éventuelles modifications de packaging.
         */

        /**7. Il faut obligatoirement utiliser la visibilité pulbic car le main et les class
         * de personnages n'appartiennent plus au même package.
         */


    }

}
