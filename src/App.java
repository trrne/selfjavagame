import trrne.*;

public class App {
    public static void main(String[] args) throws Exception {
        Vector2 a = new Vector2(2, 4);
        Vector2 b = new Vector2(8, 16);

        System.out.println("a: " + a.Magnitude() + ", " + a.Normalize());
        System.out.println("b: " + b.Magnitude() + ", " + b.Normalize());

        System.out.println(Vector2.Distance(a, b));
        System.out.println(Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y,
                2)));

        System.out.println(Vector2.Angle(a, b));

        // class Data {
        // public String name;
        // public int age;

        // public Data(String $name, int $age) {
        // name = $name;
        // age = $age;
        // }

        // public String toString() {
        // return "name: " + name + "\nage: " + age;
        // }
        // }
        // String inakamon = new Data("inaka montarou", 32).toString();
        // IEncryption encrypt = new AES();
        // byte[] encrypted = encrypt.Encrypt(inakamon.getBytes());
        // // String decrypted = encrypt.DecryptToString(encrypted);
        // byte[] decrypted = encrypt.Decrypt(encrypted);
        // System.out.println("raw: " + inakamon);
        // System.out.println("encrypted: " + encrypted);
        // System.out.println("decrypted: " + decrypted);

        // LotteryPair<String> pair = new LotteryPair<String>(
        // new Pair<String>("kara", 1.0),
        // new Pair<String>("oko", 0.5),
        // new Pair<String>("kuri", 0.2),
        // new Pair<String>("goma", 0.1));
        // System.out.println(Lottery.Weighted(pair));
    }
}
