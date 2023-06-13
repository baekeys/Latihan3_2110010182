package geometri;

public class Lingkaran {
double radius;

Lingkaran(double radius){
    this.radius=radius;
}
double luas(){
    return 3.14*radius*radius;
}
double keliling(){
    return 2*3.14*radius;
}
}
