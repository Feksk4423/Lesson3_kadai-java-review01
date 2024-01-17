package a1;

public class Review01 {

    public static void main(String[] args) {

int money = 1500;
int tax = taxmethod(money, (int)(money * 0.10));
int result = money + tax;
System.out.println(money + "の商品の税込価格は" + result + "（消費税は" + tax + "円）です。" );
    }

public static int taxmethod(int money, int result ) {
    int tax = (int)(money * 0.10);
    return tax;
    }
}
