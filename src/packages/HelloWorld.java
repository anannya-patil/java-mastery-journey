package packages; //package names are calculated relative to the source root. thus, it is not src.packages
/*
The class HelloWorld belongs to the package named packages.
Not "create" a package. The package is already created because of the folder and the source root is src.
The package statement is simply a declaration telling Java where this class belongs.
*/

public class HelloWorld 
{
    public static void main(String args[])    
    {
        System.out.println("Hello World! :)");
    }
}