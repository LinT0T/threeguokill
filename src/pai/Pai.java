package pai;

import role.Player;
import role.computer;

public class Pai {
    private int[] paiZu = {10,10,4,4,4};// a[0] 杀，a[1] 闪，a[2] 桃，a[3] 顺手牵羊，a[4] 无懈可击，数组中数值为拥有牌数
    private int sum = 32;

    public int getSum() {
        return sum;
    }
    public int copy(int[] a){
        int i = 0;
        boolean t = true;
        while (t) {
            if (a[i] != 0 || i == 5) t = false;
            else i++;
        }
             return i;
        }

    public int grown(int x) {
        x += 1;
        return x;
    }
    public void ydeleteMa(computer computer) throws InterruptedException {
        int i = 0;
        int[] a = new int[]{0,0,0,0,0,0,0};
        a = computer.getHandPai();
        if (a[6] >= 0 ) { Thread.sleep(1000);System.out.println("电脑也是会自闭的！，删除代码无效");computer.chuPai(7);Thread.sleep(1000);
        return;}
        for (i = 6;i >=0;i--)
            if (a[i] > 0) {a[i] -= 1;
                            break;}
            System.out.println("删了代码" + (i));
    }
    public void cdeleteMa(Player you){
        int i = 0;
        for (i = 6;i >=0;i--)
            if (you.handPai[i] > 0) {you.handPai[i] -= 1;
                break;}
        System.out.println("电脑删了代码" + (i+1));
    }
    public void coneBecomeTwo(computer computer) throws InterruptedException {
        int i ,n= 0;
        for (i = 1;i <= 2;i++){
            n = computer.setStartHandPaiOfPlayer();
            computer.chouKa(n);
        }

    }
    public void yoneBecomeTwo(Player you,computer computer) throws InterruptedException {
        int i ,n= 0;
        int[] a;
        a = computer.getHandPai();
        if (a[6] >= 0 ) {
            Thread.sleep(1000);
            System.out.println("电脑也是会自闭的！，继承无效");computer.chuPai(7);Thread.sleep(1000);return;}
        for (i = 1;i <= 2;i++){
            n = you.setStartHandPaiOfPlayer();
            you.chouKa(n);
        }

    }
}
