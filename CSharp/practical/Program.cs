using System;
using System.Collections;

namespace Practical
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Product[] productList = new  Product[6];
            productList[0] = new Book(1, "Presidents of War", 70, "Prime");
            productList[1] = new Book(2, "History of Modern India Bipan Chandra", 50, "Prime");
            productList[2] = new Book(3, "The Anatomy of Hate", 40, "Prime");
            productList[3] = new MobilePhone(4, "Xperia", 300, "Sony");
            productList[4] = new MobilePhone(5, "Galaxy A7", 345, "SamSung");
            productList[5] = new MobilePhone(6, "Iphone 5", 943, "Apple");
           

            Console.WriteLine("____________Tax of Books___________________");
                double totalTaxBook = 0;
            for (int i = 0; i < productList.Length; i++)
            {
                if (productList[i] is Book)
                {
                    Console.WriteLine( productList[i].name + " - " + productList[i].computeTax());
                    totalTaxBook += productList[i].computeTax();
                }

            }
            Console.WriteLine("Total tax of Books " + totalTaxBook);
            
            Console.WriteLine("____________Tax of Mobile phones_____________");
                double totalTaxPhone = 0;
            for (int i = 0; i < productList.Length; i++)
            {
                if (productList[i] is MobilePhone)
                {
                    Console.WriteLine( productList[i].name + " - " + productList[i].computeTax());
                    totalTaxPhone += productList[i].computeTax();
                }
            }
            Console.WriteLine("Total tax of Books " + totalTaxPhone);
        }
    }
}