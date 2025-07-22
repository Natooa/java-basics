//package generics;
//
//public class Part1<T> {
//    private String string = "";
//
//    public String getString() {
//        return string;
//    }
//
//    public void addToString(T t) {
//        if(this.string.equals("")) {
//            this.string = this.string + t.toString();
//        } else {
//            this.string = this.string + " - " + t.toString();
//        }
//    }
//
//    public static void main(String[] args) {
//        Part1<Integer> p1 = new Part1<>();
//        p1.addToString(1);
//        p1.addToString(2);
//        p1.addToString(3);
//
//        System.out.println(p1.getString());
//    }
//}
