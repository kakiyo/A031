import java.util.*;
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            int p3 = sc.nextInt();
            int k = sc.nextInt();
            double  e = 81716054175L;
            List<Double> list=new ArrayList<Double>();
    for (int i = 0;i< 20;i++){
        for (int j = 0;j< 40;j++){
            for (int g = 0;g<50;g++){

                list.add(1*Math.pow(p3,i)*Math.pow(p2,j)*Math.pow(p1,g));
            }

        }
    }
    list.sort(Comparator.naturalOrder());

                System.out.println(list.get(k - 1).longValue());

        }
    }
// あなたは 3 つの素数 P_1, P_2, P_3 を使って数列をつくることになりました。
// その数列は 1 に 3 つの素数を0回以上掛け合わせてできた数を小さい順に並べたものとなっています。
// ある素数を一回も使わない場合もあることに注意してください。

// あなたはその数列で k 番目のものを出力するプログラムを作成してください。
// 入力される値
// 入力は次のフォーマットで与えられます。
// P_1 P_2 P_3 k

// ・3 つの素数を表す整数 P_1, P_2, P_3 と数列の出力する項を表す整数 k がこの順で半角スペース区切りで与えられます。
// ・入力は 1 行となり、末尾に改行が 1 つ入ります。

// 文字列は標準入力から渡されます。標準入力からの値取得方法はこちらをご確認ください
// 期待する出力
// 数列の k 番目に小さい数を出力してください。
// 答えは 64 bit 符号付き整数の範囲に収まります。
// 出力の最後に改行を入れ、余計な文字、空行を含んではいけません。
