using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment2
{
    class Program
    {
        static void Main(string[] args)
        {
            int id = 1;
            string name = "Book";
            int price = 1000;
            int qty= 50;
            string image= "Mona Lisa";
            string desc = "This book is awesome";
            string[] book = { "doraemon", "Teppi", "DragonBall", "OnePunchMan", "doraemon", "Teppi", "DragonBall", "OnePunchMan", "doraemon", "Teppi", "DragonBall", "OnePunchMan" };
            List<string> gallery = new List<string>(book);

            int id2 = 2;
            string name2 = "Toy";
            int price2 = 1000;
            int qty2 = 50;
            string image2 = "Mona Lisa";
            string desc2 = "This book is awesome";
            string[] book2 = { "doraemon", "Teppi", "DragonBall", "OnePunchMan", "doraemon", "Teppi", "DragonBall", "OnePunchMan", "doraemon", "Teppi", "DragonBall", "OnePunchMan" };
            List<string> gallery2 = new List<string>(book);

            int id3 = 3;
            string name3 = "Desk";
            int price3 = 1000;
            int qty3 = 50;
            string image3 = "Mona Lisa";
            string desc3 = "This book is awesome";
            string[] book3 = { "doraemon", "Teppi", "DragonBall", "OnePunchMan", "doraemon", "Teppi", "DragonBall", "OnePunchMan", "doraemon", "Teppi", "DragonBall", "OnePunchMan" };
            List<string> gallery3 = new List<string>(book);

            Product product = new Product(id, name, price, qty, image, desc, gallery);
            Product product2 = new Product(id2, name2, price2, qty2, image2, desc2, gallery2);
            Product product3 = new Product(id3, name3, price3, qty3, image3, desc3, gallery3);

            int idCart = 1;
            string customerCart = "TruongDX8";
            int grandTotalCart = 5000;
            Product[] products = { product, product2 };
            List<Product> productListCart = new List<Product>(products);
            string cityCart = "Hanoi";
            string countryCart = "Vietnam";
            Cart cart = new Cart(idCart, customerCart, grandTotalCart, productListCart, cityCart, countryCart);
            int flag = 0;
            do
            {
                Console.WriteLine("1. Insert product into cart");
                Console.WriteLine("2. Delete prodct from cart");
                Console.WriteLine("3. Total amount");
                Console.WriteLine("4. Show products");
                Console.WriteLine("5. Exit");
                Console.WriteLine("Please choose an option");
                int choice = Convert.ToInt32(Console.ReadLine());
                switch (choice)
                {
                    case 1:
                        cart.insertProductIntoCart(product3);
                        break;
                    case 2:
                        cart.deleteProductFromCart();
                        break;
                    case 3:
                        cart.calculateGrandTotal();
                        break;
                    case 4:
                        cart.showProductFromCart();
                        break;
                    case 5:
                        flag = 1;
                        break;
                }
            }
            while (flag == 0);

            Console.ReadKey();
        }
    }
}
