
package project.commandmanager.publication;


public sealed class Shape permits Circle,Square{
    public void sayHi(){
        System.out.println("I'm just an abstract shape");
    }
}









