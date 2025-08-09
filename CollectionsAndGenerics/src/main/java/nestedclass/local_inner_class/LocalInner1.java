package nestedclass.local_inner_class;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult(21, 4);
    }
}

class Math{
    private int desat = 10;
    public void getResult(int delimoe, int delitel) {
        class Delenie{
//            private int delimoe;
//            private int delitel;

//            public int getDelimoe() {
//                return delimoe;
//            }
//
//            public void setDelimoe(int delimoe) {
//                this.delimoe = delimoe;
//            }

//            public int getDelitel() {
//                return delitel;
//            }
//
//            public void setDelitel(int delitel) {
//                this.delitel = delitel;
//            }

            public int getChastnoe() {
                return delimoe / delitel;
            }

            public int getOstatok() {
                System.out.println(desat);
                return delimoe % delitel;
            }
        }

        Delenie delenie = new Delenie();
//        delenie.setDelimoe(21);
        System.out.println("delimoe = " + delimoe);
        System.out.println("delitel = " + delitel);
        System.out.println("chastnoe = " + delenie.getChastnoe());
        System.out.println("ostatok = " + delenie.getOstatok());
    }
}
