//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        Matango m = new Matango();
        h.setName("ミナト");
        h.setHp(40);
        m.setSuffix('A');
        m.setHp(20);
        System.out.println(h.getName() + "の現在のHP: " + h.getHp());
        King k = new King();
        k.talk(h);


        Inn i = new Inn();

        i.checkIn(h);
        h.attack(m);

    }
}