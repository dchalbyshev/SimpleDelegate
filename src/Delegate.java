public class Delegate {


    public static void main(String[] args) {

        System.out.println("Реализация при помощи interface");
        Painter painter = new Painter();
        painter.setGrafic(new Circle());
        painter.draw();
        painter.setGrafic(new Squre());
        painter.draw();
    }
}
    interface  Grafics{
        void draw();
    }

    class Circle implements  Grafics{

        @Override
        public void draw() {
            System.out.println("Рисуем круг");
        }
    }

      class Squre implements Grafics{


        @Override
        public void draw() {
            System.out.println("Рисуем квадрат");
        }
    }

    class Painter{
      Grafics grafic;
      void  setGrafic(Grafics grafic){
          this.grafic =  grafic;

      }
       void draw(){
          grafic.draw();
       }
    }



