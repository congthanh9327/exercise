using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment2
{
    class Cart
    {
        public int id;
        public string customer;
        public int grandTotal;
        public List<Product> productList;
        public string city;
        public string country;

        public Cart()
        {
        }

        public Cart(int id, string customer, int grandTotal, List<Product> productList, string city, string country)
        {
            this.id = id;
            this.customer = customer;
            this.grandTotal = grandTotal;
            this.productList = productList;
            this.city = city;
            this.country = country;
        }

        public void insertProductIntoCart(Product product)
        {
            productList.Add(product);
            Console.WriteLine("Insert successfully");
        }

        public void deleteProductFromCart()
        {
            showProductFromCart();
            Console.WriteLine("Please choose an index");
            int indexChoice = Convert.ToInt32(Console.ReadLine());
            productList.RemoveAt(indexChoice);
        }

        public void showProductFromCart()
        {
            foreach (Product product in productList)
            {
                int index = productList.IndexOf(product);
                Console.WriteLine(index + ". " + product.name);
            }
        }

        public void calculateGrandTotal()
        {
            int totalAmount;
            if(city =="Hanoi"||city=="HCM")
            {
                totalAmount = grandTotal * 101 / 100;
            }
            else
            {
                totalAmount = grandTotal * 105 / 100;
            }
            Console.WriteLine("Total amount: ");
            Console.WriteLine(totalAmount);
        }
    }
}
