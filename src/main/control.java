package main;

import role.Player;
import pai.Pai;
import role.computer;

import java.util.Scanner;

public class control {
    public void shouPai(int cblood,int csum,Player you) throws InterruptedException {
        System.out.println("你的发量：" + you.blood + "万根  " + "你的手牌数:" + you.sum);Thread.sleep(1000);
        System.out.println("对手发量：" + cblood + "万根  " + "电脑手牌数：" + csum);Thread.sleep(1000);
        System.out.println("手牌：");
        if (you.handPai[0] > 0) System.out.println("1.Bug " + you.handPai[0] + "张  " + "使对方发量减少1万");
        if (you.handPai[1] > 0) System.out.println("2.DeBug " + you.handPai[1] + "张  " + "de掉对方整的bug防止脱发");
        if (you.handPai[2] > 0) System.out.println("3.生发剂 " + you.handPai[2] + "张  " + "长出1万根头发");
        if (you.handPai[3] > 0) System.out.println("4.复制代码 " + you.handPai[3] + "张  " + "得到对方一张手牌");
        if (you.handPai[4] > 0) System.out.println("5.删除代码 " + you.handPai[4] + "张  " + "删除对方一张手牌");
        if (you.handPai[5] > 0) System.out.println("6.继承 " + you.handPai[5] + "张  " + "抽两张牌");
        if (you.handPai[6] > 0) System.out.println("7.自闭 " + you.handPai[6] + "张  " + "使对方的操作牌无效");
        Thread.sleep(1000);
        System.out.println("请出牌(输入数字，结束输入0）：");
    }

