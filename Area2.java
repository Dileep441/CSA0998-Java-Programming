import java.util.*;
class Arae2 {
    public double area;
    public double h, r;

    void cal() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the height and radius:");
        h = s.nextDouble();
        r = s.nextDouble();
        area = 3.14 * r * r;
        System.out.println("Area of circle:" + area);
    }
}

    class cy extends Arae2 {
        public double cyvol;

        void cal2() {
            cyvol = 3.14 * r * r * h;
            System.out.println("volume of cylinder:" + cyvol);
        }
    }

    class cone extends cy {
        public double covol;
        void cal3()

        {
            covol = r * r * h / 3;
            System.out.println("volume of cone:" + covol);
        }
    }

    class dis
    {
        public static void main(String []arg)
        {
            cone obj =new cone();
            obj.cal();
            obj.cal2();
            obj.cal3();
        }
    }
