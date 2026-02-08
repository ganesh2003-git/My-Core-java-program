class Collage2 {
    static void m1() {
        Student3 s1 = new Student3();
        s1.sno = 100; // Changed s3 to s1
        s1.sname = "HK";
        s1.course = "CJ";
        s1.fee = 1000;
        System.out.println(s1.sno + " " + s1.sname + " " + s1.course + " " + s1.fee);
    }

    static Student3 m2() {
        Student3 s2 = new Student3();
        s2.sno = 101; // Changed s3 to s2
        s2.sname = "BK";
        s2.course = "AJ";
        s2.fee = 1000;
        return s2;
    }
}