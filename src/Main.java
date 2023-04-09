import edu.princeton.cs.stdlib.StdDraw;
import edu.princeton.cs.stdlib.StdOut;

import java.awt.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {


        double min = -1.0;
        double max = 1.0;

        double min2 = 0;
        double max2 = 0.005;

        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);

        StdDraw.enableDoubleBuffering();

        double velocidadX = min2 + (max2 - min2) * Math.random();
        double velocidadY = min2 + (max2 - min2) * Math.random();


        double x0 = min + (max - min) * Math.random();
        double y0 = min + (max - min) * Math.random();
        double x1 = min + (max - min) * Math.random();
        double y1 = min + (max - min) * Math.random();

        //LINEA ROJA
        double velocidadXroja = velocidadX;
        double velocidadYroja = velocidadY;
        double rojax0 = x0;
        double rojay0 = y0;
        double rojax1 = x1;
        double rojay1 = y1;

        //LINEA NEGRA
        double velocidadXnegra = velocidadX;
        double velocidadYnegra = velocidadY;
        double negraX0 = x0 ;
        double negraY0 = y0 ;
        double negraX1 = x1 ;
        double negraY1 = y1 ;

        //LINEA VERDE
        double velocidadXverde = velocidadX;
        double velocidadYverde = velocidadY;
        double verdeX0 = x0 ;
        double verdeY0 = y0 ;
        double verdeX1 = x1 ;
        double verdeY1 = y1 ;

        //LINEA AZUL

        double velocidadXazul = velocidadX;
        double velocidadYazul = velocidadY;
        double azulX0 = x0 ;
        double azulY0 = y0 ;
        double azulX1 = x1 ;
        double azulY1 = y1 ;

        //LINEA AMARILLA

        double velocidadXamarillo = velocidadX;
        double velocidadYamarillo = velocidadY;
        double amarilloX0 = x0 ;
        double amarilloY0 = y0 ;
        double amarilloX1 = x1 ;
        double amarilloY1 = y1 ;

        //LINEA MAGENTA

        double velocidadXmagenta = velocidadX;
        double velocidadYmagenta = velocidadY;
        double magentaX0 = x0 ;
        double magentaY0 = y0 ;
        double magentaX1 = x1 ;
        double magentaY1 = y1 ;

        int tic = 0;


        while(true){



            //CAMBIO VELOCIDAD LINEA ROJA
            if(Math.abs(rojax0+velocidadXroja) > 1 ){
                velocidadXroja = -velocidadXroja;
            }
            if(Math.abs(rojay0+velocidadYroja) > 1 ){
                velocidadYroja = -velocidadYroja;
            }
            if(Math.abs(rojax1+velocidadXroja) > 1 ){
                velocidadXroja = -velocidadXroja;
            }
            if(Math.abs(rojay1+velocidadYroja) > 1 ){
                velocidadYroja = -velocidadYroja;
            }

            rojax0 += velocidadXroja;
            rojay0 += velocidadYroja;
            rojax1 += velocidadXroja;
            rojay1 += velocidadYroja;

            //CAMBIO VELOCIDAD LINEA NEGRA

            if(tic > 10){

                if(Math.abs(negraX0+velocidadXnegra) > 1 ){
                    velocidadXnegra = -velocidadXnegra;
                }
                if(Math.abs(negraY0+velocidadYnegra) > 1 ){
                    velocidadYnegra = -velocidadYnegra;
                }
                if(Math.abs(negraX1+velocidadXnegra) > 1 ){
                    velocidadXnegra = -velocidadXnegra;
                }
                if(Math.abs(negraY1+velocidadYnegra) > 1 ){
                    velocidadYnegra = -velocidadYnegra;
                }

                negraX0 += velocidadXnegra;
                negraY0 += velocidadYnegra;
                negraX1 += velocidadXnegra;
                negraY1 += velocidadYnegra;

            }


            //CAMBIO VELOCIDAD LINEA VERDE

            if(tic > 20){
                if(Math.abs(verdeX0+velocidadXverde) > 1 ){
                    velocidadXverde = -velocidadXverde;
                }
                if(Math.abs(verdeY0+velocidadYverde) > 1 ){
                    velocidadYverde = -velocidadYverde;
                }
                if(Math.abs(verdeX1+velocidadXverde) > 1 ){
                    velocidadXverde = -velocidadXverde;
                }
                if(Math.abs(verdeY1+velocidadYverde) > 1 ){
                    velocidadYverde = -velocidadYverde;
                }

                verdeX0 += velocidadXverde;
                verdeY0 += velocidadYverde;
                verdeX1 += velocidadXverde;
                verdeY1 += velocidadYverde;

            }

            //Cambio velocidad linea azul
            if(tic > 30){
                if(Math.abs(azulX0+velocidadXazul) > 1 ){
                    velocidadXazul = -velocidadXazul;
                }
                if(Math.abs(azulY0+velocidadYazul) > 1 ){
                    velocidadYazul = -velocidadYazul;
                }
                if(Math.abs(azulX1+velocidadXazul) > 1 ){
                    velocidadXazul = -velocidadXazul;
                }
                if(Math.abs(azulY1+velocidadYazul) > 1 ){
                    velocidadYazul = -velocidadYazul;
                }

                azulX0 += velocidadXazul;
                azulY0 += velocidadYazul;
                azulX1 += velocidadXazul;
                azulY1 += velocidadYazul;

            }

            //Cambio velocidad linea amarilla
            if(tic > 40){
                if(Math.abs(amarilloX0+velocidadXamarillo) > 1 ){
                    velocidadXamarillo = -velocidadXamarillo;
                }
                if(Math.abs(amarilloY0+velocidadYamarillo) > 1 ){
                    velocidadYamarillo = -velocidadYamarillo;
                }
                if(Math.abs(amarilloX1+velocidadXamarillo) > 1 ){
                    velocidadXamarillo = -velocidadXamarillo;
                }
                if(Math.abs(amarilloY1+velocidadYamarillo) > 1 ){
                    velocidadYamarillo = -velocidadYamarillo;
                }

                amarilloX0 += velocidadXamarillo;
                amarilloY0 += velocidadYamarillo;
                amarilloX1 += velocidadXamarillo;
                amarilloY1 += velocidadYamarillo;

            }

            //CAMBIO VELOCIDAD LIENA MAGENTA
            if(tic > 50){
                if(Math.abs(magentaX0+velocidadXmagenta) > 1 ){
                    velocidadXmagenta = -velocidadXmagenta;
                }
                if(Math.abs(magentaY0+velocidadYmagenta) > 1 ){
                    velocidadYmagenta = -velocidadYmagenta;
                }
                if(Math.abs(magentaX1+velocidadXmagenta) > 1 ){
                    velocidadXmagenta = -velocidadXmagenta;
                }
                if(Math.abs(magentaY1+velocidadYmagenta) > 1 ){
                    velocidadYmagenta = -velocidadYmagenta;
                }

                magentaX0 += velocidadXmagenta;
                magentaY0 += velocidadYmagenta;
                magentaX1 += velocidadXmagenta;
                magentaY1 += velocidadYmagenta;

            }




            StdDraw.clear();

            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.line(rojax0, rojay0, rojax1, rojay1);
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.line(negraX0,negraY0,negraX1,negraY1);
            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.line(verdeX0,verdeY0,verdeX1,verdeY1);
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.line(azulX0,azulY0,azulX1,azulY1);
            StdDraw.setPenColor(StdDraw.YELLOW);
            StdDraw.line(amarilloX0,amarilloY0,amarilloX1,amarilloY1);
            StdDraw.setPenColor(StdDraw.MAGENTA);
            StdDraw.line(magentaX0,amarilloY0,amarilloX1,amarilloY1);

            StdDraw.show();

            tic++;

            if(tic > 60){
                tic = 100;
            }





        }


    }
}
