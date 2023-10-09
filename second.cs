using System;

class Program
{
    static void Main()
    {
        int price;
        string productName;

        Console.Write("Product: ");
        productName = Console.ReadLine();

        Console.Write("Price: ");
        int.TryParse(Console.ReadLine(), out price);

        Console.WriteLine("\nInfortmation:");
        Console.WriteLine("Name: " + productName);
        Console.WriteLine("Price: " + price + " grn");

        Console.ReadLine(); 
    }
}
