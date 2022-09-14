import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Boss boss1 = new Boss();
        boss1.setHealth(500);
        boss1.setDamage(50);
        boss1.setDefense(500);
        System.out.println(boss1.getHealth()+ " "+ boss1.getDamage() + " " + boss1.getDefense());

        createHeroes();
        for (int i = 0; i < createHeroes().length; i++) {

            System.out.println(Arrays.toString(createHeroes()));
        }
    }
    public static Hero[] createHeroes (){
        Hero hero1 = new Hero(320,30,50);
        Hero hero2 = new Hero(320,30);
        Hero hero3 = new Hero(320,30,50);
        Hero [] heroes = {hero1, hero2, hero3};
        return heroes;
    }




}