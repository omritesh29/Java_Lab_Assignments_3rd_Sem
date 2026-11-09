class Area{

    static void rectA(int len, int brd) {
        int area = len * brd;

        System.out.println("Area of Rectangle = " + area);
    }

    void sqrA(int side) {
        int area = side * side;

        System.out.println("Area of Square = " + area);
    }

    public static void main(String args[]) {

        Area.rectA(10, 5);

        Area sn = new Area();
        sn.sqrA(6);
    }
}