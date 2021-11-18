package br.edu.impacta;

record Point(int x, int y) {};
record PersonRecord(String name, int age) {
    @Override
    public String toString() {
        return String.format("PersonRecord{name=%s, age=%d}", this.name, this.age);
    }
}

public class Records {
    public static void testar() {
        System.out.println("Records !!!");
        var rec = new Point(10, 20);
        System.out.println(rec);
        System.out.println(rec.x());
        System.out.println(rec.y());

        var p = new PersonRecord("Emilio", 32);
        System.out.println(p);
        System.out.println(p.name());
        System.out.println(p.age());
    }
}