    public void begin() {
        System.out.println("红岩杀测试版1.1---版本更新---新增卡牌：自闭 删除代码 继承---优化了main函数，创建了aiAndPerson抽象类---选择你的英雄：");
        System.out.println("1.hljj 女装：自己每回合多抽一张牌 “我可以女装——hljj” " /*+ "觉醒：盛世美颜：可将1张复制代码当作继承使用（限定技） “呜呜呜是hljj，awsl”" */);
        System.out.println("2.磊磊 马达：对方每回合少抽一张牌 “论划水的话，还是我比较快——磊磊” " /*+ "觉醒：六石：自己当前发量变为两倍（限定技） “我裂开了。”"*/);
        System.out.println("3.桥桥 禁言机器人：对方每回合只能整一个Bug “本轮禁言排行榜：1.桥桥 —— 执法者”" /*+ "觉醒：JOJO！：自己的Bug伤害翻倍（被动） “我不做程序员了，JOJO！”"*/);
    }
    public void key(computer computer,Player you,Pai mainPai,control ctrl,Scanner in,int cblood,int sumPai,int csum,int[] cPai) throws InterruptedException {
        int inPut,copyPai,k,n,i= 0;
        while (you.blood > 0 && cblood > 0 && sumPai > 0){              //游戏主程序
            System.out.println("抽卡");
            k = you.skillhl(you.heros);
            for (i = 1;i <= k;i++){
                n = you.setStartHandPaiOfPlayer();
                you.chouKa(n);
            }
            csum = computer.getSum();
            ctrl.shouPai(cblood,csum,you);
            while (in.hasNextInt()) {
                inPut = in.nextInt();
                if (inPut == 0) break;
                if (inPut == 1 && you.handPai[0] > 0){ System.out.println("给宁整个Bug！");Thread.sleep(1000);
                    computer.deBug(inPut,cPai[1]);
                    you.chuPai(inPut);
                    cPai = computer.getHandPai();}
                if (inPut == 3 && you.handPai[2] > 0) {System.out.println("长 头发 长,发量+1万");
                    you.blood = mainPai.grown(you.blood);
                    you.chuPai(inPut);}
                if (inPut == 4 && you.handPai[3] > 0 && csum > 0){ System.out.println("代码来");Thread.sleep(1000);
                    copyPai = mainPai.copy(cPai);
                    you.handPai[copyPai] += 1;
                    cPai[copyPai] -= 1;
                    computer.setHandPai(cPai);
                    csum -= 1;
                    computer.setSum(csum);
                    System.out.println("复制了一张" + (copyPai+1) );
                    you.chuPai(inPut);}
                if (inPut == 5 && you.handPai[4] > 0) {System.out.println("给你表演个代码消失术");
                    mainPai.ydeleteMa(computer);
                    you.chuPai(inPut);}
                if (inPut == 6 && you.handPai[5] > 0) {System.out.println("爸爸生儿子，一张变两张");
                    mainPai.yoneBecomeTwo(you,computer);
                    you.chuPai(inPut);}
                System.out.println("手牌：");Thread.sleep(750);
                if (you.handPai[0] > 0) System.out.println("1.Bug " + you.handPai[0] + "张  " + "使对方发量减少1万");
                if (you.handPai[1] > 0) System.out.println("2.DeBug " + you.handPai[1] + "张  " + "de掉对方整的bug防止脱发");
                if (you.handPai[2] > 0) System.out.println("3.生发剂 " + you.handPai[2] + "张  " + "长出1万根头发");
                if (you.handPai[3] > 0) System.out.println("4.复制代码 " + you.handPai[3] + "张  " + "偷对方一张手牌");
                if (you.handPai[4] > 0) System.out.println("5.删除代码 " + you.handPai[4] + "张  " + "删除对方一张手牌");
                if (you.handPai[5] > 0) System.out.println("6.继承 " + you.handPai[5] + "张  " + "抽两张牌");
                if (you.handPai[6] > 0) System.out.println("7.自闭 " + you.handPai[6] + "张  " + "使对方的操作牌无效");
                Thread.sleep(1000);
            }
            System.out.println("到电脑了");
            k = you.skillll(you.heros);
            for (i = 1;i <= k;i++){
                n = you.setStartHandPaiOfPlayer();
                computer.chouKa(n);
            }
            for (i = 0;i < 6;i++)       //电脑出牌
            {
                Thread.sleep(1000);
                if (cPai[i] > 0 && i != 1) switch (i) {
                    case 0:
                        k = you.skillqq(you.heros);
                        while (cPai[0] > 0 && k > 0) {
                            System.out.println("电脑在给宁整Bug");Thread.sleep(1000);
                            if (you.handPai[1] > 0) {
                                System.out.println("你有" + you.handPai[1] + "张debug，要打出吗？出牌输入2，不出输入0：");
                                inPut = in.nextInt();
                                if (inPut == 2) {
                                    System.out.println("dedededededede BBBBBBBUUUUUUUGGGGGG!发量未减少");
                                    you.chuPai(inPut);
                                    computer.chuPai(0);
                                }
                            }else {
                                    you.deBugFair();
                                    inPut = 1;
                                    computer.chuPai(inPut);
                                    k--;
                                    Thread.sleep(1000);
                                }
                            }

                        break;
                    case 2:
                        while (cPai[2] > 0) {
                            System.out.println("电脑在生发，发量+1万");
                            cblood = mainPai.grown(cblood);
                            computer.setBlood(cblood);
                            inPut = 3;
                            computer.chuPai(inPut);
                            Thread.sleep(1000);
                        }

                        break;
                    case 3:
                        while (cPai[3] > 0 && you.sum > 0) {
                            System.out.println("电脑想偷偷复制你的代码");Thread.sleep(1000);
                            if (you.handPai[6] > 0) {
                                System.out.println("你有" + you.handPai[6] + "张自闭，要打出吗？出牌输入7，不出输入0：");
                                inPut = in.nextInt();
                                if (inPut == 7){
                                    System.out.println("我自闭了！电脑复制失败");
                                    you.chuPai(inPut);
                                    computer.chuPai(4);
                                }
                            }
                            else{
                            copyPai = mainPai.copy(cPai);
                            cPai[copyPai] += 1;
                            computer.setHandPai(cPai);
                            you.handPai[copyPai] -= 1;
                            you.sum -= 1;Thread.sleep(1000);
                            System.out.println("电脑复制了一张" + (copyPai+1));
                            inPut = 4;
                            computer.chuPai(inPut);
                            Thread.sleep(1000);}
                        }

                        break;
                    case 4:
                        while (cPai[4] > 0) {
                            System.out.println("电脑想偷偷删掉了一张你的代码");Thread.sleep(1000);
                            if (you.handPai[6] > 0) {
                                System.out.println("你有" + you.handPai[6] + "张自闭，要打出吗？出牌输入7，不出输入0：");
                                inPut = in.nextInt();
                                if (inPut == 7) {
                                    System.out.println("我自闭了！电脑删除失败");
                                    you.chuPai(inPut);
                                    computer.chuPai(5);
                                }
                                else {
                                    mainPai.cdeleteMa(you);
                                    inPut = 5;
                                    computer.chuPai(inPut);
                                    Thread.sleep(1000);
                                }
                            }
                        }
                        break;
                    case 5:
                        while (cPai[5] > 0) {
                            System.out.println("电脑想偷偷继承");Thread.sleep(1000);
                            if (you.handPai[6] > 0) {
                                System.out.println("你有" + you.handPai[6] + "张自闭，要打出吗？出牌输入7，不出输入0：");
                                inPut = in.nextInt();
                                if (inPut == 7) {
                                    System.out.println("我自闭了！电脑继承失败（我也不知道为什么你自闭会影响到电脑）");
                                    you.chuPai(inPut);
                                    computer.chuPai(6);
                                                }
                                                    }
                                else {
                                    mainPai.coneBecomeTwo(computer);
                                    inPut = 6;
                                    computer.chuPai(inPut);
                                    Thread.sleep(1000);
                                    }
                                            }
                        }
                        break;
                }
            System.out.println("下个回合");
            System.out.println();
            computer.cgameOver(computer.getBlood());
            you.ygameOver(you.blood);
            Thread.sleep(1000);
        }
    }
    }
