package basic.java17.sealedclasses;

public sealed interface Shape permits Circle,Polygon,AbstractShape  {

    //only circle,Polygon and AbstractShape can implement it. If we create RightAngleTriangle
    // and want it to implement it will give error
}
