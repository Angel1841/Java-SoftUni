import java.util.*;

public class HeroesOfCodeAndLogic {

    static class Hero{

        private String name;
        private int hp;
        private int mp;

        public Hero(String name,int hp, int mp) {
            this.name = name;
            this.hp = hp;
            this.mp = mp;
        }

        public int getHp() {
            return hp;
        }

        public void setHp(int hp) {
            this.hp = hp;
        }

        public int getMp() {
            return mp;
        }

        public void setMp(int mp) {
            this.mp = mp;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Hero> heroes = new LinkedHashMap<>();

        String input = scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String[] info = input.split(" ");

            String name = info[0];
            int hp = Integer.parseInt(info[1]);
            int mp = Integer.parseInt(info[2]);

            Hero hero = new Hero(name,hp,mp);

            heroes.put(name, hero);

            input = scanner.nextLine();
        }


        while(!input.equals("End")){

            String[] data = input.split(" - ");

            String command = data[0];

            switch(command){

                case"CastSpell":

                    String heroName = data[1];
                    int amount = Integer.parseInt(data[2]);
                    String spellName = data[3];

                    if(heroes.get(heroName).getMp() >= amount){

                        heroes.get(heroName).setMp(heroes.get(heroName).getMp() - amount);

                        System.out.printf("%s has successfully cast %s and now has %d MP!%n",heroName,spellName,heroes.get(heroName).getMp());
                    }else{

                        System.out.printf("%s does not have enough MP to cast %s!%n",heroName,spellName);
                    }

                    break;

                case"TakeDamage":

                    String name = data[1];
                    int dmg = Integer.parseInt(data[2]);
                    String enemy = data[3];

                    int healthLeft = heroes.get(name).getHp() - dmg;

                    if(healthLeft > 0){
                        heroes.get(name).setHp(heroes.get(name).getHp() - dmg);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",name,dmg,enemy,heroes.get(name).getHp());
                    }else{
                        System.out.printf("%s has been killed by %s!%n",name,enemy);
                        heroes.remove(name);
                    }

                    break;

                case"Recharge":

                    String toRecharge = data[1];
                    int rechargeAmount = Integer.parseInt(data[2]);

                    if(heroes.get(toRecharge).getMp() + rechargeAmount > 200){
                        System.out.printf("%s recharged for %d MP!%n",toRecharge,200 - heroes.get(toRecharge).getMp());
                        heroes.get(toRecharge).setMp(200);
                    } else {
                        System.out.printf("%s recharged for %d MP!%n",toRecharge,rechargeAmount);
                        heroes.get(toRecharge).setMp(heroes.get(toRecharge).getMp() + rechargeAmount);
                    }


                    break;

                case"Heal":

                    String toHeal = data[1];
                    int healAmount = Integer.parseInt(data[2]);

                    if(heroes.get(toHeal).getHp() + healAmount > 100){
                        System.out.printf("%s healed for %d HP!%n",toHeal, 100 - heroes.get(toHeal).getHp());
                        heroes.get(toHeal).setHp(100);
                    } else {
                        System.out.printf("%s healed for %d HP!%n",toHeal,healAmount);
                        heroes.get(toHeal).setHp(heroes.get(toHeal).getHp() + healAmount);
                    }



                    break;


            }


            input = scanner.nextLine();
        }


        for (Map.Entry<String, Hero> entry : heroes.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println("  HP: " + entry.getValue().getHp());
            System.out.println("  MP: " + entry.getValue().getMp());
        }

    }
}
